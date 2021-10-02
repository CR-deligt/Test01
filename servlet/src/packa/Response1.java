package packa;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Response1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("曾到此一游 Response1 ");

        req.setAttribute("key1", "value1");//重定向不共享request数据

        // 设置响应状态码302 ，表示重定向，（已搬迁）--------------法1
//        resp.setStatus(302);
        // 设置响应头，说明 新的地址在哪里
//        resp.setHeader("Location", "http://localhost:8080/07_servlet/response2");
//        resp.setHeader("Location", "http://localhost:8080");//可以访问工程外的资源

        resp.sendRedirect("http://localhost:8080");//-----------法2
    }
}
