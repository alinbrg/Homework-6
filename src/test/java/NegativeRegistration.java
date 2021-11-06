import StepObjects.RegistrationSteps;
import Utils.*;
import Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static DataObjects.RegistrationData.*;

@Listeners(Utils.TestLister.class)

public class NegativeRegistration extends ChromeRunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.MINOR)
    @Description("elit electronic registration negative case")

    public void negative_Cases(){
        RegistrationSteps steps = new RegistrationSteps();
        steps
                .goToRegistrationPage()
                .checkSignUpButton()
                .checkElementsOnClick()
                .checkEmptyInputsWarningsVisible()
                .checkWrongEmailValidation(wrongEmail_1)
                .checkWrongEmailValidation(wrongEmail_2)
                .checkWrongEmailValidation(wrongEmail_3)
                .checkPasswordLength(wrongPassword)
                .comparePasswords(password, repeatWrongPassword);
    }
}
