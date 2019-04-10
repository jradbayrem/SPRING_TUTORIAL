package fr.adaming.aop;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.ThrowsAdvice;

/**
 * implementation du greffon After Throwing  
 * intervient apres que la methode a lancée une exception 
 * @author INTI0261
 *
 */
public class LoggingThrowsAdvice implements ThrowsAdvice{
	

	
	/**
	 * 
	 * @param ex
	 */
	public void afterThrowing(Method method, 
            				  Object[] args, 
                              Object target,
                              IllegalArgumentException ex){
		
		System.out.println("----AFTER THROWING----: Methode " + method.getName()+ "()");
	}
}








