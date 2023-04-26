package ru.otus.game;

import java.util.function.Supplier;

public class GameWinnerConsolePrinter implements GameWinnerPrinter {

    @Override
    public Supplier<String> printWinner(Player winner) {
        System.out.printf("Победитель: %s%n", winner.getName());
        return null;
    }
}
