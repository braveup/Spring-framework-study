# Spring-framework-read
this is a  study project abort  spring-framework.

##sping 依赖说明
   <!--spring core 核心包，core是其他组件的基本核心-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-core</artifactId>
            <version>${springframework.version}</version>
        </dependency>

        <!--spring bean 主要负责访问配置文件，创建和管理bean进行 inversion of control/dependency injection(IoC/DI)-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-beans</artifactId>
            <version>${springframework.version}</version>
        </dependency>
        <!--spring context  构建于core 和 beans之上,提供注册器的框架式的当对象访问方法。Context继承了beans的特性，为spring核心提供提供了大量的扩展，添加了对国际化（如资源绑定）、事件传播，资源加载和对Context的透明创建支持。Context模块同时支持J2EE的一些特性，例如EJB,JMX（Java message server）和基础的远程处理，ApplicationContext接口是Context模块的关键-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>${springframework.version}</version>
        </dependency>
        <!--spring expression Language (El表达式)模块，能在运行是获取和操作对象-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-expression</artifactId>
            <version>${springframework.version}</version>
        </dependency>
        <!--spring jdbc 支撑了数据库的使用-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-jdbc</artifactId>
            <version>${springframework.version}</version>
        </dependency>
        <!--spring orm 模块为流行的对象-关系映射API，如JPA，JDO,Hibernate,iBatis等提供了一个交互层，利用ORM封装包，可以混合的使用所有的spring提供特性的O/R映射-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-orm</artifactId>
            <version>${springframework.version}</version>
        </dependency>
        <!--spring context -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context-support</artifactId>
            <version>${springframework.version}</version>
        </dependency>

        <!-- Transaction dependency is required with Quartz integration -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-tx</artifactId>
            <version>${springframework.version}</version>
        </dependency>

