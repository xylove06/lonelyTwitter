package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by watts1 on 1/26/16.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2{
    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test tweet");

        tweets.addTweet(tweet);

        assertTrue(tweets.hasTweet(tweet));

    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Hello");

        assertFalse(tweets.hasTweet(tweet));

        tweets.addTweet(tweet);
        tweets.hasTweet(tweet);

        assertTrue(tweets.hasTweet(tweet));

    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test tweet");

        tweets.addTweet(tweet);
        tweets.removeTweet(tweet);

        assertFalse(tweets.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test tweet");

        tweets.addTweet(tweet);
        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(),tweet.getMessage());
        assertEquals(returnedTweet.getDate(),tweet.getDate());
    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test tweet");

        tweets.addTweet(tweet);
        tweets.getcount();

        assertEquals(tweets.getcount(),1);
    }

}
