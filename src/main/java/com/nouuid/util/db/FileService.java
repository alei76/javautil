package com.nouuid.util.db;

import java.io.ByteArrayOutputStream;

/**
 * Created by nouuid on 2015/5/7.
 */
public interface FileService {

    /**
     * ���
     * @param filename �ļ�Ψһ��ʶ
     * @param fileData �ļ���
     * @return
     */
    public boolean save(String filename, byte[] fileData);

    /**
     * ɾ��
     * @param filename
     * @return
     */
    public boolean remove(String filename); //ɾ

    /**
     * ��ѯ
     * @param filename
     * @return
     */
    public ByteArrayOutputStream get(String filename); //��
}
