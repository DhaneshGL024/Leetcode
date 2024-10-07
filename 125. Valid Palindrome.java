// Check if the given string is a valid palindrome after filtering and normalization.
public boolean isPalindrome(String s) {
    StringBuilder filtered = new StringBuilder();

    for (char c : s.toCharArray()) {
        if (Character.isLetterOrDigit(c)) {
            filtered.append(Character.toLowerCase(c));
        }
    }

    String cleaned = filtered.toString();
    int left = 0, right = cleaned.length() - 1;

    while (left < right) {
        if (cleaned.charAt(left) != cleaned.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }

    return true;
}
