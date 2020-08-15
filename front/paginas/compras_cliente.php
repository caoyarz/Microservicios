<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Compras por cliente</title>
  <link rel="stylesheet" href="css/estilo.css">
</head>
<body>
  <div class="contenido">
  <p>
  <h1>Listado de Compras por cliente</h1>
</p>
<table class="table">
  <thead class="thead-light">
    <tr>
     <th scope="col">Nombre</th>
     <th scope="col">Rut</th>
    <th scope="col">Producto</th>
    <th scope="col">Precio</th>
     <th scope="col">Fecha de compra</th>
    </tr>
  </thead>
  <tbody>
    <?php
$datos=json_decode(file_get_contents("http://localhost:8082/api/compra-persona/"),true);

for($i=0;$i<count($datos);$i++){
?>
<tr>
	<th><?php echo $datos[$i]["nombrePersona"];?></th>
	<th><?php echo $datos[$i]["rutPersona"];?></th>
	<th><?php echo $datos[$i]["nombreProducto"];?></th>
	<th><?php echo $datos[$i]["precioProducto"];?></th>
	<th><?php echo $datos[$i]["fechaCompra"];?></th>
</tr>
<?php
}
?>
  </tbody>
</table>
</div>
</body>
