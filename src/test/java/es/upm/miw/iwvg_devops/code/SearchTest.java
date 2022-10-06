package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;


import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchTest {

    @Test
    void testFindFirstDecimalFractionByUserName() {
        assertEquals(0, new Search().findFirstDecimalFractionByUserName("Oscar"));
    }

    @Test
    void testFindUserIdByAllProperFraction(){
        assertEquals(List.of("1","2","3","5"), new Search().findUserIdByAllProperFraction().collect(Collectors.toList()));
    }

    @Test
    void testFindFirstProperFractionByUserId(){
        assertEquals(1,new Search().findFirstProperFractionByUserId("3").getNumerator());
        assertEquals(5,new Search().findFirstProperFractionByUserId("3").getDenominator());
    }

    @Test
    void testFindDecimalFractionByUserName(){
        assertEquals(List.of(2.0, -0.2, 0.5, 1.3333333333333333), new Search().findDecimalFractionByUserName("Ana").collect(Collectors.toList()));
    }
}
