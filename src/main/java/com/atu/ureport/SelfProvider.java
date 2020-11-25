package com.atu.ureport;

import com.bstek.ureport.provider.report.ReportFile;
import com.bstek.ureport.provider.report.ReportProvider;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.List;

/**
 * Create by atu on 2020/11/24
 */

public class SelfProvider implements ReportProvider, ApplicationContextAware {
    @Override
    public InputStream loadReport(String s) {
        System.out.println("===loadReport" + s);
        return null;
    }

    @Override
    public void deleteReport(String s) {
        System.out.println("===deleteReport" + s);
    }

    @Override
    public List<ReportFile> getReportFiles() {
        System.out.println("===getReportFiles");
        return null;
    }

    @Override
    public void saveReport(String file, String content) {
        System.out.println("===" + content);
    }

    @Override
    public String getName() {
        return "自定义文件";
    }

    @Override
    public boolean disabled() {
        return false;
    }

    @Override
    public String getPrefix() {
        System.out.println("===getPrefix");
        return "file:";
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("===setApplicationContext");
    }
}
