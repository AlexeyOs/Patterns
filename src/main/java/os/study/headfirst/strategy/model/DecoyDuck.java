package os.study.headfirst.strategy.model;

import os.study.headfirst.strategy.FlyNoWay;
import os.study.headfirst.strategy.MuteQuack;

/**
 * Утка-приманка
 */
public class DecoyDuck extends Duck{

    public DecoyDuck() {
        FlyNoWay flyNoWay = new FlyNoWay();
        setFlyBehavior(flyNoWay);
        MuteQuack muteQuack = new MuteQuack();
        setQuackBehavior(muteQuack);
    }

}
