package ru.yandex.practicum.telemetry.analyzer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.yandex.practicum.telemetry.analyzer.model.ScenarioAction;
import ru.yandex.practicum.telemetry.analyzer.model.ScenarioActionsPK;

public interface ScenarioActionsRepository extends JpaRepository<ScenarioAction, ScenarioActionsPK> {

}
