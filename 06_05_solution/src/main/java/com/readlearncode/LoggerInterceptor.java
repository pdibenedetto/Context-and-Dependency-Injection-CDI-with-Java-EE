package com.readlearncode;

import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.util.stream.Stream;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Logged
@Interceptor
@Priority(Interceptor.Priority.APPLICATION + 100)
public class LoggerInterceptor {

    @AroundInvoke
    private Object doMethodLogging(InvocationContext ic) throws Exception {
        System.out.println("Method name: " + ic.getMethod().getName());
        System.out.println("Parameters: ");
        Stream.of(ic.getParameters())
                .map(Object::toString)
                .forEach(System.out::println);
        return ic.proceed();
    }

}