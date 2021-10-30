package org.example.pageS;

import com.thoughtworks.gauge.Step;
import org.example.StepImplementation;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class CategoryPage extends StepImplementation {
    @Step("Kategori Sayfası Kontrol")
    public void checkCategoryPage(){
        String textCheck = findElement(By.xpath("//android.widget.LinearLayout[@content-desc='Kategoriler']")).getAttribute("content-desc");
        Assertions.assertEquals("Kategoriler",textCheck,"Kategori sayfası hatalı");

    }
}
