/*
package com.hwstu.web.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

*/
/**
 * @auther: hjy
 * @Date: 2021/1/23 21:08
 * @Description:
 *//*

@WebServlet(urlPatterns = "/my/servlet",asyncSupported = true)
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        AsyncContext asyncContext = req.startAsync();

        asyncContext.start(()->{

            try {
                resp.getWriter().println("Hello,World!");

                //触发完成
                asyncContext.complete();
            } catch (IOException e) {
                e.printStackTrace();
            }

        });


    }
}
*/