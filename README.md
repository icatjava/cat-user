# cat-user
User Server


# 如何启动:
## Step-1:
- 你需要依赖: https://github.com/cat-feng/cat-java
- clone到本地后，执行`mvn clean install`

## Step-2:
- 本地启动：Zookeeper
- 本地启动：MySQL
  - 表结构请查看 doc/schema.sql
- 替换：application-dev.yml文件中的参数
```properties
MYSQL_URL: jdbc:mysql://localhost:3306/cat_user?useSSL=false&allowPublicKeyRetrieval=true&characterEncoding=utf8
MYSQL_USERNAME: root
MYSQL_PASSWORD: 123456
DUBBO_REGISTRY_ADDRESS: zookeepker://localhost:2181
```