public class Cell {

    private boolean state;

    public Cell() {
        this.state = false;
    }

    public void setNeighbours(boolean[] neighbors) {
        int numberOfAliveNeighbors = 0;
        for (int i = 0; i < neighbors.length; i++) {
            if(neighbors[i]) numberOfAliveNeighbors++;
        }
        if(numberOfAliveNeighbors == 2 || numberOfAliveNeighbors == 3) {
            state = true;
            return;
        };
        state = false;
    }

    public boolean getState() {
        return state;
    }
}
