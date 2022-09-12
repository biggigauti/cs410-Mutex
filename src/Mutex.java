public class Mutex {

    boolean flag = true;

    public synchronized boolean acquire() {
        if (flag == true) {
            flag = false;
            return true;
        }
        return false;
    }

    public synchronized void release() {
        flag = true;
    }
}
