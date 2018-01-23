package com.learn.testdb.controller;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author 01467926 on 2018/1/23.
 * @version 1.0
 */
@Controller
public class ConnectDatabase {

    private static Logger logger = LoggerFactory.getLogger(ConnectDatabase.class);

//    @Autowired
    private DataSource dataSource;

    @Autowired
    private BasicDataSource basicDataSource;


    @RequestMapping(value = "/test1")
    @ResponseBody
    public String test1(){

//        logger.warn(dataSource.toString());
        logger.warn(basicDataSource.toString());
        return "test1";

    }




    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public BasicDataSource getBasicDataSource() {
        return basicDataSource;
    }

    public void setBasicDataSource(BasicDataSource basicDataSource) {
        this.basicDataSource = basicDataSource;
    }
}
