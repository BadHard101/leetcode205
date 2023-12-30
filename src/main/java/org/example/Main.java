package org.example;

import java.util.HashMap;

public class Main {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Character> alphabet = new HashMap<>();

        Character sChar = s.charAt(0);
        Character tChar = t.charAt(0);
        alphabet.put(sChar, tChar);

        for (int i = 0; i < s.length(); i++) {
            sChar = s.charAt(i);
            tChar = t.charAt(i);

            if (!alphabet.containsKey(sChar) && !alphabet.containsValue(tChar))
                alphabet.put(sChar, tChar);

            else if (alphabet.get(sChar) != tChar)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}