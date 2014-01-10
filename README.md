spring-boot-gradle-bug
======================

Small project to reproduce a bug of spring-boot-gradle-plugin

- checkout
- do a "gradle build"
- run in terminal with "java -jar spring-boot-gradle-bug-0.1-alpha.war"

Terminal message:
```
pedgonca$ java -jar spring-boot-gradle-bug-0.1-alpha.war

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::             (v0.5.0.M7)

2014-01-10 13:06:59.953  INFO 10332 --- [           main] com.sysmon.Application                   : Starting Application on sch-bp-2277.local with PID 10332 (started by pedgonca)
2014-01-10 13:07:00.195  INFO 10332 --- [           main] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@c9bf1b5: startup date [Fri Jan 10 13:07:00 CET 2014]; root of context hierarchy
2014-01-10 13:07:01.309  INFO 10332 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.scheduling.annotation.SchedulingConfiguration' of type [class org.springframework.scheduling.annotation.SchedulingConfiguration$$EnhancerByCGLIB$$ec7a77c5] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2014-01-10 13:07:01.645  INFO 10332 --- [           main] .t.TomcatEmbeddedServletContainerFactory : Server initialized with port: 8080
2014-01-10 13:07:01.863  INFO 10332 --- [           main] o.apache.catalina.core.StandardService   : Starting service Tomcat
2014-01-10 13:07:01.864  INFO 10332 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/7.0.47
2014-01-10 13:07:02.167  INFO 10332 --- [ost-startStop-1] o.a.catalina.loader.WebappClassLoader    : validateJarFile(/private/var/folders/k8/2v50hjr12m90z7n8x_flxcmm90bcm2/T/tomcat.6058572509894910458.8080/work/Tomcat/localhost/_/WEB-INF/lib/tomcat-embed-core-7.0.47.jar) - jar not loaded. See Servlet Spec 2.3, section 9.7.2. Offending class: javax/servlet/Servlet.class
2014-01-10 13:07:02.186  INFO 10332 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2014-01-10 13:07:02.186  INFO 10332 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1993 ms
2014-01-10 13:07:03.798  INFO 10332 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring FrameworkServlet 'dispatcherServlet'
2014-01-10 13:07:03.798  INFO 10332 --- [ost-startStop-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization started
2014-01-10 13:07:03.944  INFO 10332 --- [ost-startStop-1] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2014-01-10 13:07:04.199  INFO 10332 --- [ost-startStop-1] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.String com.sysmon.TestController.getTest()
2014-01-10 13:07:04.326  INFO 10332 --- [ost-startStop-1] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2014-01-10 13:07:04.326  INFO 10332 --- [ost-startStop-1] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2014-01-10 13:07:04.550  INFO 10332 --- [ost-startStop-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization completed in 752 ms
2014-01-10 13:07:04.664  INFO 10332 --- [           main] utoConfigurationReportLoggingInitializer : 


=========================
AUTO-CONFIGURATION REPORT
=========================


Positive matches:
-----------------

   MessageSourceAutoConfiguration
      - @ConditionalOnMissingBean (types: org.springframework.context.MessageSource; SearchStrategy: all) found no beans (OnBeanCondition)

   PropertyPlaceholderAutoConfiguration#propertySourcesPlaceholderConfigurer
      - @ConditionalOnMissingBean (types: org.springframework.context.support.PropertySourcesPlaceholderConfigurer; SearchStrategy: current) found no beans (OnBeanCondition)

   JpaRepositoriesAutoConfiguration.JpaWebConfiguration
      - found web application StandardServletEnvironment (OnWebApplicationCondition)
      - found web application StandardServletEnvironment (OnWebApplicationCondition)

   DataSourceAutoConfiguration
      - @ConditionalOnClass classes found: org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType (OnClassCondition)
      - @ConditionalOnClass classes found: org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType (OnClassCondition)
      - @ConditionalOnClass classes found: org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType (OnClassCondition)

   DataSourceTransactionManagerAutoConfiguration
      - @ConditionalOnClass classes found: org.springframework.jdbc.core.JdbcTemplate,org.springframework.transaction.PlatformTransactionManager (OnClassCondition)
      - @ConditionalOnClass classes found: org.springframework.jdbc.core.JdbcTemplate,org.springframework.transaction.PlatformTransactionManager (OnClassCondition)
      - @ConditionalOnClass classes found: org.springframework.jdbc.core.JdbcTemplate,org.springframework.transaction.PlatformTransactionManager (OnClassCondition)

   JmxAutoConfiguration
      - @ConditionalOnClass classes found: org.springframework.jmx.export.MBeanExporter (OnClassCondition)
      - SpEL expression on org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration: ${spring.jmx.enabled:true} (OnExpressionCondition)
      - @ConditionalOnClass classes found: org.springframework.jmx.export.MBeanExporter (OnClassCondition)
      - SpEL expression on org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration: ${spring.jmx.enabled:true} (OnExpressionCondition)
      - @ConditionalOnClass classes found: org.springframework.jmx.export.MBeanExporter (OnClassCondition)
      - @ConditionalOnMissingBean (types: org.springframework.jmx.export.MBeanExporter; SearchStrategy: all) found no beans (OnBeanCondition)
      - SpEL expression on org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration: ${spring.jmx.enabled:true} (OnExpressionCondition)

   JpaBaseConfiguration.JpaWebConfiguration
      - found web application StandardServletEnvironment (OnWebApplicationCondition)
      - SpEL expression on org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration$JpaWebConfiguration: ${spring.jpa.openInView:${spring.jpa.open_in_view:true}} (OnExpressionCondition)

   DispatcherServletAutoConfiguration
      - found web application StandardServletEnvironment (OnWebApplicationCondition)
      - @ConditionalOnClass classes found: org.springframework.web.servlet.DispatcherServlet (OnClassCondition)
      - found web application StandardServletEnvironment (OnWebApplicationCondition)
      - @ConditionalOnClass classes found: org.springframework.web.servlet.DispatcherServlet (OnClassCondition)
      - found web application StandardServletEnvironment (OnWebApplicationCondition)
      - @ConditionalOnClass classes found: org.springframework.web.servlet.DispatcherServlet (OnClassCondition)
      - @ConditionalOnBean (types: org.springframework.boot.context.embedded.EmbeddedServletContainerFactory; SearchStrategy: all) found the following [tomcatEmbeddedServletContainerFactory] (OnBeanCondition)

   DispatcherServletAutoConfiguration#dispatcherServlet
      - no DispatcherServlet found (DispatcherServletAutoConfiguration.DefaultDispatcherServletCondition)

   EmbeddedServletContainerAutoConfiguration
      - found web application StandardServletEnvironment (OnWebApplicationCondition)
      - found web application StandardServletEnvironment (OnWebApplicationCondition)
      - found web application StandardServletEnvironment (OnWebApplicationCondition)

   EmbeddedServletContainerAutoConfiguration.EmbeddedTomcat
      - @ConditionalOnClass classes found: javax.servlet.Servlet,org.apache.catalina.startup.Tomcat (OnClassCondition)
      - @ConditionalOnClass classes found: javax.servlet.Servlet,org.apache.catalina.startup.Tomcat (OnClassCondition)
      - @ConditionalOnClass classes found: javax.servlet.Servlet,org.apache.catalina.startup.Tomcat (OnClassCondition)
      - @ConditionalOnMissingBean (types: org.springframework.boot.context.embedded.EmbeddedServletContainerFactory; SearchStrategy: current) found no beans (OnBeanCondition)

   HttpMessageConvertersAutoConfiguration
      - @ConditionalOnClass classes found: org.springframework.http.converter.HttpMessageConverter (OnClassCondition)
      - @ConditionalOnClass classes found: org.springframework.http.converter.HttpMessageConverter (OnClassCondition)
      - @ConditionalOnClass classes found: org.springframework.http.converter.HttpMessageConverter (OnClassCondition)

   HttpMessageConvertersAutoConfiguration#messageConverters
      - @ConditionalOnMissingBean (types: org.springframework.boot.autoconfigure.web.HttpMessageConverters; SearchStrategy: all) found no beans (OnBeanCondition)

   HttpMessageConvertersAutoConfiguration.ObjectMappers
      - @ConditionalOnClass classes found: com.fasterxml.jackson.databind.ObjectMapper (OnClassCondition)
      - @ConditionalOnClass classes found: com.fasterxml.jackson.databind.ObjectMapper (OnClassCondition)
      - @ConditionalOnClass classes found: com.fasterxml.jackson.databind.ObjectMapper (OnClassCondition)

   HttpMessageConvertersAutoConfiguration.ObjectMappers#jacksonObjectMapper
      - @ConditionalOnMissingBean (types: com.fasterxml.jackson.databind.ObjectMapper; SearchStrategy: all) found no beans (OnBeanCondition)

   HttpMessageConvertersAutoConfiguration.ObjectMappers#mappingJackson2HttpMessageConverter
      - @ConditionalOnMissingBean (types: org.springframework.http.converter.json.MappingJackson2HttpMessageConverter; SearchStrategy: all) found no beans (OnBeanCondition)

   ServerPropertiesAutoConfiguration
      - found web application StandardServletEnvironment (OnWebApplicationCondition)
      - found web application StandardServletEnvironment (OnWebApplicationCondition)
      - found web application StandardServletEnvironment (OnWebApplicationCondition)

   ServerPropertiesAutoConfiguration#serverProperties
      - @ConditionalOnMissingBean (types: org.springframework.boot.autoconfigure.web.ServerProperties; SearchStrategy: current) found no beans (OnBeanCondition)

   WebMvcAutoConfiguration
      - found web application StandardServletEnvironment (OnWebApplicationCondition)
      - @ConditionalOnClass classes found: javax.servlet.Servlet,org.springframework.web.servlet.DispatcherServlet,org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter (OnClassCondition)
      - found web application StandardServletEnvironment (OnWebApplicationCondition)
      - @ConditionalOnClass classes found: javax.servlet.Servlet,org.springframework.web.servlet.DispatcherServlet,org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter (OnClassCondition)
      - found web application StandardServletEnvironment (OnWebApplicationCondition)
      - @ConditionalOnClass classes found: javax.servlet.Servlet,org.springframework.web.servlet.DispatcherServlet,org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter (OnClassCondition)
      - @ConditionalOnMissingBean (types: org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport; SearchStrategy: all) found no beans (OnBeanCondition)

   WebMvcAutoConfiguration#hiddenHttpMethodFilter
      - @ConditionalOnMissingBean (types: org.springframework.web.filter.HiddenHttpMethodFilter; SearchStrategy: all) found no beans (OnBeanCondition)

   WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#defaultViewResolver
      - @ConditionalOnMissingBean (types: org.springframework.web.servlet.view.InternalResourceViewResolver; SearchStrategy: all) found no beans (OnBeanCondition)

   WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#requestContextListener
      - @ConditionalOnMissingBean (types: org.springframework.web.context.request.RequestContextListener; SearchStrategy: all) found no beans (OnBeanCondition)


Negative matches:
-----------------

   RabbitAutoConfiguration
      - required @ConditionalOnClass classes not found: org.springframework.amqp.rabbit.core.RabbitTemplate,com.rabbitmq.client.Channel (OnClassCondition)
      - required @ConditionalOnClass classes not found: org.springframework.amqp.rabbit.core.RabbitTemplate,com.rabbitmq.client.Channel (OnClassCondition)

   AopAutoConfiguration
      - required @ConditionalOnClass classes not found: org.aspectj.lang.annotation.Aspect,org.aspectj.lang.reflect.Advice (OnClassCondition)
      - required @ConditionalOnClass classes not found: org.aspectj.lang.annotation.Aspect,org.aspectj.lang.reflect.Advice (OnClassCondition)

   BatchAutoConfiguration
      - required @ConditionalOnClass classes not found: org.springframework.batch.core.launch.JobLauncher (OnClassCondition)
      - required @ConditionalOnClass classes not found: org.springframework.batch.core.launch.JobLauncher (OnClassCondition)

   JpaRepositoriesAutoConfiguration
      - @ConditionalOnClass classes found: org.springframework.data.jpa.repository.JpaRepository (OnClassCondition)
      - @ConditionalOnClass classes found: org.springframework.data.jpa.repository.JpaRepository (OnClassCondition)
      - @ConditionalOnBean (types: javax.sql.DataSource; SearchStrategy: all) found no beans (OnBeanCondition)

   MongoRepositoriesAutoConfiguration
      - required @ConditionalOnClass classes not found: com.mongodb.Mongo,org.springframework.data.mongodb.repository.MongoRepository (OnClassCondition)
      - required @ConditionalOnClass classes not found: com.mongodb.Mongo,org.springframework.data.mongodb.repository.MongoRepository (OnClassCondition)

   DataSourceAutoConfiguration.DbcpConfiguration
      - org.apache.commons.dbcp.BasicDataSource DataSource class not found (DataSourceAutoConfiguration.BasicDatabaseCondition)
      - org.apache.commons.dbcp.BasicDataSource DataSource class not found (DataSourceAutoConfiguration.BasicDatabaseCondition)

   DataSourceAutoConfiguration.EmbeddedConfiguration
      - no embedded database detected (DataSourceAutoConfiguration.EmbeddedDatabaseCondition)
      - no embedded database detected (DataSourceAutoConfiguration.EmbeddedDatabaseCondition)

   DataSourceAutoConfiguration.JdbcTemplateConfiguration
      - no existing bean configured database (DataSourceAutoConfiguration.DatabaseCondition)
      - no existing bean configured database (DataSourceAutoConfiguration.DatabaseCondition)

   DataSourceAutoConfiguration.TomcatConfiguration
      - no database driver (DataSourceAutoConfiguration.TomcatDatabaseCondition)
      - no database driver (DataSourceAutoConfiguration.TomcatDatabaseCondition)

   DataSourceTransactionManagerAutoConfiguration#transactionManager
      - @ConditionalOnBean (types: javax.sql.DataSource; SearchStrategy: all) found no beans (OnBeanCondition)

   JmsTemplateAutoConfiguration
      - required @ConditionalOnClass classes not found: org.springframework.jms.core.JmsTemplate,javax.jms.ConnectionFactory (OnClassCondition)
      - required @ConditionalOnClass classes not found: org.springframework.jms.core.JmsTemplate,javax.jms.ConnectionFactory (OnClassCondition)

   DeviceResolverAutoConfiguration
      - required @ConditionalOnClass classes not found: org.springframework.mobile.device.DeviceResolverHandlerInterceptor,org.springframework.mobile.device.DeviceHandlerMethodArgumentResolver (OnClassCondition)
      - required @ConditionalOnClass classes not found: org.springframework.mobile.device.DeviceResolverHandlerInterceptor,org.springframework.mobile.device.DeviceHandlerMethodArgumentResolver (OnClassCondition)

   HibernateJpaAutoConfiguration
      - @ConditionalOnClass classes found: org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean,org.springframework.transaction.annotation.EnableTransactionManagement,javax.persistence.EntityManager,org.hibernate.ejb.HibernateEntityManager (OnClassCondition)
      - @ConditionalOnClass classes found: org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean,org.springframework.transaction.annotation.EnableTransactionManagement,javax.persistence.EntityManager,org.hibernate.ejb.HibernateEntityManager (OnClassCondition)
      - @ConditionalOnClass classes found: org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean,org.springframework.transaction.annotation.EnableTransactionManagement,javax.persistence.EntityManager,org.hibernate.ejb.HibernateEntityManager (OnClassCondition)
      - @ConditionalOnBean (types: javax.sql.DataSource; SearchStrategy: all) found no beans (OnBeanCondition)

   ReactorAutoConfiguration
      - required @ConditionalOnClass classes not found: reactor.spring.context.config.EnableReactor (OnClassCondition)
      - required @ConditionalOnClass classes not found: reactor.spring.context.config.EnableReactor (OnClassCondition)

   RedisAutoConfiguration
      - required @ConditionalOnClass classes not found: org.springframework.data.redis.connection.lettuce.LettuceConnection,org.springframework.data.redis.core.RedisOperations (OnClassCondition)
      - required @ConditionalOnClass classes not found: org.springframework.data.redis.connection.lettuce.LettuceConnection,org.springframework.data.redis.core.RedisOperations (OnClassCondition)

   SecurityAutoConfiguration
      - required @ConditionalOnClass classes not found: org.springframework.security.config.annotation.web.configuration.EnableWebSecurity (OnClassCondition)
      - required @ConditionalOnClass classes not found: org.springframework.security.config.annotation.web.configuration.EnableWebSecurity (OnClassCondition)

   ThymeleafAutoConfiguration
      - required @ConditionalOnClass classes not found: org.thymeleaf.spring3.SpringTemplateEngine (OnClassCondition)
      - required @ConditionalOnClass classes not found: org.thymeleaf.spring3.SpringTemplateEngine (OnClassCondition)

   EmbeddedServletContainerAutoConfiguration.EmbeddedJetty
      - required @ConditionalOnClass classes not found: org.eclipse.jetty.server.Server,org.eclipse.jetty.util.Loader (OnClassCondition)
      - required @ConditionalOnClass classes not found: org.eclipse.jetty.server.Server,org.eclipse.jetty.util.Loader (OnClassCondition)

   HttpMessageConvertersAutoConfiguration.JodaModuleConfiguration
      - required @ConditionalOnClass classes not found: com.fasterxml.jackson.datatype.joda.JodaModule,org.joda.time.DateTime (OnClassCondition)
      - required @ConditionalOnClass classes not found: com.fasterxml.jackson.datatype.joda.JodaModule,org.joda.time.DateTime (OnClassCondition)

   MultipartAutoConfiguration
      - @ConditionalOnClass classes found: javax.servlet.Servlet,org.springframework.web.multipart.support.StandardServletMultipartResolver (OnClassCondition)
      - @ConditionalOnClass classes found: javax.servlet.Servlet,org.springframework.web.multipart.support.StandardServletMultipartResolver (OnClassCondition)
      - @ConditionalOnClass classes found: javax.servlet.Servlet,org.springframework.web.multipart.support.StandardServletMultipartResolver (OnClassCondition)
      - @ConditionalOnBean (types: javax.servlet.MultipartConfigElement; SearchStrategy: all) found no beans (OnBeanCondition)

   WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#beanNameViewResolver
      - @ConditionalOnBean (types: org.springframework.web.servlet.View; SearchStrategy: all) found no beans (OnBeanCondition)

   WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#viewResolver
      - @ConditionalOnBean (types: org.springframework.web.servlet.View; SearchStrategy: all) found no beans (OnBeanCondition)

   WebSocketAutoConfiguration
      - required @ConditionalOnClass classes not found: org.springframework.web.socket.WebSocketHandler (OnClassCondition)
      - required @ConditionalOnClass classes not found: org.springframework.web.socket.WebSocketHandler (OnClassCondition)



java.lang.reflect.InvocationTargetException
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:606)
        at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:53)
        at java.lang.Thread.run(Thread.java:724)
Caused by: java.lang.NoClassDefFoundError: org/aspectj/lang/ProceedingJoinPoint
        at java.lang.Class.getDeclaredMethods0(Native Method)
        at java.lang.Class.privateGetDeclaredMethods(Class.java:2521)
        at java.lang.Class.getDeclaredMethods(Class.java:1845)
        at org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor.findPersistenceMetadata(PersistenceAnnotationBeanPostProcessor.java:402)
        at org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor.postProcessMergedBeanDefinition(PersistenceAnnotationBeanPostProcessor.java:332)
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyMergedBeanDefinitionPostProcessors(AbstractAutowireCapableBeanFactory.java:908)
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:512)
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475)
        at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:304)
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:228)
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:300)
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:195)
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:700)
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:760)
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:482)
        at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.refresh(EmbeddedWebApplicationContext.java:124)
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:609)
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:321)
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:806)
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:795)
        at com.sysmon.Application.main(Application.java:19)
        ... 6 more
Caused by: java.lang.ClassNotFoundException: org.aspectj.lang.ProceedingJoinPoint
        at java.net.URLClassLoader$1.run(URLClassLoader.java:363)
        at java.net.URLClassLoader$1.run(URLClassLoader.java:355)
        at java.security.AccessController.doPrivileged(Native Method)
        at java.net.URLClassLoader.findClass(URLClassLoader.java:354)
        at org.springframework.boot.loader.LaunchedURLClassLoader.findClass(LaunchedURLClassLoader.java:148)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
        at org.springframework.boot.loader.LaunchedURLClassLoader.doLoadClass(LaunchedURLClassLoader.java:131)
        at org.springframework.boot.loader.LaunchedURLClassLoader.loadClass(LaunchedURLClassLoader.java:103)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
        ... 27 more
Caused by: java.util.zip.ZipException: invalid stored block lengths
        at java.util.zip.InflaterInputStream.read(InflaterInputStream.java:164)
        at org.springframework.boot.loader.jar.ZipInflaterInputStream.read(ZipInflaterInputStream.java:52)
        at sun.misc.Resource.getBytes(Resource.java:124)
        at java.net.URLClassLoader.defineClass(URLClassLoader.java:444)
        at java.net.URLClassLoader.access$100(URLClassLoader.java:71)
        at java.net.URLClassLoader$1.run(URLClassLoader.java:361)
        ... 35 more
2014-01-10 13:07:04.684  INFO 10332 --- [       Thread-2] ationConfigEmbeddedWebApplicationContext : Closing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@c9bf1b5: startup date [Fri Jan 10 13:07:00 CET 2014]; root of context hierarchy
2014-01-10 13:07:04.694  WARN 10332 --- [       Thread-2] ationConfigEmbeddedWebApplicationContext : Exception thrown from LifecycleProcessor on context close

java.lang.IllegalStateException: LifecycleProcessor not initialized - call 'refresh' before invoking lifecycle methods via the context: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@c9bf1b5: startup date [Fri Jan 10 13:07:00 CET 2014]; root of context hierarchy
        at org.springframework.context.support.AbstractApplicationContext.getLifecycleProcessor(AbstractApplicationContext.java:359)
        at org.springframework.context.support.AbstractApplicationContext.doClose(AbstractApplicationContext.java:888)
        at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.doClose(EmbeddedWebApplicationContext.java:153)
        at org.springframework.context.support.AbstractApplicationContext$1.run(AbstractApplicationContext.java:809)

sch-bp-2277:libs pedgonca$ 
```
