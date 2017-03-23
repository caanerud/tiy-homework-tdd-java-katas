/**
 * Created by chrisaanerud on 3/23/17.
 */

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * use static methods in your kata classes.
 *
 * Write tests for each of the actual tests being run by codingbat!
 *
 * Next, implement the method in a corresponding kata class. You should have one class per kata set.
 * So, if you choose warmup-2 and logic-2 you should have a total of four classes
 *
 *
 * Given -
 * When - makeAbba receives Hi and Bye
 * Then - they output a string and mush the words together
 *
 *
 *
 * Arrange This is where you create whatever objects you need and configure them however you need for your test.
 *
 *
 Act This is where whatever action is being tested is performed.


 Assert


 makeAbba("Hi", "Bye") → "HiByeByeHi"

 */

public class String1Test {

    @Test
    /**
     * When String1() is given Hi and Bye
     * returns HiByeByeHi
     */

    public void testMakeAbbaforReceivingHiAndBye(){

        assertThat(String1.makeAbba("Hi","Bye"), equalTo("HiByeByeHi"));

    }




    @Test

    //makeAbba("Yo", "Alice") → "YoAliceAliceYo"

    public void testMakeAbbaforReceivingYoAndAlice(){

        assertThat(String1.makeAbba("Yo", "Alice"), equalTo("YoAliceAliceYo"));

    }


    @Test

    //makeAbba("What", "Up") → "WhatUpUpWhat"

    public void testMakeAbbaforReceivingWhatAndUp(){

        assertThat(String1.makeAbba("What", "Up"), equalTo("WhatUpUpWhat"));

    }


    @Test

    //makeAbba("aaa", "bbb") → "aaabbbbbbaaa"

    public void testMakeAbbaforReceivingAaaAndBbb(){

        assertThat(String1.makeAbba("aaa", "bbb"), equalTo("aaabbbbbbaaa"));

    }


    @Test

    //makeAbba("x", "y") → "xyyx"

    public void testMakeAbbaforReceivingXAndY(){

        assertThat(String1.makeAbba("x", "y"), equalTo("xyyx"));

    }

    @Test

    //makeAbba("x", "") → "xx"

    public void testMakeAbbaforReceivingXAndNothing(){

        assertThat(String1.makeAbba("x", ""), equalTo("xx"));

    }

    @Test

    //makeAbba("", "y") → "yy"

    public void testMakeAbbaforReceivingNothingAndThenY(){

        assertThat(String1.makeAbba("", "y"), equalTo("yy"));

    }


    @Test

    //makeAbba("Bo", "Ya") → "BoYaYaBo"

    public void testMakeAbbaforReceivingBoandYa(){

        assertThat(String1.makeAbba("Bo", "Ya"), equalTo("BoYaYaBo"));

    }


    @Test

    //makeAbba("Ya", "Ya") → "YaYaYaYa"

    public void testMakeAbbaforReceivingYaandYa(){

        assertThat(String1.makeAbba("Ya", "Ya"), equalTo("YaYaYaYa"));

    }


}
