package os.study.headfirst.strategy.model;

import os.study.headfirst.strategy.FlyWithWings;

/**
 * Крякающая утка
 */
public class MallardDuck extends Duck{

    public MallardDuck(){
        FlyWithWings flyWithWings = new FlyWithWings();
        setFlyBehavior(flyWithWings);
    }
}
