package br.com.raphaelbarros.finalorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.raphaelbarros.finalorder.entities.OrderItem;
import br.com.raphaelbarros.finalorder.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}

