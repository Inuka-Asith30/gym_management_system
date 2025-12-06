package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
public class ScheduleEntity {


    @Id
    private String scheduleDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private String timeDuration;
}
