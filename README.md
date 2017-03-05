# Patrón de diseño Modelo, vista, presentación para Android(Java)

Este es una derivación del patrón modelo, vista, controlador (MVC). Mediante esto se podrá dividir de manera óptima la lógica del proyecto de las interfaces de usuario, y así mantener un orden de programación, evitar que los activitys se llenen de miles de líneas de código, facilitar los testeos, entre otros.

La siguiente aplicación está conformado por interfaces, modelos, presentador, activitys y recursos.
- Interfaces: Establece las acciones que realizara la vista y el presentador.
- Modelos: Encargado de proveer datos.
- Presentador: El intermediario de comunicación entre la vista y el modelo. Implementara su respectiva interfaz para identificar las acciones que debe cumplir.
- Activitys: Encargados de escuchar las peticiones de la vista. Implementara su respectiva interfaz para identificar las acciones que debe cumplir.
-  Recursos: Involucra elementos que requiera la aplicación.

La aplicación añadirá el nombre de un respectivo Tema y este contendrá listas de subtemas que podrán ser añadidos después de mostrar un alertdialog, al completar el alertdialog imprimirá en pantalla el nombre del Tema, nombre del subtema agregado recientemente, y el número de subtemas total agregados.


