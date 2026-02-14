package org.springframework.aop;

import org.aopalliance.aop.Advice;
import org.aopalliance.intercept.MethodInvocation;

public interface AroundAdvice extends Advice {
    Object around(MethodInvocation invocation) throws Throwable;
}
