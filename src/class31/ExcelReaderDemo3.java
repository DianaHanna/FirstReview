package class31;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReaderDemo3 {
    public static void main(String[] args) {

        LinkedHashMap<String,String> row1=new LinkedHashMap<>();
        row1.put("Name","Hamid");
        row1.put("Age","30");
        row1.put("City","San Ramon");
        row1.put("Salary","120000");

        LinkedHashMap<String,String> row2=new LinkedHashMap<>();
        row2.put("Name","Sam");
        row2.put("Age","60");
        row2.put("City","Houston");
        row2.put("Salary","125000");

        LinkedHashMap<String,String> row3=new LinkedHashMap<>();
        row3.put("Name","Fayed");
        row3.put("Age","45");
        row3.put("City","Alexandria");
        row3.put("Salary","129000");

        List<Map<String,String>> allRows=new ArrayList<>();
        allRows.add(row1);
        allRows.add(row2);
        allRows.add(row3);

        System.out.println(allRows);
    }
}
