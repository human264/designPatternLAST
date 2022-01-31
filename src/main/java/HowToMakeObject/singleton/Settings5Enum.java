package HowToMakeObject.singleton;

public enum Settings5Enum {

    //이넘을 사용하면 replaction
    INSTANCE;

    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
