//package com.example.demo.interceptors;
//
//import java.io.IOException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
//import org.springframework.security.oauth2.core.user.OAuth2User;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerInterceptor;
//
//@Component
//public class AuthenticateInterceptor implements HandlerInterceptor {
//    
//    public boolean preHandle(
//            HttpServletRequest request,
//            HttpServletResponse response,
//            Object handler
//    ) throws IOException {
//        HttpSession session = request.getSession();
//
//        if (session.getAttribute("user") != null) {
//            return true;
//        }
//
//        OAuth2AuthenticationToken authentication = 
//                SecurityContextHolder.getContext().getAuthentication() instanceof OAuth2AuthenticationToken ?
//                        (OAuth2AuthenticationToken) SecurityContextHolder.getContext().getAuthentication() : null;
//
//        if (authentication != null && authentication.isAuthenticated()) {
//            OAuth2User oauth2User = authentication.getPrincipal();
//
//            if (oauth2User != null) {
//                session.setAttribute("user", oauth2User);
//                return true;
//            }
//        }
//
//        // Chuyển hướng đến trang đăng nhập nếu không có phiên đăng nhập hoặc không có thông tin người dùng
//        session.setAttribute("error", "Vui lòng đăng nhập");
//        response.sendRedirect(request.getContextPath() + "/login");
//        return false;
//    }
//}
