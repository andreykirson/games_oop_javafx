package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    //1. Проверка метода position. Создайте объект и вызовите у него метод position.
    // Проверьте, что он занимает ту же ячейку, что и при создании объекта.
    @Test
    public void position() {
        Figure figure = new BishopBlack(Cell.F1);
        Cell excpectedPosition = figure.position();
        assertThat(Cell.F1, is(excpectedPosition));
    }

    //Далее создайте тест-метод для проверки метода way.
//
//Для этого создайте объект с начальным положеним C1. Вызовите метод way с указанием C1 и G5.
// Метод должен вернуть массив из 4 клеток. D2, E3, F4, G5.
//После этого реализуйте метод way.
    @Test
    public void way() {
        Figure figure = new BishopBlack(Cell.C1);
        Cell[] cells = figure.way(Cell.C1, Cell.G5);
        Cell[] expected = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(cells, is(expected));
    }

    //2. Проверка метода copy. Создайте объект и вызовите у него метод copy.
    // Проверьте, что возвращенный объект имеет правильную позицию.

    @Test
    public void copy() {
        Figure figure = new BishopBlack(Cell.A6);
        Figure expectedFigure = figure.copy(Cell.A6);
        assertThat(Cell.A6, is(expectedFigure.position()));
        System.out.println();

    }
}