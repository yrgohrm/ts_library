package se.yrgo.libraryapp.validator;

import org.junit.jupiter.api.Test;
import se.yrgo.libraryapp.validators.Username;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsernameTest {
    @Test
    void correctUsername() {
        assertTrue(Username.validate("bosse"));
    }

    @Test
    void incorrectUsername() {
        assertFalse(Username.validate("name with space"));
    }
}
