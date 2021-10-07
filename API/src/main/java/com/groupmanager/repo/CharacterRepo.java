package com.groupmanager.repo;

import com.groupmanager.model.Character;
import org.springframework.data.repository.CrudRepository;

public interface CharacterRepo extends CrudRepository<Character, Long>{
}
