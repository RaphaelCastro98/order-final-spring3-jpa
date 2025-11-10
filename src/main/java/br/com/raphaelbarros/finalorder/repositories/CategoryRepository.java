package br.com.raphaelbarros.finalorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.raphaelbarros.finalorder.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
