import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name;

        if(request.getParameterMap().containsKey("name")) {
            name = request.getParameter("name");
        } else {
            name = "World";
        }

        String greeting = "<h1>Hello, " + name + "!";

        response.getWriter().println(greeting);
    }
}
