package HowToMakeObject.singleton;

import java.io.Serializable;

public class Settings5Serialize implements Serializable {

        //권장하는 방법
        private Settings5Serialize() {

        }

        public static class SettingsHolder {
            private static final Settings5Serialize INSTANCE = new Settings5Serialize();
        }

        public static Settings5Serialize getInstance() {
            return SettingsHolder.INSTANCE;
        }


        //역직렬화 할때 반드시 readResolve 사용...하므로 하기 와 같이 막는다..
        protected Object readResolve() {
            return getInstance();
        }

    }