package ru.vsu.teacher.test.entity.publishment;

import lombok.Data;
import ru.vsu.teacher.test.entity.Cost;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Data
public class PublishCost implements Cost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "publish_type")
    private PublishObjectType publishObjectType;

    @ManyToOne
    @JoinColumn(name = "edition_id")
    private Edition edition;

    @Column(name = "cost")
    private Integer cost;

}
