import java.util.ArrayList;
import java.util.List;

class Solution {
    public long distinctNames(String[] ideas) {
        List<String> names = new ArrayList<>();
        List<String> ideasList = new ArrayList<>();
        for(int i = 0; i < ideas.length; i++) {
            ideasList.add(ideas[i]);
        }
        for(int i = 0; i < ideas.length; i++) {
            for(int j = 0; j < ideas.length; j++) {
                if(i != j) {
                    String[] swapped = swap(ideas[i], ideas[j]);
                    System.out.println(swapped);
                    if(!names.contains(swapped[0] + " " + swapped[1]) && !ideasList.contains(swapped[0]) && !ideasList.contains(swapped[1])) {
                        names.add(swapped[0] + " " + swapped[1]);
                    }
                }
            }
        }
        return names.size();
    }

    private String[] swap(String iA, String iB) {
        char[] s1 = iA.toCharArray();
        char[] s2 = iB.toCharArray();
        char c = s1[0];
        s1[0] = s2[0]; 
        s2[0] = c;
        String[] strings = new String[2];
        strings[0] = new String(s1);
        strings[1] = new String(s2);
        return strings;
    }
}