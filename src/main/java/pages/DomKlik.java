package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class DomKlik  extends BasePage{

    @FindBy(xpath = "//h1/span")
    List<WebElement> headers;
    @FindBy(xpath = "//h1")
    WebElement head;

    public void containsheader(String name){
        ArrayList tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(String.valueOf(tabs.get(1)));
        String headername="";
        waitVisibilityOf(head,30);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",head);
        headername=headers.get(0).getText()+" "+headers.get(1).getText();
        Assert.assertEquals("Неверный заголовок",headername,name);
    }

    @FindBy(xpath = "//input[@value='Покупка вторичной квартиры']")
    WebElement target;
    public void credittarget(String name){
        target.click();
        WebElement w = driver.findElement(By.xpath("//*[contains(text(),'"+name+"')]"));
        waitVisibilityOf(w,10);
        w.click();

    }



    @FindBy(id = "estateCost")
    WebElement cost;
    public void creditcost(String name){
        fillField(cost,name);
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @FindBy(id = "initialFee")
    WebElement initfee;
    public void creditfee(String name){
        fillField(initfee,name);
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @FindBy(id = "creditTerm")
    WebElement term;
    public void creditterm(String name){
        fillField(term,name);
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checkbox(String name){
        WebElement w= driver.findElement(By.xpath("//div[contains(text(),'"+name+"')]/ancestor::div[contains(@class,'dcCalc_switch-desktop')]//label"));
        w.click();
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @FindBy(xpath = "//span[@data-test-id='amountOfCredit']")
    WebElement amount;
    public void chamount(String name){
        String a=amount.getText();
        if(!a.startsWith(name))
            Assert.fail("неверная сумма кредита"+a);
    }

    @FindBy(xpath = "//span[@data-test-id='monthlyPayment']")
    WebElement monthpay;
    public void chmonthpay(String name){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Assert.assertTrue("Неверная сумма ежемесячного платежа", wait.until(ExpectedConditions.textToBePresentInElement(monthpay, name)));
    }

    @FindBy(xpath = "//span[@data-test-id='rate']")
    WebElement rate;
    public void chrate(String name){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Assert.assertTrue("Неверная процентная ставка", wait.until(ExpectedConditions.textToBePresentInElement(rate, name)));
    }
    @FindBy(xpath = "//span[@data-test-id='requiredIncome']")
    WebElement income;
    public void chincome(String name){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Assert.assertTrue("Неверная доход", wait.until(ExpectedConditions.textToBePresentInElement(income, name)));
    }
}
