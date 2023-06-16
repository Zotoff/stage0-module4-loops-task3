package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum = 0;
        if (firstBoarder == secondBoarder) {
            sum = firstBoarder;
        } else if (firstBoarder % secondBoarder == 0) {
            sum = 0;
        }
        else
        {
            for (int i = firstBoarder; i < secondBoarder; i++) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
