import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст на азбуке морза (. -), каждая буква разделена символом '/', без пробелов: ");
        Decoder.decod(in.next());
    }
}
class Decoder {
    private static String[] alphabet = {".-", "-...", ".--", "--.", "-..", ".", "...-", "--..", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", ".-.", "...", "-", "..-", "..-.",
            "....", "-.-.", "---.", "----", "--.-", ".--.-.", "-.--", "-..-", "...-...", "..--",
            ".-.-",};
    private static String[] russian = {"А", "Б", "В", "Г", "Д", "Е", "Ж", "З", "И", "Й", "К", "Л", "М", "Н","О",
            "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Ъ", "Ы", "Ь", "Э", "Ю", "Я"};
    private static String result = "";
    public static void decod(String input) {
        String[] parts = input.split("/");
        for (int i = 0; i < parts.length; i++){
            for (int g = 0; g < alphabet.length; g++){
                if (parts[i].equals(alphabet[g])){
                    result = result + russian[g];
                }
            }
            result = result + " ";
        }
        System.out.println(result);;
    }
}