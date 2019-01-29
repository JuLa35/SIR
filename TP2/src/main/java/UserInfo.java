import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jpa.EntityManagerHelper;

import javax.persistence.*;

@WebServlet(name="userinfo",
urlPatterns={"/UserInfo"})
public class UserInfo extends HttpServlet {

	
	EntityManagerFactory factory = Persistence
			.createEntityManagerFactory("example");
	EntityManager manager = factory.createEntityManager();
	JpaTest test = new JpaTest(manager);

	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();


		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {
			String name = request.getParameter("firstname") ;
			String lastName = request.getParameter("name");
			String mail =  request.getParameter("mail") ;		
			createParticipant(name,lastName,mail);
			out.println("<HTML>\n<BODY>\n" +
					"<H1>Recapitulatif des informations</H1>\n" +
					"<UL>\n" +            
					" <LI>Nom: "
					+ lastName + "\n" +
					" <LI>Prenom: "
					+ name + "\n" +
					" <LI>Mail: "
					+ mail + "\n" +
					"</UL>\n" +                
					"</BODY></HTML>");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();
	}

	private void createParticipant(String nom, String prenom, String mail) {
		//manager.createQuery("Insert Into Particpant (Nom, Prenom, Mail) VALUES ("+ nom+", "  + prenom + ", " +  mail);
		Participant p = new Participant();
		p.setNom(nom);
		p.setPrenom(prenom);
		p.setMail(mail);
		manager.persist(p);
	}

}
