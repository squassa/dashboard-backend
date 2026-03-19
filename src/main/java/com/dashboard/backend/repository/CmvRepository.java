package com.dashboard.backend.repository;

import com.dashboard.backend.model.Cmv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CmvRepository extends JpaRepository<Cmv, Long> {
}