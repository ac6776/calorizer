package com.buntolabs.calorizer.repos;

import com.buntolabs.calorizer.entities.Nutrition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface NutritionRepo extends JpaRepository<Nutrition, Long> {
}
