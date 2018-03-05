package shrio;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

/** 
* @author ry 
* @create2018年2月27日 下午5:28:15 
* @describe
*/
public class testHelloworld {
	
	
	public void test(){
		//获取SecurityFactory工厂 ,使用shiro.ini配置文件初始化SecurityManager
		Factory<SecurityManager> factory= new IniSecurityManagerFactory("classpath:shiro.ini");
		//得到securityManager实例，并绑定给SecurityUtils
		SecurityManager securityManager = factory.getInstance();
		SecurityUtils.setSecurityManager(securityManager);
		//得到subject及创建用户名/密码身份验证Token(即用户身份/凭证)
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken("zhang","123");
		
		try {
			//登录，即身份验证
			subject.login(token);
		} catch (AuthenticationException e) {
			//身份验证失败
			e.printStackTrace();
		}
		
		//退出
		subject.logout();
		
		
		
	}
	
	
}
 