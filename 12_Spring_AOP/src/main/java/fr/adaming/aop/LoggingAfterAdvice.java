package fr.adaming.aop;

import java.lang.reflect.Method;


import org.springframework.aop.AfterReturningAdvice;

/**
 * implementation du greffon after Returning  
 * intervient apres l'ex�cution d'une m�thode 

 *
 */
public class LoggingAfterAdvice implements AfterReturningAdvice{

	public void afterReturning(Object returnValue, 
            					Method method,             
            					Object[] args, 
            					Object target) throws Throwable {
		System.out.println( " ----AFTER RETURNING----: Methode " + method.getName() + "() termin�e et a retourn� la valeur :" 
		        + returnValue);
		
	}


}
