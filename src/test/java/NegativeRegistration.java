import StepObjects.RegistrationSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;

import static DataObjects.RegistrationData.*;

public class NegativeRegistration extends ChromeRunner {
    @Test
    public void negative_Cases(){
        RegistrationSteps steps = new RegistrationSteps();
        steps
                .goToRegistrationPage()
                .checkSignUpButton()
                .checkElementsOnClick()
                .checkEmptyInputsWarnings()
                .checkWrongEmailValidation(wrongEmail_1)
                .checkWrongEmailValidation(wrongEmail_2)
                .checkWrongEmailValidation(wrongEmail_3)
                .checkPasswordLength(wrongPassword)
                .comparePasswordsWrong(password, repeatWrongPassword);
    }
}
