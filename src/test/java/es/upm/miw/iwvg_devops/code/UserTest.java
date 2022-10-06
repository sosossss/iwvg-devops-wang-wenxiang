package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;

    @BeforeEach
    public void Constructor() {
        this.user = new User("1", "Wenxiang", "Wang", new ArrayList<>());
    }

    @Test
    public void testEmptyConstructor() {
        user = new User();
        assertNull(user.getId());
        assertNull(user.getName());
        assertNull(user.getFamilyName());
        assertEquals(new ArrayList<>(), user.getFractions());
    }

    @Test
    void testGetId() {
        assertEquals("1", this.user.getId());
    }

    @Test
    void testGetName() {
        assertEquals("Wenxiang", user.getName());
    }

    @Test
    void testSetName() {
        user.setName("Jiaming");
        assertEquals("Jiaming", user.getName());
    }

    @Test
    void testGetFamilyName() {
        assertEquals("Wang", user.getFamilyName());
    }

    @Test
    void testSetFamilyName() {
        user.setFamilyName("Shi");
        assertEquals("Shi", user.getFamilyName());
    }

    @Test
    void testGetFractions() {
        assertEquals(new ArrayList<>(), user.getFractions());
    }

    @Test
    void testSetFractions() {
        Fraction fraction = new Fraction();
        ArrayList<Fraction> fractions = new ArrayList<>();
        fractions.add(fraction);
        ArrayList<Fraction> fractionsTest = new ArrayList<>();
        fractionsTest.add(fraction);
        user.setFractions(fractionsTest);
        assertEquals(fractions, user.getFractions());
    }

    @Test
    void testAddFraction() {
        Fraction fraction = new Fraction();
        user.addFraction(fraction);
        assertEquals(1, this.user.getFractions().size());
    }

    @Test
    void testFullName() {
        assertEquals("Wenxiang Wang", this.user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("W.", this.user.initials());
    }

    @Test
    void testToString() {
        String userTest = "User{id='1', name='Wenxiang', familyName='Wang', fractions=[]}";
        assertEquals(userTest, this.user.toString());
    }

}
