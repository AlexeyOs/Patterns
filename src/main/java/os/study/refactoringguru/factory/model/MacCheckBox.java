package os.study.refactoringguru.factory.model;

public class MacCheckBox implements CheckBox {
    private String name;

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
