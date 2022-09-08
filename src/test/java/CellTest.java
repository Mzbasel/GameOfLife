import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CellTest {

    @Test
    void with_1_dead_neighbour_returns_dead() {
        Cell cell = new Cell();

        cell.setNeighbours(new boolean[] { false });

        assertFalse(cell.getState());
    }

    @Test
    void with_2_dead_neighbours_returns_dead() {
        Cell cell = new Cell();

        cell.setNeighbours(new boolean[] { false, false });

        assertFalse(cell.getState());
    }

    @Test
    void with_2_alive_neighbours_returns_alive() {
        Cell cell = new Cell();

        cell.setNeighbours(new boolean[] { true, true });

        assertTrue(cell.getState());
    }

    @Test
    void with_3_alive_neighbours_returns_alive() {
        Cell cell = new Cell();

        cell.setNeighbours(new boolean[] { true, true, true });

        assertTrue(cell.getState());
    }

    @Test
    void with_4_alive_neighbours_returns_dead() {
        Cell cell = new Cell();

        cell.setNeighbours(new boolean[] { true, true, true, true });

        assertFalse(cell.getState());
    }

    @Test
    void with_maximum_number_of_alive_neighbours_returns_dead() {
        Cell cell = new Cell();

        cell.setNeighbours(new boolean[] { true, true, true, true,  true, true, true, true});

        assertFalse(cell.getState());
    }

}
