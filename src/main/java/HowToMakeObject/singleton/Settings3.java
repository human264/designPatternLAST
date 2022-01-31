package HowToMakeObject.singleton;



public class Settings3 {

    //Eager initialized thread safe 하다고함..
    //한번 생성한 후에
    private final static Settings3 instance = new Settings3();

    private Settings3() {

    }

    //멀티 쓰레트 환경에서는 하기를 retrun 해주기만 하면 됨
    //단점은 미리 로딩으로 초기 구현시 덩어리가 큰 경우에는 만드는데 시간이 많이 걸림.
    public static  Settings3 getInstance() {
        return instance;
    }

}
