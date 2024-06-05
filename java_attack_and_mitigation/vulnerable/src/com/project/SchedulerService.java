package vulnerable.src.com.project;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class SchedulerService implements Serializable {
    private final Runnable task;

    public SchedulerService(Runnable task) {
        this.task = task;
    }

    private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
        ois.defaultReadObject();
        task.run();
    }
}