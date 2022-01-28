package ru.vsu.teacher.test.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vsu.teacher.test.dto.Advice;
import ru.vsu.teacher.test.entity.development.DevObject;
import ru.vsu.teacher.test.entity.development.DevObjectCost;
import ru.vsu.teacher.test.repo.DevObjectCostRepo;
import ru.vsu.teacher.test.repo.DevObjectRepo;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DevelopmentService {
    private final DevObjectRepo devObjectRepo;
    private final DevObjectCostRepo devObjectCostRepo;

    public Long count(List<DevObject> devObjects){
        List<DevObjectCost> all = devObjectCostRepo.findAll();
        return Long.valueOf(String.valueOf(devObjects.stream().map(devObject -> {
            Optional<DevObjectCost> any = all.stream().filter(devObjectCost -> devObjectCost.getTeacherDevObjectRole() == devObject.getTeacherDevObjectRole()
                    && devObject.getName().equals(devObjectCost.getName()) && ((devObject.getLink() != null && devObjectCost.getHasLink()) || devObject.getLink() == null && !devObjectCost.getHasLink())).findAny();
            return any.map(DevObjectCost::getCost).orElse(0);
        }).reduce(Integer::sum)));
    }

    public List<Advice> getListAdvices(List<DevObject> devObjects){
        return null;
    }

}
