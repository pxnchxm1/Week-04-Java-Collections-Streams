@FunctionalInterface
interface SquareCalculator {
    int calculateSquare(int number); 

    default void printSquare(int number) { 
        System.out.println("The square of " + number + " is: " + calculateSquare(number));
    }
}

public class CalcSquare {
    public static void main(String[] args) {
   
        SquareCalculator sc = num -> num * num;
        sc.printSquare(5);
        sc.printSquare(10);
    }
}
