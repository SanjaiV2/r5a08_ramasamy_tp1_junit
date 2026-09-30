package r5a08.tp1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserGreetingTest {

    @Test
    public void testFormatGreeting() {
        // Arrange
        String nom = "Sanjai";
        
        // Act
        String resultat = UserGreeting.formatGreeting(nom);
        
        // Assert
        assertEquals("Bonjour, Sanjai", resultat, "Le message n est pas le même.");
    }
    
    @Test
    public void testNomVide() {
        assertThrows(
            UserGreetingFailureException.class, 
            () -> UserGreeting.formatGreeting("")
        );
    }

    @Test
    public void testNomTropLong() {
        assertThrows(
            UserGreetingFailureException.class, 
            () -> UserGreeting.formatGreeting("SanjaiSanjaiSanjai")
        );
    }

    @Test
    public void testNomAvecEspaces() {
        assertThrows(
            UserGreetingFailureException.class, 
            () -> UserGreeting.formatGreeting("San jai")
        );
    }

    @Test
    public void testNomCaracteresSpeciaux() {
        assertThrows(
            UserGreetingFailureException.class, 
            () -> UserGreeting.formatGreeting("Sanjai@")
        );
    }
}
