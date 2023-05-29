import manager.InMemoryTaskManager;
import tasks.*;

public class Main {
    public static void main(String[] args) {

        InMemoryTaskManager inMemoryTaskManager = new InMemoryTaskManager();
        Task task;
        Epic epic;
        Subtask subtask;


        //Тестирование
        //1. Создайте 2 задачи, один эпик с 2 подзадачами, а другой эпик с 1 подзадачей.
        task = new Task("Почитать", "Гарри Поттера");
        inMemoryTaskManager.createNewTask(task);
        task = new Task("Отдохнуть", "Полежать на диване");
        inMemoryTaskManager.createNewTask(task);

        epic = new Epic("Посмотреть летом", "фильмы");
        inMemoryTaskManager.createNewEpic(epic);
        subtask = new Subtask("Гарри Поттер", "все части",3);
        inMemoryTaskManager.createNewSubtask(subtask);
        subtask = new Subtask("Властелин колец", "все части", 3);
        inMemoryTaskManager.createNewSubtask(subtask);

        epic = new Epic("Посетить культурные места","в разных городах");
        inMemoryTaskManager.createNewEpic(epic);
        subtask = new Subtask("В Москве","Третьяковская галерея",6);
        inMemoryTaskManager.createNewSubtask(subtask);

        System.out.println("Тест 2:");
        //2. Распечатайте списки эпиков, задач и подзадач
        inMemoryTaskManager.getTaskList();
        inMemoryTaskManager.getEpicList();
        inMemoryTaskManager.getSubtaskList();

        System.out.println("Тест 3:");
        //3. Измените статусы созданных объектов, распечатайте.
        task = new Task("Почитать", "Гарри Поттера");
        task.setStatus(Status.DONE);
        inMemoryTaskManager.updateTask(task);
        subtask = new Subtask("Властелин колец", "все части", 3);
        inMemoryTaskManager.updateSubtask(subtask);

        inMemoryTaskManager.getTaskList();
        inMemoryTaskManager.getEpicList();
        inMemoryTaskManager.getSubtaskList();

        System.out.println("Тест 4:");
        //4. И, наконец, попробуйте удалить одну из задач и один из эпиков.
        inMemoryTaskManager.deleteEpicFromId(6);
        inMemoryTaskManager.deleteTaskFromId(2);

        inMemoryTaskManager.getTaskList();
        inMemoryTaskManager.getEpicList();
        inMemoryTaskManager.getSubtaskList();

    }
}
