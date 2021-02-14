package os.study.headfirst.strategy;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        //Не летает
        System.out.println("Fly no way");
    }
}
