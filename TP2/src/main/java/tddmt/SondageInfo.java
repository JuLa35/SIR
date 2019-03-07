package tddmt;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jpa.EntityManagerHelper;

import javax.persistence.*;

@WebServlet(name="sondageinfo",
urlPatterns={"/SondageInfo"})
public class SondageInfo extends HttpServlet {

	
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
			Date dateReu = null;
			try{
				SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
				String dateReuString =  request.getParameter("date") ;
				dateReu=(Date) date.parse(dateReuString);}
			catch (ParseException e1) {
				out.println("la date entrée est fausse, retapez la date");
				}
			String intituleReu =  request.getParameter("intitule") ;
			String resumeReu =  request.getParameter("resume") ;
			//createSondage(name,lastName,mail,dateReu,intituleReu,resumeReu);
			out.println("<HTML>\n<BODY>\n" +
					"<H1>Recapitulatif des informations</H1>\n" +
					"<UL>\n" +            
					" <LI>Nom: "
					+ lastName + "\n" +
					" <LI>Prenom: "
					+ name + "\n" +
					" <LI>Mail: "
					+ mail + "\n" +
					" <LI>Date de réunion: "
					+ dateReu + "\n" +
					" <LI>Intitulé de réunion : "
					+ intituleReu + "\n" +
					" <LI>Resumé de réunion: "
					+ resumeReu + "\n" +
					"</UL>\n" +                
					"</BODY></HTML>");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();
	}

	/*private void createSondage(String nom, String prenom, String mail, Date dateReu,String intituleReu, String resumeReu) {
		//manager.createQuery("Insert Into Particpant (Nom, Prenom, Mail) VALUES ("+ nom+", "  + prenom + ", " +  mail);
		Sondage s = new Sondage();
		
		Createur myCreateur = new Createur();
		myCreateur.setFirstName(prenom);
		myCreateur.setName(nom);
		myCreateur.setMail(mail);
		
		Reunion r = new Reunion();
		r.setIntitule(intituleReu);
		r.setResume(resumeReu);
		
		DateR date = new DateR();
		date.setReunion(r);
		date.setDateReu(dateReu);
		
		s.addDateR(date);
		manager.persist(s);
	}*/

}

