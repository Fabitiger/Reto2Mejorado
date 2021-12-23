package com.scrum7.repositoryCrud;

import com.scrum7.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * MISION TIC 2022
 */

public interface ProductCrudRepository extends MongoRepository<Product, String> {
}
