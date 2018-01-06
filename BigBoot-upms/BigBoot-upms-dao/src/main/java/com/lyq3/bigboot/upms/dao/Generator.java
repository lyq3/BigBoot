package com.lyq3.bigboot.upms.dao;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
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
        String[] tableNames = {"upms_user"};//需要生成代码的表名
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
        strategyConfig
                .setCapitalMode(true);
//        strategyConfig  .setEntityLombokModel(false);
        strategyConfig  .setDbColumnUnderline(true);
        strategyConfig   .setNaming(NamingStrategy.underline_to_camel);
        strategyConfig  .setInclude(tableNames);
        config.setActiveRecord(false);
        config  .setAuthor(AUTHOR);
        config  .setOutputDir(OUTPUTDIR);
//        config  .setFileOverride(true);
        AutoGenerator autoGenerator = new AutoGenerator();
        autoGenerator.setGlobalConfig(config);
        autoGenerator.setDataSource(dataSourceConfig);
        autoGenerator .setStrategy(strategyConfig);
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent(packageName);
//        packageConfig.setController(null);//不生成controller
//        packageConfig.setEntity("entity");
//        packageConfig.setService(null);//不生成service
//        packageConfig.setServiceImpl(null);//不生成serviceimpl
        packageConfig.setXml(null);//不生成XML
        autoGenerator .setPackageInfo(
                packageConfig
        );
        autoGenerator.execute();
    }
}
