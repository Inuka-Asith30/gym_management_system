package edu.icet.model.dto;

import lombok.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Schedule {
    private String scheduleDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private String timeDuration;
}
