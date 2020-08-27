package multyThread;

public class Cons implements Runnable{
    Q q;

    Cons (Q q){
        this.q = q;
        new Thread(this, "Cons").start();
    }

    @Override
    public void run() {
        while (true){
            q.get();
        }
    }
}
