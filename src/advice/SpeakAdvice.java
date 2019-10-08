package advice;

import java.util.Date;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class SpeakAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation method) throws Throwable {
		System.out.println("------------method start-------------");
		Date begin=new Date();
		//����ִ��ҵ�����
		Object obj=method.proceed();
		
		Date end=new Date();
		System.out.println("------------method end---------------");
		System.out.println("�������е�ʱ��Ϊ��"+(end.getTime()-begin.getTime())+"����");
		return obj;
	}

}
