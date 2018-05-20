package steps;

import io.qameta.allure.Step;
import pages.DomKlik;

public class DomKlikSteps {

    @Step("страница содержит заголовок {0}")
    public  void containsHeader(String name){
        //
        new DomKlik().containsheader(name);
    }

    @Step("Цель кредита {0}")
    public  void creditTarget(String name){
        //
        new DomKlik().credittarget(name);
    }
    @Step("Стоимость {0}")
    public  void creditCost(String name){
        //
        new DomKlik().creditcost(name);
    }
    @Step("Первоначальный взнос {0}")
    public  void creditFee(String name){
        //
        new DomKlik().creditfee(name);
    }
    @Step("Срок {0}")
    public  void creditTerm(String name){
        //
        new DomKlik().creditterm(name);
    }
    @Step("Снят чекбокс {0}")
    public  void checkBox(String name){
        //
        new DomKlik().checkbox(name);
    }
    @Step("сумма кредита {0}")
    public  void chAmount(String name){
        //
        new DomKlik().chamount(name);
    }
    @Step("сумма ежемесячного платежа {0}")
    public  void chMonthpay(String name){
        //
        new DomKlik().chmonthpay(name);
    }
    @Step("процентная ставка {0}")
    public  void chRate(String name){
        //
        new DomKlik().chrate(name);
    }
    @Step("доход {0}")
    public  void chIncome(String name){
        //
        new DomKlik().chincome(name);
    }








}
