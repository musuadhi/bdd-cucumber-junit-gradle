//package nl.example.pages;
//
//import nl.example.utils.DriverSetup;
//import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
//
//public class LoginScreen {
//
//    // Element locators
//    private final By emailField = By.id("nl.nrc.audio:id/email");
//    private final By passwordField = By.id("nl.nrc.audio:id/password");
//    private final By newsLetterCheckbox = By.id("nl.nrc.audio:id/additionalNewsLetterCheckbox");
//    private final By forgotPasswordLink = By.id("nl.nrc.audio:id/forgotPassword");
//    private final By loginButton = By.id("nl.nrc.audio:id/loginButton");
//
//
//    // Page actions
//    public void assertEmailField() {
//        try{
//            System.out.println("Validating Email Field");
//            DriverSetup.getDriver().findElement(emailField);
//        } catch (NoSuchElementException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    public void assertPasswordField() {
//        try{
//            System.out.println("Validating Password Field");
//            DriverSetup.getDriver().findElement(passwordField);
//        } catch (NoSuchElementException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    public void assertLoginButton() {
//        try {
//            System.out.println("Validating Login button");
//            DriverSetup.getDriver().findElement(loginButton);
//        } catch (NoSuchElementException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    // Write code to validate other elements
//
//    public void enterUsername(String username) {
//        try{
//            DriverSetup.getDriver().findElement(emailField).sendKeys(username);
//        } catch (NoSuchElementException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    public void enterPassword(String password) {
//        try {
//            DriverSetup.getDriver().findElement(passwordField).sendKeys(password);
//        } catch (NoSuchElementException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    public void clickLoginButton() {
//        try{
//            System.out.println("Tapping on Login button");
//            DriverSetup.getDriver().findElement(loginButton).click();
//        } catch (NoSuchElementException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//}
