package org.example.pageS;

import com.thoughtworks.gauge.Step;
import org.example.StepImplementation;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class LoginPages extends StepImplementation{
        @Step("Login page doğrulama")
        public void checkLogin(){
            boolean loginButtonVisible = findElement(By.id("com.ozdilek.ozdilekteyim:id/btnLogin")).isDisplayed();
            Assertions.assertTrue(loginButtonVisible,"login sayfası dogrulanmadı");

        }
    }

