import java.util.HashMap;
class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
                continue;
            }
            map.put(ch, 1);
        }
        for (int i = 0; i<t.length(); i++){
            char ch = t.charAt(i);
            if (map.containsKey(ch) && map.get(ch) > 0){
                map.put(ch, map.get(ch)-1);
            }
            else{
                return ch;
            }
        }
        return ' ';
    }
}