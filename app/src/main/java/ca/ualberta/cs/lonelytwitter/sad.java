package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by runqi on 1/12/16.
 */
public class sad extends BM{
    private Date date;

    public sad(Date todate){
        this.date = todate;
    }

    public void setDate(Date todate){
        this.date=todate;
    }

    @Override
    public String getmood() {
        return "SAD!";
    }

    public Date getdate(){
        return this.date;
    }

}
