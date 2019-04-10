package fr.adaming.aop;

import java.lang.reflect.Method;


import org.springframework.aop.AfterReturningAdvice;

/**
 * implementation du greffon after Returning  
 * intervient apres l'exécution d'une méthode 

 *
 */
public class LoggingAfterAdvice implements AfterReturningAdvice{

	public void afterReturning(Object returnValue, 
            					Method method,             
            					Object[] args, 
            					Object target) throws Throwable {
		System.out.println( " ----AFTER RETURNING----: Methode " + method.getName() + "() terminée et a retourné la valeur :" 
		        + returnValue);
		
	}


}
