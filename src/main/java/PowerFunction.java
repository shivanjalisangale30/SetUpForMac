public class PowerFunction {
    public static void main(String[] args) {
        int base = 5;
        int exponent = 2;
        int result = 1;
        for (int limit=1; limit<=exponent; limit++){
            result= result * base;
        }
        System.out.printf("Result of power function is" +result);
    }
}
