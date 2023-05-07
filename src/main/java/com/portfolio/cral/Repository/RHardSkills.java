package com.portfolio.cral.Repository;

import com.portfolio.cral.Entity.HardSkills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RHardSkills extends JpaRepository<HardSkills, Integer> {

    public Optional<HardSkills> findByNombreH(String nombreH);

    public boolean existsByNombreH(String nombreH);
}

