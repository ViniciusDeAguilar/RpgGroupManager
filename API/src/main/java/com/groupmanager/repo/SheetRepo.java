package com.groupmanager.repo;

import com.groupmanager.model.Sheet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SheetRepo extends JpaRepository<Sheet, Long> {
}
