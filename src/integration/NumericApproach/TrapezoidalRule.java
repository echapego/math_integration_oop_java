package integration.NumericApproach;

import integration.Function;

public class TrapezoidalRule implements NumericApproach {
    @Override
    public double getArea(Function function, double left, double right) {
        return 0.5 * (function.f(left) + function.f(right)) * (right - left);
    }
}
