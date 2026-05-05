package edu.ban7.e3chatbotback.dao;

import edu.ban7.e3chatbotback.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Long> {
}