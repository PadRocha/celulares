package mx.uam.azc.los_estelares.celulares.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;

/**
 * Servlet implementation class BancoUpdateServlet
 */
/**
 * @author los_estelares
 */ 
@WebServlet(name = "BancoUpdate", urlPatterns = { "/BancoUpdate" })
public class BancoUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public BancoUpdateServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log("Actualizando información del banco");
		response.setContentType("text/html");
		Writer writer = response.getWriter();
		writer.write("<html><body><p>¿Cómo estás?</p></body></html>");
	}

}
