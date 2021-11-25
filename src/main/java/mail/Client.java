package mail;

import lombok.Getter;

@Getter
public class Client {
    private static int counterID = 0;
    private int id;
    private Gender gender;
    private int age;
    private String name;

    public Client(String name, int age, Gender gender) {
        this.id = counterID;
        counterID++;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}