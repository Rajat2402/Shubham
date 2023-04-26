package org.studyeasy.REST.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.studyeasy.REST.model.brandModel;

public class BrandDAO {

	SessionFactory factory=new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(brandModel.class)
			.buildSessionFactory();

	public List<brandModel> getListUser() {
		Session session=factory.getCurrentSession();
		session.beginTransaction();
		List<brandModel> list=session.createQuery("from brands").getResultList();
		session.getTransaction().commit();
		session.close();
		return list;
	}
}
