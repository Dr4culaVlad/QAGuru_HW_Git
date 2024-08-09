import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class first_test {

    @Test
    void succesfulLoginTest() {
        Configuration.holdBrowserOpen = true;
        Configuration.browser = "firefox";


        // Открыть форму авторизации
        open("https://qa.guru/cms/system/logif");
        // Ввести почту
        $("[name=email]").setValue("qagurubot@gmail.com");
        // ввести пароль
        $("[name=password]").setValue("qagurupassword");
        // Нажать кнопку войти
        $(".btn-success").click();
        // Нажать на кнопку "Личный кабинет"
        $(".main-header__login").click();
        // Проверить успешную авторизацию
        $(".logined-form").shouldHave(text("QA_GURU_BOT")).click();
    }


}
