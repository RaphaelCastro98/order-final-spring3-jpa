package br.com.raphaelbarros.finalorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.raphaelbarros.finalorder.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
