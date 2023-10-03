package com.intellekta.user_checks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
	@Test
    public void testCheckValidAge() {
        User user = new User("John", 25, "Password123");
        assertTrue(user.checkAge());
    }

    @Test
    public void testCheckInvalidAge() {
        User user = new User("Jane", 17, "Password456");
        assertFalse(user.checkAge());
    }
    
    @Test
    public void testCheckValidPassword() {
        User user = new User("Mike", 30, "Pa$$word");
        assertTrue(user.checkPassword());
    }

    @Test
    public void testCheckInvalidPassword() {
        User user = new User("Bob", 40, "weak");
        assertFalse(user.checkPassword());
    }
}
