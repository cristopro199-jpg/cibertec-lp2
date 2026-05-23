package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import model.Subject;

public class SubjectDAOImpl implements SubjectDAO{
	
	EntityManager em;
	EntityManagerFactory fabric;
	
	public SubjectDAOImpl() {
		fabric = Persistence.createEntityManagerFactory("cibertecjpa");
		em = fabric.createEntityManager();
	}

	@Override
	public void create(Subject subject) {
		try {
			em.getTransaction().begin();
			em.persist(subject);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
		
	}

	@Override
	public void update(Subject subject) {
		em.getTransaction().begin();
		em.merge(subject);
		em.getTransaction().commit();
		
	}

	@Override
	public void delete(Subject subject) {
		em.getTransaction().begin();
		em.remove(subject);
		em.getTransaction().commit();
		
	}

	@Override
	public Subject find(int id) {
		return em.find(Subject.class, id);
	}

	@Override
	public List<Subject> findAll() {
		Query query = em.createNamedQuery("Subject.findAll");
		List<Subject> list;
		try {
			list = query.getResultList();
		} catch (Exception e) {
			list = null;
		}
		return list;
	}

}
