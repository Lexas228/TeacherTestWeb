package ru.vsu.teacher.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vsu.teacher.test.entity.event.Event;
import ru.vsu.teacher.test.entity.event.EventCost;

import java.util.List;

@Repository
public interface EventCostRepo extends JpaRepository<EventCost, Long> {
    List<EventCost> getAll();
}
