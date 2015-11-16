package nl.fontys.coffeemachine.util;

/**
 * An exception that indicates, that no resources of a certain kind are available.
 */
public class NoResourcesException extends RuntimeException {

    public NoResourcesException(String message) {
        super(message);
    }
}