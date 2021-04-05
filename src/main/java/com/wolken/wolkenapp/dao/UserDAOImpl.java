package com.wolken.wolkenapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.wolken.wolkenapp.HibernateSessionFactory;
import com.wolken.wolkenapp.dto.UserDTO;

public class UserDAOImpl implements UserDAO {

	@Override
	public void createUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		// HibernateSessionFactory.getFactory();

		Session session = HibernateSessionFactory.getFactory().openSession();

		Transaction transaction = session.beginTransaction();
		session.save(userDTO);
		transaction.commit();
		session.close();

	}

	@Override
	public void updateUser(Integer id, String name1) {
		System.out.println("inside update");
		// TODO Auto-generated method stub
		/*
		 * Configuration configuration=new Configuration(); configuration.configure();
		 * configuration.addAnnotatedClass(UserDTO.class); SessionFactory
		 * factory=configuration.buildSessionFactory(); Session
		 * session=factory.openSession(); UserDTO dto=session.get(UserDTO.class, id);
		 * dto.setUserName(name1); Transaction transaction=session.beginTransaction();
		 * session.update(dto); transaction.commit(); session.close();
		 */
		// configuration.close();
		Session session = HibernateSessionFactory.getFactory().openSession();
		Transaction transcation = session.beginTransaction();
		Query query = session.createQuery("update UserDTO us set us.userName=:userName where us.id =:id");

		query.setParameter("userName", name1);
		query.setParameter("id", id);

		query.executeUpdate();
		session.close();

	}

	public void updateAgeByName(String name, int age) {
		System.out.println("inside update");

		Session session = HibernateSessionFactory.getFactory().openSession();
		Transaction transcation = session.beginTransaction();
		Query query = session
				.createQuery("update UserDTO us set us.userAge='" + age + "' where us.userName ='" + name + "'");
		/*
		 * query.setParameter("userName", name1); query.setParameter("id", id);
		 */

		query.executeUpdate();
		session.close();

	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("inside delete");
		Session session = HibernateSessionFactory.getFactory().openSession();

		//Query query = session.createQuery("delete UserDTO us  where us.id = " + id);
		//Query query = session.createQuery("delete UserDTO us  where us.id =:id");
		Query query=session.getNamedQuery("delete");
		query.setParameter("id", id);
		Transaction transcation = session.beginTransaction();
		query.executeUpdate();
		session.close();

	}

	@Override
	public List<UserDTO> getAll() {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getFactory().openSession();
		
		//Query query = session.createQuery("select us from UserDTO us ");
		Query query=session.getNamedQuery("selectAll");
		// UserDTO dtos=(UserDTO)query.uniqueResult();
		// System.out.println(dtos);
		List<UserDTO> dtos = query.list();
		// dtos.forEach(System.out::println);
		return dtos;

	}

}
