package com.example.demo.PracticeActivities;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import java.io.*;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class PA8C {
    private final SecretKey secretKey;
    private final Cipher cipher;

    PA8C(SecretKey secretKey, String transformation) throws NoSuchPaddingException, NoSuchAlgorithmException {
        this.secretKey = secretKey;
        this.cipher = Cipher.getInstance(transformation);
    }

    void encrypt(String content, String fileName) throws IOException, InvalidKeyException {
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] iv = cipher.getIV();
        // in try with resource create fileOut from FileOutputStream(fileName)
        // and cipherOut from CipherOutputStream(fileOut, cipher)
        try(FileOutputStream fileOut = new FileOutputStream(fileName);
            CipherOutputStream cipherOut = new CipherOutputStream(fileOut, cipher)){
            fileOut.write(iv);
            cipherOut.write(content.getBytes());
        }
        // try ( your code goes here... ) {
        // use fileOut to write iv (byte[]) by calling write() method
        // use cipherOut to write content.getBytes() (byte[]) by calling write() method
        // your code goes here...
        // }
    }

    String decrypt(String fileName) throws IOException, InvalidAlgorithmParameterException, InvalidKeyException {
        String content = "";
        try (FileInputStream fileIn = new FileInputStream(fileName)) {
            byte[] fileIv = new byte[16];
            fileIn.read(fileIv);
            cipher.init(Cipher.DECRYPT_MODE, secretKey, new IvParameterSpec(fileIv));
            // in try with resource create cipherIn from CipherInputStream(fileIn, cipher)
            // and inputReader from InputStreamReader(cipherIn)
            // and reader from BufferedReader(inputReader)
            try(CipherInputStream cipherIn = new CipherInputStream(fileIn, cipher);
                InputStreamReader inputReader = new InputStreamReader(cipherIn);
                BufferedReader reader = new BufferedReader(inputReader)){
                StringBuilder stringBuilder = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    stringBuilder.append(line);
                }
                content = stringBuilder.toString();
            }
            // try ( your code goes here... ) {
            // Create StringBuilder object and String line
            // read line by line from reader and append each line to StringBuilder
            // now content is equals to StringBuilder.toString()
            // your code goes here...
            // }
        }
        return content;
    }
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
        String originalContent = "foobar";
        SecretKey secretKey = KeyGenerator.getInstance("AES").generateKey();
        PA8C fileEncrypterDecrypter = new PA8C(secretKey, "AES/CBC/PKCS5Padding");
        fileEncrypterDecrypter.encrypt(originalContent, "baz.enc");
        String decryptedContent = fileEncrypterDecrypter.decrypt("baz.enc");
        System.out.println("Decrypted content is: " + decryptedContent);
//        new File("baz.enc").delete(); // cleanup
        File file = new File("baz.enc");
        file.deleteOnExit();
    }
}