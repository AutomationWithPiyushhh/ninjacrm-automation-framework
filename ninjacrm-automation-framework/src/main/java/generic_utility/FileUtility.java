package generic_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FileUtility {

	public String getDataFromPropFile(String key) throws IOException {

		FileInputStream fis = new FileInputStream("./src\\test\\resources\\commonData.properties");

		Properties pObj = new Properties();
		pObj.load(fis);

		String value = pObj.getProperty(key);

		return value;
	}

	public String getDataFromExcelFile(String sheetName, int rowNum, int cellNum)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testData.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		String value = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();

		return value;
	}
	
	public String getDataFromJsonFile(String key) throws FileNotFoundException, IOException, ParseException {
		
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("./src/test/resources/commondata.json"));
	 	JSONObject jObj = (JSONObject) obj;
	 	String value = jObj.get(key).toString();
		
		
		return value;
		
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		FileUtility fUtil = new FileUtility();
		String mobile = fUtil.getDataFromJsonFile("key4");
		System.out.println(mobile);
	}
}
