public class Calculator {
    public int add(int first, int second) {

        long result = (long) first + second;

        if (result > Integer.MAX_VALUE) {

            throw new IllegalArgumentException("Input is too large");
        }
        return (int) result;
    }

    public int Subs(int first, int second) {

        long result = (long) first - second;

        if (result < 0) {

            throw new IllegalArgumentException("Result cant be minus!");
        }
        return (int) result;
    }

}
