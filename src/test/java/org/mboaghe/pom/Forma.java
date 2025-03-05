package org.mboaghe.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forma {
    public static WebDriver driver;

    @FindBy(id = "firstName")
    WebElement firstNameEl;

    @FindBy(id = "lastName")
    WebElement LastNameEl;

    @FindBy(id = "userEmail")
    WebElement userEmailEl;

    @FindBy(id = "userNumber")
    WebElement userNumberEl;

    @FindBy(id = "state")
    WebElement stateEl;

    @FindBy(id = "city")
    WebElement cityEl;

    @FindBy(id = "submit")
    WebElement submitEl;

    public Forma(WebDriver driver) {
        Forma.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void steState(String stateParam) {

    }

    public void setUserNumber(String numberParam) {
        userNumberEl.sendKeys(numberParam);

    }

    public void setFirstName(String firstNameParam) {
        firstNameEl.sendKeys(firstNameParam);
    }

    public void setLastName(String lastNameParam) {
        LastNameEl.sendKeys(lastNameParam);
    }

    public void setEmail(String emailParam) {
        userEmailEl.sendKeys(emailParam);
    }


    public void selectGender(String genderParam) {
        WebElement labelEl = driver.findElement(By.xpath("//*[@id='genterWrapper']//label[text()='" + genderParam + "']"));
        labelEl.click();
    }
}
