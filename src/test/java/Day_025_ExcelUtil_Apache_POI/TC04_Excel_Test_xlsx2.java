package Day_025_ExcelUtil_Apache_POI;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest4;

public  class TC04_Excel_Test_xlsx2
{
		

    
WebDriver driver;
    

    @Test
    public void hello()throws Exception
    {
    	
    	ExcelApiTest4 eat=new ExcelApiTest4();
    	eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_EMPExport3.xlsx","Sheet1",1,0,"Admin11");
    	eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_EMPExport3.xlsx","Sheet1",1,1,"admin12345");

    	/*
    	 
    	String EmpFirstName=driver.findElement(By.id("personal_txtEmpFirstName")).getText();
     	String EmpLastName=driver.findElement(By.id("personal_txtEmpLastName")).getText();
    	String EmpId=driver.findElement(By.id("personal_txtEmployeeId")).getText();
    		
     	eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_EMPExport3.xlsx","Sheet3",1,0,EmpFirstName);
     	eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_EMPExport3.xlsx","Sheet3",1,1,EmpLastName);
     	eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_EMPExport3.xlsx","Sheet3",1,2,EmpId);
    	*/
    	
    }
    
    
    
    
    
    
    
}

