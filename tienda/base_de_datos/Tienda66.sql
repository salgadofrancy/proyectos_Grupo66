SELECT c.nombres || " " || c.apellidos AS "Nombre cliente", c.identificacion
FROM Clientes c LEFT JOIN Ventas v ON v.idCliente = c.identificacion
WHERE v.codigoVenta  IS NULL;