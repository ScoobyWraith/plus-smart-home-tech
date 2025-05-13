package ru.yandex.practicum.telemetry.collector.dto.hub.action;

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
public class DeviceAction {
    final String sensorId;
    final DeviceActionType type;
    final int value;
}
