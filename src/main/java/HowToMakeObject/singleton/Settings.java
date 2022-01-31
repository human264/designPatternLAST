package HowToMakeObject.singleton;


//멀티 쓰레트 환경에서는 안전하지 못함
public class Settings {

    private static Settings instance;

    private Settings() {

    }

    public static Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }

}
