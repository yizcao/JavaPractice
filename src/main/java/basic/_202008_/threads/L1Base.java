package basic._202008_.threads;

public class L1Base implements Runnable{
    @Override
    public void run() {
    }

    public static void main(String[] args) {
        new Thread(()-> System.out.println("helki")).start();
    }
}
