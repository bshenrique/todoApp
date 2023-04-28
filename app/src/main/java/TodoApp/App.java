package TodoApp;

import controller.ProjectController;
import controller.TaskController;
import model.Project;
import java.util.Date;
import java.util.List;
import model.Task;

public class App {
    public static void main(String[] args) {
        
       ProjectController projectController = new ProjectController();
       TaskController taskController = new TaskController();
       //Project project = new Project("ORACLE Java Back-End", "Programa de formação Back-End Dev com Java");
       //projectController.save(project);
       
       //taskController.save(task);
       Task task = new Task(2,"BD com MySQL","Quebrando tudo no SQL pai!",false,new Date());
       task.setId(1);
       //taskController.update(task);
       taskController.removeById(1);
       
       
    }
}
