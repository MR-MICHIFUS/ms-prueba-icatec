package com.icatec.prueba.repository;

import com.icatec.prueba.entity.Catalogo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogoRepository extends JpaRepository<Catalogo, Long> {
}
