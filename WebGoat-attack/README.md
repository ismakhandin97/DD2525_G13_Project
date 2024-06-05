# WebGoat deserialization attack
Add this folder to the WebGoat project 
Compile it
```sh
cd attack/src
javac org.dummy.insecure.framework/Attacker.java org.dummy.insecure.framework/VulnerableTaskHolder.java 
```

Run it
```sh
java org.dummy.insecure.framework.Attacker
```

Finally, add the obtained output to the WebGoat serialized input and this will exploit it
