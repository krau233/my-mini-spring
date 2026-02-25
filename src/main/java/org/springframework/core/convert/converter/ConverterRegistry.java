package org.springframework.core.convert.converter;

/***
 * 类型转化器注册接口
 */
public interface ConverterRegistry {
    void addConverter(Converter<?,?> converter);

    void addConverterFactory(ConverterFactory<?, ?> converterFactory);

    void addConverter(GenericConverter converter);
}
