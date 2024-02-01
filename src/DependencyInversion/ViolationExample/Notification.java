package DependencyInversion.ViolationExample;

public class Notification {
    private Gmail gmail = new Gmail(); // violates DIP
    private Hotmail hotmail = new Hotmail(); // violates DIP

    public void sendGmail() {
        gmail.send();
    }

    public void sendHotmail() {
        hotmail.send();
    }
}
