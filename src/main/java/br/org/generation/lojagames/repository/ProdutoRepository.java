package br.org.generation.lojagames.repository;

import br.org.generation.lojagames.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Long>{
    public List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
}
