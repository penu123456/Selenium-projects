package Reporter_Example_Word;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import com.documents4j.api.DocumentType;
import com.documents4j.api.IConverter;
import com.documents4j.job.LocalConverter;



public class WordConvertPDF {
	
	
	
	public static void main(String filename) {
		
		

      //  File inputWord = new File("D:/c2/TC01_Login_2019_Sep_12_3_55_17 AM.docx");
      //  File outputFile = new File("D:/Test5.pdf");
		String s = filename;
        System.out.println(s.substring(0, s.length() - 4));
        
       // s="D:/"+s+"pdf";
        s=s.substring(0, s.length() - 4)+"pdf";
        System.out.println("PDF doc placed at:"+s);
        
        		File inputWord = new File(filename);
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
	
	
	
	
	
	
	
}