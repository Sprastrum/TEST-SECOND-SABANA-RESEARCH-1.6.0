# POOB-TEST-SECOND-SABANA-RESEARCH


## I. (30%) IMPLEMENTANDO


## I. (25%) DISEÑANDO


## I. (25%) EXTENDIENDO


## I. (20%) CONCEPTOS

1. ¿Cuáles son las acciones los tres momentos importantes de las excepciones? ¿Cuál es el objetivo de cada una? 
¿Cómo se implementa en Java cada acción?.
   
Los tres momentos de las excepciones son: 
* Lanzar: Este momento es cuando se inicia una excepción en un método, sirve para mandar la excepción a todos los 
  sistemas que utilicen el método de la excepción. Para su implementación es la palabra reservada `throws`
* Propagar: Este momento es cuando se manda la excepción a los demás sistemas que utilicen el método con la excepción,
  este sirve para llevar el seguimiento de la excepción, para implementarlo se usa la palabra reservada `throw`
* Controlar: Este momento es cuando se quiere hacer alguna acción diferente al salir la excepción, sirve cuando 
se quiere retornar un valor si hay una excepción. La palabra reservada para implementarlo es `try-catch`
2. ¿Qué es sobre-escritura de métodos? ¿Por qué aplicarla? ¿Cómo impedir que se sobre-escriba un método?.

La sobre-escritura de métodos es cuando hay una relación de herencia y el hijo quiere cambiar el funcionamiento de un
método del padre. Se aplica para encapsular funcionamientos unicos para cada clase hija. Para impedir que una clase
sobre-escriba el método se usa el `final`.

## I. (50%) BONO

Implemente pruebas unitarias el código necesario para que las mismas pases sobre el método `summarize()` de la clase
`Project`, asegurese de probar el `ISynthesizer` de tipo `ExecutiveSynthesizer` y `StudentSynthesizer`, para cada uno 
sus casos de éxito y excepciones.

SI REALIZO EL BONO ASEGÚRESE DE INDICARLO EN EL ARCHIVO SOLUTIONS.md.

## Condiciones

1. La entrega debe realizarse en un archivo llamado SOLUTION.md, no se revisará documentación en ningún otro lugar.
2. Puede encontrar los editables de los diagramas en este [enlace](https://unisabanaedu-my.sharepoint.com/:u:/g/personal/diegopt_unisabana_edu_co/ESYDrd-h2lFDjnEWv7D6qmIBMd89yuTTzS1Q7P4d68IUjQ?e=g9OcpW).
3. Puede acceder a todos los recursos que considere necesarios, excepto pedirle ayuda a un tercero.
4. El examen se calificará contra un conjunto de pruebas que no esta adjunto al parcial, sin embargo el mismo cuenta con un conjunto de pruebas modelo, piense en casos que pueden no estar cubiertos en el mismo.
5. Revise la clase [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html) de Java.
5. Revise la clase [Duration](https://docs.oracle.com/javase/8/docs/api/java/time/Duration.html) de Java.

## Entrega

Siga al pie de la letra estas indicaciones para la entrega de este punto. EL HACER CASO OMISO DE ESTAS INSTRUCCIONES 
PENALIZARÁ LA NOTA.

1. Configure su usuario de GIT

```bash
$ git config --global user.name "Juan Perez"
$ git config --global user.email juan.perez@unisabana.edu.co
```

2. Desde el directorio raíz (donde está este archivo README.md), haga commit de lo realizado. Mantenga su repositorio 
privado hasta después de la entrega del parcial, entonces hagalo publico.

```bash
$ git add .
$ git commit -m "entrega parcial - Juan Perez"
```

3. Desde este mismo directorio, comprima todo con: (no olvide el punto al final de la instrucción)

```bash
$ zip -r APELLIDO.NOMBRE.zip .
```

4. Abra el archivo ZIP creado, y rectifique que contenga lo desarrollado.

5. Suba el archivo antes creado (APELLIDO.NOMBRE.zip) en el espacio de Teams correspondiente.

6. IMPORTANTE!. Conserve una copia de la carpeta y del archivo .ZIP.

7. Haga commits recurrentes para verificar su progreso, UN PARCIAL SOLUCIONADO EN 1 SOLO COMMIT SE CONSIDERA COPIA.
 
