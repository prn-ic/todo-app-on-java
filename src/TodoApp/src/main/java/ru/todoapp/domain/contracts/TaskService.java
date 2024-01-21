package ru.todoapp.domain.contracts;

import ru.todoapp.domain.entities.Task;

import java.util.UUID;

public interface TaskService {
    Task getById(UUID id);
    boolean create(Task task);
    boolean update(Task task);
    boolean deleteById(UUID id);
}
