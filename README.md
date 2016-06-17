# ConexionMySQL

Conexión a MySQL mediante el "Singleton Pattern" o "Patrón de instancia única"

#Descripción
El objetivo de este patrón es asegurar que sólo exista una única instancia de una clase o variable y que esta sea accesible desde cualquier parte de nuestro proyecto.

#Capturas
![Código de Conexión](/Capturas/Código Singleton.png)
![Formulario Principal](/Capturas/Formulario Principal.png)

#Caracteristicas
- Controlar el acceso a la instancia.
- Reducir el espacio de nombres ya que evitamos variables globales.
- Permite refinar operaciones y la representación a través de la creación de subclases.
- Permite controlar fácilmente el número de instancias que creamos. 

#Como usar
Creamos la instancia de la clase donde queremos hacer uso de ella:
```ConexionMySQL conexionMySQL = new ConexionMySQL();```

Enseguida hacemos llamamos al método `getConnection()`:
```conexionMySQL.getConnection();```
