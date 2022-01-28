package ru.vsu.teacher.test.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vsu.teacher.test.dto.Result;
import ru.vsu.teacher.test.dto.StageOne;
import ru.vsu.teacher.test.dto.Test;

@Service
@AllArgsConstructor
public class TestService {
    private final AwardService awardService;
    private final DevelopmentService developmentService;
    private final EventService eventService;
    private final PublishmentService publishmentService;

    public Test get(String teacherFullName){
        return null;
    }

    public Result getResult(String teacherFullName){
        return null;
    }

    public Integer saveFirstStage(String fullName, StageOne stageOne){

    }
}
