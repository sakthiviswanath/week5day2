package week5.day2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CreatLead extends Parent {
	
	

		
		@Test(dataProvider="fetchData")
		public void runCreateLead(String company,String fName,String Lname) {
			
			driver.findElementByLinkText("Create Lead").click();
			driver.findElementById("createLeadForm_companyName").sendKeys(company);
			driver.findElementById("createLeadForm_firstName").sendKeys(fName);
			driver.findElementById("createLeadForm_lastName").sendKeys(Lname);
			driver.findElementByName("submitButton").click();
			

		}


		
		@DataProvider(name="fetchData")
		public String[][] sendData(){
			
			String[][] data=new String[2][3];
			
			data[0][0]="TestLeaf";
			data[0][1]="Hari";
			data[0][2]="P";
			
			data[1][0]="TestLeaf";
			data[1][1]="Dhivya";
			data[1][2]="P";
			return data;
			
		}
}
