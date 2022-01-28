package ru.vsu.teacher.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vsu.teacher.test.entity.development.DevObject;

@Repository
public interface DevObjectRepo extends JpaRepository<DevObject, Long> {
}
