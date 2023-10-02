package interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindBrokenLinkOnPage {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println("number of liks = "+elements.size());
        List<String> brokenLinks = new ArrayList<>();
        for (WebElement ele : elements){
            String link = ele.getAttribute("href");
            System.out.println(link);
            URL url = new URL(link);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
           httpURLConnection.connect();
           int resCode = httpURLConnection.getResponseCode();
           if(resCode != 200){
               brokenLinks.add(link);
           }
        }
        for (String link : brokenLinks){
            System.out.println(link);
        }
    }
}
