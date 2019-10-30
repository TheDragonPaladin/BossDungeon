
class Singleton{
    private static Player SINGLE_INSTANCE;
    private Singleton(){}
    public static Player getInstance() {
        if (SINGLE_INSTANCE == null) {
            synchronized (Singleton.class) {
                if (SINGLE_INSTANCE == null) {
                    SINGLE_INSTANCE = new Player(50, 10 ,0);
                }
            }
        }
        return SINGLE_INSTANCE;
    }
    public static void setInstance(Player prev){
        synchronized (Singleton.class) {
            if (SINGLE_INSTANCE == null) {
                SINGLE_INSTANCE = prev;
            }
        }
    }
}
