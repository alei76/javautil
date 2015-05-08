package com.nouuid.util.db.solr;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.response.QueryResponse;

/**
 * Created by nouuid on 2015/5/8.
 */
public interface SolrService {

    /**
     * �Ƿ����������Ϣ
     * @return
     */
    public boolean isConfigurated();

    /**
     * ��ѯ
     * @param query
     * @return
     */
    public QueryResponse query(SolrQuery query);

    /**
     * ����collection
     * @param collectionName
     */
    public void createCollection(String collectionName);

    /**
     * ����������5��collection��ÿ��1��
     */
    public void createCollectionPerDay();
}
