package com.example.demo.PracticeActivities;

import java.io.*;
public class PA8A {
    public static void backupImages() throws IOException {
        String sourceDir = "src/main/java/com/example/demo/images/";
        String targetDir = "src/main/java/com/example/demo/Img/";
        File dir = new File(sourceDir);
        File[] files = dir.listFiles();
        byte[] buffer = new byte[4096];
        int bytesRead;
        for (File f : files) {
            if (f.isFile() && f.getName().endsWith(".png")) {
                try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
                     BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetDir + f.getName()))) {
                    while ((bytesRead = bis.read(buffer)) != -1) {
                        bos.write(buffer, 0, bytesRead);
                    }
                    System.out.println("For " + f.getName() + " " + f.length() + " bytes copied");
                }
            }
        }
    }
    public static void main(String[] args) {
        try {
            backupImages();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}