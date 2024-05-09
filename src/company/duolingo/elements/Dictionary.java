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

    public void deleteWord() {
        String wordToDelete = JOptionPane.showInputDialog(null, "Introduce la palabra que quieres eliminar:", "Eliminar Palabra", 0);
        String initial = wordToDelete.substring(0, 1).toLowerCase();

        if (dictionary.containsKey(initial)) {
            Set<String> wordSet = dictionary.get(initial);
            if (wordSet.remove(wordToDelete)) {
                JOptionPane.showMessageDialog(null, "Palabra eliminada correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La palabra no estaba en el diccionario.");
            }
            dictionary.put(initial, wordSet);
        } else {
            JOptionPane.showMessageDialog(null, "La palabra no estaba en el diccionario.");
        }
    }
    
    public void wordExist() {
        String wordToSearch = JOptionPane.showInputDialog(null, "Introduce la palabra que quieres buscar:", "Buscar Palabra", 0);
        String initial = wordToSearch.substring(0, 1).toLowerCase();

        if (dictionary.containsKey(initial)) {
            Set<String> wordSet = dictionary.get(initial);
            if (wordSet.contains(wordToSearch)) {
                JOptionPane.showMessageDialog(null, "La palabra está en el diccionario.");
            } else {
                JOptionPane.showMessageDialog(null, "La palabra no está en el diccionario.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La palabra no está en el diccionario.");
        }
    }
}
