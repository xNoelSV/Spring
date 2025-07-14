package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class LoggerAspect {

    private Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @Around("execution(* com.example.services.*.*(..)))")
    /** Explanation: This method is executed before and after the method execution (@Around).
     * #  * is used to match any method in any package, independent of the public or private access modifier and
     *      the return type of the method.
     * #  com.example.services is the package name where the interface is defined
     * #  com.example.services.* selects any class inside the package
     * #  com.example.services.*.* selects any method inside the class
     * #  (..) is used to match any number of arguments
     */
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info(joinPoint.getSignature().toString() + " method execution start");
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : " + timeElapsed);
        logger.info(joinPoint.getSignature().toString() + " method execution end");
    }

    @AfterThrowing(value = "execution(* com.example.services.*.*(..))", throwing = "ex")
    /** Explanation: This method is executed after a method throws an exception (@AfterThrowing).
     * # throwing = "ex" is used to match the exception thrown
     */
    public void logException(JoinPoint joinPoint, Exception ex) {
        logger.log(Level.SEVERE, joinPoint.getSignature() + " An exception thrown with the help of" +
                " @AfterThrowing which happened due to: ", ex.getMessage());
    }

    @AfterReturning(value = "execution(* com.example.services.*.*(..)))", returning = "retVal")
    /** Explanation: This method is executed after a method returns successfully (@AfterReturning).
     * # returning = "retVal" is used to match the return value of the method
     */
    public void logStatus(JoinPoint joinPoint, Object retVal) {
        logger.log(Level.INFO, joinPoint.getSignature() + " Method successfully processed with the status " +
                retVal.toString());
    }

    @Around("@annotation(com.example.interfaces.LogAspect)")
    /** Explanation: This method is executed before and after the method execution (@Around).
     * # @annotation(com.example.interfaces.LogAspect) is used to match any method annotated with @LogAspect
     */
    public void logWithAnnotation(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info(joinPoint.toString() + " method execution start");
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : " + timeElapsed);
        logger.info(joinPoint.toString() + " method execution end");
    }

}
