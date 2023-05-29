package manager;

import tasks.Task;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InMemoryHistoryManager implements HistoryManager {
    private List<Task> viewsHistory = new LinkedList<>();

    @Override
    public List<Task> getHistory() {
        return viewsHistory;
    }
    @Override
    public void addTask(Task task) {
        viewsHistory.add(task);
    }
}
