package Interface;

public class TextMessage implements Reader {
    private String content;

    public TextMessage(String content) {
        this.content = content;
    }

    // Must implement read() method
    public String read() {
        return content;
    }
}
