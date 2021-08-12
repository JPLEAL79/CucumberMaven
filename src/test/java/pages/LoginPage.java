package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath ="//*[@class='linkCuenta']")
    private WebElement buttonIniciarSesión;
    @FindBy(xpath = "//*[@name='logonId']")
    private WebElement campoRut;
    @FindBy(xpath = "//*[@id='Header_GlobalLogin_GlobalLogon']//input[@name='logonPassword']")
    private WebElement campoContraseña;
    @FindBy(xpath = "//*[@class='button_text']")
    private WebElement buttonEntrar;

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void clickIconoIniciarSesión() {
        buttonIniciarSesión.click();

    }

    public void setCampoRut(String rut){
        campoRut.sendKeys(rut);
    }

    public void setCampoContraseña(String contraseña){
        campoContraseña.sendKeys(contraseña);

    }

    public void setButtonEntrar(){
        buttonEntrar.click();
    }

    public boolean isdisplayedForm(){
        return campoRut.isDisplayed();
    }
}
