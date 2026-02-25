package org.springframework.core.convert;

public interface ConversionService {
    boolean canConvert(Class<?> sourceTyep,Class<?> targetType);

    <T> T convert(Object source,Class<T> targetType);
}
