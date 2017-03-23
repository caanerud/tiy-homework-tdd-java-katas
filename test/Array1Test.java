import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by chrisaanerud on 3/23/17.
 */
public class Array1Test {


    /**
     * public boolean firstLast6(int[] nums) {
     return nums[0] == 6 || nums[nums.length - 1] == 6;
     }

     *
     * given an array called firstLast6 with 6 integers
     * when the code checks the first and last number
     * then if it finds a 6 either in position 0 or position 5 it returns true
     */

@Test

// firstLast6([1, 2, 6]) → true

public void testForArrayNumberSixinPositionTwo(){

    //Arrange

    int[] nums = {1, 2, 6};

    //Act
    boolean x = Array1.firstLast6(nums);

    //Assert

    assertThat(x, equalTo(true));

}


    @Test

// firstLast6([6, 1, 2, 3]) → true

  /*int[] nums = new int[3];
nums[0] = 6;
nums[1] = 2;
nums[2] = 3; */

    public void testForArrayNumberSixinTheFirstPosition(){

        //Arrange

        int[] nums = {6, 2, 3};

        //Act
        boolean x = Array1.firstLast6(nums);

        //Assert

        assertThat(x, equalTo(true));

    }


    @Test

// firstLast6([13, 6, 1, 2, 3]) → false



    public void testForArrayNumberSixinTheSecondPosition(){

        //Arrange

        int[] nums = {1, 6, 2, 3};

        //Act
        boolean x = Array1.firstLast6(nums);

        //Assert

        assertThat(x, equalTo(false));

    }


    @Test

// firstLast6([13, 6, 1, 2, 6]) → true



    public void testForArrayNumberSixinACorrectandIncorrectPosition(){

        //Arrange

        int[] nums = {1, 6, 2, 3, 6};

        //Act
        boolean x = Array1.firstLast6(nums);

        //Assert

        assertThat(x, equalTo(true));

    }

    @Test

// firstLast6([3, 2, 1]) → false



    public void testForArrayNumberSixNotPresent(){

        //Arrange

        int[] nums = {1, 0, 2, 3, 5};

        //Act
        boolean x = Array1.firstLast6(nums);

        //Assert

        assertThat(x, equalTo(false));

    }


    @Test

// firstLast6([3, 6, 1]) → false



    public void testForArrayNumberSixinTheMiddleSomewhere(){

        //Arrange

        int[] nums = {1, 0, 6, 3, 5};

        //Act
        boolean x = Array1.firstLast6(nums);

        //Assert

        assertThat(x, equalTo(false));

    }

    @Test

// firstLast6([3, 6]) → true



    public void testForArrayNumberSixinTheLastPosition(){

        //Arrange

        int[] nums = {1, 6};

        //Act
        boolean x = Array1.firstLast6(nums);

        //Assert

        assertThat(x, equalTo(true));

    }

    @Test

// firstLast6([6]) → true



    public void testForArrayNumberSixisTheOnlyNumber(){

        //Arrange

        int[] nums = {6};

        //Act
        boolean x = Array1.firstLast6(nums);

        //Assert

        assertThat(x, equalTo(true));

    }

    @Test

// firstLast6([3]) → false



    public void testForArrayNumberSixisNotThereOnlyOneNumberPresent(){

        //Arrange

        int[] nums = {2};

        //Act
        boolean x = Array1.firstLast6(nums);

        //Assert

        assertThat(x, equalTo(false));

    }

    @Test

// firstLast6([5, 6]) → true



    public void testForArrayNumberSixInTheLastPosition(){

        //Arrange

        int[] nums = {2, 6};

        //Act
        boolean x = Array1.firstLast6(nums);

        //Assert

        assertThat(x, equalTo(true));

    }


    @Test

// firstLast6([5, 5]) → false



    public void testForArrayNumberSixIsNotThereWhenGivenTwoNumbersThatAreTheSame(){

        //Arrange

        int[] nums = {2, 2};

        //Act
        boolean x = Array1.firstLast6(nums);

        //Assert

        assertThat(x, equalTo(false));

    }


    @Test

// firstLast6([1, 2, 3, 4, 6]) → true



    public void testForArrayNumberSixWhenCountingUpFromOneSequentially(){

        //Arrange

        int[] nums = {1, 2, 3, 4, 5, 6};

        //Act
        boolean x = Array1.firstLast6(nums);

        //Assert

        assertThat(x, equalTo(true));

    }


    @Test

//   firstLast6([1, 2, 3, 4]) → false



    public void testForArrayNumberSixWhenCountingUpFromOneSequentiallyWithNoSixPresent(){

        //Arrange

        int[] nums = {1, 2, 3, 4, 5};

        //Act
        boolean x = Array1.firstLast6(nums);

        //Assert

        assertThat(x, equalTo(false));

    }


}
