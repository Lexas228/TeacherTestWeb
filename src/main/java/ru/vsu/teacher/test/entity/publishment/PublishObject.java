package ru.vsu.teacher.test.entity.publishment;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PublishObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "publish_type")
    private PublishObjectType publishObjectType;

    @ManyToOne
    @JoinColumn(name = "edition_id")
    private Edition edition;
}
