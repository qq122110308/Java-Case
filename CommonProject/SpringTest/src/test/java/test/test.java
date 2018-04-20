package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import bean.TestBean;
import config.TestConfig;

@RunWith(SpringJUnit4ClassRunner.class) // 在Junit环境下提供SpringTestContextFramework的功能
@ContextConfiguration(classes = {TestConfig.class}) //用来加载配置ApplicationContext,其中classes属性用来加载配置类
public class test {
	
	@Autowired
	private TestBean testBean;
	
	
	@Test
	public void prodBean(){
		String actual = testBean.getContent();
	}
}
