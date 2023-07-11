package com.example.demo.repository;
import com.example.demo.entity.Directorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "steams", path = "steams")
public interface DirectorioRepository extends PagingAndSortingRepository <Directorio, Integer>, CrudRepository<Directorio, Integer> {
    List<Directorio> findByNombre(@Param("nombre") String nombre);
}
