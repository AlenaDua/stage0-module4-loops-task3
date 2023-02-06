package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int prev1 = 0, prev2 = 1;
        int sum = 0;
        for (int i = 0; i < lastFibonacci; i++) {
            System.out.println(prev1);
            sum = prev1 + prev2;
            prev1 = prev2;
            prev2 = sum;
        }

    }
}
