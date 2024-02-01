package DependencyInversion.GoodExample;

public class Hotmail implements Message{
    private String from;
    private String to;
    private String content;

    public Hotmail() {

    }

    public Hotmail(String from, String to, String content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public void send() {
        // send email logic
    }

}
