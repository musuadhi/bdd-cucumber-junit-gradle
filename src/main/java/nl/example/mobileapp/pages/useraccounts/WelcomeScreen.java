//package nl.example.pages;
//import nl.example.utils.DriverSetup;
//import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
//
//public class WelcomeScreen {
//
//    // Element locators
//    private final By loginButton = By.id("nl.nrc.audio:id/loginButton");
//    private final By createAccountButton = By.id("nl.nrc.audio:id/registerButton");
//
//    // Page actions
//    public void assertCreateAccountButton() {
//        try{
//            System.out.println("Validating Create Account button");
//            DriverSetup.getDriver().findElement(createAccountButton);
//        } catch (NoSuchElementException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    public void assertLoginButton() {
//        try{
//            System.out.println("Validating Login button");
//            DriverSetup.getDriver().findElement(loginButton);
//        } catch (NoSuchElementException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    public void clickCreateAccountButton() {
//        try{
//            System.out.println("Tapping on Create Account button");
//            DriverSetup.getDriver().findElement(createAccountButton).click();
//        } catch (NoSuchElementException e){
//            throw new RuntimeException(e);
//        }
//    }
//
//    public void clickLoginButton() {
//        try{
//            System.out.println("Tapping on Login button");
//            DriverSetup.getDriver().findElement(loginButton).click();
//        } catch (NoSuchElementException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
//
//
