import javax.swing.JOptionPane;

import company.duolingo.elements.Dictionary;
import company.duolingo.util.Menu;

public class App {
    public static void main(String[] args) {
        int option;
        Dictionary dictionary = new Dictionary();
        do {
            option = Menu.showMenu();
            try {
                switch (option) {
                    case 1:
                        dictionary.addWord();
                        break;
                    case 2:
                        dictionary.deleteWord();
                        break;
                    case 3:
                        dictionary.wordExist();
                        break;
                    case 4:
                        dictionary.availableInitials();
                        break;
                    case 5:
                        dictionary.wordByInitials();
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;    
                
                    default:
                        System.out.println("Opción inválida. Elige una opción válida");
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingresa un número entero válido");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Error: Valor nulo.");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Error: Argumento ilegal");
            } catch (IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Error: Índice fuera de límites");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
            }
        } while (option != 6);
    }
}
