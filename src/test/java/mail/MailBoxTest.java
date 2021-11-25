package mail;

import static org.junit.jupiter.api.Assertions.*;

class MailBoxTest {
    Client cl1 = new Client("Monica", 24, Gender.FEMALE);
    Client cl2 = new Client("Ross", 27, Gender.MALE);
    MailInfo inf1 = new MailInfo(cl1, MailCode.HAPPY_BIRTHDAY);
    MailInfo inf2 = new MailInfo(cl2, MailCode.GREETINGS);
    MailBox box = new MailBox();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        box.addMailInfo(inf1);
        box.addMailInfo(inf2);
    }

    @org.junit.jupiter.api.Test
    void sendAll() {
        assertEquals("sent", box.sendAll());

    }
}