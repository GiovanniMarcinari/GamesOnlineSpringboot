package br.org.generation.LojaGames.repository;


	
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.LojaGames.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
		
		public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);

	}

