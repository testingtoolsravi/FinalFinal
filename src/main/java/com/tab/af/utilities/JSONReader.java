package com.tab.af.utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONReader {
    private static JSONReader instance;
    private static final String DIRECTORY = System.getProperty("user.dir");
    private static final String DEPOSITPATH = "\\src\\main\\resources\\OnBoardTestData\\Deposits.json";
    private static final String LOANPATH = "\\src\\main\\resources\\OnBoardTestData\\Loan.json";
    private static final String INDIVIUDALOANPATH = "\\src\\main\\resources\\OnBoardTestData\\Loan Individual.json";
    private static ConcurrentHashMap<Integer, JSONObject> depositDataMap = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<Integer, JSONObject> loanDataMap = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<Integer, JSONObject> loanIndividualDataMap = new ConcurrentHashMap<>();
    private static volatile AtomicInteger depositArrayIndex = new AtomicInteger();
    private static volatile AtomicInteger loanArrayindex = new AtomicInteger();
    private static volatile AtomicInteger loanIndividualArrayIndex = new AtomicInteger();
    // private static JSONArray preDataArrayLoanIndividual = new JSONArray();
    // private static JSONArray postDataArrayDeposits = new JSONArray();
    // private static JSONArray preDataArrayLoan = new JSONArray();
    // private static JSONArray postDataArrayLoan = new JSONArray();
    // private static JSONArray postDataArrayLoanIndividual = new JSONArray();

    private JSONReader() {
    }

    public static JSONReader getInstance() {
	if (instance == null) {
	    instance = new JSONReader();
	}
	return instance;
    }

    /**
     * Returns a New Deposit Data Test Data Map with Next Index
     * 
     * @return
     * @throws Exception
     */
    public ConcurrentHashMap<String, String> getDepositMap() throws Exception {
	ConcurrentHashMap<String, String> dataMap = null;
	if (depositDataMap.isEmpty()) {
	    loadDepositMap();
	}
	JSONObject dataAtIndex = depositDataMap.get(depositArrayIndex.getAndIncrement());
	dataMap = jsonToMap(dataAtIndex.toJSONString());
	return dataMap;
    }

    public void loadDepositMap() throws Exception {
	JSONParser jsonParser = new JSONParser();
	JSONArray arr;
	try (FileReader reader = new FileReader(DIRECTORY + DEPOSITPATH)) {
	    Object obj = jsonParser.parse(reader);
	    arr = (JSONArray) obj;
	} catch (Exception e) {
	    throw e;
	}
	for (int i = 0; i < arr.size(); i++) {
	    depositDataMap.put(i, (JSONObject) arr.get(i));
	}
    }

    public ConcurrentHashMap<String, String> getLoanMap() throws Exception {
	ConcurrentHashMap<String, String> dataMap = null;
	if (loanDataMap.isEmpty()) {
	    loanDataMap();
	}
	JSONObject dataAtIndex = loanDataMap.get(loanArrayindex.getAndIncrement());
	dataMap = jsonToMap(dataAtIndex.toJSONString());
	// preDataArrayLoan.remove(dataAtIndex);
	return dataMap;
    }

    public void loanDataMap() throws Exception {
	JSONParser jsonParser = new JSONParser();
	JSONArray arr;
	try (FileReader reader = new FileReader(DIRECTORY + LOANPATH)) {
	    Object obj = jsonParser.parse(reader);
	    arr = (JSONArray) obj;
	} catch (Exception e) {
	    throw e;
	}
	for (int i = 0; i < arr.size(); i++) {
	    loanDataMap.put(i, (JSONObject) arr.get(i));
	}
    }

    public ConcurrentHashMap<String, String> getIndividualMap() throws Exception {
	ConcurrentHashMap<String, String> dataMap = null;
	JSONObject dataAtIndex = null;
	if (loanIndividualDataMap.isEmpty()) {
	    loadIndividualLoanData();
	}
	dataAtIndex = loanIndividualDataMap.get(loanIndividualArrayIndex.getAndIncrement());
	dataMap = jsonToMap(dataAtIndex.toString());
	// preDataArrayLoanIndividual.remove(dataAtIndex);
	return dataMap;
    }

    public void loadIndividualLoanData() throws Exception {
	JSONParser jsonParser = new JSONParser();
	JSONArray arr;
	try (FileReader reader = new FileReader(DIRECTORY + INDIVIUDALOANPATH)) {
	    Object obj = jsonParser.parse(reader);
	    arr = (JSONArray) obj;
	} catch (Exception e) {
	    throw e;
	}
	for (int i = 0; i < arr.size(); i++) {
	    loanIndividualDataMap.put(i, (JSONObject) arr.get(i));
	}
    }

    public static void flushTestDataToJSON() {
//	Gson gson = new GsonBuilder().setPrettyPrinting().create();
//	String dir = System.getProperty("user.dir");
//		if (!preDataArrayDeposits.isEmpty()) {
//			try (FileWriter file = new FileWriter(dir + "\\src\\main\\resources\\OnBoardTestData\\Deposits.json")) {
//				file.append(gson.toJson(preDataArrayDeposits));
//				file.flush();
//			} catch (Exception e) {
//				System.out.print("Exception Occured While Writing to PREDATA");
//				e.printStackTrace();
//			}
//		}
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
//		if (!preDataArrayLoan.isEmpty()) {
//			try (FileWriter file = new FileWriter(dir + "\\src\\main\\resources\\OnBoardTestData\\Loan.json")) {
//				file.append(gson.toJson(preDataArrayLoan));
//				file.flush();
//			} catch (Exception e) {
//				System.out.print("Exception Occured While Writing to PREDATA");
//				e.printStackTrace();
//			}
//		}
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

    public ConcurrentHashMap<String, String> jsonToMap(String json)
	    throws JsonParseException, JsonMappingException, IOException {
	ObjectMapper mapper = new ObjectMapper();
	ConcurrentHashMap<String, String> map = mapper.readValue(json, ConcurrentHashMap.class);
	return map;
    }
}
