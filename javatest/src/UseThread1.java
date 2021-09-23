
class TimerThread extends Thread {
    int n = 0;

    @Override
    public void run() {
        //run 메소드에 작성된 코드를 "스레드 코드" 라고 부른다.
        while(true){
            System.out.println(n);
            n++;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }

    }
}

public class UseThread1{
    public static void main(String[] args){
        TimerThread th = new TimerThread();
        th.start();
    }
}



