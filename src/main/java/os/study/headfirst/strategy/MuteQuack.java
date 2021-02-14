package os.study.headfirst.strategy;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        //Не издаёт звука
        System.out.println("Mute!");
    }
}
