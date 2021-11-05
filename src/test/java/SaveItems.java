import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.element;

public class SaveItems  extends ChromeRunner {
    @Test
    public void cart(){
        $(".btn-cart").click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $("#search_list").setValue("კომპიუტერი");

        Assert.assertEquals("კომპიუტერი", $("#search_list").getValue());

        element(".filter-select-list", 2).click();

        element(".add_to_cart", 0).click();

        $(".btn-cart").click();

//        $(byText("კალათა ცარიელია")).shouldNotBe(Condition.visible);
        Assert.assertFalse($(byText("კალათა ცარიელია")).is(Condition.visible));

        element(".fa-trash", 0).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);

        $(byText("კალათა ცარიელია")).waitUntil(Condition.visible, 5000);
    }

//
    @Test
    public void savedItems(){
        $(".btn-cart").click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);

        $(byText("შენახული ნივთები")).click();
        $(byText("ვერ მოიძებნა")).shouldBe(Condition.visible);

        $("#search_list").setValue("კომპიუტერი");
        element(".filter-select-list", 2).click();
        element(".add_to_cart", 0).click();

        $(".btn-cart").click();
//        $(byText("კალათა ცარიელია")).shouldNotBe(Condition.visible);
        Assert.assertFalse($(byText("კალათა ცარიელია")).is(Condition.visible));
        element(".save-icon", 0).click();
        $(byText("შენახული ნივთები")).click();
//        $(byText("ვერ მოიძებნა")).shouldNotBe(Condition.visible);
        Assert.assertFalse($(byText("ვერ მოიძებნა")).is(Condition.visible));

        $(".btn-cart").click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);

        $(byText("შენახული ნივთები")).click();
        element(".cross_icon", 0).click();
        $(byText("ვერ მოიძებნა")).shouldBe(Condition.visible);
    }
}
