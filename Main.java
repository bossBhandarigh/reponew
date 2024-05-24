//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
        }
        T1 t1 = new T1();
        T1 t2 = new T1();
        t1.setName("wipro1");
        t2.setName("wipro2");
        t1.start();
        t2.start();
        System.out.println(Thread.activeCount());
    }
}
class T1 extends Thread{
    public void run(){
        try{
            for(int i=0; i<5; i++){
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}