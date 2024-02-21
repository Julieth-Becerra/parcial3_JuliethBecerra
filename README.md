Julieth Viviana Becerra Valderrama 201920702
EL puerto usado es: 3001
Para acceder a la documentacion: http://localhost:3001/docs

API Endpoints
customersController
GET /customers: Obtiene todos los clientes.
POST /saveCustomer: Agrega un nuevo cliente.
DELETE /costumers/{id}: Elimina un cliente por su ID.
productController
GET /products: Obtiene todos los productos.
POST /saveProduct: Agrega un nuevo producto.
saleController
GET /sales/{saleId}/customer: Obtiene el cliente asociado a una venta.
GET /products/{productId}/stock: Valida la disponibilidad de stock para un producto.
GET /{saleId}/products: Obtiene los productos asociados a una venta.
POST /saveSale: Agrega una nueva venta.
Respuestas comunes
200 OK: Respuesta exitosa.
201 Created: Recurso creado exitosamente.
202 Accepted: La solicitud ha sido aceptada para procesamiento.
400 Bad Request: La solicitud no pudo ser entendida por el servidor debido a una sintaxis incorrecta o parámetros inválidos.
404 Not Found: Recurso no encontrado.
500 Internal Server Error: Error interno del servidor.
