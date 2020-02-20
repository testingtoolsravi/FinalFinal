package com.tab.af.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.joda.time.DateTime;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class JSONReaderBackup implements Runnable {

	public ConcurrentHashMap<String, String> getFirstObjectMap() {
		String dir = System.getProperty("user.dir");
		ConcurrentHashMap<String, String> cMap = new ConcurrentHashMap<String, String>();
		Object lock = new Object();
		String formattedString = null;
		JSONParser jsonParser = new JSONParser();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		synchronized (lock) {
			try {
				FileReader reader = new FileReader(dir + "\\src\\main\\resources\\data\\Deposits.json");
				// Read JSON file
				Object obj = jsonParser.parse(reader);
				JSONObject parentObject = (JSONObject) obj;
				JSONArray dataArray = (JSONArray) parentObject.get("UserDetails");
				JSONObject dataAtZero = (JSONObject) dataArray.get(0);
				cMap = new Gson().fromJson(dataAtZero.toString(), ConcurrentHashMap.class);
				dataAtZero.put("Data Used", true);
				dataAtZero.put("Used Date", DateTime.now().toString());
				try (FileWriter file = new FileWriter(dir + "\\src\\main\\resources\\data\\PostData.json", true)) {
					formattedString = gson.toJson(dataAtZero);
					file.append(formattedString);
					file.flush();
				} catch (Exception e) {
					System.out.print("Exception Occured While Writing to POSTDATA");
					e.printStackTrace();
				}
				dataArray.remove(dataAtZero);
				try (FileWriter file = new FileWriter(dir + "\\src\\main\\resources\\data\\Deposits.json")) {
					formattedString = gson.toJson(parentObject);
					file.append(formattedString);
					file.flush();
				} catch (Exception e) {
					System.out.print("Exception Occured While Writing to PREDATA");
					e.printStackTrace();
				}
			} catch (Exception e) {
				System.out.print("Exception Occured While Reading Input JSON");
			}
			// System.out.println(cMap);
			return cMap;
		}
	}

	@SuppressWarnings("deprecation")
	public void convertExcelToJSONByColumnNameAsKey() {
		String dir = System.getProperty("user.dir");
		// Below Enter the Path of Input Excel
		File file = new File("C:\\Users\\achaudhary\\Downloads\\edited loans data.xlsx");
		JsonObject sheetsJsonObject = new JsonObject();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		Workbook workbook = null;
		String prettyJson = "";
		try {
			workbook = new XSSFWorkbook(file);
		} catch (InvalidFormatException | IOException e) {
			e.printStackTrace();
		}
		// For single sheet data either remove others or set loop to 0
		for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
			JsonArray sheetArray = new JsonArray();
			ArrayList<String> columnNames = new ArrayList<String>();
			Sheet sheet = workbook.getSheetAt(i);
			Iterator<Row> sheetIterator = sheet.iterator();
			while (sheetIterator.hasNext()) {
				Row currentRow = sheetIterator.next();
				JsonObject jsonObject = new JsonObject();
				if (currentRow.getRowNum() != 0) {
					for (int j = 0; j < columnNames.size(); j++) {
						if (currentRow.getCell(j) != null) {
							if (currentRow.getCell(j).getCellType() == CellType.BLANK) {
								jsonObject.addProperty(columnNames.get(j), "");
							} else {
								currentRow.getCell(j).setCellType(CellType.STRING);
								String columnName = columnNames.get(j);
								if (columnName.equals("DL STATE") || columnName.equals("STATE")) {
									jsonObject.addProperty(columnName,
											stateName.get(currentRow.getCell(j).getStringCellValue().trim()));
								} else {
									jsonObject.addProperty(columnNames.get(j),
											currentRow.getCell(j).getStringCellValue());
								}
							}
						} else {
							jsonObject.addProperty(columnNames.get(j), "");
						}
					}
					sheetArray.add(jsonObject);
				} else {
					// store column names
					for (int k = 0; k < currentRow.getPhysicalNumberOfCells(); k++) {
						columnNames.add(currentRow.getCell(k).getStringCellValue());
					}
				}
			}
			sheetsJsonObject.add(workbook.getSheetName(i), sheetArray);
			prettyJson = gson.toJson(sheetsJsonObject);
		}
		// Write to Converted test Data JSON
		try (FileWriter files = new FileWriter(dir + "\\src\\main\\resources\\data\\CompleteLoanData.json")) {
			files.append(prettyJson);
			files.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		getFirstObjectMap();
	}

	public static final Map<String, String> stateName;
	static {
		stateName = new HashMap<String, String>();
		stateName.put("AL", "Alabama");
		stateName.put("AK", "Alaska");
		stateName.put("AB", "Alberta");
		stateName.put("AZ", "Arizona");
		stateName.put("AR", "Arkansas");
		stateName.put("BC", "British Columbia");
		stateName.put("CA", "California");
		stateName.put("CO", "Colorado");
		stateName.put("CT", "Connecticut");
		stateName.put("DE", "Delaware");
		stateName.put("DC", "District Of Columbia");
		stateName.put("FL", "Florida");
		stateName.put("GA", "Georgia");
		stateName.put("GU", "Guam");
		stateName.put("HI", "Hawaii");
		stateName.put("ID", "Idaho");
		stateName.put("IL", "Illinois");
		stateName.put("IN", "Indiana");
		stateName.put("IA", "Iowa");
		stateName.put("KS", "Kansas");
		stateName.put("KY", "Kentucky");
		stateName.put("LA", "Louisiana");
		stateName.put("ME", "Maine");
		stateName.put("MB", "Manitoba");
		stateName.put("MD", "Maryland");
		stateName.put("MA", "Massachusetts");
		stateName.put("MI", "Michigan");
		stateName.put("MN", "Minnesota");
		stateName.put("MS", "Mississippi");
		stateName.put("MO", "Missouri");
		stateName.put("MT", "Montana");
		stateName.put("NE", "Nebraska");
		stateName.put("NV", "Nevada");
		stateName.put("NB", "New Brunswick");
		stateName.put("NH", "New Hampshire");
		stateName.put("NJ", "New Jersey");
		stateName.put("NM", "New Mexico");
		stateName.put("NY", "New York");
		stateName.put("NF", "Newfoundland");
		stateName.put("NC", "North Carolina");
		stateName.put("ND", "North Dakota");
		stateName.put("NT", "Northwest Territories");
		stateName.put("NS", "Nova Scotia");
		stateName.put("NU", "Nunavut");
		stateName.put("OH", "Ohio");
		stateName.put("OK", "Oklahoma");
		stateName.put("ON", "Ontario");
		stateName.put("OR", "Oregon");
		stateName.put("PA", "Pennsylvania");
		stateName.put("PE", "Prince Edward Island");
		stateName.put("PR", "Puerto Rico");
		stateName.put("QC", "Quebec");
		stateName.put("RI", "Rhode Island");
		stateName.put("SK", "Saskatchewan");
		stateName.put("SC", "South Carolina");
		stateName.put("SD", "South Dakota");
		stateName.put("TN", "Tennessee");
		stateName.put("TX", "Texas");
		stateName.put("UT", "Utah");
		stateName.put("VT", "Vermont");
		stateName.put("VI", "Virgin Islands");
		stateName.put("VA", "Virginia");
		stateName.put("WA", "Washington");
		stateName.put("WV", "West Virginia");
		stateName.put("WI", "Wisconsin");
		stateName.put("WY", "Wyoming");
		stateName.put("YT", "Yukon Territory");
	}
	private static volatile AtomicInteger arrindex = new AtomicInteger();
	// private static JSONArray postDataArrayDeposits = new JSONArray();
	private static JSONArray preDataArrayDeposits = new JSONArray();
	private static volatile AtomicInteger arrLoanindex = new AtomicInteger();
	// private static JSONArray postDataArrayLoan = new JSONArray();
	private static JSONArray preDataArrayLoan = new JSONArray();
	private static volatile AtomicInteger arrLoanIndividualindex = new AtomicInteger();
	// private static JSONArray postDataArrayLoanIndividual = new JSONArray();
	private static JSONArray preDataArrayLoanIndividual = new JSONArray();

	/**
	 * Returns a New Deposit Data Test Data Map with Next Index
	 * 
	 * @return
	 * @throws Exception
	 */
	public ConcurrentHashMap<String, String> getDepositMap() throws Exception {
		JSONObject dataAtIndex = null;
		String dir = System.getProperty("user.dir");
		Object lock = new Object();
		JSONParser jsonParser = new JSONParser();
		try (FileReader reader = new FileReader(dir + "\\src\\main\\resources\\OnBoardTestData\\Deposits.json")) {
			// Read JSON file
			Object obj = jsonParser.parse(reader);
			JSONArray arr = (JSONArray) obj;
			if (preDataArrayDeposits.isEmpty()) {
				preDataArrayDeposits = (JSONArray) obj;
			}
			dataAtIndex = (JSONObject) arr.get(arrindex.getAndIncrement());
			synchronized (lock) {
				preDataArrayDeposits.remove(dataAtIndex);
				// dataAtIndex.put("Used Date", DateTime.now().toString());
				// postDataArrayDeposits.add(dataAtIndex);
			}
		} catch (Exception e) {
			throw new Exception("Exception Occued While Reading Deposit's TestData" + e.getMessage());
		}
		return getMap(dataAtIndex.toString());
	}

	public ConcurrentHashMap<String, String> getLoanMap() throws Exception {
		JSONObject dataAtIndex = null;
		String dir = System.getProperty("user.dir");
		Object lock = new Object();
		JSONParser jsonParser = new JSONParser();
		try (FileReader reader = new FileReader(dir + "\\src\\main\\resources\\OnBoardTestData\\Loan.json")) {
			// Read JSON file
			Object obj = jsonParser.parse(reader);
			JSONArray arr = (JSONArray) obj;
			if (preDataArrayLoan.isEmpty()) {
				preDataArrayLoan = (JSONArray) obj;
			}
			dataAtIndex = (JSONObject) arr.get(arrLoanindex.getAndIncrement());
			synchronized (lock) {
				preDataArrayLoan.remove(dataAtIndex);
				// dataAtIndex.put("Used Date", DateTime.now().toString());
				// postDataArrayLoan.add(dataAtIndex);
			}
		} catch (Exception e) {
			throw new Exception("Exception Occued While Reading LOAN's TestData" + e.getMessage());
		}
		return getMap(dataAtIndex.toString());
	}

	public ConcurrentHashMap<String, String> getIndividualMap() throws Exception {
		JSONObject dataAtIndex = null;
		String dir = System.getProperty("user.dir");
		Object lock = new Object();
		JSONParser jsonParser = new JSONParser();
		try (FileReader reader = new FileReader(
				dir + "\\src\\main\\resources\\OnBoardTestData\\Loan Individual.json")) {
			// Read JSON file
			Object obj = jsonParser.parse(reader);
			JSONArray arr = (JSONArray) obj;
			if (preDataArrayLoanIndividual.isEmpty()) {
				preDataArrayLoanIndividual = (JSONArray) obj;
			}
			dataAtIndex = (JSONObject) arr.get(arrLoanIndividualindex.getAndIncrement());
			synchronized (lock) {
				preDataArrayLoanIndividual.remove(dataAtIndex);
				// dataAtIndex.put("Used Date", DateTime.now().toString());
				// postDataArrayLoanIndividual.add(dataAtIndex);
			}
		} catch (Exception e) {
			throw new Exception("Exception Occued While Reading LOAN's Indiviudal TestData" + e.getMessage());
		}
		return getMap(dataAtIndex.toString());
	}

	public static void flushTestDataToJSON() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String dir = System.getProperty("user.dir");
		if (!preDataArrayDeposits.isEmpty()) {
			try (FileWriter file = new FileWriter(dir + "\\src\\main\\resources\\OnBoardTestData\\Deposits.json")) {
				file.append(gson.toJson(preDataArrayDeposits));
				file.flush();
			} catch (Exception e) {
				System.out.print("Exception Occured While Writing to PREDATA");
				e.printStackTrace();
			}
		}
//	if (!postDataArrayDeposits.isEmpty()) {
//	    try (FileWriter writer = new FileWriter(
//		    dir + "\\src\\main\\resources\\OnBoardTestData\\DepositsPostData.json", true)) {
//		String formattedString = gson.toJson(postDataArrayDeposits);
//		writer.append(formattedString);
//		writer.append(",");
//		writer.flush();
//	    } catch (Exception e) {
//		System.out.print("Exception Occured While Writing to POSTDATA");
//		e.printStackTrace();
//	    }
//	}
		if (!preDataArrayLoan.isEmpty()) {
			try (FileWriter file = new FileWriter(dir + "\\src\\main\\resources\\OnBoardTestData\\Loan.json")) {
				file.append(gson.toJson(preDataArrayLoan));
				file.flush();
			} catch (Exception e) {
				System.out.print("Exception Occured While Writing to PREDATA");
				e.printStackTrace();
			}
		}
//	if (!postDataArrayLoan.isEmpty()) {
//	    try (FileWriter writer = new FileWriter(dir + "\\src\\main\\resources\\OnBoardTestData\\LoanPostData.json",
//		    true)) {
//		String formattedString = gson.toJson(postDataArrayLoan);
//		writer.append(formattedString);
//		writer.append(",");
//		writer.flush();
//	    } catch (Exception e) {
//		System.out.print("Exception Occured While Writing to POSTDATA");
//		e.printStackTrace();
//	    }
//	}
	}

	@SuppressWarnings("deprecation")
	public static void convertExcelToJSONByColumnNameAsKey(String path) {
		// Below Enter the Path of Input Excel
		File file = new File(path);
		JsonObject sheetsJsonObject = new JsonObject();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		Workbook workbook = null;
		String prettyJson = "";
		try {
			workbook = new XSSFWorkbook(file);
		} catch (InvalidFormatException | IOException e) {
			e.printStackTrace();
		}
		// For single sheet data either remove others or set loop to 0
		for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
			JsonArray sheetArray = new JsonArray();
			ArrayList<String> columnNames = new ArrayList<String>();
			Sheet sheet = workbook.getSheetAt(i);
			Iterator<Row> sheetIterator = sheet.iterator();
			while (sheetIterator.hasNext()) {
				Row currentRow = sheetIterator.next();
				JsonObject jsonObject = new JsonObject();
				if (currentRow.getRowNum() != 0) {
					for (int j = 0; j < columnNames.size(); j++) {
						if (currentRow.getCell(j) != null) {
							if (currentRow.getCell(j).getCellType() == CellType.BLANK) {
								jsonObject.addProperty(columnNames.get(j), "");
							} else {
								currentRow.getCell(j).setCellType(CellType.STRING);
								if (columnNames.get(j).equalsIgnoreCase("bus_st")
										|| columnNames.get(j).equalsIgnoreCase("rep1_st")
										|| columnNames.get(j).equalsIgnoreCase("verstate")
										|| columnNames.get(j).equalsIgnoreCase("beststate")
										|| columnNames.get(j).equalsIgnoreCase("DL STATE")
										|| columnNames.get(j).equalsIgnoreCase("STATE")) {
									String val = stateName.get(currentRow.getCell(j).getStringCellValue());
									if (val == null) {
										System.out.print("Break");
									}
									jsonObject.addProperty(columnNames.get(j), val);
								} else if (columnNames.get(j).equalsIgnoreCase("DOB/YOB")) {
									String val = currentRow.getCell(j).getStringCellValue();
									if (val.length() < 7) {
										val = "0101" + val;
										jsonObject.addProperty(columnNames.get(j), val);
									}
								} else {
									jsonObject.addProperty(columnNames.get(j),
											currentRow.getCell(j).getStringCellValue().trim());
								}
							}
						} else {
							jsonObject.addProperty(columnNames.get(j), "");
						}
					}
					sheetArray.add(jsonObject);
				} else {
					// store column names
					for (int k = 0; k < currentRow.getPhysicalNumberOfCells(); k++) {
						columnNames.add(currentRow.getCell(k).getStringCellValue());
					}
				}
			}
			sheetsJsonObject.add(workbook.getSheetName(i), sheetArray);
			prettyJson = gson.toJson(sheetsJsonObject);
		}
		// Write to Converted test Data JSON
		try (FileWriter files = new FileWriter("C:\\Users\\achaudhary\\Downloads\\CompleteLoanIndividual.json")) {
			files.append(prettyJson);
			files.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ConcurrentHashMap<String, String> getMap(String json)
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();

		ConcurrentHashMap<String, String> map = mapper.readValue(json, ConcurrentHashMap.class);
		return map;

	}

	public static void main(String[] Args) throws ClassNotFoundException, SQLException {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection(
					"jdbc:sqlserver://ogvsqlcoreint01\\int.onboarding:1433;user=jdbcuser; password=99*-Jdbc");
			// our SQL SELECT query.
			// if you only need a few columns, specify them by name instead of using "*"
			String query = "UPDATE [int.onboarding].dbo.EDGE_APPLICANT SET guarantor = '0'  WHERE id='dac8a2d7-ebc8-7ffb-5358-665e8ed95068'";
			// create the java statement
			// execute the query, and get a java resultset
			JSONReaderBackup j = new JSONReaderBackup();
			j.convertExcelToJSONByColumnNameAsKey();
		} catch (Exception e) {
			System.out.print("sdsd");
		}
	}
}
