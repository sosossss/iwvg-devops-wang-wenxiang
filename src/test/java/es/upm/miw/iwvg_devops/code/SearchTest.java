package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class SearchTest {

    @Test
    void testFindFirstDecimalFractionByUserName() {
        assertEquals(0, new Search().findFirstDecimalFractionByUserName("Oscar"));
    }
}
