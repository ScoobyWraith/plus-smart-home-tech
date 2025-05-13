package ru.yandex.practicum.telemetry.collector.dto.hub.condition;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ScenarioCondition {
    final String sensorId;
    final ScenarioConditionType type;
    final ScenarioConditionOperation operation;
    final int value;
}
