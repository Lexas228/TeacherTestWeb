package ru.vsu.teacher.test.entity.award;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Award {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "award_level")
    private AwardLevel awardLevel;
}
