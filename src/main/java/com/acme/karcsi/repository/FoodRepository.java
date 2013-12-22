package com.acme.karcsi.repository;
import com.acme.karcsi.domain.Food;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = Food.class)
public interface FoodRepository {
}
