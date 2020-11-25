package com.atu.ureport;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create by atu on 2020/11/24
 *
 * spring bean数据集
 */
@Component
public class TestBean {

    /**
     *
     * @param dsName  数据源名称
     * @param datasetName 数据集名称
     * @param parameters 外部传入的map
     * @return
     */
    public List<Map<String,Object>> loadReportData(String dsName,String datasetName,Map<String,Object> parameters){
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < 1000; i++) {
            // 模拟数据
            Map<String, Object> m = new HashMap<String, Object>();
            m.put("id", i);
            m.put("name", RandomStringUtils.random(10, true, false));
            m.put("salary", RandomUtils.nextInt() + i);
            list.add(m);
        }
        return list;
    }
    public List<User> buildReport(String dsName,String datasetName,Map<String,Object> parameters){
        int dg = 0;
        Object degree = parameters.get("degree");
        if (degree != null)
            dg = Integer.valueOf(dg);
        List<User> list = new ArrayList<User>();
        for (int i = 1; i < 5; i++) {
            User m = new User();
            m.setId(i);
            m.setName("tutu" + i);
            m.setSalary(RandomUtils.nextInt() + i);
            m.setDegree(30 * i + 15);
//            m.setDegree(i);
            list.add(m);
        }
        return list;
    }

    /*public List<User> prepareChart(String dsName,String datasetName,Map<String,Object> parameters){

    }*/
}
