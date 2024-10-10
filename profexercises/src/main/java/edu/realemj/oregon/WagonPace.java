package edu.realemj.oregon;

public enum WagonPace {
    SLOW(7),
    NORMAL(15),
    FAST(18);

    private double milesPerDay;

    private WagonPace(double milesPerDay) {
        this.milesPerDay = milesPerDay;
    }

    public double getMilesPerDay() {
        return milesPerDay;
    }
}
