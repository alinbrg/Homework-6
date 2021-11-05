package DataObjects;

import com.github.javafaker.Faker;

public interface RegistrationData {
    Faker faker = new Faker();

    String
        firstName = faker.name().firstName(),
        lastName = faker.name().lastName(),
        email = faker.internet().emailAddress(),
        password = faker.internet().password(),
        repeatPassword = password,
        wrongPassword = "alin",
        repeatWrongPassword = "alina",
        wrongEmail_1 = "test",
        wrongEmail_2 = wrongEmail_1 + "@",
        wrongEmail_3 = wrongEmail_2 + "gmail";


}
