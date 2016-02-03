package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by romansky on 1/12/16.
 */
public abstract class Tweet {
    protected Date date;
    protected String message;

    public abstract Boolean isImportant();

    /**
     * This function record date and message under Tweet
     * @param date the record date
     * @param message the record message
     */
    public Tweet(Date date, String message) {
        this.date = date;
        this.message = message;
    }

    /**
     * make message is avaliable for Tweet
     * @param message message
     */
    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    /**
     * get the time
     * @return time
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * get message
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * make sure the message will not show out of the screen
     * @param message the message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    /**
     * make the format for the record, like what is going to look like when it shows up
     * @return new format of the record
     */
    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}
