class Solution {
    public String sortVowels(String s) {
        char[] c = s.toCharArray();
        int n = c.length;

        // Collect vowels
        String vowels = "AEIOUaeiou";
        java.util.List<Character> list = new java.util.ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (vowels.indexOf(c[i]) != -1) {
                list.add(c[i]);
            }
        }

        // Sort vowels
        list.sort((a, b) -> a - b);

        // Replace vowels in order
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (vowels.indexOf(c[i]) != -1) {
                c[i] = list.get(idx++);
            }
        }

        return new String(c);
    }
}
