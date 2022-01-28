package ru.vsu.teacher.test.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vsu.teacher.test.dto.Advice;
import ru.vsu.teacher.test.entity.event.Event;
import ru.vsu.teacher.test.entity.event.EventCost;
import ru.vsu.teacher.test.entity.event.EventResult;
import ru.vsu.teacher.test.repo.EventCostRepo;
import ru.vsu.teacher.test.repo.EventRepo;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EventService {
    private final EventRepo eventRepo;
    private final EventCostRepo eventCostRepo;

    public Long count(List<EventResult> eventResultList){
        List<EventCost> eventCosts = eventCostRepo.getAll();
        return eventResultList.stream().map(eventResult -> {
            Optional<EventCost> any = eventCosts.stream().filter(eventCost -> eventCost.getEventType() == eventResult.getEvent().getEventType() &&
                    eventCost.getEventLevel() == eventResult.getEvent().getEventLevel() && eventCost.getTeacherRole() == eventResult.getTeacherRole()).findAny();
            return any.map(eventCost -> eventCost.getCost() * eventResult.getNumOfEvents()).orElse(0L);
        }).reduce(0L, Long::sum);
    }

    public List<Advice> getListAdvices(){
        return null;
    }
}
