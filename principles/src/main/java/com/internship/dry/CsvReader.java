package com.internship.dry;

import java.io.*;

public class CsvReader {
    public static void csvReader(String csvFile) throws IOException {
        File file1 = new File(csvFile);
        BufferedReader bf = new BufferedReader(new FileReader(file1));

        String st;
        while ((st= bf.readLine())!=null) System.out.println(st);
    }
}
