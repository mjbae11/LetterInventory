// Stuart Reges
// CSE 143 

public class LetterInventory {

    private static final int LETTERS_IN_ALPHABET = 26;

    // private String elementData;  // string of characters
    // private int size;               // current number of characters in the string

    int [] letterCount = new int[LETTERS_IN_ALPHABET];
    int size;
    
    // pre: uses any combination of characters in string format.
    // post: constructs an array of 26, each index for its according letter
    // a-z. Each index counts how many of each letter show up in "data".
    public LetterInventory(String data) {
        data = data.replaceAll(" ", "");
        data = data.toLowerCase();
        data = data.replaceAll("[^a-z]+","");
        for (int i = 0; i < data.length(); i++) {
            char currLetter = data.charAt(i);
            letterCount[currLetter - 'a']++;
        }
        size = data.length();
    }

    // Post: returns the sum of letters in the inventory.
    public int size() {
        return size;
    }

    // Post: checks whether the inventory is empty.
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }   else {
            return false;
        }
    }

    // Pre: given letter must be a letter (throws IllegalArgumentException)
    // otherwise. 
    //
    // Post: returns the amount of the given letter found in inventory. 
    public int get(char letter) {
        if (!Character.isLetter(letter)) {
            throw new IllegalArgumentException(); 
        }
        letter = Character.toLowerCase(letter);      
        return letterCount[letter - 'a'];
    }

    // Post: returns a string combining the number of
    // each character in the inventory
    public String toString() {
        if (size == 0) {
            return "[]";
        }   else {
            String result = "[";
            int count = 0;
            for (int i = 0; i < letterCount.length; i ++) {
                count = letterCount[i];
                for (int j = 0; j < count; j++) {
                    char c = (char)(i + 97);
                    result += c;
                }
                
            }
            result += "]";
            return result;

        }
    }
    
    public void set(char letter, int value) {
        if (!Character.isLetter(letter) || value < 0) {
            throw new IllegalArgumentException(); 
        }   else {
            letter = Character.toLowerCase(letter); 
            if (value == 0) {
                size -= letterCount[letter - 'a'];
            } else {
                size += value;
            }
            letterCount[letter - 'a'] = value;
        }
    }

}