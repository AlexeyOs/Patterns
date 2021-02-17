package os.study.refactoringguru.prototype;

public class Course implements Prototype {
    private String name;
    private String subject;
    private String platform;

    public Course(String name, String subject, String platform) {
        this.name = name;
        this.subject = subject;
        this.platform = platform;
    }

    public Course(Course cloneable) {
        if (cloneable != null) {
            this.name = cloneable.name;
            this.subject = cloneable.subject;
            this.platform = cloneable.platform;
        }
    }

    @Override
    public Course clone() {
        return new Course(this);
    }
}