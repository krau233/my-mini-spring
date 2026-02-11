package org.springframework.test.aop;

import org.junit.Test;
import org.springframework.aop.AdvisedSupport;
import org.springframework.aop.TargetSource;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.framework.JdkDynamicAopProxy;
import org.springframework.test.common.WorldServiceInterceptor;
import org.springframework.test.service.WorldService;
import org.springframework.test.service.WorldServiceImpl;

public class DynamicProxyTest {
    @Test
    public void testJdkDynamicProxy() throws Exception{
        WorldService worldService = new WorldServiceImpl();
        AdvisedSupport advisedSupport = new AdvisedSupport();
        advisedSupport.setMethodInterceptor(new WorldServiceInterceptor());
        advisedSupport.setTargetSource(new TargetSource(worldService));
        advisedSupport.setMethodMatcher(new AspectJExpressionPointcut
                ("execution(* org.springframework.test.service.WorldService.explode(..))")
                .getMethodMatcher());
        WorldService proxy = (WorldService) new JdkDynamicAopProxy(advisedSupport).getProxy();
        proxy.explode();

    }
}
