package com.example.cafe.repositery;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.cafe.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	List<Category> findAllByNameContaining(String title);



	

	
}
