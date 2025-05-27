package ru.yandex.practicum.telemetry.analyzer.service.hub.handlers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.yandex.practicum.kafka.telemetry.event.DeviceAddedEventAvro;
import ru.yandex.practicum.kafka.telemetry.event.HubEventAvro;
import ru.yandex.practicum.telemetry.analyzer.model.Sensor;
import ru.yandex.practicum.telemetry.analyzer.repository.SensorRepository;

@Component
@RequiredArgsConstructor
public class DeviceAddedAnalyzerHandler implements AnalyzerHubEventHandler {
    private final SensorRepository sensorRepository;

    @Override
    public void handle(HubEventAvro hubEvent) {
        DeviceAddedEventAvro eventAvro = (DeviceAddedEventAvro) hubEvent.getPayload();
        Sensor sensor = Sensor.builder()
                .id(eventAvro.getId())
                .hubId(hubEvent.getHubId())
                .build();

        sensorRepository.save(sensor);
    }

    @Override
    public Class<?> getCheckedClass() {
        return DeviceAddedEventAvro.class;
    }
}
