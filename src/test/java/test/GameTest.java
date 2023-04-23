package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.otus.game.*;

public class GameTest {

    private Dice dice = new DiceImpl();
    private GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();

    Game game = new Game(dice, winnerPrinter);

    @Test
    @DisplayName("Проверка на ничью")
    public void testEqualResult() {
        int player1Result = dice.roll();
        int player2Result = dice.roll();

        if (player1Result == player2Result) {
            System.err.println("Ничья. Перебросьте кубики");
        } else {
            System.out.println("Игра продолжается");
        }
    }
}
