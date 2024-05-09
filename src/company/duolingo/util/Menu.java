package company.duolingo.util;

import javax.swing.JOptionPane;

public class Menu{

    public static int showMenu() {
        String menu = "Menú Principal\n\n"
                    + "1. Añadir palabra\n"
                    + "2. Eliminar palabra\n"
                    + "3. Existe palabra\n"
                    + "4. Mostrar iniciales disponibles\n"
                    + "5. Ver palabras por inicial\n"
                    + "6. Cerrar programa";
        String option = JOptionPane.showInputDialog(null, menu + "\n\nSelecciona una opción:");
        return Integer.parseInt(option);
    }
}