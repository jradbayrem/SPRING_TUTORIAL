package fr.adaming.aop;


import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;



/**
 * combine toutes les actions des autres greffons 
 * @author INTI0261
 *
 */
 class LoggingAroundAdvice implements MethodInterceptor {

	 public Object invoke(MethodInvocation methodInvocation) throws Throwable {


		// same with MethodBeforeAdvice
		System.out.println(" ----Before method avec Around "+ methodInvocation.getMethod().getName()+"()");

		try {
			// proceed to original method call
			Object result = methodInvocation.proceed();

			// same with AfterReturningAdvice
			System.out.println(" ----After method avec Around "+ methodInvocation.getMethod().getName()+"()"+" avec le resultat "+ result);

			return result;

		} catch (IllegalArgumentException e) {
			// same with ThrowsAdvice
			System.out.println("----AfterThrowing method avec Around  "+methodInvocation.getMethod().getName() +"()"+":et leve exception!");
			throw e;
		}
	}
}
