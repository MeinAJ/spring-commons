```
@Autowired,先根据type从spring中查找bean,如果个数等于1,为true,如果个数等于0,那就抛异常,如果个数大于1,再根据
这个需要被注入的field名字从多个bean中查找,如果不是匹配到1个,就抛异常.根据field的名字去找,肯定是找到一个或者0个

@Resource,如果设置了name,直接根据name去查找,如果查找不到,就根据@Autowired这个逻辑去找

spring内置了很多BeanPostProcessor来处理各种解析
CommonAnnotationBeanPostProcessor先于AutowiredAnnotationBeanPostProcessor执行

@Autowired -> AutowiredAnnotationBeanPostProcessor解析器的postProcessorProperties处理这个注解
@Resource -> CommonAnnotationBeanPostProcessor解析器的postProcessorProperties完成解析
```