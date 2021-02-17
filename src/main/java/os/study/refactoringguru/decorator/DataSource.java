package os.study.refactoringguru.decorator;

public interface DataSource {
    void writeData(String string);
    String readData();
}
