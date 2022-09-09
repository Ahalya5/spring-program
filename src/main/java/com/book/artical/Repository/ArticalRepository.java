package com.book.artical.Repository;

import com.book.artical.DAO.ArticalDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticalRepository extends JpaRepository<ArticalDAO,Integer> {

}
