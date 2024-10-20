package com.VigenereCipherAlgorithm.Encryption;

public class Encryption {

    public void encryptionAlgorithm(String message, String key) {
        String messageInput = message.toLowerCase();
        String keyInput = key.toLowerCase();
        char[] chars = messageInput.toCharArray();
        char[] outChars = new char[message.length()];

        int length = message.length();
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

            int mod = (messageValue + keyValue) % 26;
            char ch = HelperClass.getChar(mod);
            outChars[i] = ch;
        }

        String cipherText = new String(outChars).toUpperCase();

        System.out.println();
        System.out.println("The Encrypted message is : " + cipherText);
    }
}
