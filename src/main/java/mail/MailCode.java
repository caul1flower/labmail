package mail;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public enum MailCode {
    HAPPY_BIRTHDAY("src/main/java/happy_birthday.txt"),
    GREETINGS("src/main/java/greetings.txt");
    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }
    public String generateText() {
        String result = "";
        File path = new File(filename);
        try {
            Scanner sc = new Scanner(path);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                result = result.concat(line);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
}
