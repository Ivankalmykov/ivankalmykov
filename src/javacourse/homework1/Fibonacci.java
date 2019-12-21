package javacourse.homework1;

public class Fibonacci {
    public static void main(String[] args) {
        int firstNumber = 0;
        int nextNumber = 1;
        int sumTwoPrevious;
        for (int i = 0; i < 10 ; i++) {
            sumTwoPrevious = firstNumber + nextNumber;
            firstNumber = nextNumber;
            nextNumber = sumTwoPrevious;
            System.out.print(sumTwoPrevious +" ");
        }
    }
}

