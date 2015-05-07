package com.nouuid.util.clazz;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * Created by nouuid on 2015/5/7.
 */
public class ClassUtil {

    protected final Log logger = LogFactory.getLog(getClass());

    public static Class<?> getGenericParaClass(Type type, int i) {
        if (type instanceof ParameterizedType) { // ����������
            return getParameterizedGenericClass((ParameterizedType) type, i);
        } else if (type instanceof TypeVariable) {
            return (Class<?>) getGenericParaClass(((TypeVariable<?>) type).getBounds()[0], 0); // �����Ͳ��ö���
        } else {// class����Ҳ��type��ǿ��ת��
            return (Class<?>) type;
        }
    }

    private static Class<?> getParameterizedGenericClass(ParameterizedType parameterizedType, int i) {
        Object genericClass = parameterizedType.getActualTypeArguments()[i];
        if (genericClass instanceof ParameterizedType) { // ����༶����
            return (Class<?>) ((ParameterizedType) genericClass).getRawType();
        } else if (genericClass instanceof GenericArrayType) { // �������鷺��
            return (Class<?>) ((GenericArrayType) genericClass).getGenericComponentType();
        } else if (genericClass instanceof TypeVariable) { // �����Ͳ��ö���
            return (Class<?>) getGenericParaClass(((TypeVariable<?>) genericClass).getBounds()[0], 0);
        } else {
            return (Class<?>) genericClass;
        }
    }


}
