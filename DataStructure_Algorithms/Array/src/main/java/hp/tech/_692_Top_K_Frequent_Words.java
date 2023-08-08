package hp.tech;
import jdk.jshell.execution.Util;

import java.util.*;

public class _692_Top_K_Frequent_Words {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] words = {"i","love","leetcode","i","love","coding"};
        s.topKFrequent(words, 2);
    }
    static class Solution {
        public Solution() {
        }

        public List<String> topKFrequent(String[] words, int k) {

            Map<String, Integer> mapWord = new HashMap<>();
            List<String> result = new ArrayList<>();
            for (String s: words) {
                int i = 1;
                if (mapWord.containsKey(s)) {
                    i = mapWord.get(s);
                    i++;
                }

                mapWord.put(s,i);
            }

            for (Map.Entry<String, Integer> entry : mapWord.entrySet()) {
                result.add(entry.getKey());
            }

            // sort

            Collections.sort(result, ((o1, o2) -> {
                if (mapWord.get(o1).equals(mapWord.get(o2))) {
                    return o1.compareTo(o2);
                }
                return mapWord.get(o2) - mapWord.get(o1);
            }));
//            for (String s: result) {
//                System.out.println(s);
//            }

            return result.subList(0, k);
        }
    }
}
