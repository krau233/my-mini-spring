package org.springframework.core.convert.converter;

/***
 * 类型转化抽象接口
 * @param <S>
 * @param <T>
 */
public interface Converter<S,T> {
    /***
     * 类型转化
     * @param source
     * @return
     */

    T convert(S source);
}
