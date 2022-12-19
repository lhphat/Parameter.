package parameterTestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class KiemTraTieuDe {
    WebDriver driver;

    @Test
    public void kiemthutieudetrangwebtgdd(){
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.thegioididong.com/");
        assertEquals(driver.getTitle(), "Thegioididong.com - Điện thoại, Laptop, Phụ kiện, Đồng hồ chính hãng");
        driver.close();

    }
    @Test
    public void kiemthutieudetrangwebdmx(){
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.dienmayxanh.com/");
        assertEquals(driver.getTitle(), "Siêu thị Điện máy XANH - Mua bán điện tử, điện lạnh, gia dụng");
        driver.close();

    }

    @Test
    public void kiemthutieudetrangwebbhx(){
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.thegioididong.com/");
        assertEquals(driver.getTitle(), "Siêu thị Bách hoá XANH - Mua bán thực phẩm, sản phẩm gia đình");
        driver.close();

    }

}
