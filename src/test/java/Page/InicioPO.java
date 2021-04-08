package Page;

import Bussines.drivers.DriverContext;
import StepDefinition.StepBusqueda;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class InicioPO {

    private WebDriver driver;


    public InicioPO() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//*[@id='search']")
    private WebElement inputTextBusqueda;

    @FindBy(xpath = "//*[@id='search_btn']")
    private WebElement btnBusqueda;

    @FindBy(xpath = "//*[@id='seccion-banner-bajo']/a/img")
    private WebElement imgBanner2;

    public void insertarProducto(String producto){
        inputTextBusqueda.sendKeys(producto);
    }

    public void clickBtnBuscar(){
        btnBusqueda.click();
    }

    public void clickBannerDos(){
        imgBanner2.click();
    }


}
