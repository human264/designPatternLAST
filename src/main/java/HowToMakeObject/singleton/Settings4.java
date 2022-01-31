package HowToMakeObject.singleton;

public class Settings4 {


        //Eager initialized thread safe 하다고함..
        //한번 생성한 후에
        // 1.4 이하 에서 적용시 volatile
        private static volatile Settings4 instance;

        private Settings4() {

        }

        //멀티 쓰레트 환경에서는 하기를 retrun 해주기만 하면 됨
        //Double Checked Locking으로 효율적인 동기화 블럭이 만들어짐...
        public static Settings4 getInstance() {
            if(instance == null) {
                synchronized (Settings4.class) {
                    if(instance == null) {
                        instance = new Settings4();
                    }
                }
            }
            return instance;
        }

    }