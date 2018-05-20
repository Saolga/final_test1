package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage {
    @FindBy(xpath = "//a[contains(@class,'menu-list__link_level_2')]")
    List<WebElement> subItems;


    public void selectmenu(String subname){            //Взять кредит
        WebElement mainMenu=driver.findElement(By.xpath("//span[contains(text(),'Взять')]//ancestor::li"));
        new Actions(driver).moveToElement(mainMenu).perform();
        waitVisibilityOf(subItems.get(0),15);

        selectCollectionItem(subname,subItems);
    }
}
