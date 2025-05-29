package ru.yandex.practicum.telemetry.analyzer.service.snapshots.checkers;

import org.springframework.stereotype.Component;
import ru.yandex.practicum.kafka.telemetry.event.ConditionTypeAvro;
import ru.yandex.practicum.kafka.telemetry.event.SensorStateAvro;
import ru.yandex.practicum.kafka.telemetry.event.TemperatureSensorAvro;
import ru.yandex.practicum.telemetry.analyzer.model.Condition;

@Component
public class TemperatureConditionChecker extends AnalyzerConditionChecker {
    public boolean check(Condition condition, SensorStateAvro state) {
        TemperatureSensorAvro sensor = (TemperatureSensorAvro) state.getData();
        return isOperationTrue(condition.getOperation(), condition.getValue(), sensor.getTemperatureC());
    }

    public ConditionTypeAvro getCheckedType() {
        return ConditionTypeAvro.TEMPERATURE;
    }
}
