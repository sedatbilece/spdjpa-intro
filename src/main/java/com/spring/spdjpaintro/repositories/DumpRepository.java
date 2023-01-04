package com.spring.spdjpaintro.repositories;

import com.spring.spdjpaintro.domain.Dump;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DumpRepository extends JpaRepository<Dump, UUID> {
}
