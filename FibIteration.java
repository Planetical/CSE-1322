public class FibIteration implements FindFib{

    @Override
    public int calculate_fix(int num) {
        if (num == 1 || num == 2) {
            return 1;
        } else {
            int numFib = 1;
            int lastNumFib = 1;
            for (int i = 3; i <= num; i++) {
                int hold = numFib;
                numFib += lastNumFib;
                lastNumFib = hold;
            }
            return numFib;
        }
    }
}
