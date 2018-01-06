package com.lyq3.bigboot.upms.dao;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * 代码生成器
 */
public class Generator {
    //代码输出路径
    private static  String OUTPUTDIR = System.getProperty("user.dir")+"\\BigBoot-upms\\BigBoot-upms-dao\\src\\main\\java\\";
    //作者
    private static String AUTHOR = "卡卢比";
    //包名
    private static String PACKAGENAME = "com.lyq3.bigboot.upms.dao";

    public static void main(String[] args) {
        String[] tableNames = {"upms_user",
                "upms_log",
                "upms_organization",
                "upms_persission",
                "upms_role_permission",
                "upms_system",
                "upms_user_organization",
                "upms_user_persission",
                "upms_user_role",
                "upms_role"};//需要生成代码的表名
        generateByTables(PACKAGENAME, tableNames);
    }


    private static void generateByTables(String packageName, String... tableNames){
        GlobalConfig config = new GlobalConfig();
        String dbUrl = "jdbc:mysql://182.61.60.110:3333/big-boot";
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig .setUrl(dbUrl);
        dataSourceConfig  .setUsername("bigBoot");
        dataSourceConfig  .setPassword("bigboot123456");
        dataSourceConfig   .setDriverName("com.mysql.jdbc.Driver");
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(true);
//        strategyConfig  .setEntityLombokModel(false);
        strategyConfig  .setDbColumnUnderline(true);
        strategyConfig   .setNaming(NamingStrategy.underline_to_camel);
        strategyConfig  .setInclude(tableNames);
        strategyConfig.setEntityBuilderModel(true);
        config.setActiveRecord(true);
        config  .setAuthor(AUTHOR);
        config  .setOutputDir(OUTPUTDIR);
//        config  .setFileOverride(true);
        AutoGenerator autoGenerator = new AutoGenerator();
        autoGenerator.setGlobalConfig(config);
        autoGenerator.setDataSource(dataSourceConfig);
        autoGenerator .setStrategy(strategyConfig);
        //包设置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent(packageName);
        //模板设置
        TemplateConfig tc = new TemplateConfig();
        //以下模块不生成
        tc.setController(null);
//        tc.setXml(null);
        tc.setService(null);
        tc.setServiceImpl(null);
        autoGenerator .setPackageInfo( packageConfig);
        autoGenerator.setTemplate(tc);
        autoGenerator.execute();
    }
}
