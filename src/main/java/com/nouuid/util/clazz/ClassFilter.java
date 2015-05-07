package com.nouuid.util.clazz;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by nouuid on 2015/5/7.
 */
public class ClassFilter {

    protected final Log logger = LogFactory.getLog(getClass());

    //boolean/Boolean
    public static boolean isBooleanCastableFrom(Class<?> srcClass) {
        if (srcClass == null) {
            return false;
        }

        if (    //过滤出可转换的类型
                ClassChecker.isBoolean(srcClass) ||
                        ClassChecker.isWrapBoolean(srcClass) ||
                        ClassChecker.isString(srcClass)
                ) {
            return true;
        }

        return false;
    }

    //byte/Byte
    public static boolean isByteCastableFrom(Class<?> srcClass) {
        if (srcClass == null) {
            return false;
        }

        if (    //过滤出可转换的类型
                ClassChecker.isByte(srcClass) ||
                        ClassChecker.isWrapByte(srcClass) ||
                        ClassChecker.isString(srcClass)
                ) {
            return true;
        }

        return false;
    }

    //char/Character
    public static boolean isCharCastableFrom(Class<?> srcClass) {
        if (srcClass == null) {
            return false;
        }

        if (    //过滤出可转换的类型
                ClassChecker.isChar(srcClass) ||
                        ClassChecker.isWrapChar(srcClass)
                ) {
            return true;
        }

        return false;
    }

    //short/Short
    public static boolean isShortCastableFrom(Class<?> srcClass) {
        if (srcClass == null) {
            return false;
        }

        if (    //过滤出可转换的类型
                ClassChecker.isShort(srcClass) ||
                        ClassChecker.isInt(srcClass) ||
                        ClassChecker.isLong(srcClass) ||
                        ClassChecker.isFloat(srcClass) ||
                        ClassChecker.isDouble(srcClass) ||
                        ClassChecker.isWrapShort(srcClass) ||
                        ClassChecker.isWrapInt(srcClass) ||
                        ClassChecker.isWrapLong(srcClass) ||
                        ClassChecker.isWrapFloat(srcClass) ||
                        ClassChecker.isWrapDouble(srcClass) ||
                        ClassChecker.isString(srcClass) ||
                        ClassChecker.isBigInteger(srcClass) ||
                        ClassChecker.isBigDecimal(srcClass)
                ) {
            return true;
        }

        return false;
    }

    //int/Integer
    public static boolean isIntCastableFrom(Class<?> srcClass) {
        if (srcClass == null) {
            return false;
        }

        if (    //过滤出可转换的类型
                ClassChecker.isShort(srcClass) ||
                        ClassChecker.isInt(srcClass) ||
                        ClassChecker.isLong(srcClass) ||
                        ClassChecker.isFloat(srcClass) ||
                        ClassChecker.isDouble(srcClass) ||
                        ClassChecker.isWrapShort(srcClass) ||
                        ClassChecker.isWrapInt(srcClass) ||
                        ClassChecker.isWrapLong(srcClass) ||
                        ClassChecker.isWrapFloat(srcClass) ||
                        ClassChecker.isWrapDouble(srcClass) ||
                        ClassChecker.isString(srcClass) ||
                        ClassChecker.isBigInteger(srcClass) ||
                        ClassChecker.isBigDecimal(srcClass)
                ) {
            return true;
        }

        return false;
    }

    //long/Long
    public static boolean isLongCastableFrom(Class<?> srcClass) {
        if (srcClass == null) {
            return false;
        }

        if (    //过滤出可转换的类型
                ClassChecker.isShort(srcClass) ||
                        ClassChecker.isInt(srcClass) ||
                        ClassChecker.isLong(srcClass) ||
                        ClassChecker.isFloat(srcClass) ||
                        ClassChecker.isDouble(srcClass) ||
                        ClassChecker.isWrapShort(srcClass) ||
                        ClassChecker.isWrapInt(srcClass) ||
                        ClassChecker.isWrapLong(srcClass) ||
                        ClassChecker.isWrapFloat(srcClass) ||
                        ClassChecker.isWrapDouble(srcClass) ||
                        ClassChecker.isString(srcClass) ||
                        ClassChecker.isBigInteger(srcClass) ||
                        ClassChecker.isBigDecimal(srcClass) |
                                ClassChecker.isDate(srcClass)
                ) {
            return true;
        }

        return false;
    }

    //float/Float
    public static boolean isFloatCastableFrom(Class<?> srcClass) {
        if (srcClass == null) {
            return false;
        }

        if (    //过滤出可转换的类型
                ClassChecker.isShort(srcClass) ||
                        ClassChecker.isInt(srcClass) ||
                        ClassChecker.isLong(srcClass) ||
                        ClassChecker.isFloat(srcClass) ||
                        ClassChecker.isDouble(srcClass) ||
                        ClassChecker.isWrapShort(srcClass) ||
                        ClassChecker.isWrapInt(srcClass) ||
                        ClassChecker.isWrapLong(srcClass) ||
                        ClassChecker.isWrapFloat(srcClass) ||
                        ClassChecker.isWrapDouble(srcClass) ||
                        ClassChecker.isString(srcClass) ||
                        ClassChecker.isBigInteger(srcClass) ||
                        ClassChecker.isBigDecimal(srcClass)
                ) {
            return true;
        }

        return false;
    }

    //double/Double
    public static boolean isDoubleCastableFrom(Class<?> srcClass) {
        if (srcClass == null) {
            return false;
        }

        if (    //过滤出可转换的类型
                ClassChecker.isShort(srcClass) ||
                        ClassChecker.isInt(srcClass) ||
                        ClassChecker.isLong(srcClass) ||
                        ClassChecker.isFloat(srcClass) ||
                        ClassChecker.isDouble(srcClass) ||
                        ClassChecker.isWrapShort(srcClass) ||
                        ClassChecker.isWrapInt(srcClass) ||
                        ClassChecker.isWrapLong(srcClass) ||
                        ClassChecker.isWrapFloat(srcClass) ||
                        ClassChecker.isWrapDouble(srcClass) ||
                        ClassChecker.isString(srcClass) ||
                        ClassChecker.isBigInteger(srcClass) ||
                        ClassChecker.isBigDecimal(srcClass)
                ) {
            return true;
        }

        return false;
    }

    //enum
    public static boolean isEnumCastableFrom(Class<?> srcClass) {
        if (srcClass == null) {
            return false;
        }

        if (    //过滤出可转换的类型
                ClassChecker.isEnum(srcClass) ||
                        ClassChecker.isString(srcClass)
                ) {
            return true;
        }

        return false;
    }

    //String
    public static boolean isStringCastableFrom(Class<?> srcClass) {
        if (srcClass == null) {
            return false;
        }

        if (    //过滤出可转换的类型
                ClassChecker.isBoolean(srcClass) ||
                        ClassChecker.isByte(srcClass) ||
                        ClassChecker.isChar(srcClass) ||
                        ClassChecker.isShort(srcClass) ||
                        ClassChecker.isInt(srcClass) ||
                        ClassChecker.isLong(srcClass) ||
                        ClassChecker.isFloat(srcClass) ||
                        ClassChecker.isDouble(srcClass) ||
                        ClassChecker.isWrapBoolean(srcClass) ||
                        ClassChecker.isWrapByte(srcClass) ||
                        ClassChecker.isWrapChar(srcClass) ||
                        ClassChecker.isWrapShort(srcClass) ||
                        ClassChecker.isWrapInt(srcClass) ||
                        ClassChecker.isWrapLong(srcClass) ||
                        ClassChecker.isWrapFloat(srcClass) ||
                        ClassChecker.isWrapDouble(srcClass) ||
                        ClassChecker.isEnum(srcClass) ||
                        ClassChecker.isString(srcClass) ||
                        ClassChecker.isBigInteger(srcClass) ||
                        ClassChecker.isBigDecimal(srcClass)
                ) {
            return true;
        }

        return false;
    }

    //Date
    public static boolean isDateCastableFrom(Class<?> srcClass) {
        if (srcClass == null) {
            return false;
        }

        if (    //过滤出可转换的类型
                ClassChecker.isShort(srcClass) ||
                        ClassChecker.isInt(srcClass) ||
                        ClassChecker.isLong(srcClass) ||
                        ClassChecker.isFloat(srcClass) ||
                        ClassChecker.isDouble(srcClass) ||
                        ClassChecker.isWrapShort(srcClass) ||
                        ClassChecker.isWrapInt(srcClass) ||
                        ClassChecker.isWrapLong(srcClass) ||
                        ClassChecker.isWrapFloat(srcClass) ||
                        ClassChecker.isWrapDouble(srcClass) ||
                        ClassChecker.isBigInteger(srcClass) ||
                        ClassChecker.isBigDecimal(srcClass) ||
                        ClassChecker.isDate(srcClass)
                ) {
            return true;
        }

        return false;
    }

    //BigInteger/BigDecimal
    public static boolean isBigNumberCastableFrom(Class<?> srcClass) {
        if (srcClass == null) {
            return false;
        }

        if (    //过滤出可转换的类型
                ClassChecker.isShort(srcClass) ||
                        ClassChecker.isInt(srcClass) ||
                        ClassChecker.isLong(srcClass) ||
                        ClassChecker.isFloat(srcClass) ||
                        ClassChecker.isDouble(srcClass) ||
                        ClassChecker.isWrapShort(srcClass) ||
                        ClassChecker.isWrapInt(srcClass) ||
                        ClassChecker.isWrapLong(srcClass) ||
                        ClassChecker.isWrapFloat(srcClass) ||
                        ClassChecker.isWrapDouble(srcClass) ||
                        ClassChecker.isString(srcClass) ||
                        ClassChecker.isBigInteger(srcClass) ||
                        ClassChecker.isBigDecimal(srcClass)
                ) {
            return true;
        }

        return false;
    }

    //Custom
    public static boolean isCustomCastableFrom(Class<?> srcClass) {
        if (srcClass == null) {
            return false;
        }

        if (    //过滤出可转换的类型
                ClassChecker.isCustom(srcClass)
                ) {
            return true;
        }

        return false;
    }
}
