package org.example.classes;

public class OwnString {

    private char[] characters;

    public OwnString(char[] characters) {
        this.characters = characters.clone();
    }

    public char[] toCharArray() {
        return characters.clone();
    }

    public String replace(char oldChar, char newChar) {
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == oldChar) {
                characters[i] = newChar;
            }
        }
        return new String(characters);
    }

}
