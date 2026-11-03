package com.ejemplo.mscatalogo.service.impl;

import com.ejemplo.mscatalogo.entity.Categoria;
import com.ejemplo.mscatalogo.repository.CategoriaRepository;
import com.ejemplo.mscatalogo.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;


    @Override
    public List<Categoria> listar() {
        return categoriaRepository.findAll();
    }


    @Override
    public Categoria guardar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }


    @Override
    public Categoria actualizar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }


    @Override
    public Optional<Categoria> listarPorId(Integer id) {
        return categoriaRepository.findById(id);
    }


    @Override
    public void eliminarPorId(Integer id) {
        categoriaRepository.deleteById(id);
    }
}
