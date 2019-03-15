package springboot_mybatis_thymeleaf;

import java.util.stream.Stream;

/**
 * 生成所有表<table/>标签
 * @author rfx
 * @Date 2019/3/15 11:00
 */
public class TableGen {
    public static void main(String[] args) {
        //1.在数据库执行show tables 全选复制到以下
        String tables = "user\n" +
                "user_album";
        //2.生成所有表<table/>标签
        Stream.of(tables.split("\n")).forEach(tableName->{
            System.out.println("<table tableName=\""+tableName+"\"/>");
        });
        //3.把控制台打印的<table/>标签复制到resources/builder/generatorConfig.xml里面的<context>标签内

        //4.修改generatorConfig.xml对应的数据库配置

        //5.右键点击pom.xml->run maven->Plugins->mybatis-generator-maven-plugin->mybatis-generator:generate
    }
}
