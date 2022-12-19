package parameterTestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class KiemThuVoiDataProvider {
    WebDriver driver;
    @Test(dataProvider = "trangweb")
    public void kiemtratieudecactrangweb(String tenWebsite){
        driver.get(tenWebsite);
        assertEquals(driver.getTitle(), "Thegioididong.com - Điện thoại, Laptop, Phụ kiện, Đồng hồ chính hãng");

    }

    @DataProvider(name = "trangweb")
    public Object[][] dulieu(){
        return new Object[][]{
                {"https://www.thegioididong.com/"},
                {"https://www.dienmayxanh.com/"},
                {"https://www.bachhoaxanh.com/"},
        };
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("trước các test thực hiện mở trình duyệt");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterTest
    public void afterTest(){
        driver.close();
        System.out.println("Sau các test thực hiện đóng trình duyệt");
    }
}
