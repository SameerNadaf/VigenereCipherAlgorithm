package com.VigenereCipherAlgorithm.Decryption;

import java.util.Scanner;

public class DecryptionRunner {
    public static void main(String[] args) {
        Decryption decryption = new Decryption();

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("------ Try playing with Vigenere Cipher algorithm ------");
        System.out.println();
        System.out.print("Enter the Ciphertext : ");
        String cipherText = sc.nextLine();
        System.out.print("Enter the Key : ");
        String key = sc.next();
        sc.close();

        decryption.decryptionAlgorithm(cipherText, key);
    }

}
