package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by romansky on 1/12/16.
 * make important Tweet as special
 *
 */
public class ImportantTweet extends Tweet implements Tweetable {
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    public ImportantTweet(Date date, String message) {
        super(date, message);
    }

    public ImportantTweet(String message) {
        super(message);
    }

    /**
     * get the current time
     * @return the current time
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * get message
     * @return the message
     */
    public String getMessage() {
        return "!IMPORTANT! " + this.message;
    }
}
