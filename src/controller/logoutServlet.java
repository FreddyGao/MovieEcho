package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class logoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();
        session.removeAttribute("user");
        out.println("<script>");//���script��ǩ
        out.println("alert('�Ƴ��ɹ�');");//js��䣺���alert���
        out.println("window.location.href='...';");//js��䣺�����ҳ�������
        out.println("</script>");//���script��β��ǩ
    }
}
