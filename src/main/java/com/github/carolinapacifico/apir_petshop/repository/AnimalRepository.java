package com.github.carolinapacifico.apir_petshop.repository;

import com.github.carolinapacifico.apir_petshop.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
