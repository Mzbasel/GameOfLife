import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameOfLifeTest {

    @Test
    public void should_return_initial_grid() {
        boolean [][] board = {{true}};
        GameOfLife gameOfLife = new GameOfLife(board);

        boolean[][] expectedGrid = {{true}};
        assertArrayEquals(expectedGrid, gameOfLife.getState());
    }

    @Test
    public void should_return_initial_grid_false() {
        boolean [][] board = {{false}};
        GameOfLife gameOfLife = new GameOfLife(board);

        boolean[][] expectedGrid = {{false}};
        assertArrayEquals(expectedGrid, gameOfLife.getState());
    }

    @Test
    public void live_cell_should_return_false_1_neighbor() {
        boolean [][] board = {{true}};
        GameOfLife gameOfLife = new GameOfLife(board);

        gameOfLife.nextGen();

        assertArrayEquals(new boolean[][] {{false}}, gameOfLife.getState());
    }

    @Test
    public void when_lonely_a_dead_cell_remains_dead_cell() {
        boolean [][] board = {{false}};
        GameOfLife gameOfLife = new GameOfLife(board);

        gameOfLife.nextGen();

        boolean[][] expectedGrid = {{false}};
        assertArrayEquals(expectedGrid, gameOfLife.getState());
    }

    @Test
    public void with_2_cells_one_alive_will_die() {
        boolean [][] board = {{false,true}};
        GameOfLife gameOfLife = new GameOfLife(board);

        gameOfLife.nextGen();

        boolean[][] expectedGrid = {{false, false}};
        assertArrayEquals(expectedGrid, gameOfLife.getState());
    }

    @Test
    public void with_3_cells_one_alive_will_die() {
        boolean [][] board = {{false,false,true}};
        GameOfLife gameOfLife = new GameOfLife(board);

        gameOfLife.nextGen();

        boolean[][] expectedGrid = {{false, false, false}};
        assertArrayEquals(expectedGrid, gameOfLife.getState());
    }

    @Test
    public void with_3_cells_alive_middle_cell_will_live() {
        boolean [][] board = {{true,true,true}};
        GameOfLife gameOfLife = new GameOfLife(board);

        gameOfLife.nextGen();

        boolean[][] expectedGrid = {{false,true,false}};
        assertArrayEquals(expectedGrid, gameOfLife.getState());
    }

    @Test
    public void with_3_cells_2_neighbours_alive_then_all_die() {
        boolean [][] board = {{true,true,false}};
        GameOfLife gameOfLife = new GameOfLife(board);

        gameOfLife.nextGen();

        boolean[][] expectedGrid = {{false,false,false}};
        assertArrayEquals(expectedGrid, gameOfLife.getState());
    }

}