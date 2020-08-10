package os.study.decorator;

public interface DataSource {
    void writeData(String string);
    String readData();
}
