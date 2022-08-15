import java.util.*;

public class PercolationBFS extends PercolationDFSFast {
    /**
     * Initialize a grid so that all cells are blocked.
     *
     * @param n is the size of the simulated (square) grid
     */
    public PercolationBFS(int n) {
        super(n);
    }
    @Override
    protected void dfs(int row, int col) {
        if (!inBounds(row,col) || isFull(row, col) || !isOpen(row, col)) {
            return;
        }
        Queue<int[]> q = new LinkedList<>();
        myGrid[row][col] = FULL;
        q.add(new int[]{row, col});
        int[] rowDelta = {-1, 1, 0, 0};
        int[] colDelta = {0, 0, -1, 1};
        while (q.size() != 0) {
            int[] val = q.remove();
            for (int i = 0; i < rowDelta.length; i++) {
                row = val[0] + rowDelta[i];
                col = val[1] + colDelta[i];
                if (inBounds(row, col) && !isFull(row,col) && isOpen(row,col)) {
                    q.add(new int[]{row, col});
                    myGrid[row][col] = FULL;
                }
            }
        }
    }
}