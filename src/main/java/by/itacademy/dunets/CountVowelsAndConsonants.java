package by.itacademy.dunets;

import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String vowels = "aeiouAEIOU";
        char letter;
        boolean isVowel;
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++) {
            isVowel = false;
            letter = text.charAt(i);
            if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
                for (int j = 0; j < vowels.length(); j++) {
                    if (letter == vowels.charAt(j)) {
                        isVowel = true;
                        vowelCount++;
                        break;
                    }
                }
                if (!isVowel) {
                    consonantCount++;
                }
            }
        }
        System.out.println("Гласных: " + vowelCount);
        System.out.println("Согласных: " + consonantCount);
    }
}
