package com.tab.af.utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	WebElement table;;
	WebDriver driver;
	

	/**
	 * Initialize This constructor with either a {@link WebElement} with CUBA ID or
	 * a String of CUBA ID Only
	 * 
	 * @param <T>
	 * @param wtable
	 */
	public <T> WebTable(T table) {
		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			if (table instanceof String) {
				String c = "//*[@cuba-id=\"" + table + "\"]";
				this.table = driver.findElement(By.xpath(c));
			} else if (table instanceof WebElement) {
				this.table = (WebElement) table;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Map<String, String> getHeadersIndex(WebElement table) {
		Map<String, String> tableHeader= new HashMap<String, String>();
		List<WebElement> headersList = table.findElements(By.xpath("//div[@class='v-table-header']//tr//td//div[3]"));
		Iterator<WebElement> itr = headersList.iterator();
		int column = 1;
		while (itr.hasNext()) {
			tableHeader.put(itr.next().getText(), String.valueOf(column));
			column++;
		}
		return tableHeader;
	}

	// get the number of rows present
	public int getRowCount() {
		WebElement dataTable = table.findElement(By.xpath("//table[@class=\"v-table-table\"]"));
		int noOfRows = dataTable.findElements(By.tagName("tr")).size() - 1;
		return noOfRows;
	}

	// get the number of columns present
	public int getColumnCount() {
		int noOfCols = table.findElements(By.xpath("//tr[2]/td")).size();
		return noOfCols;
	}

	// get the nuber of rows and columns and return it as Map
	public Map<String, Integer> getTableSize() {
		Map<String, Integer> tableSize = new HashMap<>();
		tableSize.put("rows", getRowCount());
		tableSize.put("columns", getColumnCount());
		return tableSize;
	}

	// get row data and return it as list
	public List<String> rowData(int rowNumber) throws Exception {
		if (rowNumber == 0) {
			throw new Exception("Row number starts from 1");
		}
		rowNumber = rowNumber + 1;
		List<WebElement> row = table.findElements(By.xpath("//tr[" + rowNumber + "]/td"));
		List<String> rData = new ArrayList<>();
		for (WebElement webElement : row) {
			rData.add(webElement.getText());
		}
		return rData;
	}

	// get the column data and return as list
	public List<String> columnData(int columnNumber) throws Exception {
		if (columnNumber == 0) {
			throw new Exception("Column number starts from 1");
		}
		List<WebElement> column = table.findElements(By.xpath("//tr/td[" + columnNumber + "]"));
		List<String> cData = new ArrayList<>();
		for (WebElement webElement : column) {
			cData.add(webElement.getText());
		}
		return cData;
	}

	// get all the data from the table
	public List<List<String>> getAllData() {
		// get number of rows
		int noOfRows = table.findElements(By.xpath("//tr")).size() - 1;
		// get number of columns
		int noOfColumns = table.findElements(By.xpath("//tr[2]/td")).size();
		List<List<String>> allData = new ArrayList<List<String>>();
		// iterate over the rows, to ignore the headers we have started the i with '1'
		for (int i = 2; i < noOfRows; i++) {
			// reset the row data every time
			List<String> ro = new ArrayList<String>();
			// iterate over columns
			for (int j = 1; j < noOfColumns; j++) {
				// get text from the i th row and j th column
				ro.add(table.findElement(By.xpath("//tr[" + i + "]/td[" + j + "]")).getText());
			}
			// add the row data to allData of the table
			allData.add(ro);
		}
		return allData;
	}

	// verify presence of the text/data
	public boolean presenceOfData(String data) {
		// verify the data by getting the size of the element matches based on the
		// text/data passed
		int dataSize = table.findElements(By.xpath("//td[normalize-space(text())='" + data + "']")).size();
		boolean presence = false;
		if (dataSize > 0) {
			presence = true;
		}
		return presence;
	}

	// get the data from a specific cell
	public String getCellData(int rowNumber, int columnNumber) throws Exception {
		if (rowNumber == 0) {
			throw new Exception("Row number starts from 1");
		}
		rowNumber = rowNumber + 1;
		String cellData = table.findElement(By.xpath("//tr[" + rowNumber + "]/td[" + columnNumber + "]")).getText();
		return cellData;
	}

	public static void main(String[] Args) {
		WebTable tl = new WebTable("applicationsTable");
		tl.getRowCount();
	}
}
