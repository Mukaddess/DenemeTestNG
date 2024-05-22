package techproed.tests.day21_pom_excel;


import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.ExcelReader;

public class C04_ExcelReaderUsage {

    @Test
    public void test01() {
        String path ="src/test/java/techproed/resources/adminTestData.xlsx";
        String pageName="customer_info";



        ExcelReader excelReader = new ExcelReader(path,pageName);

        String email =excelReader.getCellData(0,0);
        String password =excelReader.getCellData(0,1);

        System.out.println(email+" "+password);

        String email1 =excelReader.getCellData(1,0);
        String password1 =excelReader.getCellData(1,1);

        System.out.println(email1+" "+password1);


    }
}