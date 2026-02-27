# 项目名称
云图库

##  配置依赖
### spring-boot-starter-web
主要作用：让你的项目变成一个能接收 HTTP 请求的 Web 应用（包括 RESTful API 和传统的网页应用）。
- Spring MVC（核心 web 框架）
- Jackson（JSON 序列化/反序列化）
- 内嵌 Tomcat（默认 web 服务器，也可换成 Jetty / Undertow）
- spring-web、spring-webmvc 等底层依赖
- 自动配置：DispatcherServlet、错误处理、静态资源映射、HttpMessageConverters 等
### MySQL
主要作用：
提供 Java 程序与 MySQL 数据库通信的驱动程序（JDBC Driver）。
它本身不包含：
- 连接池
- ORM 功能
- 事务管理
它是 Java 连接 MySQL 的“插头”，没有它 Spring Boot 根本无法与 MySQL 数据库通信。
### lombok
主要作用：
通过注解在编译期自动生成大量重复代码，让实体类、DTO、VO 等写得非常简洁。
- 极大减少 boilerplate 代码，让实体类和服务类看起来干净 3–5 倍，几乎是现代 Spring Boot 项目的“标配”。
### MyBatis-Plus （最受欢迎的 ORM 增强）
一句话总结：MyBatis 的“懒人版”，让你少写 70% 的 Mapper.xml 和 SQL。
最常用注解/类：@TableName、BaseMapper<T>、IService<T>、QueryWrapper、LambdaQueryWrapper、@TableField(fill = FieldFill.INSERT)（自动填充）。
- 对比原生 MyBatis：原生要自己写 insert/update/delete/select + xml，MP 基本不用写 xml。
### Hutool（Java 开发“瑞士军刀”）
一句话总结：项目里所有 Util 类都可以删了，改用 Hutool 的静态方法。
### Knife4j（接口文档“美颜+功能升级版”）
一句话总结：让 Swagger 文档从“丑陋难用”变成“好看+实用”的在线 API 管理工具。
### spring-boot-starter-aop（横切关注点神器）
- 一句话总结：让日志、异常、权限、监控等“到处都要写”的代码，集中写一次。
- 核心概念：@Aspect + @Before / @After / @Around / @Pointcut。
- 典型使用（统一日志 + 耗时统计）：
## 通用代码
### exception包 
#### 自定义异常类
ErrorCode
- 自定义错误码，对错误进行收集，便于前端统一处理


