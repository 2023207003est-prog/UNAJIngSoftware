package com.ejemplo.mscatalogoservice.repository;

import com.ejemplo.mscatalogoservice.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}

