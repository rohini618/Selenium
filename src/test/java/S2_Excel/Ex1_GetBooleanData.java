package S2_Excel;

import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex1_GetBooleanData {
    public static void main(String[] args) throws IOException {
        FileInputStream file=new FileInputStream("C:\\Users\\Yogesh\\Desktop\\RohiniClass\\ExcelDoc.xlsx");
        boolean data= WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(1).getBooleanCellValue();
        System.out.println(data);

    }
}
