package org.mboaghe.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    public static WebDriver driver;

    @FindBy(id = "user-name")
    WebElement loginNameEl;

    @FindBy(id = "password")
    WebElement loginPasswordEl;

    @FindBy(xpath = "//*[@id='login-button'] ")
    WebElement sendEl;

    @FindBy(xpath = "//*[text()='Products']")
    WebElement productsEl;



    public Login(WebDriver driver) {
        Login.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setUserName(String userNameParam) {
        loginNameEl.sendKeys(userNameParam);
    }

    public void setUserPassword(String userPasswordParam) {
        loginPasswordEl.sendKeys(userPasswordParam);
    }
    public void clickSend() {
        sendEl.click();
    }

    public String getTitleText(){
       return productsEl.getText();
    }

}
