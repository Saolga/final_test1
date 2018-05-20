package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SubMainPage extends BasePage {


    @FindBy(xpath = "//a[contains(@aria-label,'Переход на сайт')]/span")
    List<WebElement> subMenu;


    public void selectfield(String name){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",subMenu.get(0));
        selectCollectionItem(name,subMenu);
    }
}
