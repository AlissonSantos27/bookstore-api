package com.alisson.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.alisson.bookstore.domain.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
