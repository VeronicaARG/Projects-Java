
package com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.repository;

import com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente,Long> {
    
}
