import StepObjects.RegistrationSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;

import static DataObjects.RegistrationData.*;

public class PositiveRegistration extends ChromeRunner {
    @Test
    public void positive_case(){
        RegistrationSteps steps = new RegistrationSteps();
        steps
                .goToRegistrationPage()
                .writeFirstName(firstName)
                .writeLastName(lastName)
                .writeEmail(email)
                .writePassword(password)
                .repeatPassword(repeatPassword)
                .clickOnSignUpBtn();
    }
}
