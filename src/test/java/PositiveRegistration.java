import StepObjects.RegistrationSteps;
import Utils.*;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static DataObjects.RegistrationData.*;

@Listeners(Utils.TestLister.class)

public class PositiveRegistration extends ChromeRunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("elit electronic registration positive case")


    public void positive_case(){
        RegistrationSteps steps = new RegistrationSteps();
        steps
                .goToRegistrationPage()
                .writeFirstName(firstName)
                .writeLastName(lastName)
                .writeEmail(email)
                .writePassword(password)
                .repeatPassword(repeatPassword)
                .checkEmptyInputsWarningsInvisible()
                .clickOnSignUpBtn();
    }
}
