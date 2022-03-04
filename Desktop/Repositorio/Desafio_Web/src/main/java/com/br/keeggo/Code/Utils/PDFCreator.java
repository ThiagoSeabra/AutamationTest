package com.br.keeggo.Code.Utils;

import java.io.FileOutputStream;
import java.io.IOException;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

public class PDFCreator {
	
	static Document document;
	
	public static void GeradorPDF(String fileName) throws DocumentException, IOException {
		document = new Document();
		PdfWriter.getInstance(document , new FileOutputStream(System.getProperty("user.dir") + "/evidences/"+ fileName));
		document.open();
		
	}
	
	public static void AdicionaImagemaoPDF(String imagePath) throws DocumentException, IOException {

		Image imagem = Image.getInstance(System.getProperty("user.dir") + "/prints/"+imagePath);
		imagem.scaleToFit(500, 600);
		
		document.newPage();
		document.add(imagem);
		
	}
	
	public static void closeDocument() {
		document.close();
	}
}

