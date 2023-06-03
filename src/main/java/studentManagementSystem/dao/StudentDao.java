package studentManagementSystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import studentManagementSystemMain.dto.Student;

public class StudentDao {
	
	public EntityManager getmanager() {
		return Persistence.createEntityManagerFactory("Gitashree").createEntityManager();
		
	}
	
	public void saveStudent(Student student) {
		EntityManager em=getmanager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(student);
		et.commit();
		System.out.println("Student details has been saved");
		
	}

}
