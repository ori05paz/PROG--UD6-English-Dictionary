# Explicación de Clases


## Menu

-------------------------------
**ºMétodo showMenu:**

_**1.** String menu =:_ Cadena llamada "menu" que contiene las opciones del menú principal; cada una de estas con lo que hace.
_**2.** String option = JOptionPane.showInputDialog:_ Cuadro de diálogo de entrada de texto utilizando JOptionPane.showInputDialog(), en el cual se muestra el menú, el usuario ingresa el número de lo que quiera del menú.
_**3.**return Integer.parseInt(option):_ Representa la selección del usuario, determinando la acción a realizar.

-------------------------------


## Dictionary

-------------------------------
**ºMap:**

_**1.** Map, Set:_ Declaración de variable "dictionary" tipo Map la cual "mapea" claves a valores; el tipo de clave es String y el tipo de set es "Set<String>". Esto hace a dictionary un mapa donde sus claves son cadena y su valores un conjuto de estas.
_**2.** new HashMap:_ HashMap almacena pares de tipo "clave-valor".

-------------------------------
**ºaddWord:**

_**1.**String newWordInput = JOptionPane.showInputDialog:_ muestra un cuadro de diálogo donde el usuario puede ingresar una nueva palabra, con un valor predeterminado de 0.
_**2.**String newWord = newWordInput.toLowerCase():_ Conversión a minúsculas de la palabra.
_**3.**String initial = newWord.substring(0, 1):_ Se guarda el primer carácter de la palabra ingresada por el usuario para saber su inicial y organizar las palabras en el diccionario.
_**4.**if (this.dictionary.containsKey(initial)):_ Verifica si el diccionario ya contiene una la inicial de la palabra ingresada por el usuario, si sí, se agrega la palabra al grpo de palabras, si no, se crea un nuevo grupo de palabras para la inicial.
_**5.**Set<String> wordSet = this.dictionary.get(initial):_ Si el diccionario ya contiene una entrada para la inicial de la palabra, se obtiene el conjunto de palabras asociado a esa inicial.
_**6.**if (wordSet.add(newWord)):_ Se agrega la palabra al grupo de palabras.
_**7.**this.dictionary.put(initial, wordSet):_ Se actualiza el diccionario.

-------------------------------
**ºdeleteWord:**

_**1.**String wordToDeleteInput = JOptionPane.showInputDialog:_ muestra un cuadro de diálogo donde el usuario puede ingresar la palabra a eliminar, con un valor predeterminado de 0.
_**2.**String wordToDelete = wordToDeleteInput.toLowerCase():_ Conversión a minúsculas de la palabra.
_**3.**String initial = wordToDelete.substring(0, 1).toLowerCase():_ Se guarda el primer carácter de la palabra ingresada por el usuario para saber su inicial y se convierte a minúsculas.
_**4.**if (this.dictionary.containsKey(initial)):_ Verifica si el diccionario ya contiene una la inicial de la palabra ingresada por el usuario, si sí, se elimina la palabra del grupo de palabras.
_**5.**Set<String> wordSet = this.dictionary.get(initial):_ Si el diccionario ya contiene una entrada para la inicial de la palabra, se obtiene el conjunto de palabras asociado a esa inicial.
_**6.**if (wordSet.remove(wordToDelete)):_ Se elimina la palabra al grupo de palabras.
_**7.**this.dictionary.put(initial, wordSet):_ Se actualiza el diccionario.

-------------------------------
**ºwordExist:**

_**1.**String wordToSearchInput = JOptionPane.showInputDialog:_ muestra un cuadro de diálogo donde el usuario puede ingresar la palabra que quiere buscar, con un valor predeterminado de 0.
_**2.**String wordToSearch = wordToSearchInput.toLowerCase():_ Conversión a minúsculas de la palabra.
_**3.**String initial = wordToSearch.substring(0, 1).toLowerCase():_ Se guarda el primer carácter de la palabra ingresada por el usuario para saber su inicial y se convierte a minúsculas.
_**4.**if (this.dictionary.containsKey(initial)):_ Verifica si el diccionario ya contiene una la inicial de la palabra ingresada por el usuario, si sí, se trata de saber si la palabra está en el grupo de palabras de la inicial.
_**5.**Set<String> wordSet = this.dictionary.get(initial):_ Si el diccionario ya contiene una entrada para la inicial de la palabra, se obtiene el conjunto de palabras asociado a esa inicial.
_**6.**if (wordSet.contains(wordToSearch)):_ Se muestra un mensaje si la palabra está o no en el diccionario.

-------------------------------
**ºavailableInitials:**

_**1.**StringBuilder initialsList = new StringBuilder:_ Creación de objeto StringBuilder para construir cadena.
_**2.**for (String initial : dictionary.keySet()):_ Se itera sobre la claves del diccionario ya que cada clave es una inicial.
_**3.**initialsList.append(initial).append:_ Se agrega cada clave a "initialsList".
_**4.**JOptionPane.showMessageDialog(null, initialsList.toString()):_ Se muestra un cuadro de diálogo con todas las iniciales.

-------------------------------
**ºwordByInitials:**

_**1.**String initialInput = JOptionPane.showInputDialog:_ Cuadro de diálogo donde el usuario puede ingresar la inicial de las palabras que desea buscar.
_**2.**String initial = initialInput.substring(0, 1).toLowerCase():_ Se guarda la inicial y se convierte a minúsculas.
_**3.**if (dictionary.containsKey(initial)):_ Verifica si el diccionario ya contiene una la inicial de la palabra ingresada por el usuario, si sí, se obtiene las palabras con esa inicial.
_**4.**Set<String> words = dictionary.get(initial):_ Se obtiene el conjunto de palabras asociado a la inicial de la palabra ingresada por el usuario.
_**5.**for (String word : words):_ Se itera sobre cada palabra.
_**6.**wordsList.append(word).append("\n"):_ Todas las palbras se agregan a "wordsList" para que se construya la lista de palabras.
_**7.** JOptionPane.showMessageDialog:_ Se muestra un cuadro de diálogo con todas las palabras de la incial.

-------------------------------


## App

-------------------------------
**ºMétodo main:**

_**1.**int option = 0:_ Inicialización de la variable option con un valor de 0 utilizada para almacenar la opción seleccionada por el usuario.
_**2.** Dictionary dictionary = new Dictionary():_ Creación de una instancia  que se utiliza para realizar operaciones en el diccionario.
_**3.**do while (option != 6):_ Bucle do while que se ejecutará mientras el usuario no seleccione 6.
_**4.**try catch:_ Bloque para manejar excepciones.
_**5.**switch (option):_ Estructura switch para realizar alguna de las acciones especificadas según lo que escoja el usuario.