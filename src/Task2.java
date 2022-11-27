import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String args[]) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:/Task2.txt");
        int i = -1;
        StringBuilder txtInfo = new StringBuilder();
        while ((i = fileInputStream.read()) != -1) {
            txtInfo.append((char) i);
        }
        fileInputStream.close();

        HashMap<String, String> mapName = new HashMap<String, String>();
        String numbers = "\n", phones = "\n", emails = "\n";

        Pattern emailPattern = Pattern.compile("[\\w]+@[A-z]+\\.[A-z]{2,6}");
        Pattern phonePattern = Pattern.compile("\\+375\\(\\d{2}\\)[0-9]{7}");
        Pattern numberPattern = Pattern.compile("[0-9]{4}\\-[0-9]{4}\\-[0-9]{2}");

        Matcher matcher = emailPattern.matcher(txtInfo);
        while (matcher.find()) {
            emails += matcher.group() + "\n";
        }

        matcher = phonePattern.matcher(txtInfo);
        while (matcher.find()) {
            phones += matcher.group() + "\n";
        }

        matcher = numberPattern.matcher(txtInfo);
        while (matcher.find()) {
            numbers += matcher.group() + "\n";
        }

        mapName.put("email", emails);
        mapName.put("phone", phones);
        mapName.put("number", numbers);

        System.out.println(mapName);
    }
}
