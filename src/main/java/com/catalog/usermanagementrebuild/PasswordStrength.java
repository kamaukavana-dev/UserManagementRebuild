package com.catalog.usermanagementrebuild;

public class PasswordStrength {
    private PasswordStrength() {
        // utility class; prevent instantiation
    }

    /**
     * Computes a password strength score in the inclusive range [0, 4].
     *
     * <p>The score combines length criteria with the number of distinct
     * character classes present (lowercase, uppercase, digit, special).
     * A {@code null} or empty password returns {@code 0}.</p>
     *
     * @param password the password to evaluate
     * @return an int in the range 0-4





}
