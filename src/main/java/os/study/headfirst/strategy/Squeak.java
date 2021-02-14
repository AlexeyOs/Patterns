package os.study.headfirst.strategy;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        //Резиновая утка пищит
        System.out.println("Squeak");
    }
}
