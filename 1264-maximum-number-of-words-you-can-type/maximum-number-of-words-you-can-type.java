class Solution {
    public int canBeTypedWords(String text, String b) {
    char arr[] = b.toCharArray();
    String words[] = text.split(" ");
    int count = 0;

    outer: for (String w : words) {
        for (int j = 0; j < arr.length; j++) {
            if (w.indexOf(arr[j]) != -1) { // if word contains broken letter
                continue outer;           // skip this word
            }
        }
        count++; 
    }
    return count;
}

}