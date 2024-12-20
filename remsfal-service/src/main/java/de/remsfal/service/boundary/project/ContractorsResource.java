package de.remsfal.service.boundary.project;

import de.remsfal.core.api.ContractorsEnpoint;
import de.remsfal.core.json.project.TaskJson;
import de.remsfal.core.json.project.TaskListJson;
import de.remsfal.core.model.project.TaskModel;
import de.remsfal.service.control.TaskController;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import java.util.Optional;

@RequestScoped
public class ContractorsResource implements ContractorsEnpoint {
    @Inject
    TaskController taskController;

    @Override
    public  TaskListJson getTasks(String ownerId, TaskModel.Status status) {
        return  null ;
        //return TaskListJson.valueOf(taskController.getTasks(ownerId, Optional.ofNullable(status)));
    }

    @Override
    public TaskJson getTask(String ownerId, String taskId) {
        return TaskJson.valueOf(taskController.getTask(ownerId, taskId));
    }
}
