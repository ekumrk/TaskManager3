package manager;

import tasks.Task;

public class Managers {


    public static TaskManager getDefault() {
        return new InMemoryTaskManager();
    }
}
