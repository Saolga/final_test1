package steps;

import io.qameta.allure.Step;
import pages.MainPage;

public class MainSteps {

    @Step("выбор в меню 'Взять кредит' пункт {0}")
    public  void selectMenu(String subname){
        //
        new MainPage().selectmenu(subname);
    }
}
