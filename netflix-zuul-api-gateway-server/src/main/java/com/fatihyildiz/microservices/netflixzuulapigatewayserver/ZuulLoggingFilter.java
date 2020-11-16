package com.fatihyildiz.microservices.netflixzuulapigatewayserver;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class ZuulLoggingFilter extends ZuulFilter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // return "post" , "pre", or "error". Specify when the filter should intercept
    @Override
    public String filterType() {
        return "pre";
    }

    //set a priority order between different filters. returning 1 means zuulloggingfilter is the
    //one with most priority
    @Override
    public int filterOrder() {
        return 1;
    }

    //decide whether execute the filter or not
    //only return true means execute for all requests
    @Override
    public boolean shouldFilter() {
        return true;
    }

    //implement all logic here.
    @Override
    public Object run() throws ZuulException {
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        logger.info("request-> {} request uri -> {}", request, request.getRequestURI());

        return null;
    }
}
