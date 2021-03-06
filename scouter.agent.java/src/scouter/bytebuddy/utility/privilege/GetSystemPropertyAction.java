// Generated by delombok at Sun Feb 26 12:31:38 KST 2017
package scouter.bytebuddy.utility.privilege;

import java.security.PrivilegedAction;

/**
 * An action for reading a system property as a privileged action.
 */
public class GetSystemPropertyAction implements PrivilegedAction<String> {
    /**
     * The property key.
     */
    private final String key;

    /**
     * Creates a new action for reading a system property.
     *
     * @param key The property key.
     */
    public GetSystemPropertyAction(String key) {
        this.key = key;
    }

    @Override
    public String run() {
        return System.getProperty(key);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof GetSystemPropertyAction)) return false;
        final GetSystemPropertyAction other = (GetSystemPropertyAction) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$key = this.key;
        final java.lang.Object other$key = other.key;
        if (this$key == null ? other$key != null : !this$key.equals(other$key)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof GetSystemPropertyAction;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $key = this.key;
        result = result * PRIME + ($key == null ? 43 : $key.hashCode());
        return result;
    }
}
