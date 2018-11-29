import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorSimpleServlet",urlPatterns = "/calculate")
public class CalculatorSimpleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double firstNumber = Double.parseDouble(request.getParameter("firstNumber"));
        double secondNumber = Double.parseDouble(request.getParameter("secondNumber"));
        char operator = request.getParameter("operator").charAt(0);

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Result:</h1>");
        try{
            double result = Calculator.calculate(firstNumber, secondNumber, operator);
            writer.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);
        }catch (Exception ex){
            writer.println("Error: " + ex.getMessage());
        }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
