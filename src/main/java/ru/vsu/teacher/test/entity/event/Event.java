package ru.vsu.teacher.test.entity.event;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "event_level")
    private EventLevel eventLevel;


    @Column(name = "event_type")
    private EventType eventType;


}
