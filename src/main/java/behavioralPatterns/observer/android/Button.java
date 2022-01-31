package behavioralPatterns.observer.android;

public class Button {

    public Button() {

    }
    public void onClick() {
        if(onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public interface OnClickListener {
        public void onClick(Button button);
    }

    private OnClickListener onClickListener;

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
