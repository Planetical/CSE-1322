import java.lang.Math;
public class FibFormula implements FindFib{

    @Override
    public int calculate_fix(int num) {
        double sqrt5 = Math.sqrt(5);
        double first = (1 + sqrt5) / 2;
        double second = (1 - sqrt5) / 2;
        int newNum = (int) ((Math.pow(first,num) - Math.pow(second,num)) / sqrt5);
        return newNum;
    }
}
