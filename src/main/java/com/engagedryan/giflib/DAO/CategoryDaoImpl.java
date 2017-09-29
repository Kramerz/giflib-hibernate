package com.engagedryan.giflib.DAO;

import com.engagedryan.giflib.model.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDaoImpl implements ICategoryDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @SuppressWarnings("unchecked")
    public List<Category> findAll() {
        Session session = sessionFactory.openSession();

        //Retrieve all categories with Hibernate Critera
        List<Category> categories = session.createCriteria(Category.class).list();

        session.close();
        return categories;
    }

    @Override
    public Category findById(Long id) {
        Session session = sessionFactory.openSession();

        Category category = session.get(Category.class, id);
        session.close();

        return category;

    }

    @Override
    public void save(Category category) {
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        session.save(category);

        session.getTransaction().commit();

        session.close();
    }

    @Override
    public void delete(Category category) {

    }
}
