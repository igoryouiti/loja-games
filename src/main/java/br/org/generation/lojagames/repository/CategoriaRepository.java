package br.org.generation.lojagames.repository;

import br.org.generation.lojagames.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository {
    public List<Categoria> getAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);
}
