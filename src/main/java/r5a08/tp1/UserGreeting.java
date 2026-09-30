package r5a08.tp1;

public class UserGreeting {

    public static String formatGreeting(String nom) {
        if (nom == null || nom.isEmpty())  {
            throw new UserGreetingFailureException("Le nom ne doit pas être vide");
        }
        if (nom.length() > 10) {
            throw new UserGreetingFailureException("Le nom ne doit pas dépasser 10 caractères");
        }
        if (!nom.matches("^[a-zA-Z0-9]+$")) {
            throw new UserGreetingFailureException("Le nom ne doit pas contenir d'espaces ni de caractères spéciaux");
        }
        
        return "Bonjour, " + nom;
    }
}
