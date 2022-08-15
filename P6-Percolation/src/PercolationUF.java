import java.util.*;
public class PercolationUF implements IPercolate{
    private boolean [][] myGrid;
    private int myOpenCount;
    private IUnionFind myFinder;
    private final int VTOP;
    private final int VBOTTOM;

    public PercolationUF(IUnionFind finder, int size) {
        myGrid = new boolean [size][size];
        for (int i = 0; i<size;i++){
            for (int j = 0; j<size; j++) {
                myGrid[i][j] = false;
            }
        }
        myOpenCount = 0;
        myFinder = finder;
        myFinder.initialize(size*size+2);
        VTOP = myGrid.length*myGrid[0].length;
        VBOTTOM = VTOP+1;
    }

    @Override
    public void open(int row, int col) {
        if (!inBounds(row, col)) {
            throw new IndexOutOfBoundsException(
                    String.format("(%d,%d) not in bounds", row, col));
        }
        if (myGrid[row][col]) {
            return;
        }
        myGrid[row][col] = true;
        myOpenCount++;
        int num1 = row * myGrid.length + col;
        int[] rowDelta = {-1, 1, 0, 0};
        int[] colDelta = {0, 0, -1, 1};
        for (int i = 0; i < rowDelta.length; i++) {
            int rowD = rowDelta[i] + row;
            int colD = colDelta[i] + col;
            int num2 = rowD * myGrid.length + colD;
            if (inBounds(rowD,colD) && isOpen(rowD, colD) && !myFinder.connected(num1,num2) ){
                myFinder.union(num1, num2);
            }
            if (num1>=(myGrid.length * (myGrid[0].length - 1))&& !myFinder.connected(num1,VBOTTOM )){
                    myFinder.union(num1, VBOTTOM);
                }

        }
        if (num1 < myGrid.length && !myFinder.connected(num1,VTOP)) {
            myFinder.union(VTOP, num1);
        }

        }


    private boolean inBounds(int row, int col) {
        if (row>=myGrid.length||row<0) return false;
        if (col>=myGrid[0].length||col<0) return false;
        return true;
    }

    @Override
    public boolean isOpen(int row, int col) {
        if (! inBounds(row,col)) {
            throw new IndexOutOfBoundsException(
                    String.format("(%d,%d) not in bounds", row,col));
        }
        return myGrid[row][col];
    }

    @Override
    public boolean isFull(int row, int col) {
        if (!inBounds(row, col)) {
            throw new IndexOutOfBoundsException(
                    String.format("(%d,%d) not in bounds", row, col));
        }
        int num = row * myGrid.length + col;
        return myFinder.connected(num,VTOP);
    }

    @Override
    public boolean percolates() {
        return myFinder.connected(VTOP,VBOTTOM);
    }

    @Override
    public int numberOfOpenSites() {
        return myOpenCount;
    }
}
