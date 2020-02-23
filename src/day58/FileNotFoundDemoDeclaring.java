package day58;


import java.nio.file.Files;
import java.nio.file.Paths;

public class FileNotFoundDemoDeclaring {
    public static void main(String[] args) throws Exception{
        System.out.println("Before Try catch");

            Files.readAllLines(Paths.get("file.txt"));

    }
}