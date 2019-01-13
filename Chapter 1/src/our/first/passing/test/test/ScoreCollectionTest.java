package our.first.passing.test.test;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;
import our.first.passing.test.ScoreCollection;

public class ScoreCollectionTest {

    @Test
    public void answersArithmeticMeanOfTwoNumbers() {

        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        int actualResult = collection.arithmeticMean();

        Assert.assertThat(actualResult, IsEqual.equalTo(6));
    }
}
