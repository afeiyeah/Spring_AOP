package advice;

import java.util.Date;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class SpeakAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation method) throws Throwable {
		System.out.println("------------method start-------------");
		Date begin=new Date();
		//继续执行业务代码
		Object obj=method.proceed();
		
		Date end=new Date();
		System.out.println("------------method end---------------");
		System.out.println("程序运行的时间为："+(end.getTime()-begin.getTime())+"毫秒");
		return obj;
	}

}
