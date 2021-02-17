package fr.orchestre.elouan;

public final class Singleton {
    private static volatile Singleton instance = null;
    private Singleton() {
        super();
    }

    public final static Singleton getInstance() {

        if (Singleton.instance == null) {
           synchronized(Singleton.class) {
             if (Singleton.instance == null) {
               Singleton.instance = new Singleton();
             }
           }
        }
        return Singleton.instance;
    }
}