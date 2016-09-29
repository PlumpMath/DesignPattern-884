package org.yyf.designPattern.behaviorStyle.statePattern;

/**
 * Created by tobi on 16-9-19.
 */
public abstract class State {
    Lift lift;

    public State setLift(Lift lift) {
        this.lift = lift;
        return this;
    }

    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();
}
