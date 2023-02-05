package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    int first = 0;
    int second = 1;
    public void printFibonacci(int lastFibonacci) {
        for(int i = 0; i <= lastFibonacci; i++) {
            System.out.println(first);
            int sum = first + second;
            first = second;
            second = sum;
        }
    }
}
