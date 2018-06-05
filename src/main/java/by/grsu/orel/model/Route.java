package by.grsu.orel.model;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * `route` Table model
 */
public class Route {

    private long time;
    private boolean stop;
    private float x;
    private float y;

    //	for debug
    @Override
    public String toString() {
        return "Route [time=" + time + ", stop=" + stop + ", x=" + x + ", y=" + y + "]";
    }

    public long getTime() {
        return time;
    }

    public String getNormalTime() {
        DateFormat dateFormat = new SimpleDateFormat("mm:HH:ss MM:DD:YYYY");
        return dateFormat.format(new Date(time));
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
