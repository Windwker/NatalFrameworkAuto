#language: es

Característica: Opciones de columna

  Escenario: Verificar los elementos desplegados en el selector de columnas
    Dado que me encuentro en el website de tablas
    Cuando presiono el boton Columnas
    Entonces se despliega la seccion columnas mostrando las opciones
      | ID | Nombre | Apellido | Fecha | Importe | Porcentaje | Check | Teléfono |
    Y se muestran los botones
      | Restaurar | Todos | Ninguno |


  Escenario: Verificar el comportamiento del selector de columnas al seleccionar columnas individualmente
    Dado que me encuentro en el website de tablas
    Cuando presiono el boton Columnas
    Y selecciono las opciones "Nombre" y "Apellido" y "Porcentaje"
    Entonces la tabla es visualizada  unicamente con las columnas
      | Nombre | Apellido | Porcentaje |

  Escenario: Verificar el comportamiento del selector de columnas al seleccionar todas las columnas
    Dado que me encuentro en el website de tablas
    Cuando presiono el boton Columnas
    Y selecciono las opcion "Todos"
    Entonces la tabla es visualizada con todas las columnas


