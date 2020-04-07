import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("UserName");
        String password = request.getParameter("Password");
        PrintWriter printWriter = response.getWriter();
        printWriter.write("<html>");
        if (userName.equals("admin")&&password.equals("123123")){
            printWriter.write("Welcome back "+userName+"!");
        }
        else {
            printWriter.write("Error login!");
        }
        printWriter.write("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
