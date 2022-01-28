package ru.vsu.teacher.test.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vsu.teacher.test.dto.Advice;
import ru.vsu.teacher.test.entity.award.Award;
import ru.vsu.teacher.test.entity.award.AwardCost;
import ru.vsu.teacher.test.repo.AwardCostRepo;
import ru.vsu.teacher.test.repo.AwardRepo;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AwardService {
    private final AwardRepo awardRepo;
    private final AwardCostRepo awardCostRepo;

    public Long count(List<Award> awards){
        List<AwardCost> awardCosts = awardCostRepo.findAll();
        return Long.valueOf(awards.stream().map(award -> {
            Optional<AwardCost> any = awardCosts.stream().filter(awardCost -> award.getAwardLevel() == awardCost.getAwardLevel()).findAny();
            return any.map(AwardCost::getCost).orElse(0);
        }).reduce(0, Integer::sum));
    }

    public List<Advice> getListOfAdvices(List<Award> awards){
        return null;
    }
}
