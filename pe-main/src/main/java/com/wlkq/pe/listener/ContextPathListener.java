package com.wlkq.pe.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wlkq.pe.util.Const;




public class ContextPathListener implements ServletContextListener {
	Logger log = LoggerFactory.getLogger(ContextPathListener.class);

	@Override
	public void contextInitialized(ServletContextEvent sce) {
//		获取ServletContext对象
		ServletContext servletContext = sce.getServletContext();
//		获取上下文路径
		String contextPath = servletContext.getContextPath();
//		把上下文路径存到session中
		servletContext.setAttribute(Const.PATH, contextPath);
		log.debug("上下文路径为{}",contextPath);
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		log.debug("filter已经失效");
		
	}
	
	


}
