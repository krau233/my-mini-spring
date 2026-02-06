package org.springframework.beans.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;

public interface BeanFactoryAware extends Aware {
    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
