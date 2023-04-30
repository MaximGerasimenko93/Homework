package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.otus.game.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class GameTest {

    @Mock
    Dice dice;
    @Mock
    GameWinnerPrinter winnerPrinter;
    @InjectMocks
    Game game;
    Player player1 = new Player("TestName1");
    Player player2 = new Player("TestName2");

    @Test
    @DisplayName("Победа первого игрока")
    public void testWhenFirstWinnerPlayer() {
        when(dice.roll()).thenReturn(6).thenReturn(4);
        game.playGame(player1, player2);
        verify(winnerPrinter).printWinner(eq(player1));
    }

    @Test
    @DisplayName("Победа второго игрока")
    public void testWhenSecondWinnerPlayer() {
        when(dice.roll()).thenReturn(5).thenReturn(6);
        game.playGame(player1, player2);
        verify(winnerPrinter).printWinner(eq(player2));
    }

    @Test
    @DisplayName("Ничья")
    public void testWhenEqualsResult() {
        when(dice.roll()).thenReturn(5).thenReturn(5);
        game.playGame(player1, player2);
        verify(winnerPrinter).printWinner(eq(player2));
    }
}

