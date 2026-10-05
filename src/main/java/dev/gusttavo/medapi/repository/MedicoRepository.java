package dev.gusttavo.medapi.repository;

import dev.gusttavo.medapi.medico.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico,Long> {
}
