package CS.CS1Hybrid;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class dataDriven {

    public static void main(String[] args) {
    }

    public ArrayList<Object> getData(String testCaseName) throws IOException {
        //Putting all the grabbed data into an array list to pass it to the testcases
        ArrayList<Object> a= new ArrayList();


        // fileInputStream argument
        FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\CS1.xlsx");

        // creating workbook object
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        // counting no:of sheets present in workbook
        int sheets = workbook.getNumberOfSheets();
        System.out.println("sheets: "+sheets);

        // iterating through sheets
        for (int i = 0; i < sheets; i++) {
            if (workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {
                XSSFSheet sheet = workbook.getSheetAt(i);// getting complete access to the sheet to work with. THis
                // sheet can drive the entire data from the sheet

                //Iterating through rows of sheet
                Iterator<Row> rows = sheet.iterator();
                Row firstrow = rows.next(); //moving iterator to next to find the element needed

                //Iterating through cells to find the appropriate cell or data
                Iterator<Cell> ce = firstrow.cellIterator();

                int k=0;
                int column = 0;

                while(ce.hasNext()) { //checking if ce has next value or if it is the last cell
                    Cell value = ce.next();//moving to next if it has one, and getting the value of that cell

                    if(value.getStringCellValue().equalsIgnoreCase("Item")) {//checking for desired column or row

                        column = k;//column index of required data
                    }

                    k++;//increments after we check the condition everytime.
                }

                System.out.println("column: "+column);

                //after identifying testcases column scan and find the entire testcase column and find the purchase testcase row
                while(rows.hasNext()) {
                    Row r = rows.next();
                    if(r.getCell(column).getStringCellValue().equalsIgnoreCase("sofa")) {
                        //if value matches, then we have to get all the data from that row
                        Iterator<Cell> cv = r.cellIterator();

                        while(cv.hasNext()) {
                            //System.out.println(cv.next().getStringCellValue());

                            Cell c= cv.next();
                            switch(c.getCellType()) {
                                case STRING: {
                                    a.add(c.getStringCellValue());
                                    break;
                                }
                                case NUMERIC: {
                                    a.add(c.getNumericCellValue());
                                    break;
                                }
                            }

                        }

                    }
                }
            }
        }
        return a;
    }
}


