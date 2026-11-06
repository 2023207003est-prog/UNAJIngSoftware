package com.ejemplo.mscatalogoservice.service;

import com.ejemplo.mscatalogoservice.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {
    List<Categoria> listar();
    Optional<Categoria> buscarPorId(Integer id);
    Categoria guardar(Categoria categoria);
    Categoria actualizar(Integer id, Categoria categoria);
    void eliminar(Integer id);
}

