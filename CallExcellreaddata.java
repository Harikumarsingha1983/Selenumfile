package utils;

public class CallExcellreaddata {
	public static void main(String[] args) {
		String ProjectPath = System.getProperty("user.dir");
		Excellreaddata excel = new Excellreaddata (ProjectPath+"/ExcelFile/Data.xlsx","Sheet1");
		excel.getRowCount();
		excel.getCelldata(0, 0);
		
		 dummyExcellutils amuk = new dummyExcellutils (ProjectPath+"/ExcelFile/Data.xlsx","Sheet1");
		 amuk.getRowCount();
		 amuk.getCelldata(0,1);
		
		
		
	}

}
