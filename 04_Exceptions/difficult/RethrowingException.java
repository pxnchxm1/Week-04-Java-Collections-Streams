public class RethrowingException {
    static void performDivisor(int numerator, int denominator) {
        try {
            int res = numerator / denominator;
            System.out.println(res);
        } catch (ArithmeticException e) {
            throw e ;
        }
    }
    static void calculate(int numerator , int denominator) {
        try{
            performDivisor(numerator, denominator);
        }catch(ArithmeticException e){
            System.out.println("Divison by zero error");
        }
    }

    public static void main(String[] args) {
        calculate(10, 0);

    }
}
