// Given a string `s`, return the length of the last word in the string.
public int lengthOfLastWord(String s) {
    s = s.trim();

    int length = 0;
    int i = s.length() - 1;

    while (i >= 0 && s.charAt(i) != ' ') {
        length++;
        i--;
    }

    return length;
}