package com.aravind.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns = {"*.do"})
public class LoginRequiredFilter implements Filter{

	@Override
	public void destroy() {
				
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)servletRequest;
		HttpServletResponse response = (HttpServletResponse)servletResponse;
		if(request.getSession().getAttribute("name") != null) {
			System.out.println(request.getRequestURI());
			filterChain.doFilter(servletRequest, servletResponse);
		}
		else {
			request.getRequestDispatcher("/login.do").forward(servletRequest, servletResponse);
		}
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
				
	}

}
