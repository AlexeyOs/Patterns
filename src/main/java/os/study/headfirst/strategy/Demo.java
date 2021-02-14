package os.study.headfirst.strategy;

import os.study.headfirst.strategy.model.*;

public class Demo {

    public static void main(String[] args) {
        System.out.println("---DecoyDuck---");
        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.performFly();
        decoyDuck.performQuack();

        System.out.println("---MallardDuck---");
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("---RedheadDuck---");
        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.performFly();
        redheadDuck.performQuack();

        System.out.println("---RubberDuck---");
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.performFly();
        rubberDuck.performQuack();
    }

}
