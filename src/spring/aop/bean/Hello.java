package spring.aop.bean;

public class Hello implements Speaker {

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("------------Hello Speaker--------------");
	}

}
