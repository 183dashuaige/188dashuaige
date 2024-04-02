package 任务;

class TaskIdGenerator {
    private static int currentId = 1;

    // 用于生成新的任务 ID
    public static int generateId() {
        // 返回当前的 currentId 值，并将 currentId 的值加 1
        return currentId++;
    }
}
