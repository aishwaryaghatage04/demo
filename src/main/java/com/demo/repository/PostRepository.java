package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
	
	

}
