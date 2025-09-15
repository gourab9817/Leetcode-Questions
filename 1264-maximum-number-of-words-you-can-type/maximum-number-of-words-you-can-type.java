class Solution {
    public int canBeTypedWords(String text, String b) {
    String[] words = text.split(" ");
    int count = 0;

    for (int i = 0; i < words.length; i++) {
        String w = words[i];
        boolean ok = true;

        for (int j = 0; j < b.length(); j++) {
            char c = b.charAt(j);
            if (w.indexOf(c) != -1) { // word has a broken letter
                ok = false;
                break;
            }
        }

        if (ok) count++;
    }

    return count;
}


}