import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

public class LoginServlet extends HttpServlet {
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
         
        // read form fields
        String username = request.getParameter("username");
        String password = request.getParameter("password");
         
        //System.out.println("username: " + username);
        //System.out.println("password: " + password);
 
        // do some processing here...
         
        // get response writer
        PrintWriter pw = response.getWriter();
         
         
//writing html in the stream  
pw.println("<html><body>");  
pw.println("<h2>Your username is: " + username + "<br/>");  
pw.println("Your password is: " + password + "</h2></body></html>"); 
                
    }
 
}