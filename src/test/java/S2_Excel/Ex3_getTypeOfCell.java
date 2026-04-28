package S2_Excel;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex3_getTypeOfCell {
    public static void main(String[] args) throws IOException {
        FileInputStream file=new FileInputStream("C:\\Users\\Yogesh\\Desktop\\RohiniClass\\ExcelDoc.xlsx");
        CellType s1= WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getCellType();
        System.out.println(s1);
    }
}
