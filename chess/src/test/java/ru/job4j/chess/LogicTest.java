package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LogicTest {

    @Test
    public void moveWayNotClean() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.E3));
        boolean rsl = logic.move(Cell.C1, Cell.H6);
        assertThat(rsl, is(false));
    }

    @Test
    public void moveWayIsClean() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        boolean rsl = logic.move(Cell.C1, Cell.H6);
        assertThat(rsl, is(true));
    }

    @Test
    public void wayNotFree() {
        Figure figure = new BishopBlack(Cell.C1);
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.E3));
        Cell[] steps = figure.way(Cell.C1, Cell.H6);
        boolean rsl = logic.isWayFree(steps);
        assertThat(rsl, is(true));
    }

    @Test
    public void wayIsFree() {
        Figure figure = new BishopBlack(Cell.C1);
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        Cell[] steps = figure.way(Cell.C1, Cell.H6);
        boolean rsl = logic.isWayFree(steps);
        assertThat(rsl, is(false));
    }
}