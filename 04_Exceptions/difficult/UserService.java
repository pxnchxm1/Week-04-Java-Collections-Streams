import java.util.HashSet;
import java.util.Set;

class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}

class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}

public class UserService {

    private Set<String> registeredUsers = new HashSet<>();

   
    public void registerUser(String username) throws UserAlreadyExistsException {
        if (registeredUsers.contains(username)) {
            throw new UserAlreadyExistsException("User '" + username + "' already exists.");
        }
        registeredUsers.add(username);
        System.out.println("User '" + username + "' registered successfully.");
    }

  
    public void checkUserExistence(String username) throws UserNotFoundException {
        if (!registeredUsers.contains(username)) {
            throw new UserNotFoundException("User '" + username + "' not found.");
        }
        System.out.println("User '" + username + "' exists in the system.");
    }

   
    public static void main(String[] args) {
        UserService service = new UserService();

        try {
            service.registerUser("alice");
            service.registerUser("bob");
            service.registerUser("alice");
        } catch (UserAlreadyExistsException e) {
            System.err.println("Registration Error: " + e.getMessage());
        }

        try {
            service.checkUserExistence("bob");
            service.checkUserExistence("charlie"); 
        } catch (UserNotFoundException e) {
            System.err.println("Check Error: " + e.getMessage());
        }
    }
}
