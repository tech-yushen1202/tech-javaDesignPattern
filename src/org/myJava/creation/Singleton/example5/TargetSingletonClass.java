package org.myJava.creation.Singleton.example5;

public class TargetSingletonClass {

    public static TargetSingletonClass getInstance() {
        return Elvis.INSTANCE.getInstance();
    }

    private enum Elvis {
        INSTANCE;
        private TargetSingletonClass singleton;

        Elvis() {
            singleton = new TargetSingletonClass();
        }

        private TargetSingletonClass getInstance() {
            return singleton;
        }
    }

    public static void main(String[] args) {
        TargetSingletonClass targetSingleton = TargetSingletonClass.getInstance();
    }
}