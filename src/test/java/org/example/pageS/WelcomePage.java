package org.example.pageS;

import com.thoughtworks.gauge.Step;
import org.example.StepImplementation;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class WelcomePage  extends StepImplementation {

        @Step("Açılış Sayfası Kontrol")
        public void open() {
            String alisveriseBaslaBtn = findElement(By.id("com.ozdilek.ozdilekteyim:id/tv_startShoppingStore")).getText();
            Assertions.assertEquals("ALIŞVERİŞE BAŞLA",alisveriseBaslaBtn,"Hatalı alışveris Butonu");

        }
    }
