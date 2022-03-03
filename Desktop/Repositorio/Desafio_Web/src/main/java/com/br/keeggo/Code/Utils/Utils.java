package com.br.keeggo.Code.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.br.keeggo.Code.Chrome.ChromeLogic;
import io.cucumber.java.AfterStep;

public class Utils {
	
	public static String userName;
	public static String password;

	public static void takeScreenShot(String nomeArquivo) throws Exception {

		TakesScreenshot scrShot = ((TakesScreenshot) ChromeLogic.navegador);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		String imageFileDir = System.getProperty("user.dir") + "/prints/";
		FileUtils.copyFile(srcFile, new File(imageFileDir, nomeArquivo));

	}

	@AfterStep
	public void tirarPrint() throws Exception {

		Thread.sleep(5000);
		Date dataAtual = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
		String dataFormatada = dateFormat.format(dataAtual);
		String screamshootname = dataFormatada + ".png";
		Utils.takeScreenShot(screamshootname);

		PDFCreator.AdicionaImagemaoPDF(screamshootname);

	}

	public static void scrollToElement(WebElement element) {

		Actions actions = new Actions(ChromeLogic.navegador);
		actions.moveToElement(element);
		actions.perform();

	}

	public static void lerArquivoXlsx() throws IOException {
		
		String  fileName = System.getProperty("user.dir") + "/data/data.xlsx";
        FileInputStream file = new FileInputStream(new File(fileName));
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        XSSFSheet sheet = workbook.getSheetAt(0);

        Iterator<Row> rowIterator = sheet.iterator();

            Row row = rowIterator.next();
            row = rowIterator.next(); //Forco a ler os dados da segunda linha
            
            Iterator<Cell> cellIterator = row.cellIterator();
            Cell cell = cellIterator.next(); //interajo com a primeira celula
            
            userName = cell.getStringCellValue();
            
            cell = cellIterator.next(); //interajo com a segunda celula
            
            password = cell.getStringCellValue();
            
        file.close();

	}

}