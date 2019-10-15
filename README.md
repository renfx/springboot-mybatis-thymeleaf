## 项目简述
springboot + mybatis + tk.mybatis + thymeleaf + pageHelper + 代码生成

虽然idea创建项目可以快速集成这些框架,但还是需要一些配置或者遇到一些错误

本模板为减少工作量而存在

## 使用步骤

> 建议在Idea进行项目导入, Eclipse未进行项目导入测试

### 1. 修改文件名、包名

git clone项目 -> 修改项目文件夹 -> Idea导入项目 -> 修改包名springboot_mybatis_thymeleaf为想要的包名,如:com.rfxdevelop.utils

> 注意:需勾选search in comments and strings和search for text occurrences

最后全局替换springboot_mybatis_thymeleaf为更换的包名,如:com.rfxdevelop.utils

### 2. 修改配置

#### a. resources/application.yml
端口和数据库配置

#### b. resources/builder/generatorConfig.yml
数据库配置和需要生成的表配置

### 3. 生成实体、Mapper.java、Mapper.xml
右键点击pom.xml->run maven->Plugins->mybatis-generator-maven-plugin->mybatis-generator:generate

> TableGen是一个小工具配合生成所有表的table标签


### 4. 启动项目
启动类是Application,直接启动即可

### 5. [关于tk.mybatis](https://github.com/abel533/Mapper/wiki)
查询示例:
```java
  Example example = new Example(User.class);
  Example.Criteria criteria = example.createCriteria();
  criteria.andEqualTo("categoryID", 1);
  criteria.orEqualTo("categoryID", 2);
  userMapper.selectByExample(example);
```
Criteria还有更多方法,对于单表查询基本满足日常需求

[本项目地址](https://github.com/renfx/springboot-mybatis-thymeleaf.git)
