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
     */
    public static int score(String password) {
        if (password == null || password.isEmpty()) {
            return 0;
        }

        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }

        int classes = 0;
        if (hasLower) {
            classes++;
        }
        if (hasUpper) {
            classes++;
        }
        if (hasDigit) {
            classes++;
        }
        if (hasSpecial) {
            classes++;
        }

        int score = 0;

        // Length criteria.
        if (password.length() >= 8) {
            score++;
        }
        if (password.length() >= 12) {
            score++;
        }

        // Character-class diversity (adds up to 2 points).


}
