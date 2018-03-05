package shrio;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.realm.Realm;

/** 
* @author ry 
* @create2018年2月27日 下午5:48:35 
* @describe
*/
public class MyRealm implements Realm{

	@Override
	public String getName() {
		return "myrealm";
	}

	@Override
	public boolean supports(AuthenticationToken token) {
		//仅支持UsernamepasswordToken类型的token
		return token instanceof UsernamePasswordToken;
	}

	@Override
	public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String username = (String)token.getPrincipal();//得到用户名
		String password = new String((char[])token.getCredentials());//得到密码
		if(!"zhang".equals(username)){
			throw new UnknownAccountException();//用户名错误
		}
		if(!"123".equals(password)){
			throw new IncorrectCredentialsException();//密码错误
		}
		//如果身份认证成功，返回一个AuthenticationInfo实现;
		return new SimpleAuthenticationInfo(username, password, getName());
		
	}
	
}
 