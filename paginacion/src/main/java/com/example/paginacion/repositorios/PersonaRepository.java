package com.example.paginacion.repositorios;

import com.example.paginacion.entidades.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

    //Método de Query
    public List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);
    public Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);

    //JPQL parametros indexados
    /*@Query(value = "SELECT p FROM Persona WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    public List<Persona> searchJPQL(@Param("filtro") String filtro);

    @Query(value = "SELECT p FROM Persona WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    public Page<Persona> searchJPQL(@Param("filtro") String filtro, Pageable pageable);*/

    @Query(
            value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
            nativeQuery = true
    )
    public List<Persona> searchNative(@Param("filtro") String filtro);

    @Query(
            value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
            countQuery = "SELECT count(*) FROM personas",
            nativeQuery = true
    )
    public Page<Persona> searchNative(@Param("filtro") String filtro, Pageable pageable);
}