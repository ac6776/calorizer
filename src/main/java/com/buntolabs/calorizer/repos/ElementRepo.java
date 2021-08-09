package com.buntolabs.calorizer.repos;

import com.buntolabs.calorizer.entities.Element;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementRepo extends JpaRepository<Element, Long> {

}
