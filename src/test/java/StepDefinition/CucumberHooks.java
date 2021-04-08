package StepDefinition;

import Bussines.constants.Navegador;
import Bussines.drivers.DriverContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;


public  class CucumberHooks {


//    @Before
    @Given("^el usuario ingresa a la pagina de PCFactory \"([^\"]*)\"$")
    public void beforeScenario(String url) {
        DriverContext.setUp(Navegador.Chrome, url);
    }



    @After
    public void afterScenario(Scenario s) {
        DriverContext.quitDriver();
    }



}