package com.dynamic.data.source.generate;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mqz
 * @description
 * @since 2020/9/8
 */

public class Generator {


    private static void make(String[] tableNames,
                             String authorName,
                             String moduleName,
                             String url,
                             String driverName,
                             String userName,
                             String password){

        String projectPath = System.getProperty("user.dir");

        //============================== 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(projectPath + "/src/main/java")
                // 是否支持 AR
                .setActiveRecord(true)
                //设置作者名字
                .setAuthor(authorName)
                //文件覆盖(全新文件)
                .setFileOverride(true)
                //主键策略
                .setIdType(IdType.AUTO)
                //SQL 映射文件
                .setBaseResultMap(true)
                //SQL 片段
                .setBaseColumnList(true)
                .setOpen(false);
        //============================== 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MARIADB)
                .setUrl(url)
                .setDriverName(driverName)
                .setUsername(userName)
                //.setSchemaName("public")
                .setPassword(password);
        //==============================包配置
        PackageConfig pc = new PackageConfig();
        //配置业务包路径
        pc.setParent("com.dynamic.data.source.business")
                .setModuleName(moduleName)
                .setEntity("entity")
                .setMapper("mapper")
                .setService("service")
                .setController("controller").setServiceImpl("service.impl");

        //会自动生成 impl，可以不设定
        //============================== 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };
        List<FileOutConfig> focList = new ArrayList<>();
        focList.add(new FileOutConfig("/templates/mapper.xml.ftl") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                System.out.println(tableInfo.getName());
                System.out.println(tableInfo.getEntityName());
                // 自定义输入文件名称
                return projectPath + "/dynamic-data-source/src/main/java/com/dynamic/data/source/business/"+pc.getModuleName()+"/mapper"
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);
        //============================== 策略配置
        StrategyConfig strategy = new StrategyConfig();
        //设置命名规则  underline_to_camel 底线变驼峰
        strategy.setNaming(NamingStrategy.underline_to_camel)
                //设置设置列命名  underline_to_camel 底线变驼峰
                .setColumnNaming(NamingStrategy.underline_to_camel)
                //.setSuperEntityClass("com.maoxs.pojo")//设置继承类
                // 设置继承类
                //.setSuperControllerClass("com.maoxs.controller")
                //表格前缀，加了这个实体会去掉前缀
                //.setTablePrefix("t_")
                .setLogicDeleteFieldName("")
                //是否加入lombok
                .setEntityLombokModel(true)
                //设置表名
                .setInclude(tableNames)
                // 设置超级超级列
                //.setSuperEntityColumns("id")
                //设置controller映射联字符
                .setControllerMappingHyphenStyle(true);
        //============================== 生成配置
        AutoGenerator mpg = new AutoGenerator();
        mpg.setCfg(cfg)
                .setTemplate(new TemplateConfig().setXml(null))
                .setGlobalConfig(gc)
                .setDataSource(dsc)
                .setPackageInfo(pc)
                .setStrategy(strategy)
                // 选择 freemarker 引擎需要指定如下加，注意 pom 依赖必须有！ (需要导入 freemarker-springboot 的依赖)
                .setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }

    public static void main(String[] args) {

        /**数据库连接信息-用户体系库*/
        String master_url = "jdbc:mysql://xxxxx:3306/test?useUnicode=true&characterEncoding=UTF-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String master_driverName = "com.mysql.jdbc.Driver";
        String master_userName = "xxxx";
        String master_password = "xxxxx";

        /**数据库连接信息-manage*/
        String k2_manage_url = "jdbc:mysql://localhost:3306/fxq-api?useUnicode=true&characterEncoding=UTF-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String k2_manage_driverName = "com.mysql.jdbc.Driver";
        String k2_manage_userName = "xxxx";
        String k2_manage_password = "xxxxx";

        /**数据库连接信息-localhost*/
        String k3_local_url = "jdbc:mysql://xxxxx:3306/hetong2?useUnicode=true&characterEncoding=utf8&rewriteBatchedStatements=true&autoReconnect=true&serverTimezone=Asia/Shanghai";
        String k3_local_driverName = "com.mysql.jdbc.Driver";
        String k3_local_userName = "xxxx";
        String k3_local_password = "xxxxx";


        String authorName = "mqz";
        String moduleName = "k2";
        String[] tableNames = new String[]{
                "t_msg"
        };
        make(tableNames,
                authorName,
                moduleName,
                k2_manage_url,
                k2_manage_driverName,
                k2_manage_userName,
                k2_manage_password);
    }


}
