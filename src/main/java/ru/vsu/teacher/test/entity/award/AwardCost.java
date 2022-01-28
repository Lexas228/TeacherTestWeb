package ru.vsu.teacher.test.entity.award;

import lombok.Data;
import ru.vsu.teacher.test.entity.Cost;

import javax.persistence.*;

@Entity
@Data
public class AwardCost implements Cost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "award_level")
    private AwardLevel awardLevel;

    @Column(name = "cost")
    private int cost;
}
