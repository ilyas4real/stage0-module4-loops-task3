package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int n = 0;
        int s = 0;

        for (int i = 1; i <= lengthOfLastNumber; i++) {
            n += 9;
            s += 9;
            n *= 10;
        }
        System.out.println(s);
    }
}
