package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;

import android.content.Intent;

import android.test.ActivityInstrumentationTestCase2;

import junit.framework.TestCase;

/**
 * Created by wz on 14/09/15.
 */
public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2 {

    public LonelyTwitterActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }
    public void testSendText(){
        Intent intent = new Intent();
        intent.putExtra(IntentReaderActivity.TEXT_TO_TRANSFORM_KEY, "message 1");

        setActivityIntent(intent);
        IntentReaderActivity ira = (IntentReaderActivity) getActivity();

        assertEquals("IntentReaderActivity should get the text from intent","message 1",ira.getText());
    }

    public void testStart() throws Exception {
        Activity activity = getActivity();

    }
}