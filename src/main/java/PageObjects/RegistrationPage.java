package PageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    protected SelenideElement
        firstNameInput = $("#firstName"),
        lastNameInput = $("#lastName"),
        emailInput = $("#email"),
        passwordInput = $("#password"),
        repeatPasswordInput = $("#confirmPassword"),
        signUpBtn = $("#singup"),
        firstNameMust = $(byText("სახელი სავალდებულოა")),
        lastNameMust = $(byText("გვარი სავალდებულოა")),
        emailMust = $(byText("ელ. ფოსტა სავალდებულოა")),
        passwordMust = $(byText("პაროლი სავალდებულოა.")),
        repeatPasswordMust = $(byText("პაროლის გამეორება სავალდებულოა")),
        goToRegistrationPageBtn = $(byText("რეგისტრაცია")),
        fastRegistrationText = $(byText("სწრაფი რეგისტრაცია"));

}
