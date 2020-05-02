/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Set;

/**
 *
 * @author admin
 */
public class Serialization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String file_name = "C:\\Users\\admin\\Desktop\\Amit Kakade\\Java Programs\\Serialization\\demo.txt";

        /**
         * Serialization.
         */
        try {
            Demo demo = new Demo(1, "Amit Kakade");
            try (FileOutputStream file = new FileOutputStream(file_name); ObjectOutputStream os = new ObjectOutputStream(file)) {
                os.writeObject(demo);
            }
        } catch (IOException e) {
            System.out.println("Exception Occour Here.");
        }

        /**
         * Deserialization.
         */
        try {
            try (FileInputStream file_is = new FileInputStream(file_name); ObjectInputStream ois = new ObjectInputStream(file_is)) {
                Demo demo_deserialized = (Demo) ois.readObject();
                System.out.println(demo_deserialized.toString());
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Exception Occour Here");
        }
    }

}
