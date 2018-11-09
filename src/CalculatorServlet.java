import com.sun.jdi.Value;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

@WebServlet("/calc")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        String meters = request.getParameter("meters");
        String centimeters = request.getParameter("centimeters");
        String milimeters = request.getParameter("milimeters");
        String grams = request.getParameter("grams");
        String miligrams = request.getParameter("miligrams");
        String kilograms = request.getParameter("kilograms");
        PrintWriter writer = response.getWriter();

        if (!"".equals(meters)&& "".equals(centimeters)&& "".equals(milimeters)) {
            double metersToDouble = Double.parseDouble(meters);
            request.setAttribute("MetersToDouble", metersToDouble);
            double metersToCentimeters = ValueCalculator.MetersToCentimeters(metersToDouble);
            request.setAttribute("CentimetersToDouble", metersToCentimeters);
            double metersToMilimeters = ValueCalculator.MetersToMilimeters(metersToDouble);
            request.setAttribute("MilimetersToDouble", metersToMilimeters);
            request.getRequestDispatcher("outcomeMeter.jsp").forward(request,response);

        } else if ("".equals(meters)&& !"".equals(centimeters)&& "".equals(milimeters)) {
            double centimetersToDouble = Double.parseDouble(centimeters);
            request.setAttribute("CentimetersToDouble", centimetersToDouble);
            double centimetersToMeters = ValueCalculator.CentimetersToMeters(centimetersToDouble);
            request.setAttribute("MetersToDouble", centimetersToMeters);
            double centimetersToMilimeters = ValueCalculator.CentimetersToMilimeters(centimetersToDouble);
            request.setAttribute("MilimetersToDouble", centimetersToMilimeters);
            request.getRequestDispatcher("outcomeMeter.jsp").forward(request,response);

        } else if ("".equals(meters)&& "".equals(centimeters)&& !"".equals(milimeters)) {
            double milimetersToDouble = Double.parseDouble(milimeters);
            request.setAttribute("MilimetersToDouble", milimetersToDouble);
            double milimetersToCentimiters = ValueCalculator.MilimetersToCentimeters(milimetersToDouble);
            request.setAttribute("CentimetersToDouble", milimetersToCentimiters);
            double milimetersToMeters = ValueCalculator.MilimetersToMeters(milimetersToDouble);
            request.setAttribute("MetersToDouble", milimetersToMeters);
            request.getRequestDispatcher("outcomeMeter.jsp").forward(request,response);

        }else if (!"".equals(grams)&& "".equals(kilograms)&& "".equals(miligrams)) {
            double gramsToDouble = Double.parseDouble(grams);
            request.setAttribute("GramsToDouble", gramsToDouble);
            double gramsToKilograms = ValueCalculator.GramsToKilograms(gramsToDouble);
            request.setAttribute("KilogramsToDouble", gramsToKilograms);
            double gramsToMiligrams = ValueCalculator.GramsToMiligrams(gramsToDouble);
            request.setAttribute("MiligramsToDouble", gramsToMiligrams);
            request.getRequestDispatcher("outcomeWeight.jsp").forward(request,response);

        } else if ("".equals(grams)&& "".equals(kilograms)&& !"".equals(miligrams)) {
            double miligramsToDouble = Double.parseDouble(miligrams);
            request.setAttribute("MiligramsToDouble", miligramsToDouble);
            double miligramsToKilograms = ValueCalculator.MiligramsToKilograms(miligramsToDouble);
            request.setAttribute("KilogramsToDouble", miligramsToKilograms);
            double miligramsTGrams = ValueCalculator.MiligramsToGrams(miligramsToDouble);
            request.setAttribute("GramsToDouble", miligramsTGrams);
            request.getRequestDispatcher("outcomeWeight.jsp").forward(request,response);

        } else if ("".equals(grams)&& !"".equals(kilograms)&& "".equals(miligrams)) {
            double kilogramsToDouble = Double.parseDouble(kilograms);
            request.setAttribute("KilogramsToDouble", kilogramsToDouble);
            double kilogramsToGrams = ValueCalculator.KilogramsToGrams(kilogramsToDouble);
            request.setAttribute("GramsToDouble", kilogramsToGrams);
            BigDecimal kilogramsToMiligrams = BigDecimal.valueOf(ValueCalculator.KilogramsToMiligrams(kilogramsToDouble));
            request.setAttribute("MiligramsToDouble", kilogramsToMiligrams);
            request.getRequestDispatcher("outcomeWeight.jsp").forward(request, response);
        }else if("".equals(grams)&& "".equals(kilograms)&& "".equals(miligrams)){
            response.sendRedirect("index.html");
        }else if("".equals(meters)&& "".equals(centimeters)&& "".equals(milimeters)){
            response.sendRedirect("index.html");
        }else{
            writer.print("Nie można wpisać dwóch wartości");
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
