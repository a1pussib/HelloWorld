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
		System.out.println("输出"+i);
		try{
			thread.wait();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
}
