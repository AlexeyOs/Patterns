package os.study.headfirst.strategy.model;

import os.study.headfirst.strategy.FlyBehavior;
import os.study.headfirst.strategy.FlyWithWings;
import os.study.headfirst.strategy.Quack;
import os.study.headfirst.strategy.QuackBehavior;

public class Duck {

    Duck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void swim(){
        System.out.println("Bul bul");
    }

    public void display(){
        System.out.println("Show");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }
    
}
