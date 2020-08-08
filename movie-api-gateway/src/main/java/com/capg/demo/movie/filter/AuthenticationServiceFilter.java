package com.capg.demo.movie.filter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capg.demo.movie.model.UserCredentials;
import com.capg.demo.movie.model.UserInfo;
import com.capg.demo.movie.service.AuthenticationService;
import com.capg.demo.movie.util.TokenUtil;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class AuthenticationServiceFilter extends ZuulFilter{

	@Autowired
	AuthenticationService authentionService;
	
	@Autowired
	TokenUtil util;
	
	
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		RequestContext context=RequestContext.getCurrentContext();
		HttpServletRequest req=context.getRequest();
		String requestUri=req.getRequestURI();
		System.out.println("\n\n"+requestUri+"\n\n");
		
		String token = req.getHeader("Authorization");
		if(token !=null) {
			
			UserCredentials cred= util.decode(token);
			
			UserInfo user=authentionService.authenticate(cred);
			
			if(requestUri.contains("/admin/")) {
				if(user.getUserType().equals("admin")) {
					return null;
				}
			}
			if(requestUri.contains("/user/")) {
				if(user.getUserType().equals("user")) {
					return null;
				}
			}
			else {
				return null;
			}
			
		}
		
		if(requestUri.contains("/public/"))
		{
			return null;
		}
		
		
		
			context.setSendZuulResponse(false);
			context.setResponseStatusCode(401);
			context.setResponseBody("Unauthorized");
		
		
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
