package ru.gerch.homework_2;

import java.io.Serial;
import java.io.Serializable;

public class Result implements Serializable {

    @Serial
    private static final long serialVersionUID = -3840735463593232623L;

    private double x1;
    private double x2;

    public Result(double x1, double x2){
        this.x1 = x1;
        this.x2 = x2;
    }

    public double getX2() {
        return x2;
    }

    public double getX1() {
        return x1;
    }

    @Override
    public String toString() {
        return "Result{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                '}';
    }
}