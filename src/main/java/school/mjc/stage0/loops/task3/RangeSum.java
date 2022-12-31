package school.mjc.stage0.loops.task3;

public class RangeSum {
    public static void main(String[] args) {
        RangeSum rangeSum = new RangeSum();
        rangeSum.printSumInclusive(2,10);
    }
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        for (int i = firstBoarder; i <=secondBoarder ; i++) {
            System.out.println(i);
        }
    }
}
