package ru.todoapp.domain.contracts;

import ru.todoapp.domain.entities.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {
    List<Task> getAll();
    Task getById(UUID id);
    boolean create(Task task);
    boolean update(Task task);
    boolean deleteById(UUID id);
}
