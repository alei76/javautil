package com.nouuid.util.clazz;


public interface ClassChecker {

    /**
     * 是否为基础类型
     * @param clazz
     * @return
     */
    public boolean isBoolean(Class<?> clazz);
    public boolean isByte(Class<?> clazz);
    public boolean isChar(Class<?> clazz);
    public boolean isShort(Class<?> clazz);
    public boolean isInt(Class<?> clazz);
    public boolean isLong(Class<?> clazz);
    public boolean isFloat(Class<?> clazz);
    public boolean isDouble(Class<?> clazz);

    /**
     * 是否为基础类型封装类
     * @param clazz
     * @return
     */
    public boolean isWrapBoolean(Class<?> clazz);
    public boolean isWrapByte(Class<?> clazz);
    public boolean isWrapChar(Class<?> clazz);
    public boolean isWrapShort(Class<?> clazz);
    public boolean isWrapInt(Class<?> clazz);
    public boolean isWrapLong(Class<?> clazz);
    public boolean isWrapFloat(Class<?> clazz);
    public boolean isWrapDouble(Class<?> clazz);

    /**
     * 是否为枚举
     * @param clazz
     * @return
     */
    public boolean isEnum(Class<?> clazz);

    /**
     * 是否为基本类型（基础类型、基础类型封装类、String）
     * @param clazz
     * @return
     */
    public boolean isBasicType(Class<?> clazz);

    /**
     * 是否为基础类型封装类型
     * @param clazz
     * @return
     */
    public boolean isWrapClass(Class<?> clazz);

    /**
     * 是否为String类型
     * @param clazz
     * @return
     */
    public boolean isString(Class<?> clazz);

    /**
     * 是否为Date类型
     * @param clazz
     * @return
     */
    public boolean isDate(Class<?> clazz);

    /**
     * 是否为BigInteger/BigDecimal类型
     * @param clazz
     * @return
     */
    public boolean isBigNumber(Class<?> clazz);

    /**
     * 是否为BigDecimal类型
     * @param clazz
     * @return
     */
    public boolean isBigDecimal(Class<?> clazz);

    /**
     * 是否为BigInteger类型
     * @param clazz
     * @return
     */
    public boolean isBigInteger(Class<?> clazz);

    /**
     * 是否为自定义类型
     * @param clazz
     * @return
     */
    public boolean isCustom(Class<?> clazz);

    /**
     * 是否为数组类型
     * @param clazz
     * @return
     */
    public boolean isArray(Class<?> clazz);

    /**
     * 是否为List类型
     * @param clazz
     * @return
     */
    public boolean isList(Class<?> clazz);

    /**
     * 是否为Set类型
     * @param clazz
     * @return
     */
    public boolean isSet(Class<?> clazz);

    /**
     * 是否为Map类型
     * @param clazz
     * @return
     */
    public boolean isMap(Class<?> clazz);

    /**
     * 数组、List、Set、Map
     * @return
     */
    public boolean isCollection(Class<?> clazz);

    /**
     * 获取泛型参数类型
     * @param type 泛型类型
     * @param i 参数列表编号
     * @return
     */
//	public Class<?> getGenericParaClass(Type type, int i);

    public boolean isBooleanCastableFrom(Class<?> srcClass);
    public boolean isByteCastableFrom(Class<?> srcClass);
    public boolean isCharCastableFrom(Class<?> srcClass);
    public boolean isShortCastableFrom(Class<?> srcClass);
    public boolean isIntCastableFrom(Class<?> srcClass);
    public boolean isLongCastableFrom(Class<?> srcClass);
    public boolean isFloatCastableFrom(Class<?> srcClass);
    public boolean isDoubleCastableFrom(Class<?> srcClass);
    public boolean isEnumCastableFrom(Class<?> srcClass);
    public boolean isStringCastableFrom(Class<?> srcClass);
    public boolean isDateCastableFrom(Class<?> srcClass);
    public boolean isBigNumberCastableFrom(Class<?> srcClass);
    public boolean isCustomCastableFrom(Class<?> srcClass);
}
