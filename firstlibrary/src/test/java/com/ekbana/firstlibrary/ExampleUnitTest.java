package com.ekbana.firstlibrary;

import io.reactivex.observers.DisposableSingleObserver;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getSingleResponseTest() {
        MessageUtil util = new MessageUtil();
        util.getSingleResponse().subscribe(new DisposableSingleObserver<String>() {
            @Override
            public void onSuccess(String value) {
                System.out.println(value);
            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }
}