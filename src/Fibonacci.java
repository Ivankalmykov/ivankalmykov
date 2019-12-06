public class Fibonacci {
    public static void main(String[] args) {
        int firstNumber = 0;
        int nextNumber = 1;
        int fibonacci;
        for (int i = 0; i < 10 ; i++) {
            fibonacci = firstNumber + nextNumber;
            firstNumber = nextNumber;
            nextNumber = fibonacci;
            System.out.print(fibonacci +" ");
        }
    }
}

