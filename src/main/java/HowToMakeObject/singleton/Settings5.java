package HowToMakeObject.singleton;

public class Settings5 {

        //권장하는 방법
        private Settings5() {

        }

        public static class SettingsHolder {
            private static final Settings5 INSTANCE = new Settings5();
        }

        public static Settings5 getInstance() {
            return SettingsHolder.INSTANCE;
        }

    }