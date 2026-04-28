package S2_Excel;

import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1_GetStringData {
    public static void main(String[] args) throws IOException {
        FileInputStream file= new FileInputStream("C:\\Users\\Yogesh\\Desktop\\RohiniClass\\ExcelDoc.xlsx");
      String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
        System.out.println(data);



    }
}
