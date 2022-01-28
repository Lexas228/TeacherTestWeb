package ru.vsu.teacher.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vsu.teacher.test.entity.event.Event;

@Repository
public interface EventRepo extends JpaRepository<Event, Long> {
}
