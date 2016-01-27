package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by watts1 on 1/26/16.
 */
public class TweetList {
    private ArrayList<Tweet> tweets= new ArrayList<Tweet>();

    public void addTweet(Tweet tweet){
        tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public void removeTweet(Tweet tweet){
        tweets.remove(tweet);
    }

    public int getcount() {return tweets.size();}
}
