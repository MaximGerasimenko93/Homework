package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.otus.game.*;

public class GameTest {

    private Dice dice = new DiceImpl();
    private GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();

    Game game = new Game(dice, winnerPrinter);

    Player player1 = new Player("TestName1");
    Player player2 = new Player("TestName2");

    @Test
    @DisplayName("Проверка на ничью")
    public void testEqualResult() {

        game.playGame(player1, player2);
        int resultPlayer1 = dice.roll();
        int resultPlayer2 = dice.roll();

        if (resultPlayer1 == resultPlayer2) {
            System.err.println("Ничья! Перебросьте кубики");
        } else {
            System.out.println("Игра продолжается");
        }
    }

    @Test
    @DisplayName("Проверка на победу")
    public void testToDefineWinner() {
        int resultPlayer1 = dice.roll();
        int resultPlayer2 = dice.roll();

        if (resultPlayer1 > resultPlayer2) {
            winnerPrinter.printWinner(player1);
        } else {
            winnerPrinter.printWinner(player2);
        }
    }
}
