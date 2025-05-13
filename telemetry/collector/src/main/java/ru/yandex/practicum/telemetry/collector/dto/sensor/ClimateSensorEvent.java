package ru.yandex.practicum.telemetry.collector.dto.sensor;

import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@ToString(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClimateSensorEvent extends SensorEvent {
    @NotNull
    final Integer temperatureC;

    @NotNull
    final Integer humidity;

    @NotNull
    final Integer co2Level;

    @Override
    public SwitchSensorEvent.SensorEventType getType() {
        return SwitchSensorEvent.SensorEventType.CLIMATE_SENSOR_EVENT;
    }
}
