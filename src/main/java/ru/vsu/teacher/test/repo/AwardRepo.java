package ru.vsu.teacher.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vsu.teacher.test.entity.award.Award;

@Repository
public interface AwardRepo extends JpaRepository<Award, Long> {
}
