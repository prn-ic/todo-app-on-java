package ru.todoapp.domain.entities;

import java.util.UUID;

public class EntityBase {
    private UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
