//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package utilities;

import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {
    public SeleniumUtils() {
    }

    public static void switchToNewTab(WebDriver driver, WebElement element) {
        String mainWindow = driver.getWindowHandle();
        element.click();
        Iterator var3 = driver.getWindowHandles().iterator();

        while(var3.hasNext()) {
            String windowHandle = (String)var3.next();
            if (!windowHandle.equals(mainWindow)) {
                driver.switchTo().window(windowHandle);
            }
        }

        System.out.println("Currently the driver is on " + driver.getCurrentUrl());
    }

    public static void click(WebDriver driver, WebElement element) {
        FluentWait wait = (new FluentWait(driver)).ignoring(ElementClickInterceptedException.class).withTimeout(Duration.ofSeconds(30L));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public static void acceptAlerts(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15L));
        wait.until(ExpectedConditions.alertIsPresent());

        try {
            driver.switchTo().alert().accept();
        } catch (NoAlertPresentException var3) {
            NoAlertPresentException e = var3;
            System.out.println("Alert doesnt exist");
            e.printStackTrace();
        }

    }

    public static void dismissAlerts(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15L));
        wait.until(ExpectedConditions.alertIsPresent());

        try {
            driver.switchTo().alert().dismiss();
        } catch (NoAlertPresentException var3) {
            NoAlertPresentException e = var3;
            System.out.println("Alert doesnt exist");
            e.printStackTrace();
        }

    }

    public static boolean isElementPresent(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15L));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException var4) {
            return false;
        }
    }

    public static void clickWithRetries(WebDriver driver, By locator, int retries) throws InterruptedException {
        int numOfTrials = 0;

        while(numOfTrials < retries) {
            try {
                WebElement element = driver.findElement(locator);
                element.click();
                return;
            } catch (StaleElementReferenceException var5) {
                ++numOfTrials;
                waitForSec(1);
            } catch (NoSuchElementException var6) {
                NoSuchElementException e = var6;
                System.out.println("Wrong locator!");
                e.printStackTrace();
                return;
            }
        }

    }

    public static void waitForSec(int numOfSec) {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException var2) {
        }

    }
}
