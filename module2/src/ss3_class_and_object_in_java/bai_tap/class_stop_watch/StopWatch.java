package ss3_class_and_object_in_java.bai_tap.class_stop_watch;

public class StopWatch {

    long startTime,endTime;
    public StopWatch(){

    }

    public void setStart() {
        this.startTime = System.currentTimeMillis();
    }
    public long getStart() {
        return startTime;
    }
    public void setStop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getStop() {
        return endTime;
    }

    public long getElapsedTime() {
        return (this.getStop() - this.getStart());

    }
}
