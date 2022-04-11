# retoSWAG
Reto Choucair
Reto SWAGLABS
Errores
Error 01
Rol: standard_user
Título: La opción “Reset App State” no restablece correctamente los botones “ADD TO CART” a “REMOVE”
Descripción: Al tener en el carrito de compras elementos seleccionados, al usar la opción “Reset App State” dentro del botón menú, la página principal no se actualiza y los elementos agregado en el carro permanece en REMOVE.
Evidencia:
Página Principal con elementos agregados:
 
Botón Menú:
 
Restablecimiento de los botones de los objetos agregados:
 
Error 02
Rol: standard_user
Título: 
Se permite realizar un compra sin tener seleccionado ningún elemento en el carrito de compras
Descripción: 
Se puede realizar el proceso de compras sin tener en el carrito algún producto.
Evidencia:
Vista de la página de compras
 
Página de inserción de datos  para la compra:
 
Página de consolidado y total a pagar:
 
Página de pago exitoso:
 

Error 03
Rol: problem_user
Título: La opción “ABOUT” dentro del menú, conduce a una página con error 404
Descripción: Al seleccionar la opción de ABOUT dentro del menú, conduce a una página  con error 404
Evidencia:  

Error 04
Rol: problem_user
Título: Las fotografías usadas para cada elemento de la tienda es la misma.
Descripción: Los ítems dentro de la página principal usan la misma imagen de miniatura.
Evidencia: Página principal
 

Error 05
Rol: problem_user
Título: Filtro no funcionales 
Descripción: Al seleccionar los filtros para organizar los ítems de la página principal, no afecta el orden en el cual se disponen en la vista.
Evidencia:

Error 06
Rol: problem_user
Título: No es posible realizar una compra
Descripción: al proceder la ejecución de la compra de cualquier elemento, en la página de CHECKOUT: YOUR INFORMATION no es posible completar el texto obligatorio (“Last Name”) y por tanto no es posible proseguir.
 
Error 07
Rol: problem_user
Título: No es posible agregar todos los productos 
Descripción: En la página principal, los botones ADD TO CART de los 4  de los 6 ítems dentro de esta no funcionan.
Evidencia:
 
Casos de Prueba
Identificador: CH_01
Nombre: Comprar tres elementos  en SWAGLABS
Pasos:
1.	Ingresar a la página SWAGLABS.
2.	Ingresar credenciales validos <Usuario> y <Contraseña>
3.	Agregar <elemento> al carrito de compras usando el botón ADD TO CARD.
4.	Dirigirse al carrito de compras por medio del botón.
5.	Rellenar la información para completar la compra.
6.	Verificar los datos de la compra.
7.	Finalizar la compra.
Resultado esperado: Se debe mostrar la página CHECKOUT: COMPLETE! que aprueba la compra.
Identificador: CH_02
Nombre: Comprar tres elementos  en SWAGLABS y eliminar uno en la página de carrito de compras
Pasos:
1.	Ingresar a la página SWAGLABS.
2.	Ingresar credenciales validos <Usuario> y <Contraseña>
3.	Agregar <elemento> al carrito de compras usando el botón ADD TO CARD.
4.	Dirigirse al carrito de compras por medio del botón.
5.	Eliminar un elemento del carrito de compras.
6.	Rellenar la información para completar la compra.
7.	Verificar los datos de la compra.
8.	Finalizar la compra.
Resultado esperado: Se debe mostrar la página CHECKOUT: COMPLETE! que aprueba la compra.
Identificador: CH_03
Nombre: Comprar tres elementos  en SWAGLABS y eliminar uno en la página principal
Pasos:
1.	Ingresar a la página SWAGLABS.
2.	Ingresar credenciales validos <Usuario> y <Contraseña>
3.	Agregar <elemento> al carrito de compras usando el botón ADD TO CARD.
4.	Eliminar un elemento del carrito de compras desde la página principal.
5.	Dirigirse al carrito de compras por medio del botón.
6.	Rellenar la información para completar la compra.
7.	Verificar los datos de la compra.
8.	Finalizar la compra.
Resultado esperado: Se debe mostrar la página CHECKOUT: COMPLETE! que aprueba la compra.

Identificador: CH_04
Nombre: Compra con el carrito vacío
Pasos:
1.	Ingresar a la página SWAGLABS.
2.	Ingresar credenciales validos <Usuario> y <Contraseña>
3.	Dirigirse al carrito de compras por medio del botón.
4.	Rellenar la información para completar la compra.
5.	Verificar los datos de la compra.
6.	Finalizar la compra.
Resultado esperado: Se debe mostrar la página CHECKOUT: COMPLETE! que desaprueba la compra.
Identificador: CH_05
Nombre: revisión de la página de Swaglabs
Pasos:
1.	Ingresar a la página SWAGLABS.
2.	Ingresar credenciales validos <Usuario> y <Contraseña>
3.	Dirigirse al botón Menú.
4.	Acceder a la opción ABOUT
Resultado esperado: Se debe mostrar la página indicada.
Identificador: CH_06
Nombre: revisión de la página de Swaglabs
Pasos:
1.	Ingresar a la página SWAGLABS.
2.	Ingresar credenciales validos <Usuario> y <Contraseña>
3.	Dirigirse al botón Menú.
4.	Acceder a la opción LOGOUT
Resultado esperado: Se debe mostrar la página de login.

