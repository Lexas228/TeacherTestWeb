package ru.vsu.teacher.test.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vsu.teacher.test.dto.Advice;
import ru.vsu.teacher.test.entity.publishment.PublishCost;
import ru.vsu.teacher.test.entity.publishment.PublishObject;
import ru.vsu.teacher.test.repo.PublishObjectCostRepo;
import ru.vsu.teacher.test.repo.PublishObjectRepo;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PublishmentService {
    private final PublishObjectCostRepo publishObjectCostRepo;
    private final PublishObjectRepo publishObjectRepo;

    public Long count(List<PublishObject> publishObjectList){
        List<PublishCost> all = publishObjectCostRepo.findAll();

       return Long.valueOf(String.valueOf(publishObjectList.stream().map(publishObject -> {
            Optional<PublishCost> any = all.stream().filter(publishCost -> publishCost.getPublishObjectType() == publishObject.getPublishObjectType() &&
                    publishCost.getEdition() == publishObject.getEdition()).findAny();
            return any.map(PublishCost::getCost).orElse(0);
        }).reduce(Integer::sum)));
    }

    public List<Advice> getListAdvices(){
         return null;
    }
}
