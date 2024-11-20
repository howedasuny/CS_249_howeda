package edu.realemj.exercises15.strategy;

public abstract class Bear {
    protected Moveable moveBehavior;

    public Bear(Moveable m) {
        setMoveBehavior(m);
    }

    public void performMove() {
        moveBehavior.move();
    }

    public void setMoveBehavior(Moveable m) {
        moveBehavior = m;
    }
}
