package ru.job4j.chess.firuges.white;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class BishopWhite implements Figure {
    private final Cell position;

    public BishopWhite(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        int size = Math.abs(source.x - dest.x);
        Cell[] steps = new Cell[size];
        int incrementX = dest.x - source.x;
        int incrementY = dest.y - source.y;
        int x = source.x;
        int y = source.y;
        for (int index = 0; index < size; index++) {
            if(incrementX > 0){
                x = x + 1;
            } else{x = x - 1;}
            if(incrementY > 0) {
                y = y + 1;
            } else{y = y - 1;}
            steps[index] = Cell.findBy(x,y);
        }
        return steps;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopWhite(dest);
    }
}
