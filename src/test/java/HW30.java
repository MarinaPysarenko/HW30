import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.io.File;
import java.io.IOException;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class HW30 {

    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://omr.gov.ua/");
        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(By.xpath("(//img[@alt='image'])[3]"))).click().build().perform();
        ArrayList tabs1 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window((String) tabs1.get(1));
        action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'SMS-інформування')])[1]"))).click().build().perform();

        ArrayList tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window((String) tabs2.get(2));
        action.moveToElement(driver.findElement(By.xpath("(//a[normalize-space()='nginx.com'])[1]"))).click().build().perform();
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath("(//a[normalize-space()='Privacy'])[1]"));
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(1000);
        element.click();

        ArrayList tab3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window((String) tab3.get(3));
        Thread.sleep(1000);
        WebElement eleService = driver.findElement(By.xpath("(//a[@class='u02a-nav__link'][normalize-space()='Create a Service Request'])[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", eleService);
        Thread.sleep(1000);
        eleService.click();

        ArrayList tab4 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window((String) tab4.get(4));
        Thread.sleep(1000);
        driver.switchTo().activeElement();
        driver.findElement(By.xpath("(//button[normalize-space()='Cancel'])[1]")).click();
        driver.findElement(By.xpath("(//div[@class='pane'])[2]")).click();
        Thread.sleep(1000);
        WebElement eleSupport = driver.findElement(By.xpath("(//a[normalize-space()='Support and Sales >'])[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", eleSupport);
        Thread.sleep(1000);
        eleSupport.click();

        ArrayList tab5 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window((String) tab5.get(5));
        action.moveToElement(driver.findElement(By.xpath("(//span[@class='meta-nav__link-text'][normalize-space()='F5 Sites'])[1]"))).click().build().perform();
        action.moveToElement(driver.findElement(By.xpath("(//a[@class='meta-nav__menu-link'][normalize-space()='DevCentral'])[1]"))).click().build().perform();
        action.moveToElement(driver.findElement(By.xpath("(//img[@class='sfdcCbImage'])[1]"))).click().build().perform();


        ArrayList tab6 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window((String) tab6.get(6));
        WebElement eleTraining = driver.findElement(By.xpath("(//a[normalize-space()='Training'])[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", eleTraining);
        Thread.sleep(1000);
        eleTraining.click();

        ArrayList tab7 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window((String) tab7.get(7));
        action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Getting Started Series Catalog ›')])[1]"))).click().build().perform();


        ArrayList tab8 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window((String) tab8.get(8));
        Thread.sleep(1000);
        WebElement test = driver.findElement(By.xpath("//*[@id=\"shared-document-preview\"]"));
        test.click();

        WebElement fr = driver.findElement(By.xpath("//body/div[@id='shared-document-preview']/div[1]/iframe[1]"));
        driver.switchTo().frame(fr);
        Thread.sleep(1000);

        WebElement fr2 = driver.findElement(By.xpath("(//iframe[@name='skin'])[1]"));
        driver.switchTo().frame(fr2);
        Thread.sleep(1000);

        WebElement el6intoframe = driver.findElement(By.xpath("//*[@id=\"PageBody\"]/div/div[2]/div/section/div[20]"));
        Thread.sleep(1000);
        action.moveToElement(el6intoframe).perform();

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", el6intoframe);
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[contains(text(),'Full Description')])[19]")).click();

        //В открывшемся попапе нажать "Launch Training"
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"Popup65\"]//div[3]/a")).click();


//Когда запустится обучающий курс, нажать на кнопку пауза, сделать скриншот окна, нажать на "Resources"
// и кликнуть документ "Manual: BIG-IP Policy Enforcement Manager: Implementations (User Guide)"
//На открывшейся страничке навести курсор на Knowledge Centers и перейти (кликнуть) на "BIG-IP i10000 Series"

        ArrayList tab9 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window((String) tab9.get(9));
        driver.findElement(By.xpath("//*[@id=\"previewLink\"]")).click();


        ArrayList tab10 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window((String) tab10.get(10));
        Thread.sleep(1000);
        WebElement button = driver.findElement(By.xpath("(//*[name()='svg'][@class='cs-icon pause-icon'])[1]"));
        button.click();
        myScreenshot(driver);

        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[contains(text(),'Resources')])[1]")).click();
        action.moveToElement(driver.findElement(By.xpath("(//span[contains(text(),'Manual: BIG-IP Policy Enforcement Manager: Impleme')])[1]"))).click().build().perform();

        ArrayList tab11 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window((String) tab11.get(12));
        action.moveToElement(driver.findElement(By.xpath("(//a[@class='nav-link currentURL'][normalize-space()='Knowledge Centers'])[1]"))).perform();
        action.moveToElement(driver.findElement(By.xpath("(//a[normalize-space()='BIG-IP i10000 Series'])[1]"))).click().perform();

        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[normalize-space()='Find serial number'])[1]")).click();
        Thread.sleep(1000);

        List<WebElement> cellsProduct = driver.findElements(By.xpath("//tbody/tr"));
        int iteration = 0;
        System.out.println("Product and their article: ");
        for (WebElement cell : cellsProduct) {
            iteration++;
            if (iteration != 1) {
                System.out.println(cell.getText());
            }
        }
    }


    public static void myScreenshot(WebDriver driver) throws IOException {
        Date d = new Date();
        String fileName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File(".//screenshot//" + fileName));
    }


}