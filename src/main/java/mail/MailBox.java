package mail;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    List<MailInfo> infos = new ArrayList<MailInfo>();
    MailSender sender = new MailSender();
    public void addMailInfo(MailInfo info) {
        infos.add(info);
    }
    public String sendAll(){
        for (MailInfo info : infos) {
            MailSender.sendMail(info);
        }
        return "sent";
    }
}
