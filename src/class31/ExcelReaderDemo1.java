package class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ExcelReaderDemo1 {
    public static void main(String[] args) throws IOException {

        // location of file on the computer
        String path="Files/Book1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        // it's a class that knows how to read and write data from and to Excel files
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet1= (Sheet) xssfWorkbook.getSheet("Sheet1");
        Row row=sheet1.getRow(1);
        Cell cell= row.getCell(1);

        System.out.println(cell);
    }
}
