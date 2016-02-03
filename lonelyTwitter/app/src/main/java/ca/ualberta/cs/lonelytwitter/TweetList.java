package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by watts1 on 1/26/16.
 * make all Tweets as a list
 */
public class TweetList {
    /**
     * set up a new list
     */
    private ArrayList<Tweet> tweets= new ArrayList<Tweet>();

    /**
     * make function about add new tweet to the list
     * @param tweet add tweet to list
     */
    public void addTweet(Tweet tweet){
        tweets.add(tweet);
    }

    /**
     * try to make sure there is something in the tweet's list
     * @param tweet tweet list
     * @return whether there are something in the tweet's list
     */
    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    /**
     * make function to get the tweet's index number
     * @param index index number
     * @return the number for each tweet in the tweet's list
     */
    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    /**
     * make function to remove tweet in the tweet's list
     * @param tweet tweet list
     */
    public void removeTweet(Tweet tweet){
        tweets.remove(tweet);
    }

    /**
     * make a funciton to get how make tweet we typied in.
     * @return how many messages that we typied in
     */
    public int getcount() {return tweets.size();}
}
