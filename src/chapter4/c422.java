package chapter4;

public class c422 {

    public static void main(String[] args) {
        System.out.println("N\t10*N\t100*N\t1000*N");

        for (int N = 1; N <= 5; N++) {
            int tenTimesN = 10 * N;
            int hundredTimesN = 100 * N;
            int thousandTimesN = 1000 * N;

            System.out.printf("%d\t%d\t%d\t%d%n", N, tenTimesN, hundredTimesN, thousandTimesN);
        }
    }
}
