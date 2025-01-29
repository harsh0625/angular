//package com.example.cafe.Configurations;
//
//import org.springframework.core.Ordered;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//
//import io.jsonwebtoken.io.IOException;
//import jakarta.servlet.Filter;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.FilterConfig;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.ServletRequest;
//import jakarta.servlet.ServletResponse;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//@Component
//@Order(Ordered.HIGHEST_PRECEDENCE)
//public class SimpleCrosFilter implements Filter {
//    @Override
//    public void doFilter(ServletRequest req,ServletResponse res, FilterChain chain) throws IOException, ServletException, java.io.IOException{
//    HttpServletResponse response = (HttpServletResponse) res;
//    HttpServletRequest request = (HttpServletRequest) req;
//    String originHeader = request.getHeader("Origin");
//    response.setHeader("Access-Control-Allow-Origin", originHeader);
//    response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
//    response.setHeader("Access-Control-Max-Age", "3600");
//    response.setHeader("Access-Control-Allow-Headers", "*");
//
//    if ("OPTIONS".equalsIgnoreCase(request.getMethod())) {
//        response.setStatus(HttpServletResponse.SC_OK);
//    } else {
//        chain.doFilter(req, res);
//    }
//}
//@Override
//    public void init(FilterConfig filterConfig){
//
//}
//@Override
//    public void destroy(){
//}
//}