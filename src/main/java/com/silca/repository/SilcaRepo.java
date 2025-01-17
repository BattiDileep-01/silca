package com.silca.repository;

import com.silca.entity.SilcaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SilcaRepo extends JpaRepository<SilcaEntity , Integer> {
}
