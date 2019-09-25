package com.bv.interceptor;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class CustomInterceptor implements Interceptor {
	
	

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("custom interceptor destryoed");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("custom interceptor initialized");
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		System.out.println("Pre-Processing");
		String result = ai.invoke();
		System.out.println("Post-Processing");
		
		return result;
	}
	

}
