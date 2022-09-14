public class Mutex {

    private boolean flag = true;

    public synchronized boolean acquire() {
        if (flag) {
            flag = false;
            return true;
        }
        return false;
    }

    public synchronized void release() {
        flag = true;
    }
}
