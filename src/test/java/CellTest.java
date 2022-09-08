import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CellTest {

    @Test
    void dead_cell_returns_false_state() {
        Cell cell = new Cell(false);

        assertFalse(cell.getState());
    }

    @Test
    void alive_cell_returns_true_state() {
        Cell cell = new Cell(true);

        assertTrue(cell.getState());
    }

    @Test
    void dead_cell_with_1_dead_neighbour_returns_dead() {
        Cell cell = new Cell(false);

        cell.setNeighbours(new boolean[] { false });

        assertFalse(cell.getState());
    }

}
