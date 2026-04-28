package S2_Excel;

import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex2_GetRowSize_InASheet {
    public static void main(String[] args) throws IOException {
        FileInputStream file=new FileInputStream("C:\\Users\\Yogesh\\Desktop\\RohiniClass\\ExcelDoc.xlsx");
        int rowSize= WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum() +1;
        System.out.println(rowSize);

    }
}
