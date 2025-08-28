package extra;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphonePrices {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone" + Keys.ENTER);
		Thread.sleep(3000);

		List<WebElement> prices = driver.findElements(By.className("a-price-whole"));

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\User\\git\\ocmrs\\marriage-registration\\src\\test\\resources\\testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);

		for (int i = 0; i < prices.size(); i++) {
			String price = prices.get(i).getText();
			wb.getSheet("amazon").getRow(i).createCell(0).setCellValue(price);
		}

		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\User\\git\\ocmrs\\marriage-registration\\src\\test\\resources\\testData.xlsx");
		wb.write(fos);
		
		wb.close();
		fis.close();
		fos.close();
		
		driver.quit();
	}
}
