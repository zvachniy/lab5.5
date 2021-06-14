package basicPackage;

import java.util.LinkedList;

public class LabClassProxy extends BasicLabClass{
    private LinkedList <String> actions = new LinkedList<String>();

    @Override
    public void read() {
        actions.add("Read at " + System.currentTimeMillis());
    }

    @Override
    public void write() {
        actions.add("Write at " + System.currentTimeMillis());
    }

    @Override
    public void flush() {
        for (String action: actions) {
            if (action.contains("Read")) {
                super.read();
            }
            if (action.contains("Write")) {
                super.write();
            }
            if (action.contains("Erasing")) {
                super.erase();
            }

        }
        actions.clear();
    }
    @Override
    public void erase() {
        actions.add("Erasing the file at " + System.currentTimeMillis());
    }
}
