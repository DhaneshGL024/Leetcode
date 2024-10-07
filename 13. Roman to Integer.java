// Problem: Convert a Roman numeral string to an integer.
public int romanToInt(String s) {
    int result = 0;
    int prevValue = 0;
    Map<Character, Integer> romanToIntMap = new HashMap<>();
    romanToIntMap.put('I', 1);
    romanToIntMap.put('V', 5);
    romanToIntMap.put('X', 10);
    romanToIntMap.put('L', 50);
    romanToIntMap.put('C', 100);
    romanToIntMap.put('D', 500);
    romanToIntMap.put('M', 1000);

    for (int i = s.length() - 1; i >= 0; i--) {
        char c = s.charAt(i);
        int value = romanToIntMap.get(c);
        if (value < prevValue) {
            result -= value;
        } else {
            result += value;
        }
        prevValue = value;
    }

    return result;
}