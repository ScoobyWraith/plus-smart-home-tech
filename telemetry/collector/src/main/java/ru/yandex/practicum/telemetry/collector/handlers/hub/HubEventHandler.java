package ru.yandex.practicum.telemetry.collector.handlers.hub;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ru.yandex.practicum.kafka.telemetry.event.HubEventAvro;
import ru.yandex.practicum.telemetry.collector.kafka.KafkaClient;
import ru.yandex.practicum.telemetry.collector.kafka.Topics;
import ru.yandex.practicum.telemetry.collector.model.hub.HubEvent;

@Getter
@Setter
@ToString
@AllArgsConstructor
public abstract class HubEventHandler <T extends HubEvent> {
    private final KafkaClient kafkaClient;
    private final String topic = Topics.TELEMETRY_HUBS_V_1;

    public void handle(T event) {
        Object eventPayload = getPayload(event);
        HubEventAvro payload = HubEventAvro.newBuilder()
                .setHubId(event.getHubId())
                .setTimestamp(event.getTimestamp())
                .setPayload(eventPayload)
                .build();

        kafkaClient.sendData(event.getHubId(), payload, topic);
    }

    public abstract HubEvent.HubEventType getEventType();

    protected abstract Object getPayload(T event);
}
