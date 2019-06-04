package something;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelPractice {
    public static void main(String[] args) throws IOException {
//        OutPutExcel();
        FileInputStream fileInputStream = new FileInputStream("f:\\excel.xls");
        HSSFWorkbook wb = new HSSFWorkbook(fileInputStream);

        //获取Excel文档中的第一个表单
        HSSFSheet sht0 = wb.getSheetAt(0);
        for (Row row : sht0) {
//            if (row.getRowNum()<2){
//                continue;
//            }
            System.out.println("getRowNum"+row.getRowNum());
            Cell cell0 = row.getCell(0);
            Cell cell1 = row.getCell(1);
            Cell cell2 = row.getCell(2);
            System.out.println(cell0+"----"+cell1+"===="+cell2);

        }

        fileInputStream.close();



    }

    private static void OutPutExcel() throws IOException {
        //创建HSSWorkbook对象
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("sheet0");
        HSSFRow row = sheet.createRow(0);
        HSSFCell cell = row.createCell(0);
        cell.setCellValue("单元格中的中文");
        FileOutputStream fileOutputStream = new FileOutputStream("f:\\excel.xls ");
        wb.write(fileOutputStream);
        fileOutputStream.flush();
    }

}
