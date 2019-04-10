package fr.adaming.aop;

import java.lang.reflect.Method;
import java.util.Arrays;


import org.springframework.aop.MethodBeforeAdvice;



/**
 * implementation du greffon Before intervient avant l'ex�cution d'une m�thode
 * 
 * @author INTI0261
 *
 */
public class LoggingBeforeAdvice implements MethodBeforeAdvice {

	
	/**
	 * acces aux details de la methode et ses args consigne le debut de la
	 * methode
	 */
	public void before(Method method, Object[] args, Object target) throws Throwable {


		
		System.out.println(" ----BEFORE----: Methode " + method.getName() + "() invoqu�e avec : " + Arrays.toString(args));

	}


}
