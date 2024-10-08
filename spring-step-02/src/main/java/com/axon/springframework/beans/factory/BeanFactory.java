package com.axon.springframework.beans.factory;

public interface BeanFactory {

    Object getBean(String beanName) throws InstantiationException, IllegalAccessException;
}
