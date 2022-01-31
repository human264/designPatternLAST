package StructuralPatterns.decorator._02_after;

public class SpamFilteringCommentDecorator extends CommentDecorator {

    public SpamFilteringCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        if (isNotSpam(comment)) {
            super.addComment(comment);
        }
        super.addComment(comment.replace("없", ""));

    }

    private boolean isNotSpam(String comment) {
        return !comment.contains("http");
    }
}
