package StepObjects;

import PageObjects.RegistrationPage;
import com.codeborne.selenide.Condition;
import org.testng.Assert;

public class RegistrationSteps extends RegistrationPage {
    public RegistrationSteps goToRegistrationPage(){
        goToRegistrationPageBtn.click();
        Assert.assertTrue(goToRegistrationPageBtn.is(Condition.visible));
        return this;
    }
    public RegistrationSteps writeFirstName (String first_name) {
        firstNameInput.setValue(first_name);
        firstNameInput.shouldNotBe(Condition.empty);
        return this;
    }
    public RegistrationSteps writeLastName (String last_name) {
        lastNameInput.setValue(last_name);
        lastNameInput.shouldNotBe(Condition.empty);
        return this;
    }
    public RegistrationSteps writeEmail (String email) {
        emailInput.setValue(email);
        emailInput.shouldNotBe(Condition.empty);
        return this;
    }
    public RegistrationSteps writePassword (String password) {
        passwordInput.setValue(password);
        passwordInput.shouldNotBe(Condition.empty);
        return this;
    }
    public RegistrationSteps repeatPassword (String repeatPassword) {
        repeatPasswordInput.setValue(repeatPassword);
        repeatPasswordInput.shouldNotBe(Condition.empty);
        return this;
    }

    public RegistrationSteps clickOnSignUpBtn (){
        signUpBtn.click();
//        signUpBtn.shouldNotBe(Condition.enabled);
        return this;
    }

    public RegistrationSteps checkSignUpButton (){
        Assert.assertFalse(signUpBtn.is(Condition.enabled));
        return this;
    }
    public RegistrationSteps checkElementsOnClick(){
        firstNameInput.click();
        lastNameInput.click();
        emailInput.click();
        passwordInput.click();
        repeatPasswordInput.click();
        return this;
    }

    public RegistrationSteps checkEmptyInputsWarnings(){
        Assert.assertTrue(firstNameMust.is(Condition.visible));
        Assert.assertTrue(lastNameMust.is(Condition.visible));
        Assert.assertTrue(emailMust.is(Condition.visible));
        Assert.assertTrue(passwordMust.is(Condition.visible));
//        Assert.assertTrue(repeatPasswrodMust.is(Condition.visible));
        return this;
    }

    public RegistrationSteps checkWrongEmailValidation (String email){
        emailInput.setValue(email);
        Assert.assertTrue(emailMust.is(Condition.visible));
        return this;
    }

    public RegistrationSteps checkPasswordLength (String password){
        passwordInput.setValue(password);
        Assert.assertTrue(passwordMust.is(Condition.visible));
        return this;
    }

    public RegistrationSteps comparePasswordsWrong (String password, String repeatPassword){
        passwordInput.setValue(password);
        repeatPasswordInput.setValue(repeatPassword);
        Assert.assertTrue(repeatPasswordMust.is(Condition.visible));
        return this;
    }
}
