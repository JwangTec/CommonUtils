package com.wang;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import java.util.Objects;
import java.util.Scanner;

/**
 * <p>
 * mysql 代码生成器
 * </p>
 *
 * @author wang
 */
public class MysqlGenerator {


    /**
     * RUN THIS
     * 选择 freemarker 引擎需要指定如下，注意 pom 依赖必须有！
     *         mpg.setTemplateEngine(new FreemarkerTemplateEngine());
     *         mpg.setTemplate(new TemplateConfig().setXml(null));
     *         mpg.setTemplateEngine(new FreemarkerTemplateEngine());
     */
    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();
//        String baseEntity = scanner("需继承的父类实体");
        String baseEntity = "com.sssk.cloud.common.BaseEntity";
        String tableName = scanner("数据库表名");
//        String importPath = scanner("项目需引入该包的路径");
        String importPath = "com.sssk.cloud.activity.service";
//        String auth = scanner("auth");
        String auth = "wangqi";
        String moduleName = null;
        String outStringPath = null;

        GlobalConfig globalConfig = getGlobalConfig(null,auth);
        DataSourceConfig dataSourceConfig = getDataSourceConfig();
        PackageConfig packageConfig = getPackageConfig(importPath, null);
        InjectionConfig injectionConfig = getInjextionConfig();
        StrategyConfig strategyConfig = getStrategyConfig(baseEntity, tableName);

        //封装信息
        mpg.setDataSource(dataSourceConfig);
        mpg.setPackageInfo(packageConfig);
        mpg.setGlobalConfig(globalConfig);
        mpg.setStrategy(strategyConfig);
        mpg.setCfg(injectionConfig);

        mpg.execute();
    }


    /**
     * 获取数据源配置
     * @return
     */
    private static DataSourceConfig getDataSourceConfig(){
        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://192.168.2.140:3306/sssk_cloud?allowMultiQueries=true&autoReconnect=true&failOverReadOnly=false&useUnicode=true&characterEncoding=utf8&nullNamePatternMatchesAll=true&serverTimezone=Asia/Shanghai");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        return dsc;
    }

    /**
     * 策略配置
     * @param baseEntity 基实体类
     * @param tableName  数据库表名
     * 相关其他配置:
     *         strategy.setSuperControllerClass("com.baomidou.mybatisplus.samples.generator.common.BaseController");
     *         strategy.setSuperEntityColumns("id");
     *         strategy.setTablePrefix("_");
     */
    private static StrategyConfig getStrategyConfig(String baseEntity,String tableName) {

        StrategyConfig strategy = new StrategyConfig();
        //下划线转驼峰
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        //父类实体
        strategy.setSuperEntityClass(baseEntity);
        strategy.setEntityLombokModel(true);
        strategy.setInclude(tableName);
        strategy.setControllerMappingHyphenStyle(true);
//        strategy.setTablePrefix("_");
        return strategy;
    }

    /**
     * 自定义配置
     */
    private static InjectionConfig getInjextionConfig() {
        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        /*
         List<FileOutConfig> focList = new ArrayList<>();
                focList.add(new FileOutConfig("/templates/mapper.xml.ftl") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输入文件名称
                return projectPath + "/mybatis-plus-sample-generator/src/main/resources/mapper/" + pc.getModuleName()
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);
         */
        return cfg;
    }

    /**
     * 相关包路径配置
     * @param importPath
     * @param moduleName
     */
    private static PackageConfig getPackageConfig(String importPath,String moduleName) {
        // 包配置
        PackageConfig pc = new PackageConfig();

        //模块名配置
        if (Objects.nonNull(moduleName)) {
            pc.setModuleName(moduleName);
        }
        pc.setParent(importPath);
        return pc;
    }

    /**
     * 获取通用配置
     * @param outStringPath 输出相对路径
     */
    private static GlobalConfig getGlobalConfig(String outStringPath,String auth) {
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        //获取当前项目绝对路径 如：Users/wang/Desktop/generator_demo
        String projectPath = System.getProperty("user.dir");
        if (Objects.isNull(outStringPath) || "".equals(outStringPath)) {
            outStringPath = "/generatorTmp";
        }
        gc.setOutputDir(projectPath + outStringPath);
        gc.setAuthor(auth);
        //是否文件覆盖
        gc.setFileOverride(true);
        //主键策略（自动）
        gc.setIdType(IdType.AUTO);
        //生成基本字段的sql片段
        gc.setBaseColumnList(true);
        //开启实体属性swagger注解
        gc.setSwagger2(true);
        gc.setOpen(false);
        return gc;
    }

    /**
     * <p>
     * 读取控制台内容
     * </p>
     */
    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotEmpty(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }
}
