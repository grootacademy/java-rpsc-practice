package com.groot;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter{
	FilterConfig filterConfig;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.filterConfig=filterConfig;
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String val=filterConfig.getInitParameter("abc");
		out.print("Parameter value :: "+val+"<br>");
		out.print("filter is invoked before");
		chain.doFilter(request, response);
		out.print("filter is invoked After");
	}


}
