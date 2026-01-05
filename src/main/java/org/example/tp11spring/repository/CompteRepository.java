package org.example.tp11spring.repository;

import org.example.tp11spring.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

import org.example.tp11spring.entity.TypeCompte;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import java.util.List;

@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte, Long> {
    @RestResource(path = "/byType")
    List<Compte> findByType(@Param("t") TypeCompte type);
}
