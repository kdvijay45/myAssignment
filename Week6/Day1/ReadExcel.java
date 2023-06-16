package Week6.Day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

    public class ReadExcel {
    public static void main(String[] args) throws IOException {
    //Set up the path
        XSSFWorkbook wb=new XSSFWorkbook("Data/CreateLeadTest.xlsx");
    //Get into work Sheet    
        XSSFSheet ws = wb.getSheetAt(0);//sheet index ctrl+2
    //Get into the Row
        XSSFRow row = ws.getRow(1);//Row ctrl+2+l
        
    //Get into Column
        XSSFCell cell = row.getCell(2);
        
    //Read the data
        String cellValue = cell.getStringCellValue();
        System.out.println(cellValue); }
    }	