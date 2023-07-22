package Reporter_Example_Word;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xwpf.usermodel.Document;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.testng.annotations.Test;

import com.documents4j.api.DocumentType;
import com.documents4j.api.IConverter;
import com.documents4j.job.LocalConverter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import com.documents4j.api.DocumentType;
import com.documents4j.api.IConverter;
import com.documents4j.job.LocalConverter;

    public class ImageAttachmentInDocument1 {
        /**
         * @param args
         * @throws IOException
         */
    	
    	 CustomXWPFDocument document ;
    	 String fileName1;
    	
    	ImageAttachmentInDocument1()
    	{
    		//this.document=document1;
    		
    		document = new CustomXWPFDocument();
    		
    	}
    	
      //  public void main(String[] args) throws Exception {
        	
       @Test
       public void Word_Test() throws Exception {

          
          

        /*
            CreateHeader();
            PasteImage();
            CreateParaLeft();
            WordOutput_File();*/

 
        }
        
        
        public void CreateParaLeft(String Paragraph_Text) throws Exception 
        {
        XWPFParagraph paragraphThree = document.createParagraph();
        paragraphThree.setAlignment(ParagraphAlignment.LEFT);
        XWPFRun paragraphThreeRunOne = paragraphThree.createRun();
        paragraphThreeRunOne.setFontSize(14);
        paragraphThreeRunOne.setFontFamily("Verdana");
        paragraphThreeRunOne.setColor("000070");
        paragraphThreeRunOne.setText(Paragraph_Text);
        paragraphThreeRunOne.addBreak();
        }
        
        
        
        
        //WordOutput_File starts
        public String WordOutput_File(String TestName) throws Exception 
        {
        	
        
        FileOutputStream outStream = null;
        try {
            double x = Math.random();
           // String fileName = "D:\\c2\\" + String.valueOf(x) + ".docx";
            
            String fileName = "C:\\HTML Report\\Word_Docs\\" + TestName + ".docx";
            outStream = new FileOutputStream(fileName);
            
             fileName1=fileName;
            
            System.out.println("word doc placed at:"+fileName);
            
     
            
            
            
        } catch (FileNotFoundException e) {
            System.out.println("First Catch");
            e.printStackTrace();
        }
        
        
        
        try {
            document.write(outStream);
            outStream.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Second Catch");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Third Catch");
            e.printStackTrace();
        }
		return fileName1;
        
        
        
    	//Thread.sleep(400);
    	//WordConvertPDF(fileName1);
    	//Thread.sleep(400);
		
        
     }   
     //WordOutput_File ends 
        
        
        
        
       //start WordConvertPDF
        public  void WordConvertPDF(String fileName1) throws Exception 
        {
        	 

        
       // String s = "apple car 05";
       // System.out.println(s.substring(0, s.length() - 2));
        
        String s = fileName1;
        System.out.println(s.substring(0, s.length() - 4));
        
       // s="D:/"+s+"pdf";
        s=s.substring(0, s.length() - 4)+"pdf";
        System.out.println("PDF doc placed at:"+s);
        
        		File inputWord = new File(fileName1);
		        File outputFile = new File(s);
		        
		        try  {
		            InputStream docxInputStream = new FileInputStream(inputWord);
		            OutputStream outputStream = new FileOutputStream(outputFile);
		            IConverter converter = LocalConverter.builder().build();
		            converter.convert(docxInputStream).as(DocumentType.DOCX).to(outputStream).as(DocumentType.PDF).execute();
		            outputStream.close();
		            System.out.println("success");
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		        
        
       }
        //ends WordConvertPDF 
        
        
        
        
        
        
        
        
        
        
        public void CreateHeader(String Header_Text) throws Exception 
        {
        	XWPFParagraph paragraphOne = document.createParagraph();
            paragraphOne.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun paragraphOneRunOne = paragraphOne.createRun();
            paragraphOneRunOne.setBold(true);
            paragraphOneRunOne.setFontSize(20);
            paragraphOneRunOne.setFontFamily("Verdana");
            paragraphOneRunOne.setColor("000070");
            paragraphOneRunOne.setText(Header_Text);
        }

        
        
        
        
        public void PasteImage(String Paragraph_Text,String Imagepath) throws Exception 
        {
        	
        	System.out.println("Paragraph_Text"+Paragraph_Text);
        	System.out.println("Imagepath"+Imagepath);
        	
        	  XWPFParagraph paragraphThree = document.createParagraph();
              paragraphThree.setAlignment(ParagraphAlignment.LEFT);
              XWPFRun paragraphThreeRunOne = paragraphThree.createRun();
              paragraphThreeRunOne.setFontSize(14);
              paragraphThreeRunOne.setFontFamily("Verdana");
              paragraphThreeRunOne.setColor("000070");
              paragraphThreeRunOne.setText(Paragraph_Text);
              
             // paragraphThreeRunOne.addBreak();
        	
        	
        	
        // Adding a file
        try {

            // Working addPicture Code below...
            XWPFParagraph paragraphX = document.createParagraph();
            paragraphX.setAlignment(ParagraphAlignment.CENTER);

            String blipId = paragraphX.getDocument().addPictureData(
                   // new FileInputStream(new File("D://c2//WLB.jpg")),
            		//  new FileInputStream(new File("C://Users//admin//Desktop//Selenium.png")),
            		new FileInputStream(new File(Imagepath)),
                    Document.PICTURE_TYPE_PNG);
            System.out.println("4" + blipId);
            System.out.println(document
                    .getNextPicNameNumber(Document.PICTURE_TYPE_PNG));
            document.createPicture(blipId,
                    document.getNextPicNameNumber(Document.PICTURE_TYPE_PNG),
                    200, 75);
            System.out.println("5");
            
           
            
            
            XWPFParagraph paragraphfour = document.createParagraph();
            paragraphfour.setAlignment(ParagraphAlignment.LEFT);
            XWPFRun paragraphFourRunOne = paragraphfour.createRun();
            paragraphFourRunOne.setFontSize(14);
            paragraphFourRunOne.setFontFamily("Verdana");
            paragraphFourRunOne.setColor("000070");
            paragraphFourRunOne.setText("______________________________________");

        } catch (InvalidFormatException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        // insert doc details
        // Createa a para -1
        
        
        
        }
        
        
        
        
        
    }