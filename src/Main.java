public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++) {
            long factorial = 1;
            for(int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.println("Factorial of " + i + " is " + factorial);
        }
    }
}


