package com.test;

import java.io.*;

public class FileProcessor {
    public void writeToFile(String filename, String content) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write(content);
        } catch (IOException e) {
            System.out.println("file not found");
        }
    }

    public String readFile(String filename) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line);
            }
        } catch (IOException e) {
            System.out.println("file not found");
        }
        return content.toString();
    }
}
