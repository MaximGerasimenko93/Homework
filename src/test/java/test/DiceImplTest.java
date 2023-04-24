package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.otus.game.DiceImpl;

import static org.junit.jupiter.api.Assertions.*;

public class DiceImplTest {

    DiceImpl diceimpl = new DiceImpl();

    @Test
    @DisplayName("Тест x > 6")
    public void testRollWhenResultBiggerThanSix() {
        int result = diceimpl.roll();
        assertTrue(result < 6, "Результат больше 6");
    }

    @Test
    @DisplayName("Тест x < 0")
    public void testRollWhenResultLessThanNull() {
        int result = diceimpl.roll();
        if (result < 0) {
            System.err.println("Результат меньше 0");
        } else {
            System.out.println("Тест пройден");
        }
    }

    @Test
    @DisplayName("Тест x = 0")
    public void testRollWhenResultIsNotNull() {
        int result = diceimpl.roll();
        assertNotEquals(0, result, "Результат равен 0");
    }
}
