package steps;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ScenarioSteps {
    MainSteps mainsteps=new MainSteps();
    SubMainSteps submainsteps = new SubMainSteps();
    DomKlikSteps dksteps = new DomKlikSteps();


    @When("^выбор в меню 'Взять кредит' пункт \"(.+)\"$")
    public  void selectMenu(String subname){
        mainsteps.selectMenu(subname);
    }
    @When("^выбор в разделе 'Как подать заявку' пункт \"(.+)\"$")
    public  void selectField(String subname){
        submainsteps.selectField(subname);
    }
    @Then("^страница содержит заголовок \"(.+)\"$")
    public void containsHeader(String name){
        dksteps.containsHeader(name);
    }

    @When("^Цель кредита \"(.+)\"$")
    public void creditTarget(String name){
        dksteps.creditTarget(name);
    }
    @When("^Стоимость \"(.+)\"$")
    public void creditCost(String name){
        dksteps.creditCost(name);
    }
    @When("^Первоначальный взнос \"(.+)\"$")
    public void creditFee(String name){
        dksteps.creditFee(name);
    }
    @When("^Срок \"(.+)\"$")
    public void creditTerm(String name){
        dksteps.creditTerm(name);
    }
    @When("^Снят чекбокс \"(.+)\"$")
    public void checkBox(String name){
        dksteps.checkBox(name);
    }

    @Then("^сумма кредита \"(.+)\"$")
    public void chAmount(String name){
        dksteps.chAmount(name);
    }
    @Then("^сумма ежемесячного платежа \"(.+)\"$")
    public void chMonthpay(String name){
        dksteps.chMonthpay(name);
    }
    @Then("^процентная ставка \"(.+)\"$")
    public void chRate(String name){
        dksteps.chRate(name);
    }
    @Then("^доход \"(.+)\"$")
    public void chIncome(String name){
        dksteps.chIncome(name);
    }
}
