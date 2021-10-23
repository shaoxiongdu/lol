package cn.shaoxiongdu.leagueoflegends.web.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: shaoxiongdu <email@shaoxiongdu.cn>
 * @date: 2021-10-15 | 15:15
 */
public abstract class BaseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //请求业务类型
        String action = req.getParameter("action");

        //利用反射调用方法
        Method method = null;
        try {
            //利用反射调用方法
            method = this.getClass().getMethod(action,HttpServletRequest.class,HttpServletResponse.class);

        } catch (Exception e) {
            e.printStackTrace();
            req.setAttribute("message","没有通过反射找到action为" + action + "的业务方法。检查" + this.getClass().getName() + "类中的方法名或查询请求参数action的值");
            req.setAttribute("title","请求异常");
            req.getRequestDispatcher("/pages/error.jsp").forward(req,resp);
        }
        try {
            method.invoke(this,req,resp);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            req.setAttribute("message",e.getMessage());
            req.setAttribute("title","错误码，500，服务器内部执行异常");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //请求业务类型
        String action = req.getParameter("action");
        try {
            //利用反射调用方法
            Method method = this.getClass().getMethod(action,HttpServletRequest.class,HttpServletResponse.class);
            method.invoke(this,req,resp);
        } catch (Exception e) {
            req.setAttribute("message","没有通过反射找到action为" + action + "的业务方法。检查" + this.getClass().getName() + "类中的方法名或查询请求参数action的值");
            req.setAttribute("title","请求异常");
            req.getRequestDispatcher("/pages/error.jsp").forward(req,resp);
        }
    }
}
