package com.capg.demo.movie.filter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class MovieServiceFilter extends ZuulFilter{

	
	
	
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
		System.err.println("\n\nFiter passed...\n");
		if(req.getRequestURI().contains("1002")) {
			context.setSendZuulResponse(false);
			context.setResponseStatusCode(400);
			context.setResponseBody("Bad Request");
		}
		
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
