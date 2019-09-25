package com.bv.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

@SuppressWarnings("serial")
public class CustomInterceptor2 implements Interceptor {

	@Override
	public void destroy() {
		System.out.println("destroy method of custom interceptor 2");
		
	}

	@Override
	public void init() {
		System.out.println("intialization method of CustomInterceptor 2");
		
	}

	@Override
	public String intercept(ActionInvocation mi) throws Exception {
		System.out.println("Pre-Processing Custom Interceptor 2");
		String result = mi.invoke();
		System.out.println("Post-Processing Custom Interceptor 2");
		return result;
	}

}
