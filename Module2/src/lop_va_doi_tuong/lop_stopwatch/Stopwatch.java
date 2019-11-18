package lop_va_doi_tuong.lop_stopwatch;

public class Stopwatch {
    private  long startTime;
    private  long endTime;
    public Stopwatch() {
        this.startTime = System.currentTimeMillis();
    }
    public void start(){
        this.startTime=System.currentTimeMillis();
    }
    public long getStartTime(){
        return this.startTime;
    }
    public void end(){
        this.endTime=System.currentTimeMillis();
    }
    public long getEndTime(){
        return this.endTime;
    }
    public long getElapsedTime(){
        return (this.endTime-this.startTime);
    }
}
