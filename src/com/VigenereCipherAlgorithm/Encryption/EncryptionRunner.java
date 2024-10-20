package com.VigenereCipherAlgorithm.Encryption;

import java.util.Scanner;

public class EncryptionRunner {
    public static void main(String[] args) {
        Encryption encryption = new Encryption();

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("------ Try playing with Vigenere Cipher algorithm ------");
        System.out.println();
        System.out.print("Please enter message : ");
        String message = scanner.nextLine();
        System.out.print("Please enter key : ");
        String key = scanner.next();
        scanner.close();

        encryption.encryptionAlgorithm(message, key);
    }

}
