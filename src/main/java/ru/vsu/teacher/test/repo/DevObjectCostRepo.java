package ru.vsu.teacher.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vsu.teacher.test.entity.development.DevObjectCost;

@Repository
public interface DevObjectCostRepo extends JpaRepository<DevObjectCost, Integer> {
}
