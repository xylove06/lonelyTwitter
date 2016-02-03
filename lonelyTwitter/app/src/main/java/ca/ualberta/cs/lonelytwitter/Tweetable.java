package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by romansky on 1/12/16.
 *
 */
public interface Tweetable {
    /**
     *getMessage returns the tweet message.
     * @return message and message time
     */
    public String getMessage();
    public Date getDate();
}
