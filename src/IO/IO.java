package IO;

import model.Student;

import java.io.*;
import java.util.ArrayList;

 public class IO {
        static File file =new File("C:\\Users\\Admin\\Desktop\\Thi2\\QLySinhVien\\src\\Meneger.txt");


        public static void write(ArrayList<Student> students){
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(students);
                objectOutputStream.close();
                fileOutputStream.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        public static ArrayList<Student> read(){
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                ArrayList<Student> sinhViens = (ArrayList<Student>) objectInputStream.readObject();
                return sinhViens;
            }catch (Exception e){
                e.printStackTrace();
                return new ArrayList<>();
            }
        }
    }

