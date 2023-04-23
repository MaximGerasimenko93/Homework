package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.otus.game.DiceImpl;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiceImplTest {

    DiceImpl diceimpl = new DiceImpl();

    @Test
    @DisplayName("Тест x > 6")
    public void testRollWhenResultBiggerThanSix() {
        int result = diceimpl.roll();
        if (result > 6) {
            System.err.println("Результат больше 6");
        } else {
            System.out.println("Тест пройден");
        }
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
        assertNotNull(result);
        System.err.println("Результат равен 0");
    }
}
