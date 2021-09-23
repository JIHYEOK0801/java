class TimerRunnable implements Runnable{
    int n = -1;
    @Override
    public void run() {
        System.out.println("스레드 이름"+ Thread.currentThread().getName());
        while(true){
            System.out.println(n);
            n--;

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){return;}
        }
    }
}
public class UseThread2 {
    public static void main(String[] args){
        Thread th = new Thread(new TimerRunnable());
        th.start();
        th.interrupt();
    }

}
