import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainClassTest {

    private MainClass mainClass = new MainClass();

    @Test
    public void testGetLocalNumber() {
        assertEquals(14, mainClass.getLocalNumber(), "Фактический результат не равен 14");
    }

    @Test
    public void testGetClassNumber() {
        assertTrue(mainClass.getClassNumber() > 45,"Фактический результат меньше 45");
    }

    @Test
    public void testGetClassString() {
        String classString = mainClass.getClassString();
        assertThat("Подстрока не найдена", classString, anyOf(
                containsString("hello"),
                containsString("Hello")));
    }
}
