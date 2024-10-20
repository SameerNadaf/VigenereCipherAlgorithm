package com.VigenereCipherAlgorithm.Decryption;

import com.VigenereCipherAlgorithm.Encryption.HelperClass;

public class Decryption {
    public void decryptionAlgorithm(String cipherText, String key) {
        String messageInput = cipherText.toLowerCase();
        String keyInput = key.toLowerCase();
        char[] chars = messageInput.toCharArray();
        char[] outChars = new char[messageInput.length()];

        int length = messageInput.length();
        int keyLength = keyInput.length();
        StringBuilder newKey = new StringBuilder();

        for (int i = 0; i < length; i++) {
            newKey.append(keyInput.charAt(i % keyLength));
        }

        char[] newChars = newKey.toString().toCharArray();

        for (int i = 0; i < length; i++) {
            if (chars[i] == ' '){
                outChars[i] = ' ';
                continue;
            }
            int keyValue = HelperClass.getValue(newChars[i]);
            int messageValue = HelperClass.getValue(chars[i]);

            int mod = (messageValue - keyValue) % 26;

            if (mod < 0){
                mod += 26;
            }

            char ch = HelperClass.getChar(mod);
            outChars[i] = ch;
        }

        String plainText = new String(outChars).toUpperCase();

        System.out.println();
        System.out.println("The Encrypted message is : " + plainText);
    }
}
