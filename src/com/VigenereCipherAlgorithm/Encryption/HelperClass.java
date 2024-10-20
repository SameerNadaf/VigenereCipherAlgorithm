package com.VigenereCipherAlgorithm.Encryption;

public class HelperClass {

    public static int getValue(char ch) {
        return switch (ch) {
            case 'a' -> 0;
            case 'b' -> 1;
            case 'c' -> 2;
            case 'd' -> 3;
            case 'e' -> 4;
            case 'f' -> 5;
            case 'g' -> 6;
            case 'h' -> 7;
            case 'i' -> 8;
            case 'j' -> 9;
            case 'k' -> 10;
            case 'l' -> 11;
            case 'm' -> 12;
            case 'n' -> 13;
            case 'o' -> 14;
            case 'p' -> 15;
            case 'q' -> 16;
            case 'r' -> 17;
            case 's' -> 18;
            case 't' -> 19;
            case 'u' -> 20;
            case 'v' -> 21;
            case 'w' -> 22;
            case 'x' -> 23;
            case 'y' -> 24;
            case 'z' -> 25;
            default -> -1;
        };
    }

    public static char getChar (int num) {
        return switch (num) {
            case 0 -> 'a';
            case 1 -> 'b';
            case 2 -> 'c';
            case 3 -> 'd';
            case 4 -> 'e';
            case 5 -> 'f';
            case 6 -> 'g';
            case 7 -> 'h';
            case 8 -> 'i';
            case 9 -> 'j';
            case 10 -> 'k';
            case 11 -> 'l';
            case 12 -> 'm';
            case 13 -> 'n';
            case 14 -> 'o';
            case 15 -> 'p';
            case 16 -> 'q';
            case 17 -> 'r';
            case 18 -> 's';
            case 19 -> 't';
            case 20 -> 'u';
            case 21 -> 'v';
            case 22 -> 'w';
            case 23 -> 'x';
            case 24 -> 'y';
            case 25 -> 'z';
            default -> '1';
        };
    }

}
