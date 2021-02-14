package os.study.headfirst.strategy;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        //Утка крякает
        System.out.println("Quack");
    }
}
