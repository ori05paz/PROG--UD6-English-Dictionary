package company.duolingo.elements;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

public class Dictionary {

    Map<String, Set<String>> dictionary = new HashMap<>();

    public void addWord() {
    String newWord = JOptionPane.showInputDialog(null, "Introduce una nueva palabra", "Nueva Palabra", 0);
    
    String initial = newWord.substring(0, 1);

    if (this.dictionary.containsKey(initial)) {
        Set<String> wordSet = this.dictionary.get(initial);
        if (wordSet.add(newWord)) {
            JOptionPane.showMessageDialog(null, "Palabra añadida correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "La palabra ya está en el diccionario.");
        }
        this.dictionary.put(initial, wordSet);
    } else {
        Set<String> newSet = new HashSet<>();
        newSet.add(newWord);
        this.dictionary.put(initial, newSet);
        JOptionPane.showMessageDialog(null, "Palabra añadida correctamente.");
    }
}
    
}
