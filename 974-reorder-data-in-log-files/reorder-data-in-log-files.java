class Solution {
    public String[] reorderLogFiles(String[] arr) {
        // Arrays.sort(logs);
        // return logs;
        List<String> st = new ArrayList<>();
List<String> st2 = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            String s=arr[i];
            int x=s.length()-1;
            String[] parts = s.split(" ", 2);
String content = parts[1];
boolean isNumeric = Character.isDigit(content.charAt(0));

            if(isNumeric){
                st.add(s);

            }else{
                st2.add(s);
            }


        }
        String arr1[] = st2.toArray(new String[0]);
Arrays.sort(arr1, (a, b) -> {
    String[] splitA = a.split(" ", 2);
    String[] splitB = b.split(" ", 2);
    int cmp = splitA[1].compareTo(splitB[1]);
    if (cmp == 0) return splitA[0].compareTo(splitB[0]);
    return cmp;
});

String arr2[] = st.toArray(new String[0]); // no sorting

        for(int x=0;x<arr1.length;x++){
            arr[x]=arr1[x];
        }
        int xi=0;
        for(int x=arr1.length; x<arr.length;x++){
            arr[x]=arr2[xi];
            xi++;
        }
        return arr;

    }
}