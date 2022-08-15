public class PercolationDFSFast extends PercolationDFS {

    /**
     * Initialize a grid so that all cells are blocked.
     *
     * @param n is the size of the simulated (square) grid
     */
    public PercolationDFSFast(int n) {
        super(n);
    }

    @Override
    protected void updateOnOpen(int row, int col) {
        if (row == 0) {
            dfs(row, col);
        } else {
            int[] rowDelta = {-1, 1, 0, 0};
            int[] colDelta = {0, 0, -1, 1};
            for (int i = 0; i < 4; i++) {
                int row1 = row + rowDelta[i];
                int col1 = col + colDelta[i];
                if (inBounds(row1, col1) && isFull(row1, col1)) {
                    dfs(row, col);
                    i = 5;
                }
            }
        }
    }
}