INSTRUCCIONES DE EJECUCIÓN - AUTOMATIZACIÓN DEMOBLAZE

1. PRERREQUISITOS:
   - Tener Java JDK 11 o superior instalado
   - Tener Maven instalado
   - Conexión a internet

2. EJECUCIÓN PASO A PASO:

   a. Abrir la terminal o línea de comandos

   b. Navegar hasta la carpeta del proyecto:
      cd ruta/del/proyecto

   c. Ejecutar el siguiente comando:
      mvn clean verify

3. QUÉ HACE LA AUTOMATIZACIÓN:
   - Abre el navegador Chrome
   - Ingresa a https://www.demoblaze.com/index.html
   - Agrega 3 productos al carrito de compras
   - Completa el formulario de compra
   - Verifica que la compra sea exitosa
   - Cierra el navegador automáticamente

4. RESULTADOS:
   - Los reportes se generan en: target/site/serenity/index.html
   - Las capturas de pantalla se guardan automáticamente

5. TIEMPO ESTIMADO:
   - La ejecución completa toma aproximadamente 1-2 minutos

6. OBSERVACIONES:
   - No interferir con el navegador durante la ejecución
   - Mantener estable la conexión a internet