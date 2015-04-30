package com.nouuid.util.clazz;


public interface ClassChecker {

    /**
     * �Ƿ�Ϊ��������
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
     * �Ƿ�Ϊ�������ͷ�װ��
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
     * �Ƿ�Ϊö��
     * @param clazz
     * @return
     */
    public boolean isEnum(Class<?> clazz);

    /**
     * �Ƿ�Ϊ�������ͣ��������͡��������ͷ�װ�ࡢString��
     * @param clazz
     * @return
     */
    public boolean isBasicType(Class<?> clazz);

    /**
     * �Ƿ�Ϊ�������ͷ�װ����
     * @param clazz
     * @return
     */
    public boolean isWrapClass(Class<?> clazz);

    /**
     * �Ƿ�ΪString����
     * @param clazz
     * @return
     */
    public boolean isString(Class<?> clazz);

    /**
     * �Ƿ�ΪDate����
     * @param clazz
     * @return
     */
    public boolean isDate(Class<?> clazz);

    /**
     * �Ƿ�ΪBigInteger/BigDecimal����
     * @param clazz
     * @return
     */
    public boolean isBigNumber(Class<?> clazz);

    /**
     * �Ƿ�ΪBigDecimal����
     * @param clazz
     * @return
     */
    public boolean isBigDecimal(Class<?> clazz);

    /**
     * �Ƿ�ΪBigInteger����
     * @param clazz
     * @return
     */
    public boolean isBigInteger(Class<?> clazz);

    /**
     * �Ƿ�Ϊ�Զ�������
     * @param clazz
     * @return
     */
    public boolean isCustom(Class<?> clazz);

    /**
     * �Ƿ�Ϊ��������
     * @param clazz
     * @return
     */
    public boolean isArray(Class<?> clazz);

    /**
     * �Ƿ�ΪList����
     * @param clazz
     * @return
     */
    public boolean isList(Class<?> clazz);

    /**
     * �Ƿ�ΪSet����
     * @param clazz
     * @return
     */
    public boolean isSet(Class<?> clazz);

    /**
     * �Ƿ�ΪMap����
     * @param clazz
     * @return
     */
    public boolean isMap(Class<?> clazz);

    /**
     * ���顢List��Set��Map
     * @return
     */
    public boolean isCollection(Class<?> clazz);

    /**
     * ��ȡ���Ͳ�������
     * @param type ��������
     * @param i �����б���
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
