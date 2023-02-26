public class Calculator implements CalcOp {

    @Override
    public float add(float first, float second) {
        return first + second;
    }

    @Override
    public float subtract(float first, float second) {
        return first - second;
    }

    @Override
    public float multiply(float first, float second) {
        return first * second;
    }

    @Override
    public float division(float first, float second) {
        return first / second;
    }
}
