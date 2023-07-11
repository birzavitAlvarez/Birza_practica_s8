package com.example.demo.repository;
import com.example.demo.entity.Steam;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;


@RepositoryRestResource(collectionResourceRel = "steams", path = "steams")
public interface SteamRepository extends PagingAndSortingRepository<Steam, Integer>, CrudRepository<Steam, Integer>{
    List<Steam> findByNombre(@Param("nombre") String nombre);
}
