package com.groupmanager.repo;

import com.groupmanager.model.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeaponRepo extends JpaRepository<Weapon, Long> {
}
