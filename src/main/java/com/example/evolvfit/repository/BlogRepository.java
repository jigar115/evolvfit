package com.example.evolvfit.repository;

import com.example.evolvfit.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface BlogRepository extends JpaRepository<Blog,Integer> {

}
