# Java gadget chain deserialization attack demo
Compiling the Project
```sh
javac -d bin vulnerable/src/com/project/SchedulerService.java vulnerable/src/com/project/BackupTask.java vulnerable/src/com/project/Main.java attacker/src/com/project/BackupScheduler.java
```

Running the Attack
```sh
java -cp bin attacker.src.com.project.BackupScheduler
```

Running the Project after the attack
```sh
java -cp bin attacker.src.com.project.Main
```
