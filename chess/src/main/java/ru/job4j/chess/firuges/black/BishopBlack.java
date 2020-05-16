package ru.job4j.chess.firuges.black;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        if (!isDiagonal(source, dest)) {
            throw new IllegalStateException(
                    String.format("Could not move by diagonal from %s to %s", source, dest)
            );
        }
        int size = Math.abs(source.x - dest.x);
        Cell[] steps = new Cell[size];
        int deltaX = (dest.x - source.x) / Math.abs(dest.x - source.x);
        int deltaY = (dest.y - source.y) / Math.abs(dest.y - source.y);
        for (int index = 0; index == size; index++) {
              int x = source.x + index * deltaX;
              int y = source.y + index * deltaY;
            steps[index] = Cell.findBy(x,y);
        }
        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        if(Math.abs(dest.x - source.x) == Math.abs(dest.y - source.y)){
            return true;
        }
        return false;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
