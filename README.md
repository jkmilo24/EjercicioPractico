#  Taller de nivelación PI a PII

#  Parte Teórica
#  1. ¿Cuáles son los tipos de datos primitivos en Java?

El lenguaje JAVA tiene como base una serie de tipos de datos primitivos, los cuales son:

byte
Representa un tipo de dato de 8 bits con signo. De tal manera que puede almacenar los valores numéricos de -128 a 127 (ambos inclusive).

short
Representa un tipo de dato de 16 bits con signo. De esta manera almacena valores numéricos de -32.768 a 32.767.

int
Es un tipo de dato de 32 bits con signo para almacenar valores numéricos. Cuyo valor mínimo es -231 y el valor máximo 231-1.

long
Es un tipo de dato de 64 bits con signo que almacena valores numéricos entre -263 a 263-1.

float
Es un tipo dato para almacenar números en coma flotante con precisión simple de 32 bits.

double
Es un tipo de dato para almacenar números en coma flotante con doble precisión de 64 bits.

boolean
Sirve para definir tipos de datos booleanos. Es decir, aquellos que tienen un valor de true o false. Ocupa 1 bit de información.

char
Es un tipo de datos que representa a un carácter Unicode sencillo de 16 bits.

#  2. ¿Cómo funcionan las estructuras de control de flujo como if, else, switch y bucles en Java?

If/Else/Else If

La declaración if se utiliza para ejecutar un bloque de código solo si se cumple una condición especificada. Si la condición es TRUE, el código dentro del bloque if se ejecuta; de lo contrario, se omite. La declaración else if se puede utilizar para especificar una nueva condición si la anterior fue FALSE.

Cuando se puede usar if; cuando se tiene única condición para verificar, también cuando se tiene múltiples condiciones que deben verificarse secuencialmente.

Switch

La proposición Switch es una sentencia de alternativa múltiple, pero únicamente con comparaciones de igualdad.

Un ejemplo es:

  switch (variable) { 
  case  constante-1 :  sentencias-1;
  case  constante-2 :  sentencias-2;
  default  proposición-d;
  
}

Bucles

FOR
El bucle for es ideal para iterar sobre una secuencia de valores. Se utiliza cuando se conoce de antemano cuantas veces se necesita dar.

Cuando usar for: Cuando se conoce el numero exacto de iteraciones, también para iterar sobre arrays y colecciones.

WHILE

El bucle while se utiliza para repetir un bloque de código mientras se cumple una condición. Se verifica la condición antes de cada iteración.

Cuando usar while: cuando no se conoce el numero exacto de iteraciones y se debe iterar hasta que se cumpla una condición.

DO-WHILE

El bucle do-while es similar al bluce while, pero este verifica la condición de cada iteración. Esto garantiza que el bloque de código se ejecuta al menos una vez.

Cuando usar do-while: Cuando se desea que el bloque de código se ejecuta al menos una vez, independientemente de si la condición es verdadera.

# 3. ¿Por qué es importante usar nombres significativos para variables y métodos?

Es importante usar nombres significativos para variables y métodos porque esto facilita la lectura, mantenimiento y actualización de código. También esto facilita mucho el tema de la colaboración entre desarrolladores y le eficiencia a la hora de reutilizar estilos sin duplicar código.

# 4. ¿Qué es la Programación Orientada a Objetos (POO)?

La programación orientada a objetos (POO) es un modelo de programación que organiza el código en torno a objetos, en lugar de funciones y lógica. Se basa en el concepto de crear un modelo del problema a resolver. 

La POO tiene como objetivo: 

•	Reducir los errores.

•	Promover la reutilización del código.

•	Construir aplicaciones robustas y escalables.

•	Abordar problemas complejos de software de una manera más eficiente y efectiva.

# 5. ¿Cuáles son los cuatro pilares de la Programación Orientada a Objetos?

Los cuatro pilares de la Programación Orientada a Objetos (POO) son: Abstracción, Encapsulamiento, Polimorfismo, Herencia.

# 6. ¿Qué es la herencia en POO y cómo se utiliza en Java?

La herencia en POO (programación orientada a objetos) es un mecanismo que permite que una clase herede las características de otra clase. En Java, la herencia es una característica que permite crear nuevas clases a partir de clases ya existentes.

•	La clase que se hereda se llama superclase y la clase que hereda se llama subclase.
 
•	La subclase hereda todas las variables y métodos definidos por la superclase. 

•	La subclase puede agregar sus propios elementos únicos.
 
•	La herencia permite reutilizar el código, simplificar el proceso de desarrollo y facilitar el mantenimiento del código.

# 7. ¿Qué son los modificadores de acceso y cuáles son los más comunes en Java?

Los modificadores de acceso en Java son palabras clave que controlan la visibilidad y el acceso a clases, métodos y variables. Permiten especificar qué otras clases o paquetes pueden acceder a esos elementos, protegiendo la encapsulación y ayudando a gestionar la seguridad y el diseño del software.

Los modificadores mas comunes en JAVA son:

•	Public.
•	Private.
•	Protected.
•	Default.

# 8. ¿Qué es una variable de entorno y por qué son importantes para Java o la programación en general?

Las variables de entorno son pares clave/valor que se usan para almacenar información que se necesita para ejecutar un programa. Son importantes para la programación porque permiten personalizar el comportamiento de las aplicaciones y acceder a información relevante. Es importante para Java por lo siguiente:

•	Permiten adaptar la aplicación a diferentes entornos sin necesidad de modificar el código fuente. 

•	Evitan codificar en el código claves API y direcciones de correo electrónico. 

•	Permiten cambiar el comportamiento de los programas, las aplicaciones y los servicios.
