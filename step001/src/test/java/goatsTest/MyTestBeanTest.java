package goatsTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import goats.MyTestBean;

public class MyTestBeanTest {

	@Test
	public void testSimpleLoad() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		MyTestBean bean = (MyTestBean) ac.getBean("myTestBean");
		bean.setTestStr("Hello World");
		bean.printMe();
	}
}

