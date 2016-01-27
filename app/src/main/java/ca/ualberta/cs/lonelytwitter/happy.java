package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by runqi on 1/12/16.
 */
public class happy extends BM{

    private Date date;

    public happy(Date todate){
        this.date = todate;
    }

    public void setDate(Date todate){
        this.date = todate;
    }

    public Date getDate(){
        return this.date;
    }

    public String getmood(){
        return "HAPPY!";

    }
}
