class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> map = new HashMap<>();
         for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // If the character in s is already mapped but to a different character in t, return false
            if (map.containsKey(sChar)) {
                if (map.get(sChar) != tChar) {
                    return false;
                }
            } else { // If sChar is not mapped yet
                // If tChar is already mapped to a different character in s, return false
                if (map.containsValue(tChar)) {
                    return false;
                }
                // Map sChar to tChar
                map.put(sChar, tChar);
            }
        }

        return true;
    }
}