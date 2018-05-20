package steps;

import io.qameta.allure.Step;
import pages.SubMainPage;


public class SubMainSteps {
    @Step("выбор в разделе 'Как подать заявку ' пункт {0}")
    public  void selectField(String name){
        //
        new SubMainPage().selectfield(name);
    }
}
