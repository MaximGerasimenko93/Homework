package ru.otus.game;

import java.util.function.Supplier;

public interface GameWinnerPrinter {

    Supplier<String> printWinner(Player winner);
}
