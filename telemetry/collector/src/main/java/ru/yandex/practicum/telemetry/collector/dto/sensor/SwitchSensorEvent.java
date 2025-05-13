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
public class SwitchSensorEvent extends SensorEvent {
    @NotNull
    final Boolean state;

    @Override
    public SensorEventType getType() {
        return SensorEventType.SWITCH_SENSOR_EVENT;
    }

    public enum SensorEventType {
        MOTION_SENSOR_EVENT,
        TEMPERATURE_SENSOR_EVENT,
        LIGHT_SENSOR_EVENT,
        CLIMATE_SENSOR_EVENT,
        SWITCH_SENSOR_EVENT
    }

    public enum DeviceType {
        MOTION_SENSOR,
        TEMPERATURE_SENSOR,
        LIGHT_SENSOR,
        CLIMATE_SENSOR,
        SWITCH_SENSOR
    }
}
