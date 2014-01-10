package com.sysmon.debug;

import lombok.extern.apachecommons.CommonsLog;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@CommonsLog
@Component
public class ProfileExecutionTimeAspect {

	@Around("execution(* com.sysmon..*(..)) and @annotation(com.sysmon.debug.ProfileExecutionTime)")
	public Object profileExecutionTime(ProceedingJoinPoint pjp) throws Throwable {
		long ms = System.currentTimeMillis();
		log.info("START -> Profiling method: " + pjp.getTarget().getClass() + " " + pjp.getSignature().getName());

		Object retVal = pjp.proceed();

		log.info("END -> Profiling method: " + pjp.getTarget().getClass() + " " + pjp.getSignature().getName() + " -> Took: " + (System.currentTimeMillis() - ms));
		return retVal;
	}
}