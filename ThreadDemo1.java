public class ThreadDemo1 implements Runnable{
    public void run(){
        System.out.println("child : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Main : " + Thread.currentThread().getName());
        ThreadDemo1 t1 = new ThreadDemo1();
        Thread t  = new Thread(t1);
        t.setName("ram");
        Thread tt1 = new Thread(t1);
        tt1.setName("krishna");
        Thread tt2 = new Thread(t1);
        tt2.setName("vishnu");
        System.out.println(Thread.activeCount());
        t.start();
        tt1.start();
        tt2.start();

    }
}
