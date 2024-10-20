# 🔐 Vigenère Cipher Algorithm

This Java project implements the **Vigenère Cipher** algorithm for both encryption and decryption. The Vigenère Cipher is a more advanced encryption technique that uses a keyword to apply multiple Caesar Ciphers across the text, offering stronger encryption compared to a simple Caesar Cipher.

## 🚀 Getting Started

Follow these steps to set up and run the project on your local machine:

### Clone the Repository:

```bash
git clone https://github.com/SameerNadaf/VigenereCipherAlgorithm
```

### Compile the Java Code:

```bash
javac com/VigenereCipherAlgorithm/Encryption/EncryptionRunner.java com/VigenereCipherAlgorithm/Decryption/DecryptionRunner.java
```

### Run the Application:

To encrypt:

```bash
java com.VigenereCipherAlgorithm.Encryption.EncryptionRunner
```

To decrypt:

```bash
java com.VigenereCipherAlgorithm.Decryption.DecryptionRunner
```

## 📂 Project Structure

```
src/: Contains the Java source code files.
com.VigenereCipherAlgorithm/
    ├── Encryption/: Contains the encryption logic (EncryptionRunner.java)
    └── Decryption/: Contains the decryption logic (DecryptionRunner.java)
```

## 🔑 How It Works

- **Encryption**: Encrypts each letter in the plaintext using a keyword. Each letter is shifted by the position of the corresponding keyword letter in the alphabet.
  
- **Decryption**: Reverses the encryption by shifting each letter of the ciphertext back using the same keyword.

## 📦 Features

- Encrypts a given plaintext using a keyword.
- Decrypts a ciphertext back to the original plaintext using the same keyword.
- Supports both uppercase and lowercase letters.

## 🌐 Technologies Used

- Java

## 📘 Example Usage

### Encryption Example:

- Enter the plaintext: `HELLO`
- Enter the keyword: `KEY`

**Encrypted text**: `RIJVS`

### Decryption Example:

- Enter the ciphertext: `RIJVS`
- Enter the keyword: `KEY`

**Decrypted text**: `HELLO`

## 🤝 Contributing

Contributions are welcome! Feel free to submit issues and pull requests.

## Happy coding! 🎉
