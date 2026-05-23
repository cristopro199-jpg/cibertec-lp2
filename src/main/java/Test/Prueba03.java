package Test;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import model.Subject;

public class Prueba03 {

	public static void main(String[] args) {
		EntityManagerFactory fabric = Persistence.createEntityManagerFactory("cibertecjpa");
		EntityManager em = fabric.createEntityManager();
		
		Query query = em.createNamedQuery("Subject.findAll");
		List<Subject> list = (List<Subject>) query.getResultList();
		
		for(Subject r : list) {
			System.out.println(r.getIdsubject());
			System.out.println(r.getName());
			System.out.println(r.getStatus());
			System.out.println(r.getTeacher());
			System.out.println(r.getLevel());
		}

	}

}
