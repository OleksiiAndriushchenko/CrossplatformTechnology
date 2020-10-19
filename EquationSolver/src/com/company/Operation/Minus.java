package com.company.Operation;

public class Minus implements Operation {

    private Operation lhs;
    private Operation rhs;

    public Minus(Operation lhs, Operation rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public double solve(double var) {
        return lhs.solve(var) - rhs.solve(var);
    }

    @Override
    public Operation derivate() {
        return new Minus(lhs.derivate(), rhs.derivate());
    }

    @Override
    public String description() {
        return "(" + lhs.description() + " - " + rhs.description() + ")";
    }
}
