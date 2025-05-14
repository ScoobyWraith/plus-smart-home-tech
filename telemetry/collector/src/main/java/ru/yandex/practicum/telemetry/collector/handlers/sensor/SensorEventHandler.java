package ru.yandex.practicum.telemetry.collector.handlers.sensor;

import lombok.AllArgsConstructor;
import lombok.ToString;
import ru.yandex.practicum.kafka.telemetry.event.SensorEventAvro;
import ru.yandex.practicum.telemetry.collector.kafka.KafkaClient;
import ru.yandex.practicum.telemetry.collector.kafka.Topics;
import ru.yandex.practicum.telemetry.collector.model.sensor.SensorEvent;

@ToString
@AllArgsConstructor
public abstract class SensorEventHandler<T extends SensorEvent> {
    private final KafkaClient kafkaClient;
    private final String topic = Topics.TELEMETRY_SENSORS_V_1;

    public void handle(T event) {
        Object eventPayload = getPayload(event);
        SensorEventAvro payload = SensorEventAvro.newBuilder()
                .setId(event.getId())
                .setHubId(event.getHubId())
                .setTimestamp(event.getTimestamp())
                .setPayload(eventPayload)
                .build();

        kafkaClient.sendData(event.getHubId(), payload, topic);
    }

    public abstract SensorEvent.SensorEventType getEventType();

    protected abstract Object getPayload(T event);
}
