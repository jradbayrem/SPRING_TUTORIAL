package fr.adaming.aspectJ;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 
 * @author INTI0261
 *
 */
@Aspect
public class BanqueLoggingAspect {



	/**
	 * (*): private-protected-public / n'importe quel type de valeur de retour
	 * add(..) : un nombre quelconque d'args le greffon before
	 */
	@Before("execution(* fr.adaming.service.Ibanque.retrait(..))")
	public void logBefore(JoinPoint joinPoint) {

		System.out.println("--BEFORE-- M�thode : " + joinPoint.getSignature().getName() + "()" + " invoqu�e avec : "
				+ Arrays.toString(joinPoint.getArgs()));

	}

	/**
	 * 
	 * @param joinPoint
	 */
	@After("execution(* *.*(..))")
	public void logAfter(JoinPoint joinPoint) {

		System.out.println("--AFTER-- M�thode : " + joinPoint.getSignature().getName() + "()" + " termin�e ");
	}

	/**
	 * pour un retour normal
	 */
	@AfterReturning(pointcut = "execution(* *.*(..))", returning = "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {

		System.out.println("--AFTER RETURNING-- M�thode : " + joinPoint.getSignature().getName() + "()" + " termin�e par : " + result);
	}

	/**
	 * 
	 * @param joinPoint
	 */
	@AfterThrowing(pointcut = "execution(* *.*(..))", throwing = "ex")
	public void logAfterThrowing(JoinPoint joinPoint, IllegalArgumentException ex) {

		System.out.println("--AFTER THROWING-- Les Arguments sont invalides : " + Arrays.toString(joinPoint.getArgs()) + "  dans la m�thode  : "
				+ joinPoint.getSignature().getName());
	}

	/**
	 * greffon Around
	 * 
	 * @throws Throwable
	 */
	@Around("execution(* *.*(..))")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		// consigner le debut de la methode
		System.out.println("--AROUND (<=>Before)-- M�thode : " + joinPoint.getSignature().getName() + "()" + " invoqu�e avec : "
				+ Arrays.toString(joinPoint.getArgs()));

		try {

			// calculs
			Object result = joinPoint.proceed();

			// consigner la fin de la methode
			System.out.println("--AROUND (<=>After reunning)-- M�thode : " + joinPoint.getSignature().getName() + "()" + " termin�e par : " + result);

			return result;

		} catch (IllegalArgumentException ex) {

			System.out.println("--AROUND (<=>After throwing)-- Les Arguments sont invalides : " + Arrays.toString(joinPoint.getArgs()) + "  dans la m�thode  : "
					+ joinPoint.getSignature().getName());

			throw ex;
		}
	}

}
