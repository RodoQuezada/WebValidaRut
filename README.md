Dado el siguiente algoritmo para calcular el digito verificador, se debe crear un servlet que calcule el digito verificador y muestre en el mismo formulario si el rut ingresado es válido o inválido.
Escriba un programa que lea el rut sin el digito verificador y sin puntos. Calcule el digito verificador.
Para saber su digito verificador, haga lo siguiente:
a. Tome los números de su rut (sin contar el digito verificador, obvio) Ejemplo:
13193029-X
b. Delos vuelta 92039131
c. Tome los números y vaya multiplicando cada uno de ellos por la siguiente serie de números: 2,3,4,5,6,7, en ese orden. Si se acaban los números de la serie , vuelva a usarlo desde el principio
9*2 = 18 2*3=6 0*4=0
d. e.
f. g.
3*5=15
9*6=54
1*7=7
3*2=6
1*3=3
Una vez que haya multiplicado cada uno de los números, sume los resultados obtenidos 18+6+0+15+54+7+6+3 = 109.
Divida el numero obtenido por 11 y obtenga el resto 109 / 11 = 9
resto = 10
al numero 11, réstele el resto de la división anterior. 11-10 = 1
Ahora hay que analizar el número obtenido, hay tres posibilidades.
- Si el número obtenido es: 1,2,3,4,5,6,7,8 o 9, ése es el
digito verificador
- Si el número obtenido es: 11, el digito verificador es 0.
- Si el número obtenido es: 10 , el digito verificador es
K
En el ejemplo nos resulto el numero 1 , por lo tanto el digito verificador es 1.
