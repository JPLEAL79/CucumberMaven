package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

    @CacheLookup
    @FindBy(xpath ="//*[@class='header__search-form__inputApp']")
    private WebElement searchBox;
    @FindBy (xpath = "//*[@class='header__search-form__submitApp']")
    private WebElement clickButton;
    @FindBy(xpath = "//*[@class='box_categorias']")
    private WebElement resultPage;



    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void setClickButton(){
        clickButton.click();
    }

    public void setSearchBox(String articulo){
        searchBox.sendKeys(articulo);
    }


    public boolean homePageIsdisplayed(){
      return searchBox.isDisplayed();
    }

    public boolean searchResults(){
        return resultPage.isDisplayed();
    }
}
