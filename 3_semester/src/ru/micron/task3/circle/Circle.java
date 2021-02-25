package ru.micron.task3.circle;

public class Circle {
    private long r, D;
    private double L, S;

    public void setR(long r) { this.r = r; }
    public void setD() { D = 2 * r; }
    public void setL(double pi) { L = 2 * pi * r; }
    public void setS(double pi) { S = pi * r * r; }

    public long getD() { return D; }
    public double getL() { return L; }
    public long getR() { return r; }
    public double getS() { return S; }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", D=" + D +
                ", L=" + L +
                ", S=" + S +
                '}';
    }
}
