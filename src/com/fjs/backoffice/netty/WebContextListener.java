package com.fjs.backoffice.netty;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;


@Service
public class WebContextListener implements InitializingBean, ServletContextAware{


    @Autowired
    private Server server;


    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        server.bind(10101);
    }
}