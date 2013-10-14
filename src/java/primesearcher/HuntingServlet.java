package primesearcher;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Dises Servlet stellt die Website dar.
 * Hier werden alle anzeige vorgaenge getaetigt.
 * @author Tobias Schuschnig
 */
@WebServlet(name = "HuntingServlet", urlPatterns = {"/primes/searcher"})
public class HuntingServlet extends HttpServlet {
    
    private Date ersteZeit;
    private PrimeSearcher primes;
    
    /**
     * Das ist der Standart Konstruktor um Primesearcher zu instanzieren
     */
    public HuntingServlet(){        
        primes= new PrimeSearcher();
        primes.start();
    }
    
    /**
     * Processes requests for both HTTP
     * Hier wird alles angezeigt
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>HuntingServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 align='center'>Prime Searcher</h1>");
            out.println("<hr align=\"center\" color =\"blue\" size=20 width=\"80%\">");
                //Zeichnen des blauen Balkens
            out.println( "<p align='center'>Started at " + primes.getBeginnTime().toString() + "</p>" );
            out.println("<p align='center'>Last prime discovered was <b>" + primes.getPrime() + "</b> at " + primes.getLastTime() + "</p>" );
            out.println("<hr align=\"center\" color =\"blue\" size=20 width=\"80%\">");
                //Zeichnen des blauen Balkens
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Hunting Servlet zur Anzeige";
    }// </editor-fold>
    
    /**
     * Mit dieser Methode wird eine sauperes beenden dermoeglicht.
     * Zuerst wird die destroy Methode der Super Klasse aufgerufen
     * Danach die interrupt Methode von Thread
     */
    @Override
    public void destroy() {
        super.destroy();
        primes.interrupt();
    }
}
