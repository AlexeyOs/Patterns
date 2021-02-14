package os.study.headfirst.strategy;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        //Машет крыльями
        System.out.println("Flaps its wings");
    }
}
