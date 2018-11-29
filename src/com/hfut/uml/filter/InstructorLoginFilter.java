package com.hfut.uml.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class InstructorLoginFilter implements Filter{
	//实时订票不需拦截，但对于其中的“加入购物车”需要进行拦截，后续可改进。
	private static final String LOGIN_PREFIX_INSTRUCTOR = "/Instructor/",
								LOGIN_PAGE = "/index.jsp";
	public static final String 	ATTR_ADMINUSER_INSTRUCTOR = "counno";
	
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)arg0;
        HttpSession session = req.getSession();
        
        String requestURI = req.getRequestURI();
        
        if(requestURI.indexOf(LOGIN_PREFIX_INSTRUCTOR) != -1 && session.getAttribute(ATTR_ADMINUSER_INSTRUCTOR) == null ){
        	String loginUri = ".." + LOGIN_PAGE;
            ((HttpServletResponse)arg1).sendRedirect(loginUri);
        }
        
        arg2.doFilter(arg0, arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {}
	
	@Override
	public void destroy() {}
	
}
