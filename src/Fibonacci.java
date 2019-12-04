public class Fibonacci {
    public static void main(String[] args) {
        int Number1 = 0;
        int number2 = 1;
        int fibonacci;
        for (int i = 0; i < 10 ; i++) {
            fibonacci = Number1 + number2;
            Number1 = number2;
            number2 = fibonacci;
            System.out.print(fibonacci +" ");
        }
    }
}

