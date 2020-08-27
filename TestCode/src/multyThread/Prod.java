package multyThread;


public class Prod implements Runnable{
    Q q;

    Prod (Q q){
        this.q = q;
        new Thread(this, "Prod").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true){
            q.put(i++);
        }
    }
}
