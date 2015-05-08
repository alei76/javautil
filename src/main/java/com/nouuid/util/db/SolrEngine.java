package com.nouuid.util.db;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.apache.solr.common.params.SolrParams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nouuid on 2015/5/7.
 */
public class SolrEngine {

    public static final Log logger = LogFactory.getLog(SolrEngine.class);

    private String urlStr = null;
    private SolrClient client = null;

    public SolrEngine(String urlStr) {
        this.urlStr = urlStr;
    }

    public void init() {
        client = new HttpSolrClient(urlStr);
    }

    public void destory() {
        try {
            client.close();
        } catch (IOException e) {
            logger.error("", e);
        } finally {
            client = null;
        }
    }

    /**
     * ����ĵ�
     * @param id
     * @param content
     * @return
     */
    public boolean addDoc(String id, String content) {
        boolean flag = true;
        init();
        SolrInputDocument doc = new SolrInputDocument();
        doc.addField("id", id);
        doc.addField("content", content);
        try {
            UpdateResponse response = client.add(doc);//���һ��doc�ĵ�
            client.commit();//commit��ű��浽������
            client.close();
//	        System.out.println("query time��" + response.getQTime());
//	        System.out.println("Elapsed Time��" + response.getElapsedTime());
//	        System.out.println("status��" + response.getStatus());
        } catch (SolrServerException | IOException e) {
            logger.error("", e);
            flag = false;
        }
        destory();
        return flag;
    }

    /**
     * ��ѯ
     *
     * @param queryStr ��ѯ��������ʽfiled:keywords
     * @return
     */
    public List<String> query(String queryStr) {
        List<String> fileIdList = new ArrayList<String>();
        init();
        SolrDocument document = null;
//        SolrQuery parameters = new SolrQuery();
//        parameters.set("q", queryStr);

        SolrParams parameters = new SolrQuery(queryStr);
        try {
            QueryResponse response = client.query(parameters);
            SolrDocumentList list = response.getResults();
            //get
            if (!list.isEmpty()) {
                for (int i = 0; i < list.size(); i++) {
                    document = list.get(i);
                    fileIdList.add((document.getFieldValue("id")).toString());
                }
            }
        } catch (SolrServerException | IOException e) {
            logger.error("", e);
        }
        destory();
        return fileIdList;
    }

    /**
     * ����idɾ������
     *
     * @param id
     * @return
     */
    public boolean removeById(String id) {
        boolean flag = true;
        init();
        try {
            client.deleteById(id);
            client.commit();
        } catch (SolrServerException | IOException e) {
            logger.error("", e);
            flag = false;
        }
        destory();
        return flag;
    }

    /**
     * ����id�б�ɾ������
     * @param ids
     */
    public void removeByIds(List<String> ids) {
        init();
        try {
            client.deleteById(ids);
            client.commit();
        } catch (SolrServerException | IOException e) {
            logger.error("", e);
        }
        destory();
    }
}
