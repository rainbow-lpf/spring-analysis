package com.axon.springframework.beans.factory.config;

import com.axon.springframework.beans.factory.HierarchicalBeanFactory;
import com.axon.springframework.core.covert.ConversionService;
import com.axon.springframework.utils.StringValueResolver;
import com.sun.istack.internal.Nullable;

public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    /**
     * 销毁单例对象
     */
    void destroySingletons();


    void addEmbeddedValueResolver(StringValueResolver valueResolver);


    String resolveEmbeddedValue(String value);


    /**
     * 添加类型转换操作
     *
     * @param conversionService
     */
    void setConversionService(ConversionService conversionService);


    /**
     * 获取类型转换操作
     *
     * @return
     */
    @Nullable
    ConversionService getConversionService();


}
