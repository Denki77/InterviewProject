package lesson3;

public class WaitNotifyExample {
    private String pocket;

    public synchronized void put(String pocket) {
        System.out.println("Put started for " + Thread.currentThread().getId());
        while (this.pocket != null) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.pocket = pocket;
        this.notifyAll();
    }

    public synchronized String get() {
        System.out.println("Get started for " + Thread.currentThread().getId());
        while (this.pocket == null) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String tmp = this.pocket;
        this.pocket = null;
        this.notifyAll();
        return tmp;
    }

    public static void main(String[] args) throws InterruptedException {
        WaitNotifyExample example = new WaitNotifyExample();

        new Thread(() -> System.out.println(example.get())).start();
        new Thread(() -> System.out.println(example.get())).start();
        new Thread(() -> System.out.println(example.get())).start();

        Thread.sleep(3000);

        example.put("Pocket 1");
        example.put("Pocket 2");
        example.put("Pocket 3");
    }
}
