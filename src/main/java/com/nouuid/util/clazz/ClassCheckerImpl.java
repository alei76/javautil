package com.nouuid.util.clazz;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

/**
 * Created by bl07637 on 2015/4/29.
 */
public class ClassCheckerImpl implements ClassChecker {
    protected final Log logger = LogFactory.getLog(getClass());

    @Override
    public boolean isBoolean(Class<?> clazz) {
        return boolean.class.equals(clazz);
    }

    @Override
    public boolean isByte(Class<?> clazz) {
        return byte.class.equals(clazz);
    }

    @Override
    public boolean isChar(Class<?> clazz) {
        return char.class.equals(clazz);
    }

    @Override
    public boolean isShort(Class<?> clazz) {
        return short.class.equals(clazz);
    }

    @Override
    public boolean isInt(Class<?> clazz) {
        return int.class.equals(clazz);
    }

    @Override
    public boolean isLong(Class<?> clazz) {
        return long.class.equals(clazz);
    }

    @Override
    public boolean isFloat(Class<?> clazz) {
        return float.class.equals(clazz);
    }

    @Override
    public boolean isDouble(Class<?> clazz) {
        return double.class.equals(clazz);
    }

    @Override
    public boolean isWrapBoolean(Class<?> clazz) {
        return Boolean.class.equals(clazz);
    }

    @Override
    public boolean isWrapByte(Class<?> clazz) {
        return Byte.class.equals(clazz);
    }

    @Override
    public boolean isWrapChar(Class<?> clazz) {
        return Character.class.equals(clazz);
    }

    @Override
    public boolean isWrapShort(Class<?> clazz) {
        return Short.class.equals(clazz);
    }

    @Override
    public boolean isWrapInt(Class<?> clazz) {
        return Integer.class.equals(clazz);
    }

    @Override
    public boolean isWrapLong(Class<?> clazz) {
        return Long.class.equals(clazz);
    }

    @Override
    public boolean isWrapFloat(Class<?> clazz) {
        return Float.class.equals(clazz);
    }

    @Override
    public boolean isWrapDouble(Class<?> clazz) {
        return Double.class.equals(clazz);
    }

    @Override
    public boolean isEnum(Class<?> clazz) {
        return clazz==null ? false : clazz.isEnum();
    }

    @Override
    public boolean isBasicType(Class<?> clazz) {
        if(
                isBoolean(clazz) ||
                        isByte(clazz) ||
                        isChar(clazz) ||
                        isShort(clazz) ||
                        isInt(clazz) ||
                        isLong(clazz) ||
                        isFloat(clazz) ||
                        isDouble(clazz) ||
                        isWrapBoolean(clazz) ||
                        isWrapByte(clazz) ||
                        isWrapChar(clazz) ||
                        isWrapShort(clazz) ||
                        isWrapInt(clazz) ||
                        isWrapLong(clazz) ||
                        isWrapFloat(clazz) ||
                        isWrapDouble(clazz) ||
                        isEnum(clazz) ||
                        isString(clazz) ||
                        isDate(clazz) ||
                        isBigNumber(clazz)
                ) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWrapClass(Class<?> clazz) { //是否为基础类型包装类
        if(
                isWrapBoolean(clazz) ||
                        isWrapByte(clazz) ||
                        isWrapChar(clazz) ||
                        isWrapShort(clazz) ||
                        isWrapInt(clazz) ||
                        isWrapLong(clazz) ||
                        isWrapFloat(clazz) ||
                        isWrapDouble(clazz)
                ) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean isString(Class<?> clazz) {
        return String.class.equals(clazz);
    }

    @Override
    public boolean isDate(Class<?> clazz) {
        return Date.class.equals(clazz);
    }

    @Override
    public boolean isBigNumber(Class<?> clazz) {
        return (isBigDecimal(clazz) || isBigInteger(clazz));
    }

    @Override
    public boolean isBigDecimal(Class<?> clazz) {
        return BigDecimal.class.equals(clazz);
    }

    @Override
    public boolean isBigInteger(Class<?> clazz) {
        return BigInteger.class.equals(clazz);
    }

    @Override
    public boolean isCustom(Class<?> clazz) {
        if( isBasicType(clazz) ||
                isArray(clazz) ||
                isList(clazz) ||
                isMap(clazz) ||
                isSet(clazz)) {
            return false;
        }
        return true;
    }

    public boolean isArray(Class<?> clazz) {
        return clazz==null ? false : clazz.isArray();
    }

    public boolean isList(Class<?> clazz) {
        if(clazz==null) {
            return false;
        }

        try {
            if( !isBasicType(clazz) && !isArray(clazz) ) {
                if(clazz.isInterface() || Modifier.isAbstract(clazz.getModifiers())) {
                    if(clazz.isAssignableFrom(ArrayList.class)) {
                        return true;
                    }
                }else {
                    if(clazz.newInstance() instanceof List) { //List
                        return true;
                    }
                }
            }

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean isSet(Class<?> clazz) {
        if(clazz==null) {
            return false;
        }

        try {
            if(!isBasicType(clazz) && !isArray(clazz)) {
                if(clazz.isInterface() || Modifier.isAbstract(clazz.getModifiers())) {
                    if(clazz.isAssignableFrom(HashSet.class)) {
                        return true;
                    }
                }else {
                    if(clazz.newInstance() instanceof Set) { //Set
                        return true;
                    }
                }
            }

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean isMap(Class<?> clazz) {
        if(clazz==null) {
            return false;
        }

        try {
            if(!isBasicType(clazz) && !isArray(clazz) ) {
                if(clazz.isInterface() || Modifier.isAbstract(clazz.getModifiers())) {
                    if(clazz.isAssignableFrom(HashMap.class)) {
                        return true;
                    }
                }else {
                    if(clazz.newInstance() instanceof Map) { //Map
                        return true;
                    }
                }
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean isCollection(Class<?> clazz) {
        if(isArray(clazz) || isList(clazz) || isSet(clazz) || isMap(clazz)) {
            return true;
        }
        return false;
    }

//	public Class<?> getGenericParaClass(Type type, int i) {
//        if (type instanceof ParameterizedType) { // 处理泛型类型
//            return getParameterizedGenericClass((ParameterizedType) type, i);
//        } else if (type instanceof TypeVariable) {
//            return (Class<?>) getGenericParaClass(((TypeVariable<?>) type).getBounds()[0], 0); // 处理泛型擦拭对象
//        } else {// class本身也是type，强制转型
//            return (Class<?>) type;
//        }
//    }
//
//	private Class<?> getParameterizedGenericClass(ParameterizedType parameterizedType, int i) {
//        Object genericClass = parameterizedType.getActualTypeArguments()[i];
//        if (genericClass instanceof ParameterizedType) { // 处理多级泛型
//            return (Class<?>) ((ParameterizedType) genericClass).getRawType();
//        } else if (genericClass instanceof GenericArrayType) { // 处理数组泛型
//            return (Class<?>) ((GenericArrayType) genericClass).getGenericComponentType();
//        } else if (genericClass instanceof TypeVariable) { // 处理泛型擦拭对象
//            return (Class<?>) getGenericParaClass(((TypeVariable<?>) genericClass).getBounds()[0], 0);
//        } else {
//            return (Class<?>) genericClass;
//        }
//    }

    //boolean/Boolean
    public boolean isBooleanCastableFrom(Class<?> srcClass) {
        if(srcClass==null) {
            return false;
        }

        if(	//过滤出可转换的类型
                isBoolean(srcClass) ||
                        isWrapBoolean(srcClass) ||
                        isString(srcClass)
                ) {
            return true;
        }

        return false;
    }

    //byte/Byte
    public boolean isByteCastableFrom(Class<?> srcClass) {
        if(srcClass==null) {
            return false;
        }

        if(	//过滤出可转换的类型
                isByte(srcClass) ||
                        isWrapByte(srcClass) ||
                        isString(srcClass)
                ) {
            return true;
        }

        return false;
    }

    //char/Character
    public boolean isCharCastableFrom(Class<?> srcClass) {
        if(srcClass==null) {
            return false;
        }

        if(	//过滤出可转换的类型
                isChar(srcClass) ||
                        isWrapChar(srcClass)
                ) {
            return true;
        }

        return false;
    }

    //short/Short
    public boolean isShortCastableFrom(Class<?> srcClass) {
        if(srcClass==null) {
            return false;
        }

        if(	//过滤出可转换的类型
                isShort(srcClass) ||
                        isInt(srcClass) ||
                        isLong(srcClass) ||
                        isFloat(srcClass) ||
                        isDouble(srcClass) ||
                        isWrapShort(srcClass) ||
                        isWrapInt(srcClass) ||
                        isWrapLong(srcClass) ||
                        isWrapFloat(srcClass) ||
                        isWrapDouble(srcClass) ||
                        isString(srcClass) ||
                        isBigInteger(srcClass) ||
                        isBigDecimal(srcClass)
                ) {
            return true;
        }

        return false;
    }

    //int/Integer
    public boolean isIntCastableFrom(Class<?> srcClass) {
        if(srcClass==null) {
            return false;
        }

        if(	//过滤出可转换的类型
                isShort(srcClass) ||
                        isInt(srcClass) ||
                        isLong(srcClass) ||
                        isFloat(srcClass) ||
                        isDouble(srcClass) ||
                        isWrapShort(srcClass) ||
                        isWrapInt(srcClass) ||
                        isWrapLong(srcClass) ||
                        isWrapFloat(srcClass) ||
                        isWrapDouble(srcClass) ||
                        isString(srcClass) ||
                        isBigInteger(srcClass) ||
                        isBigDecimal(srcClass)
                ) {
            return true;
        }

        return false;
    }

    //long/Long
    public boolean isLongCastableFrom(Class<?> srcClass) {
        if(srcClass==null) {
            return false;
        }

        if(	//过滤出可转换的类型
                isShort(srcClass) ||
                        isInt(srcClass) ||
                        isLong(srcClass) ||
                        isFloat(srcClass) ||
                        isDouble(srcClass) ||
                        isWrapShort(srcClass) ||
                        isWrapInt(srcClass) ||
                        isWrapLong(srcClass) ||
                        isWrapFloat(srcClass) ||
                        isWrapDouble(srcClass) ||
                        isString(srcClass) ||
                        isBigInteger(srcClass) ||
                        isBigDecimal(srcClass) |
                                isDate(srcClass)
                ) {
            return true;
        }

        return false;
    }

    //float/Float
    public boolean isFloatCastableFrom(Class<?> srcClass) {
        if(srcClass==null) {
            return false;
        }

        if(	//过滤出可转换的类型
                isShort(srcClass) ||
                        isInt(srcClass) ||
                        isLong(srcClass) ||
                        isFloat(srcClass) ||
                        isDouble(srcClass) ||
                        isWrapShort(srcClass) ||
                        isWrapInt(srcClass) ||
                        isWrapLong(srcClass) ||
                        isWrapFloat(srcClass) ||
                        isWrapDouble(srcClass) ||
                        isString(srcClass) ||
                        isBigInteger(srcClass) ||
                        isBigDecimal(srcClass)
                ) {
            return true;
        }

        return false;
    }

    //double/Double
    public boolean isDoubleCastableFrom(Class<?> srcClass) {
        if(srcClass==null) {
            return false;
        }

        if(	//过滤出可转换的类型
                isShort(srcClass) ||
                        isInt(srcClass) ||
                        isLong(srcClass) ||
                        isFloat(srcClass) ||
                        isDouble(srcClass) ||
                        isWrapShort(srcClass) ||
                        isWrapInt(srcClass) ||
                        isWrapLong(srcClass) ||
                        isWrapFloat(srcClass) ||
                        isWrapDouble(srcClass) ||
                        isString(srcClass) ||
                        isBigInteger(srcClass) ||
                        isBigDecimal(srcClass)
                ) {
            return true;
        }

        return false;
    }

    //enum
    public boolean isEnumCastableFrom(Class<?> srcClass) {
        if(srcClass==null) {
            return false;
        }

        if(	//过滤出可转换的类型
                isEnum(srcClass) ||
                        isString(srcClass)
                ) {
            return true;
        }

        return false;
    }

    //String
    public boolean isStringCastableFrom(Class<?> srcClass) {
        if(srcClass==null) {
            return false;
        }

        if(	//过滤出可转换的类型
                isBoolean(srcClass) ||
                        isByte(srcClass) ||
                        isChar(srcClass) ||
                        isShort(srcClass) ||
                        isInt(srcClass) ||
                        isLong(srcClass) ||
                        isFloat(srcClass) ||
                        isDouble(srcClass) ||
                        isWrapBoolean(srcClass) ||
                        isWrapByte(srcClass) ||
                        isWrapChar(srcClass) ||
                        isWrapShort(srcClass) ||
                        isWrapInt(srcClass) ||
                        isWrapLong(srcClass) ||
                        isWrapFloat(srcClass) ||
                        isWrapDouble(srcClass) ||
                        isEnum(srcClass) ||
                        isString(srcClass) ||
                        isBigInteger(srcClass) ||
                        isBigDecimal(srcClass)
                ) {
            return true;
        }

        return false;
    }

    //Date
    public boolean isDateCastableFrom(Class<?> srcClass) {
        if(srcClass==null) {
            return false;
        }

        if(	//过滤出可转换的类型
                isShort(srcClass) ||
                        isInt(srcClass) ||
                        isLong(srcClass) ||
                        isFloat(srcClass) ||
                        isDouble(srcClass) ||
                        isWrapShort(srcClass) ||
                        isWrapInt(srcClass) ||
                        isWrapLong(srcClass) ||
                        isWrapFloat(srcClass) ||
                        isWrapDouble(srcClass) ||
                        isBigInteger(srcClass) ||
                        isBigDecimal(srcClass) ||
                        isDate(srcClass)
                ) {
            return true;
        }

        return false;
    }

    //BigInteger/BigDecimal
    public boolean isBigNumberCastableFrom(Class<?> srcClass) {
        if(srcClass==null) {
            return false;
        }

        if(	//过滤出可转换的类型
                isShort(srcClass) ||
                        isInt(srcClass) ||
                        isLong(srcClass) ||
                        isFloat(srcClass) ||
                        isDouble(srcClass) ||
                        isWrapShort(srcClass) ||
                        isWrapInt(srcClass) ||
                        isWrapLong(srcClass) ||
                        isWrapFloat(srcClass) ||
                        isWrapDouble(srcClass) ||
                        isString(srcClass) ||
                        isBigInteger(srcClass) ||
                        isBigDecimal(srcClass)
                ) {
            return true;
        }

        return false;
    }

    //Custom
    public boolean isCustomCastableFrom(Class<?> srcClass) {
        if(srcClass==null) {
            return false;
        }

        if(	//过滤出可转换的类型
                isCustom(srcClass)
                ) {
            return true;
        }

        return false;
    }
}
