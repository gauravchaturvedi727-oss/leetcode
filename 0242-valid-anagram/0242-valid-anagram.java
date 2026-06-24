class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(char num : s.toCharArray()){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(char num : t.toCharArray()){
            map2.put(num, map2.getOrDefault(num, 0)+1);
        }
        if(map.equals(map2)){
            return true;
        }
        return false;
    }
}