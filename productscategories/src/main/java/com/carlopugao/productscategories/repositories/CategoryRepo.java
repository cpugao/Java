package com.carlopugao.productscategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.carlopugao.productscategories.models.Category;
import com.carlopugao.productscategories.models.Product;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Long> {
	List<Category> findAll();
    List<Category> findByProductsNotContains(Product product);
}
