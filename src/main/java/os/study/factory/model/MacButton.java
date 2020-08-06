package os.study.factory.model;

public class MacButton implements Button {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
