package hispershop;

import hipstershop.AdService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdServiceTest {

    @Test
    public void test1() {
        AdService adService = new AdService();
        var ans = adService.getRandomNumbers();
        Assertions.assertEquals(ans.size(), 2);
    }

    @Test
    public void test2() {
        AdService adService = new AdService();
        var ans = adService.getRandomNumbers();
        Assertions.assertEquals(ans.size(), 2);
    }

    @Test
    public void test3() {
        AdService adService = new AdService();
        var ans = adService.getRandomNumbers();
        Assertions.assertEquals(ans.size(), 2);
    }
}

