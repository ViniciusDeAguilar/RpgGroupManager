package com.groupmanager.repo;

import com.groupmanager.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepo extends JpaRepository<Character, Long> {
}
