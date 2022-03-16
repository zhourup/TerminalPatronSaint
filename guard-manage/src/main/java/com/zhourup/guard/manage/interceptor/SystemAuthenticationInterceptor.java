package com.zhourup.guard.manage.interceptor;

import com.zhourup.guard.manage.annotation.LoginRequired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author zhourup
 * @date 2021/11/16 22:38
 */
@Component
public class SystemAuthenticationInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        // 如果不是映射到方法直接通过
        boolean isHandlerMethod = handler instanceof HandlerMethod;
        if (!isHandlerMethod) {
            return true;
        }

        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();

        // 判断接口是否需要登录
        LoginRequired methodAnnotation = method.getAnnotation(LoginRequired.class);
        // 有@LoginRequired 注解，需要认证
        if (methodAnnotation != null) {
            this.outputResult(response);
            return false;
        }

        return true;
    }

    private void outputResult(HttpServletResponse response) throws IOException {
        String msg = "您还未登录或登录失效，请重新登录！";
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().write(msg);
        response.flushBuffer();
    }
}
