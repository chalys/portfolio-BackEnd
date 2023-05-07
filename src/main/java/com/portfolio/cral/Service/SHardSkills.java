package com.portfolio.cral.Service;

import com.portfolio.cral.Entity.HardSkills;
import com.portfolio.cral.Repository.RHardSkills;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class SHardSkills {

    @Autowired
    RHardSkills rHardSkills;

    public List<HardSkills> list() {
        return rHardSkills.findAll();
    }

    public Optional<HardSkills> getOne(int id) {
        return rHardSkills.findById(id);
    }

    public Optional<HardSkills> getByNombreH(String nombreH) {
        return rHardSkills.findByNombreH(nombreH);
    }

    public void save(HardSkills skill) {
        rHardSkills.save(skill);
    }

    public void delete(int id) {
        rHardSkills.deleteById(id);
    }

    public boolean existsById(int id) {
        return rHardSkills.existsById(id);
    }

    public boolean existsByNombreH(String nombreH) {
        return rHardSkills.existsByNombreH(nombreH);
    }
}
