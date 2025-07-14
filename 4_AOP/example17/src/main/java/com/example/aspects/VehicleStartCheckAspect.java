package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(1)
public class VehicleStartCheckAspect {

    private Logger logger = Logger.getLogger(VehicleStartCheckAspect.class.getName());

    @Before("execution(* com.example.services.*.*(..)) && args(vehicleStarted, ..)")
    /** Explanation: This method is executed before the method execution (@Before).
     * #  * is used to match any method in any package, independent of the public or private access modifier and
     *      the return type of the method.
     * #  com.example.services is the package name where the interface is defined
     * #  com.example.services.* selects any class inside the package
     * #  com.example.services.*.* selects any method inside the class
     * #  (..) is used to match any number of arguments
     * #  args(vehicleStarted, ..) is used to match the arguments of the method
     */
    public void checkVehicleStart(JoinPoint joinPoint, boolean vehicleStarted) throws Throwable {
        if (!vehicleStarted) {
            throw new RuntimeException("Vehicle not started");
        }
    }
}
