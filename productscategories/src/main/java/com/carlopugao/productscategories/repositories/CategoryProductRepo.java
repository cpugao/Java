package com.carlopugao.productscategories.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.carlopugao.productscategories.models.CategoryProduct;

@Repository
public interface CategoryProductRepo extends CrudRepository <CategoryProduct, Long> {
	
}
