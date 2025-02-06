package com.exercise.springData.Repository;

import com.exercise.springData.Model.Alimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlimentoDAORepository extends JpaRepository<Alimento, Long> {
}
