package basicPackage;

public class BasicLabClass {
    public void read(){
        System.out.println("Read at " + System.currentTimeMillis());
    }
    public void write(){
        System.out.println("Write at " + System.currentTimeMillis());
    }
    public void flush() {
        System.out.println("Flushing at " + System.currentTimeMillis());
    }
    public void erase(){
        System.out.println("Erasing the file at " + System.currentTimeMillis());
    }
}
