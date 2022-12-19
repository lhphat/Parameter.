package parameterTestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class KiemThuVoiDataProvider2 {
    WebDriver driver;
    @Test(dataProvider = "data-provider")
    public void kiemtratieudecactrangweb(String tenWebsite, String tieuDe){
        driver.get(tenWebsite);
        System.out.println("Kiểm tra trang web " + tenWebsite + " có tiêu đề là " + tieuDe);
        assertEquals(driver.getTitle(), tieuDe);

    }

    @DataProvider(name = "data-provider")
    public Object[][] dataProvider(){
        Object[][] data = new Object[2][2];

        data[0][0] = "https://www.thegioididong.com/";
        data[0][1] = "Thegioididong.com - Điện thoại, Laptop, Phụ kiện, Đồng hồ chính hãng";

        data[1][0] = "https://www.dienmayxanh.com/";
        data[1][1] = "Siêu thị Điện máy XANH - Mua bán điện tử, điện lạnh, gia dụng";

        return data;

//        return new Object[][]{
//                {"https://www.thegioididong.com/", "Thegioididong.com - Điện thoại, Laptop, Phụ kiện, Đồng hồ chính hãng"},
//                {"https://www.dienmayxanh.com/", "Siêu thị Điện máy XANH - Mua bán điện tử, điện lạnh, gia dụng"},
//                {"https://www.bachhoaxanh.com/", "Siêu thị Bách hoá XANH - Mua bán thực phẩm, sản phẩm gia đình1123"},
//        };
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
