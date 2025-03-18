public class Calculator {
    public int add(int first, int second) {

        long result = (long) first + second;

        if (result > Integer.MAX_VALUE) {

            throw new IllegalArgumentException("Input is too large");
        }
        return (int) result;
    }
}
