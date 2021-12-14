show databases;
use tienda;
show tables;
select nombre from producto;
select nombre, precio from producto;
select * from producto;
SELECT nombre, precio AS "precio euros", (SELECT precio * 1.13) AS "precio dolares" FROM producto;
SELECT nombre AS 'nombre de producto', precio AS euros, (SELECT precio * 1.13) AS dolares FROM producto;
SELECT UPPER(nombre), precio FROM producto;
-- 7. nombre y precio de la tabla productos, convertir el nombre a miniscula.
SELECT LOWER(nombre), precio FROM producto;
-- 8. Llista el nom de tots els fabricants en una columna, i en una altra columna obtingui en majúscules els dos primers caràcters del nom del fabricant.
SELECT nombre, left(UPPER(nombre), 2) AS inicial FROM fabricante;
-- 9. Llista els noms i els preus de tots els productos de la taula producto, arrodonint el valor del preu.
SELECT nombre, ROUND(precio) precio FROM producto;
-- 10. Llista els noms i els preus de tots els productos de la taula producto, truncant el valor del preu per a mostrar-lo sense cap xifra decimal.
SELECT nombre, truncate(precio, 0) FROM producto;
-- 11. Llista el codi dels fabricants que tenen productos en la taula producto.
SELECT codigo FROM fabricante WHERE codigo IN (SELECT codigo_fabricante FROM producto);
-- 12. Llista el codi dels fabricants que tenen productos en la taula producto, eliminant els codis que apareixen repetits.
SELECT codigo FROM fabricante WHERE codigo IN (SELECT codigo_fabricante FROM producto 
											   GROUP BY codigo_fabricante
											   HAVING count(codigo_fabricante) = 1);
-- 13. Llista els noms dels fabricants ordenats de manera ascendent.
SELECT nombre FROM fabricante ORDER BY nombre ASC;
