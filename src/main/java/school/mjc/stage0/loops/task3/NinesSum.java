package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int ninesSum = 0;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            int currentNumber = (int) Math.pow(10, i) - 1;
            ninesSum += currentNumber;
        }
        System.out.println(ninesSum);
    }

}





