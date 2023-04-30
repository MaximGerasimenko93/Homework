package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.otus.game.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

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

        assertNotEquals(resultPlayer1, resultPlayer2, "Ничья! Перебросьте кубики");
    }

    @Test
    @DisplayName("Победа первого игрока")
    public void testWhenFirstWinnerPlayer() {

    }

//    @Test
//    public void testIfFirstPlayerWinner() {
//        game.playGame(player1, player2);
//        int resultPlayer1 = dice.roll();
//        int resultPlayer2 = dice.roll();
//
//        assertTrue(resultPlayer1 > resultPlayer2, "Победа второго игрока");
//    }
//
//    @Test
//    public void testIfSecondPlayerWinner() {
//        game.playGame(player1, player2);
//        int resultPlayer1 = dice.roll();
//        int resultPlayer2 = dice.roll();
//
//        assertTrue(resultPlayer2 > resultPlayer1, "Победа первого игрока");
//    }
}

