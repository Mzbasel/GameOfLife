import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameOfLifeTest {

    @Test
    public void should_return_initial_grid() {
        boolean [][] board = {{true}};
        GameOfLife gameOfLife = new GameOfLife(board);
        Assertions.assertArrayEquals(new boolean[][] {{true}}, gameOfLife.getState());
    }

    @Test
    public void should_return_initial_grid_false() {
        boolean [][] board = {{false}};
        GameOfLife gameOfLife = new GameOfLife(board);
        Assertions.assertArrayEquals(new boolean[][] {{false}}, gameOfLife.getState());
    }

    @Test
    public void live_cell_should_return_false_1_neighbor() {
        boolean [][] board = {{true}};
        GameOfLife gameOfLife = new GameOfLife(board);
        gameOfLife.nextGen();
        Assertions.assertArrayEquals(new boolean[][] {{false}}, gameOfLife.getState());
    }

    @Test
    public void when_lonely_a_dead_cell_remains_dead_cell() {
        boolean [][] board = {{false}};
        GameOfLife gameOfLife = new GameOfLife(board);
        gameOfLife.nextGen();
        Assertions.assertArrayEquals(new boolean[][] {{false}}, gameOfLife.getState());
    }

}