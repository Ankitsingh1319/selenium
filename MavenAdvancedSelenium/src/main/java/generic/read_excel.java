package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class read_excel implements frameworkconstant {
	public static Object[][] fetch_excel() throws Exception
	{
		FileInputStream file=new FileInputStream(Excel_path);
		Workbook w=WorkbookFactory.create(file);
		Sheet s = w.getSheet(sheet_no);
		int row=s.getPhysicalNumberOfRows();
		int column=s.getRow(0).getPhysicalNumberOfCells();
		Object[][] o=new Object[row][column];
		for(int i =0;i<row;i++)
		{
			for (int j=0;j<column;j++)
			{
				o[i][j]=w.getSheet(sheet_no).getRow(i).getCell(j).toString();
			}
		}
		
		return o;
		}
}
