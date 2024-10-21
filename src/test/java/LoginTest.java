
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest {

    @Test
    void successfullLoginTest(){
        Configuration.holdBrowserOpen = true;

        open("https://school.qa.guru/cms/system/login?required=true");
        $(".xdget-loginUserForm")
                .shouldHave(Condition.text("Войти"));
        $("[name=email]").setValue("t0l4ik.kas1@gmail.com");
        $("[name=password]").setValue("pa$$w0rd");
        //$(".form-control.form-field-email").setValue("t0l4ik.kas1@gmail.com");

    }

    @Test
    void UnSuccessfullLoginTest(){
        Configuration.holdBrowserOpen = true;

        open("https://school.qa.guru/cms/system/login?required=true");
        $(".xdget-loginUserForm")
                .shouldHave(Condition.text("Войти"));
        $("[name=email]").setValue("t0l4ik.kas1@gmail.com");
        $("[name=password]").setValue("pa$$w0rd");
        //$(".form-control.form-field-email").setValue("t0l4ik.kas1@gmail.com");

    }

    @Test
    void shouldOpen() {
        String date = "14.02.1996";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate.parse(date, formatter);
    }
    


}
