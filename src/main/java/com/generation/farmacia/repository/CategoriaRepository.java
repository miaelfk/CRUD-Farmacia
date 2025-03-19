package com.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.farmacia.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
    // para buscar por nome
    List<Categoria> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
    
    // para buscar por descrição
    List<Categoria> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);
}
