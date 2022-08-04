package ss3_class_and_object_in_java.bai_tap.class_stop_watch;


public class main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.setStart();
        int[] array = new int[100000];
        for (int i = 0; i < 100000; i++) {
            array[i] = (int) Math.floor(Math.random() * 100);
        }
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        stopWatch.setStop();
        System.out.println("Process time: " + stopWatch.getElapsedTime());
    }
}
