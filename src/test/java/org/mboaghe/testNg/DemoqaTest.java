package org.mboaghe.testNg;

import org.mboaghe.pom.Forma;
import org.testng.annotations.Test;

public class DemoqaTest extends BasicTest {

    public static String URL = "https://demoqa.com/automation-practice-form";
    public static String FIRST_NAME = "Maslincova";
    public static String LAST_NAME = "Anastasia";
    public static String EMAIL = "anasmas964224@gmail.com";
    public static String GENDER = "Female";
    public static String NUMBER = "1234567890";
    public static String BIRT_DAY = "23 Apr 2000";
    public static String STATE = "Rajasthan";
    public static String City = "Jaipur";

    @Test
    public void regFormaTest() {
        logger.info("Start forma test");
        driver.get(URL);
        driver.manage().window().maximize();
        Forma forma = new Forma(driver);
        forma.setFirstName(FIRST_NAME);
        forma.setLastName(LAST_NAME);
        forma.setEmail(EMAIL);
        forma.setUserNumber(NUMBER);
        forma.selectGender(GENDER);

        logger.info("Finish forma test");

    }
}
