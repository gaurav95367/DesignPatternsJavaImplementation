//Early Initialization + threadsafe
class Singleton1 {
    private static Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    static Singleton1 getInstance(){
        return instance;
    }
}

//Lazy Initialization + Non-threadsafe
class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {
    }

    static Singleton2 getInstance(){
        if(instance == null)
            instance = new Singleton2();
        return instance;
    }
}

//Lazy Initialization + threadsafe
class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {
    }

    static synchronized Singleton3 getInstance(){
        if(instance == null)
            instance = new Singleton3();
        return instance;
    }
}

//Lazy Initialization + threadsafe + 1 time lock
class Singleton4 {
    private static  volatile Singleton4 instance;

    private Singleton4() {
    }

    static Singleton4 getInstance(){
        if(instance == null){
            synchronized (Singleton4.class) {
                if(instance==null)
                    instance = new Singleton4();
            }
        }
        return instance;
    }
}

//Lazy Initialization + threadsafe + no  lock = bill pugh implementation [Most used]
class Singleton5{
    private Singleton5(){
    }

    // Inner class to provide instance of class
    private static class SingletonHolder {
        private static final Singleton5 instance = new Singleton5();
    }

    static Singleton5 getInstance() {
        return SingletonHolder.instance;
    }
}
