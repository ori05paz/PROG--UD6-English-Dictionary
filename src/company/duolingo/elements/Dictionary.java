package company.duolingo.elements;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Dictionary {

    Map<String, Set<String>> dictionary = new HashMap<>();

    public void addWord() {
        String newWordInput = JOptionPane.showInputDialog(null, "Introduce una nueva palabra", "Nueva Palabra", 0);
        String newWord = newWordInput.toLowerCase();

        if (!Pattern.matches("[a-z]+", newWord)) {
        JOptionPane.showMessageDialog(null, "La palabra debe contener solo letras de la A a la Z.");
        return;
        }

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
        String wordToDeleteInput = JOptionPane.showInputDialog(null, "Introduce la palabra que quieres eliminar:", "Eliminar Palabra", 0);
        String wordToDelete = wordToDeleteInput.toLowerCase();

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
        String wordToSearchInput = JOptionPane.showInputDialog(null, "Introduce la palabra que quieres buscar:", "Buscar Palabra", 0);
        String wordToSearch = wordToSearchInput.toLowerCase();

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

    public void availableInitials() {
        StringBuilder initialsList = new StringBuilder("Iniciales disponibles:\n");
        for (String initial : dictionary.keySet()) {
            initialsList.append(initial).append("\n");
        }
        JOptionPane.showMessageDialog(null, initialsList.toString());
    }

    public void wordByInitials() {
        String initialInput = JOptionPane.showInputDialog(null, "Introduce la inicial:", "Palabras por Inicial", JOptionPane.QUESTION_MESSAGE);
        String initial = initialInput.substring(0, 1).toLowerCase();

        if (dictionary.containsKey(initial)) {
            Set<String> words = dictionary.get(initial);
            StringBuilder wordsList = new StringBuilder("Palabras con inicial '" + initial + "':\n");
            for (String word : words) {
                wordsList.append(word).append("\n");
            }
            JOptionPane.showMessageDialog(null, wordsList.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No hay palabras con la inicial '" + initial + "'.");
        }
    }
}
