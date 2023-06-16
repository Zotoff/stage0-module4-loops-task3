package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        String numStr = t + "";
        for (int i = 0; i < numStr.length(); i++) {
            sum += numStr.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
