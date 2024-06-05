package vulnerable.src.com.project;

import java.io.IOException;
import java.io.Serializable;

public class BackupTask implements Runnable, Serializable {
    private final String command;
    // private transient final String command;

    public BackupTask(String command) {
        this.command = command;
    }

    @Override
    public void run() {
        try {
            Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}