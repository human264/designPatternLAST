package StructuralPatterns.decorator._02_after;

public class App {

    private static boolean enabledSpamFilter = true;

    private static boolean enabledTrimming = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if (enabledSpamFilter) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

        if (enabledTrimming) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 지지지재밌을 수가 지없지지...");
        client.writeComment("http://whiteship.me");
    }
}
