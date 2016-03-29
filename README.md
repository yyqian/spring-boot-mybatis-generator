# spring-boot-mybatis-generator

To configure and run mybatis generator, you need to:

1. add `mybatis-generator-maven-plugin` in `pom.xml`
1. configure `application.properties`
2. configure `generatorConfig.xml`
3. run: `mvn mybatis-generator:generate`

To integrate Spring Boot with Mybatis, you need to:

1. configure `/config/spring-mybatis.xml`
2. configure `/config/mybatis-config.xml`
3. configure `/config/MybatisConfig.java`