@WebServlet("/stopwatch") 
public class StopwatchServlet extends HttpServlet 
{ 
private StopwatchInterface stopwatch; @Override public void init() 
{ 
stopwatch = new StopwatchImpl();
}
@Override protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{ 
String action = request.getParameter("action");
 if (action != null) 
{
 switch (action)
 {
 case "start": stopwatch.start();
 break;
 case "stop": stopwatch.stop();
 break;
 case "reset": stopwatch.reset();
 break;
} 
} 
long elapsedTime = stopwatch.getElapsedTime(); request.setAttribute("elapsedTime", elapsedTime); request.getRequestDispatcher("stopwatch.jsp").forward(request, response);
} 
}

