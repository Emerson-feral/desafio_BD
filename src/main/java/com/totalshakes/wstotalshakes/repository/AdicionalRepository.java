package com.totalshakes.wstotalshakes.repository;

import com.totalshakes.wstotalshakes.entity.Adicional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdicionalRepository extends JpaRepository<Adicional, Integer> {
}