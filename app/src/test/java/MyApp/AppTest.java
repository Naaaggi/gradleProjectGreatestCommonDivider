package MyApp;

import MyApp.commands.algorithms.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test public void GCDEuclidSubtractionIt_test() {
        Assert.assertEquals(GCDEuclidSubtractionIt.getGCD(12,6), 6);
    }

    @Test public void GCDEuclidSubtractionRec_test() {
        Assert.assertEquals(GCDEuclidSubtractionRec.getGCD(12, 6), 6);
    }


    @Test public void GCDEuclidDivisionRestIt_test() {
        Assert.assertEquals(GCDEuclidDivisionRestIt.getGCD(12, 6), 6);
    }


    @Test public void GCDEuclidDivisionRestRec_test() {
      Assert.assertEquals(GCDEuclidDivisionRestRec.getGCD(12,6), 6);
   }
    @Test public void SieveEratosthenes_test() {
        int[] list = {2,3,5,7,11};

           Assert.assertArrayEquals(SieveOfEratosthenes.getPrime(11), list);
    }
    @Test public void StringMatchingAlgorithm_test() {
        Assert.assertEquals(StringMatchingAlgorithm.match("I’m an egotistical bastard, and I name all my " +
                        "projects after myself. First ‘Linux’, now ‘Git’","egotistical"),
                "found. The string is between the index: 8 and 18.");
    }
}

