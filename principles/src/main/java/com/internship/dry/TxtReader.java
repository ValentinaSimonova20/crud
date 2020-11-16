package com.internship.dry;
import java.io.*;

public class TxtReader {
    public static void readTxtFile(String file) throws IOException {
        File file1 = new File(file);
        BufferedReader bf = new BufferedReader(new FileReader(file1));

        String st;
        while ((st= bf.readLine())!=null) System.out.println(st);
    }
}
