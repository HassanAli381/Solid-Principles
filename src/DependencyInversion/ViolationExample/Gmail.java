package DependencyInversion.ViolationExample;

public class Gmail {

    private String from;
    private String to;
    private String content;

    public Gmail() {
    }

    public Gmail(String from, String to, String content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public void send() {
        // send email logic
    }

}
