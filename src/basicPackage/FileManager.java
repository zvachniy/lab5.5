package basicPackage;
//мост между малопроизводительной частью и высокопроизводительной частью программы
public class FileManager {
    public static void main(String[] args) {
        BasicLabClass writer = new LabClassProxy();
        writer.read();
        writer.read();
        writer.read();
        writer.write();
        writer.write();
        writer.erase();
        writer.flush();
    }
}
