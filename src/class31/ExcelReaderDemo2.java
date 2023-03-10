package class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReaderDemo2 {
    public static void main(String[] args) throws IOException {
        
        String path="Files/Book1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet1= (Sheet) xssfWorkbook.getSheet("Sheet1");
        int rowSize=sheet1.getPhysicalNumberOfRows(); // instead of this step we can do
        // for (int i = 0; i <4 ; i++) {
        for (int i = 0; i <rowSize ; i++) {
            Row row=sheet1.getRow(i);
            int noOfCells=row.getPhysicalNumberOfCells(); // instead of this step we can do
            //    for (int j = 0; j <4; j++) {
            for (int j = 0; j <noOfCells; j++) {
                Cell cell=row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
        }
    }
}
