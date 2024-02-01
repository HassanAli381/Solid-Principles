package DependencyInversion.GoodExample;

public class Notification {

    private Message mailService;

    public Notification(Message mailService) { // Constructor injection(More Common)
        this.mailService = mailService;
    }

    public void sendMail() {
        mailService.send();
    }

    // we can also make a method injection see the example below
    public void sendMail(Message mailService) {
        mailService.send();
    }

}
