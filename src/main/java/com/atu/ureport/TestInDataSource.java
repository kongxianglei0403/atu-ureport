package com.atu.ureport;

import com.bstek.ureport.definition.datasource.BuildinDatasource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

/**
 * Create by atu on 2020/11/24
 * 内置数据源
 */
@Component
public class TestInDataSource implements BuildinDatasource {

    @Autowired
    private DataSource dataSource;

    @Override
    public String name() {
        return "cluster";
    }

    @Override
    public Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            log.println("========"+throwables.getMessage());
        }
        return null;
    }
}
