package myproject.controller;

import myproject.model.Product;
import myproject.service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    private ProductServiceImpl productService = new ProductServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createCustomer(request, response);
                break;
            case "edit":
                updateCustomer(request,response);
                break;
            case "delete":
                deleteCustomer(request,response);
                break;
            default:
                break;
        }
    }
    private void deleteCustomer(HttpServletRequest request,HttpServletResponse response){
        int id=Integer.parseInt(request.getParameter("id"));
        Product product = productService.findById(id);
        RequestDispatcher dispatcher;
        if (product == null) {
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            productService.remove(id);
            try {
                response.sendRedirect("/products");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private void updateCustomer(HttpServletRequest request,HttpServletResponse response){
        int id=Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        float price=Float.parseFloat(request.getParameter("price"));
        String about=request.getParameter("about");
        String producer=request.getParameter("producer");
        Product product = productService.findById(id);
        RequestDispatcher dispatcher;
        if (product ==null) {
            dispatcher=request.getRequestDispatcher("erro-404.jsp");
        }
        else {
            product.setName(name);
            product.setPrice(price);
            product.setAbout(about);
            product.setProducer(producer);
            this.productService.update(id, product);
            request.setAttribute("message","update thanh cong");
            request.setAttribute("product", product);
            dispatcher=request.getRequestDispatcher("product/edit.jsp");
            try {
                dispatcher.forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String about = request.getParameter("about");
        String producer = request.getParameter("producer");
        float price=Float.parseFloat(request.getParameter("price"));
        int id = (int) (Math.random() * 10000);

        Product product = new Product(id, name,price, about, producer);
        this.productService.save(product);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/create.jsp");
        request.setAttribute("message", "New customer was created");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request, response);
                break;
            case "edit":
                showEditForm(request,response);
                break;
            case "delete":
                showDeleteForm(request,response);
                break;
            case "view":
                break;
            default:
                listCustomer(request, response);
                break;
        }
    }
    private void listCustomer(HttpServletRequest request, HttpServletResponse response)  {
        List<Product> products = this.productService.findAll();
        request.setAttribute("products", products);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product =this.productService.findById(id);
        System.out.println(product.getName());
        RequestDispatcher dispatcher;
        if(product ==null){
            dispatcher=request.getRequestDispatcher("error-404.jsp");
        }
        else {
            request.setAttribute("product", product);
            dispatcher=request.getRequestDispatcher("product/edit.jsp");
        }
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void showDeleteForm(HttpServletRequest request,HttpServletResponse response){
        System.out.println("okok");
        int id=Integer.parseInt(request.getParameter("id"));
        Product product = productService.findById(id);

        RequestDispatcher dispatcher;
        if(product ==null){
          dispatcher=request.getRequestDispatcher("error-404.jsp");
        }
        else {
            dispatcher=request.getRequestDispatcher("product/delete.jsp");
            try {
                request.setAttribute("product", product);
                dispatcher.forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
