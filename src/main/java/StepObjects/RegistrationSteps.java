package StepObjects;

import PageObjects.RegistrationPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

public class RegistrationSteps extends RegistrationPage {

    @Step ("go to registration page")
    public RegistrationSteps goToRegistrationPage(){
        goToRegistrationPageBtn.click();
        Assert.assertTrue(goToRegistrationPageBtn.is(Condition.visible));
        return this;
    }
    @Step ("fill first name, value {first_name}")
    public RegistrationSteps writeFirstName (String first_name) {
        firstNameInput.setValue(first_name);
        firstNameInput.shouldNotBe(Condition.empty);
        return this;
    }
    @Step ("fill lastname, value {last_name}")
    public RegistrationSteps writeLastName (String last_name) {
        lastNameInput.setValue(last_name);
        lastNameInput.shouldNotBe(Condition.empty);
        return this;
    }
    @Step ("fill email, value {email}")
    public RegistrationSteps writeEmail (String email) {
        emailInput.setValue(email);
        emailInput.shouldNotBe(Condition.empty);
        return this;
    }
    @Step ("fill password, value {password}")
    public RegistrationSteps writePassword (String password) {
        passwordInput.setValue(password);
        passwordInput.shouldNotBe(Condition.empty);
        return this;
    }
    @Step ("repeat password, value {repeatPassword}")
    public RegistrationSteps repeatPassword (String repeatPassword) {
        repeatPasswordInput.setValue(repeatPassword);
        repeatPasswordInput.shouldNotBe(Condition.empty);
        return this;
    }
    @Step ("click on sign up btn")
    public RegistrationSteps clickOnSignUpBtn (){
        signUpBtn.click();
//        signUpBtn.shouldNotBe(Condition.enabled);
        return this;
    }
    @Step ("check if sign up btn is enabled ")
    public RegistrationSteps checkSignUpButton (){
        Assert.assertFalse(signUpBtn.is(Condition.enabled));
        return this;
    }
    @Step ("click on inputs")
    public RegistrationSteps checkElementsOnClick(){
        firstNameInput.click();
        lastNameInput.click();
        emailInput.click();
        passwordInput.click();
        repeatPasswordInput.click();
        return this;
    }
    @Step ("check if empty inputs warnings are visible")
    public RegistrationSteps checkEmptyInputsWarningsVisible(){
        Assert.assertTrue(firstNameMust.is(Condition.visible));
        Assert.assertTrue(lastNameMust.is(Condition.visible));
        Assert.assertTrue(emailMust.is(Condition.visible));
        Assert.assertTrue(passwordMust.is(Condition.visible));
//        Assert.assertTrue(repeatPasswordMust.is(Condition.visible));
        return this;
    }
    @Step ("check if empty inputs warnings are invisible")
    public RegistrationSteps checkEmptyInputsWarningsInvisible(){
        Assert.assertFalse(firstNameMust.is(Condition.visible));
        Assert.assertFalse(lastNameMust.is(Condition.visible));
        Assert.assertFalse(emailMust.is(Condition.visible));
        Assert.assertFalse(passwordMust.is(Condition.visible));
        Assert.assertFalse(repeatPasswordMust.is(Condition.visible));
        return this;
    }
    @Step ("check email validation")
    public RegistrationSteps checkWrongEmailValidation (String email){
        emailInput.setValue(email);
        Assert.assertTrue(emailMust.is(Condition.visible));
        return this;
    }
    @Step ("check password validation")
    public RegistrationSteps checkPasswordLength (String password){
        passwordInput.setValue(password);
        Assert.assertFalse(passwordMust.is(Condition.visible));
        return this;
    }
    @Step ("compare password and repeated password")
    public RegistrationSteps comparePasswords (String password, String repeatPassword){
        passwordInput.setValue(password);
        repeatPasswordInput.setValue(repeatPassword);
        Assert.assertFalse(repeatPasswordMust.is(Condition.visible));
        return this;
    }
}
