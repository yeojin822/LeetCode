class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap();
        Map<Character, Integer> ransomMap = new HashMap();
    
        for(char ch : magazine.toCharArray()){
            magazineMap.put(ch, magazineMap.getOrDefault(ch, 0) + 1);
        }
       
        for(char ch : ransomNote.toCharArray()){
            ransomMap.put(ch, ransomMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : ransomMap.entrySet()) {
            if(!magazineMap.containsKey(entry.getKey())){
                return false;
            }

            char targetKey = entry.getKey();
            int countOrigin = magazineMap.getOrDefault(targetKey, 0);
            int countNeeded = entry.getValue();
            
            if(countOrigin < countNeeded){
                return false;
            }
        }

        return true;
    }
}