package ru.vsu.teacher.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vsu.teacher.test.entity.publishment.PublishObject;

@Repository
public interface PublishObjectRepo extends JpaRepository<PublishObject, Long> {
}
