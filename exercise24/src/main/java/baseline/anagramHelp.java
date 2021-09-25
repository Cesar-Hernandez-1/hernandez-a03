package baseline;

import java.util.HashMap;

public class anagramHelp {
    //public function "isAnagram" returns true if
    //words entered are an anagram and false if not
    public boolean isAnagram(String word1, String word2){
        //hashmap to count each character and number it appears in word
        HashMap<Character, Integer> letterCounter = new HashMap<>();

        //traverse through the first entered word and count number of unique characters in it
        for (int i = 0; i < word1.toCharArray().length; i++){
            if(!letterCounter.containsKey(word1.toCharArray()[i])){
                letterCounter.put(word1.toCharArray()[i], 1);
            }else{
                letterCounter.replace(word1.toCharArray()[i], letterCounter.get(word1.toCharArray()[i])+1);
            }
        }

        //traverse through the second entered word and count number of unique characters in it
        //If a character previously counted is seen, decrement it.
        //If number of characters goes to 0, remove character from hashmap.
        for (int i = 0; i < word2.toCharArray().length; i++){
            if(!letterCounter.containsKey(word2.toCharArray()[i])){
                letterCounter.put(word2.toCharArray()[i], 1);
            }else{
                letterCounter.replace(word2.toCharArray()[i], letterCounter.get(word2.toCharArray()[i])-1);
                if(letterCounter.get(word2.toCharArray()[i]) == 0){
                    letterCounter.remove(word2.toCharArray()[i]);
                }
            }
        }

        //if hashmap is empty, the words are an anagram and return true. Vice versa is it is not.
        return letterCounter.isEmpty();
    }
}
