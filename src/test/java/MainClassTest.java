import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainClassTest {

    @Test
    public void testGetLocalNumber() {
        MainClass mainClass = new MainClass();
        assertEquals(14, mainClass.getLocalNumber(), "Фактический результат не равен 14");
    }

}
