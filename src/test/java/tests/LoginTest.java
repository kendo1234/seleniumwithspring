package tests;

import annotations.LazyAutowired;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import cucumber.steps.LoginSteps;

@Execution(ExecutionMode.CONCURRENT)
public class LoginTest extends BaseTest {
    @LazyAutowired
    LoginSteps loginSteps;

    @Test
    public void invalidUserNameInvalidPassword() {
        loginSteps
                .givenIAmAtLoginPage()
                .whenILogin("onur@swtestacademy.com", "11223344")
                .thenIVerifyInvalidLoginMessage();
    }

    @Test
    public void emptyUserEmptyPassword() {
        loginSteps
                .givenIAmAtLoginPage()
                .whenILogin("", "")
                .thenIVerifyUserNameErrorMessages("Lütfen e-posta adresinizi girin.")
                .thenIVerifyPasswordErrorMessage("Bu alanın doldurulması zorunludur.");
    }
}