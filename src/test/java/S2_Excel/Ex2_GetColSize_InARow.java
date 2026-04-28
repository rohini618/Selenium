package S2_Excel;

import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex2_GetColSize_InARow {
    public static void main(String[] args) throws IOException {
        FileInputStream file=new FileInputStream("C:\\Users\\Yogesh\\Desktop\\RohiniClass\\ExcelDoc.xlsx");
        int colSize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getLastCellNum();
        System.out.println(colSize);

    }
}
