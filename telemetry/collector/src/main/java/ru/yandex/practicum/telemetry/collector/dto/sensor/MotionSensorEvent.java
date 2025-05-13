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
public class MotionSensorEvent extends SensorEvent {
    @NotNull
    final Integer linkQuality;

    @NotNull
    final Boolean motion;

    @NotNull
    final Integer voltage;

    @Override
    public SwitchSensorEvent.SensorEventType getType() {
        return SwitchSensorEvent.SensorEventType.MOTION_SENSOR_EVENT;
    }
}
