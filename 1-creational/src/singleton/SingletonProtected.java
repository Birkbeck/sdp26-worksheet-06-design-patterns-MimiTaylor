package singleton;

public class SingletonProtected {

   /*

   // not the best  way to do it.
   // it is thread safe (by using keyword synchronized) but there are disadvantages to this.
   // syncronized - has overheads and may lead to slow performance and affect 'liveness' (revisit locking/deadlock etc)
   // https://docs.oracle.com/javase/tutorial/essential/concurrency/syncmeth.html

   private static SingletonProtected SINGLETON_INSTANCE = null;

    private SingletonProtected() {}

    public static synchronized SingletonProtected getInstance() {
        if (SINGLETON_INSTANCE == null) {
            SINGLETON_INSTANCE = new SingletonProtected();
        }
        return SINGLETON_INSTANCE;
    }

    */


    // a better way to do it
    // thread safe and lazy init (created only when needed, not at start up)

    private SingletonProtected(){}; // private constructor

    // static inner helper class
    private static class SingletonProtectedHelper{
        private static final SingletonProtected INSTANCE = new SingletonProtected();
    }

    public static SingletonProtected getInstance(){
        return SingletonProtectedHelper.INSTANCE;
    }




}

// bill pugh singleton implementation
// https://www.baeldung.com/java-bill-pugh-singleton-implementation
// https://codingtechroom.com/question/singleton-design-pattern-bill-pugh-solution