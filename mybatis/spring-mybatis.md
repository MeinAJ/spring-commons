```
MapperFactoryBean -> MybatisFactoryBeanPlus1
MapperScannerRegistrar -> MybatisImportBeanDefinitionRegistrar
@MapperScan -> 专门用于扫描mapper的注解

SqlSessionFactory是SqlSession的工厂，sqlSession可以理解从连接池中拿一个连接池，并进行封装，方便执行sql
（当然底层使用的druid或者c3p0），底层是socket连接池，与数据库的连接池
```
