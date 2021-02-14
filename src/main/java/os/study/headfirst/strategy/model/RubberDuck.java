package os.study.headfirst.strategy.model;

import os.study.headfirst.strategy.Squeak;

/**
 * Резиновая утка
 */
public class RubberDuck extends Duck{

    public RubberDuck() {
        Squeak squeak = new Squeak();
        setQuackBehavior(squeak);
    }
}
