import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CardTest {

    @Test
    void shouldTest() {
        open("http://localhost:9999");
        $("span[data-test-id=name] input").setValue("Марина");
        $("span[data-test-id=phone] input").setValue("+79234022253");
        $("[data-test-id=agreement]").click();
        $("[.button[data-test-id=submit]]").click();
        $(".order-success").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }


}
