package chapter06;

public class JoinTest {
public static void main(String[] args) {
	ThreadTest thread =new ThreadTest();
	
	new Thread(thread).start();

	for(int i=0;i<6;i++){
		try{
			Thread.sleep(900);
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("这是糟糕的第"+i+"天");
		try{
			thread.wait();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
}
