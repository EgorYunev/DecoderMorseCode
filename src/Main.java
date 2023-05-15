import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] alphabet = {".-", "-...", ".--", "--.", "-..", ".", "...-", "--..", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", ".-.", "...", "-", "..-", "..-.",
                "....", "-.-.", "---.", "----", "--.-", ".--.-.", "-.--", "-..-", "...-...", "..--",
                ".-.-",};
        String[] russian = {"А", "Б", "В", "Г", "Д", "Е", "Ж", "З", "И", "Й", "К", "Л", "М", "Н","О",
                "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Ъ", "Ы", "Ь", "Э", "Ю", "Я"};
        String result = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст на азбуке морза (. -), каждая буква разделена символом '/', без пробелов: ");
        String input = in.next();
        String[] parts = input.split("/");
        for (int i = 0; i < parts.length; i++){
            for (int g = 0; g < alphabet.length; g++){
                if (parts[i].equals(alphabet[g])){
                    result = result + russian[g];
                }
            }
            result = result + " ";
        }
        System.out.print(result);
    }
}