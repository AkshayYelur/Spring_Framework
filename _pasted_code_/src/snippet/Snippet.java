package snippet;

public class Snippet {
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
	    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	    xsi:schemaLocation="
	        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
	
	    <!-- bean definitions here -->
	
	<bean id="s" class="com.cjc.setterbased.objecttype.Stundent1" >
	<property name="rollno" value="1"></property>	
	<property name="name" value="CJC"></property>
	<property name="addr" ref="add"></property>
	</bean>
	
	<bean id="add" class="com.cjc.setterbased.objecttype.Address1" >
		<property name="padd" value="Karve Nagar"></property>
		<property name="ladd" value="Pune"></property>	
	</bean>
	
	
	
	</beans>
}

