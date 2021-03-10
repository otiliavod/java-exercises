package TheNewBoston.TimeClass;

public class timeVar {
    private int hour;
    private int minute;
    private int second;
    public void setTime(int h, int m, int s) {
        hour = ((h>=0) && (h<24) ? h : 0);
        minute = ((m>=0) && (m<60) ? m : 0);
        second = ((s>=0) && (s<60) ? s : 0);
    }

    public String toMilitary(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toString(){
        return String.format("%d:%02d:%02d", ((hour==0) || (hour==12) ? 12: hour%12),minute,second,(hour<12?"AM":"PM"));
    }
    // Multiple Constructors Method:
    //private int hour;
    //private int minute;
    //private int second;
    //public timeVar() {
    //  this(0,0,0); 
    //}
    //public timeVar(int h) {
    //  this(h,0,0);
    //}
    //public timeVar(int h, int m){
    //  this(h,m,0);
    //}
    //public timeVar(int h, int m, int s){
    //  setTime(h,m,s);
    //}

    //public void setTime(int h, int m, int s) {
    //  setHour(h);
    //  setMinute(m);
    //  setSecond(s);
    //}

    //public void setHour(int h) {
    //  hour = ( (h>=0) && (h<24) ? h:0 );
    //}

    //public void setMinute(int m) {
    //  minute = ( (m>=0) && (m<60) ? m:0 );
    //}

    //public void setSecond(int s) {
    //  second = ( (s>=0) && (s<60) ? s:0 );
    //}

    //public int getHour(){
    //  return hour;
    //}

    //public int getMinute(){
    //  return minute;
    //}

    //public int getSecond(){
    //  return second;
    //}

    //public String toMilitary(){
    //  return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    //}
    
}
