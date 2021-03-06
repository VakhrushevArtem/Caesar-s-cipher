import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Decryptor {
    char[] alphabet = {'А', 'Б', 'В', 'Г',  'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};

    public static void printDecryptedText(String encryptedText, int key) {
        encryptedText = encryptedText.toUpperCase();
        char[] encryptedArray = encryptedText.toCharArray();
        for (int i = 0; i <= 33; i++) {

        }
        System.out.println(String.copyValueOf(encryptedArray));
    }

    public int findLetter(char ch) {
        for (int i = 0; i < alphabet.length; i++) {
            if (ch == alphabet[i]) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        try {
            String temp;
            for (int i = 1; i <= 33; i++) {
                BufferedReader reader = new BufferedReader(new FileReader(args[0]));
                while ((temp = reader.readLine()) != null) {
                    printDecryptedText(temp, i);
                }
                System.out.println();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

}
