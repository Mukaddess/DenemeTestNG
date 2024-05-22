package techproed.tests.day19_annotations;

import org.testng.annotations.*;

public class C01_Notasyonlar {


        @BeforeSuite
        public void beforeSuite() {
            System.out.println("Herseyden önce @BeforeSuite notasyonuna sahip method 1 kez calisir ");
        }

        @AfterSuite
        public void afterSuite() {
            System.out.println("Herseyden sonra @AfterSuite notasyonuna sahip method 1 kez calisir ");
        }

        @BeforeTest
        public void beforeTest() {
            System.out.println("Testlerden önce @BeforeTest notasyonuna sahip method 1 kez calisir ");
        }

        @AfterTest
        public void afterTest() {
            System.out.println("Testlerden sonra @AfterTest notasyonuna sahip method 1 kez calisir ");
        }

        @BeforeClass
        public void beforeClass() {
            System.out.println("Her class dan önce @BeforeClass notasyonuna sahip method 1 kez calisir ");
        }

        @AfterClass
        public void afterClass() {
            System.out.println("Her class dan sonra @AfterClass notasyonuna sahip method 1 kez calisir ");
        }

        @BeforeMethod
        public void setUp() {
            System.out.println("Her testmethodun önce  @BeforeMethod notasyonuna sahip method 1 kez calisir ");
        }

        @AfterMethod
        public void tearDown() {
            System.out.println("Her testmethodun sonra  @AfterMethod notasyonuna sahip method 1 kez calisir ");
        }

        @Test(groups = "smoke")
        public void test01() {
            System.out.println("test01 methodu calisti");
        }

        @Test
        public void test02() {
            System.out.println("test02 methodu calisti");
        }

        @Test
        public void test03() {
            System.out.println("test03 methodu calisti");
        }

    }
