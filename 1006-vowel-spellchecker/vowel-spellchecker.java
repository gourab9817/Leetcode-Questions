class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> original = new HashSet<>();
        Map<String, String> caseMap = new HashMap<>();
        Map<String, String> vowelMap = new HashMap<>();

        for (String s : wordlist) {
            original.add(s);
            String lower = s.toLowerCase();
            caseMap.putIfAbsent(lower, s);
            vowelMap.putIfAbsent(changeVowel(lower), s);
        }

        String[] res = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];
            String lower = q.toLowerCase();
            String cv = changeVowel(lower);

            if (original.contains(q)) {
                res[i] = q;
            } else if (caseMap.containsKey(lower)) {
                res[i] = caseMap.get(lower);
            } else if (vowelMap.containsKey(cv)) {
                res[i] = vowelMap.get(cv);
            } else {
                res[i] = "";
            }
        }
        return res;
    }

    private String changeVowel(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) sb.append("*");
            else sb.append(ch);
        }
        return sb.toString();
    }
}