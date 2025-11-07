package br.com.raphaelbarros.finalorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.raphaelbarros.finalorder.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
