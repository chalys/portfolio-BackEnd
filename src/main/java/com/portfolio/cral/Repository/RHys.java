package com.portfolio.cral.Repository;

import com.portfolio.cral.Entity.Hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Carlos
 */
public interface RHys extends JpaRepository<Hys, Integer> {

    public Optional<Hys> findByNombre(String nombre);

    public boolean existsByNombre(String nombre);
}
