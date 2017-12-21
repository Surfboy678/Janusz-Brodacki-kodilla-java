package com.kodilla.testing2.facebook;


import com.kodilla.testing2.config.google.google.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_SELECT_DAY = "//div[@class=\"_5k_5\"]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[@class=\"_5k_5\"]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[@class=\"_5k_5\"]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");

        WebElement selectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select daySelect = new Select(selectDay);
        daySelect.selectByIndex(30);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select monthSelect = new Select(selectMonth);
        monthSelect.selectByIndex(01);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select yearSelect = new Select(selectYear);
        yearSelect.selectByIndex(45);

    }
}
