##介绍
整合了SpringMVC、Spring、Mybaits
##编程中遇到的问题
###编码
	<filter>
		<filter-name>SpringEncodingFilter</filter-name>
			<filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
			<init-param>
				<param-name>encoding</param-name>
				<param-value>UTF-8</param-value>	
			</init-param>	
			<init-param>			
				<param-name>forceEncoding</param-name>			
				<param-value>true</param-value>
			</init-param>
	</filter>
	<filter-mapping>
		<filter-name>SpringEncodingFilter</filter-name>	
		<url-pattern>/*</url-pattern>	
	</filter-mapping>
###Mapper不用加@Repository，但要在配置文件加以下代码
	<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
		<property name="basePackage" value="com.henry.dao" />
		<property name="sqlSessionFactoryBeanName" value="sqlSessionFactory" />
	</bean>
