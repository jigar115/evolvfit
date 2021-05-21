package com.example.evolvfit.repository;

import com.example.evolvfit.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Integer> {
    public List<Comment> findByIdOfBlog(int id);
    @Transactional
    @Modifying
    @Query("delete from Comment l where l.idOfBlog =:idOfBlog")
    void deleteComments(@Param("idOfBlog") int idOfBlog);

}
