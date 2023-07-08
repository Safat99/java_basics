package Exam;

public class SolutionOfQuestion06 {

    /*Answer No 6*/
    public static class ConcurrentTask extends Thread {
        private final String taskName;
        public ConcurrentTask(String taskName) {
            this.taskName = taskName;
        }
        public void run() {
            try {
                System.out.println("Start Task: " + taskName);
                System.out.println("End Task: " + taskName);
            } catch (Exception e) {
                System.out.println("Exception is caught");
            }
        }
    }

    public static void main(String[] args) {
        int n = 3;
        for (int i=0; i<n; i++) {
            ConcurrentTask object = new ConcurrentTask("task" + i);
            object.start();
        }
    }
}
