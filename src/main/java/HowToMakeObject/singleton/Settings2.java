package HowToMakeObject.singleton;



public class Settings2 {

    private static Settings2 instance;

    private Settings2() {

    }

    //멀티 쓰레트 환경에서는 하기 synchronized 키워드를 사용하면 되는데
    //성능에 부하가 가해저 성능이 저하됨....
    public static synchronized Settings2 getInstance() {
        if (instance == null) {
            instance = new Settings2();
        }
        return instance;
    }

}
