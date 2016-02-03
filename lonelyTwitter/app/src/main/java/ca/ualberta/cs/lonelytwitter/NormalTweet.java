package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by romansky on 1/12/16.
 * we can get normal message which is different from important tweet
 */
public class NormalTweet extends Tweet implements Tweetable {
    /**
     * calling super class
     * @param date normal massage time
     * @param message normal massage
     */
    public NormalTweet(Date date, String message) {
        super(date, message);
    }
    /**
     * call super class
     * @param message normal massage
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * get the record time
     * @return record time
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * get the message
     * @return record message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * declare that message is not important
     * @return false
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
