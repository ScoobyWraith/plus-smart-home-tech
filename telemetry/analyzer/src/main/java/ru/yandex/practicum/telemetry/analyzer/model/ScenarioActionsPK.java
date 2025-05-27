package ru.yandex.practicum.telemetry.analyzer.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
@AllArgsConstructor
public class ScenarioActionsPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "scenario_id")
    Scenario scenario;

    @ManyToOne
    @JoinColumn(name = "sensor_id")
    Sensor sensor;

    @ManyToOne
    @JoinColumn(name = "action_id")
    Action action;
}
