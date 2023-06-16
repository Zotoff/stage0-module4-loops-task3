package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int f1 = 0;
        int f2 = 1;
        int f;
        System.out.println(f1);
        System.out.println(f2);
        for(int i= 3; i<=lastFibonacci; i++){
            f = f2 + f1;
            f1 = f2;
            f2 = f;
            System.out.println(f);
        }
    }
}
