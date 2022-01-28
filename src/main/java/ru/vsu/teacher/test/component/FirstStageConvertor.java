package ru.vsu.teacher.test.component;

import org.springframework.stereotype.Component;
import ru.vsu.teacher.test.dto.StageOne;
import ru.vsu.teacher.test.entity.event.Event;
import ru.vsu.teacher.test.entity.event.EventResult;

import java.util.List;

@Component
public class FirstStageConvertor {

    public List<EventResult> convert(StageOne stageOne){
        return null;
    }
}
