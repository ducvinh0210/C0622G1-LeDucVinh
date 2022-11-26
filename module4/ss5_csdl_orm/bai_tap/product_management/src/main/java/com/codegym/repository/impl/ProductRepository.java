package com.codegym.repository.impl;

import com.codegym.model.Product;
import com.codegym.repository.IProductRepository;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Repository
public class ProductRepository implements IProductRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> findAll() {
        TypedQuery<Product> query = entityManager
                .createQuery("select p from Product as p", Product.class);
        return query.getResultList();
    }


    @Override
    public void save(Product product) {
        Session session=ConnectionUtil.sessionFactory.openSession();
        session.persist(product);


    }

    @Override
    public Product findById(int id) {
        Session session=ConnectionUtil.sessionFactory.openSession();
        return session.find(Product.class,id);
    }

    @Override
    public void remove(Product product) {
        product = entityManager.merge(product);
        entityManager.remove(product);
    }


    @Override
    public void update( Product product) {
entityManager.merge(product);
    }


    @Override
    public List<Product> findBySearchName(String searchName) {
        return null;
    }
}
