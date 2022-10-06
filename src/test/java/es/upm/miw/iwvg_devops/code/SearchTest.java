package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;


import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class SearchTest {

    @Test
    void testFindFirstDecimalFractionByUserName() {
        assertEquals(0, new Search().findFirstDecimalFractionByUserName("Oscar"));
    }

    @Test
    void testFindUserIdByAllProperFraction(){
        assertEquals(List.of("1","2","3","5"), new Search().findUserIdByAllProperFraction().collect(Collectors.toList()));
    }
}
