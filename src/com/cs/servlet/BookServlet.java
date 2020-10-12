package com.cs.servlet;

import com.cs.entity.Book;
import com.cs.service.impl.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BookServlet",urlPatterns = "/BookServlet")
public class BookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        BookServiceImpl bsi = new BookServiceImpl();
        String comm =request.getParameter("comm");
        if ("list".equals(comm)) {
            try {
                List<Book> list = bsi.findBookInfoAll();
                if (list != null) {
                    request.setAttribute("lists",list);

                    request.getRequestDispatcher("list.jsp").forward(request,response);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if ("le".equals(comm)) {
            String id = request.getParameter("id");
            int ids = Integer.parseInt(id);
//            String lender = request.getParameter("lender");
            try {
                Book b = bsi.findByID(ids);
//                b.setId(ids);
//                b.setState(1);
//                b.setLender(lender);
//                int i = bsi.updateBookInfo(b);
                if (b != null) {
                    request.setAttribute("b",b);
                    request.getRequestDispatcher("lend.jsp").forward(request,response);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        if ("lend".equals(comm)) {
            String id = request.getParameter("id");
            int ids = Integer.parseInt(id);
            String lender = request.getParameter("lender");
            try {
//                Book b = bsi.findByID(ids);
                Book b = new Book();
                b.setId(ids);
                b.setState(1);
                b.setLender(lender);
                int i = bsi.updateBookInfo(b);
                if (i > 0) {
//                    request.setAttribute("b",b);
                    request.getRequestDispatcher("success.jsp").forward(request,response);
                } else {
                    request.getRequestDispatcher("failed.jsp").forward(request,response);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
