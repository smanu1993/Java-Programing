package interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class HelloWorld {
    public static WebDriver driver = new ChromeDriver();
    public static void main(String[] args) {
        System.out.println("Hello World!!");
        try{
            throw new IOException();
        }catch (IOException e){
            System.out.println("A");
        }catch (Exception e){
            System.out.println("B");
        }
    }
}
