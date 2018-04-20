package config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//实现自定义拦截器 有两种方式 HandlerInterceptorAdapter 和引用   HandlerInterceptor 
public class MyInterceptor extends HandlerInterceptorAdapter {

	@Override
	//请求发生后执行
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		System.out.println("调用  postHandler方法");
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	//请求发生前执行
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("调用preHandler方法");
		
		return true; //这里填 false 结果又是什么？
	}
	//重写preHandler 和 postHandler 方法
	
	
}
