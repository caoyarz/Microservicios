<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
<h3>Direcciones</h3>
<table border=1>
 <tr>
    <th scope="col">Nombre</th>
    <th scope="col">Rut</th>
    <th scope="col">Direccion</th>
    <th scope="col">Comuna</th>
    <th scope="col">Provincia</th>
    <th scope="col">Region</th>
  </tr>

<?php
$datos=json_decode(file_get_contents("http://localhost:8081/api/persona-geo"),true);
print_r ($datos);

for($i=0;$i<count($datos);$i++){
?>
<tr>
	<th><?php echo $datos[$i]["nombrePersona"];?></th>
	<th><?php echo $datos[$i]["rut"];?></th>
	<th><?php echo $datos[$i]["nombreDireccion"];?></th>
	<th><?php echo $datos[$i]["nombreComuna"];?></th>
	<th><?php echo $datos[$i]["nombreProvincia"];?></th>
	<th><?php echo $datos[$i]["nombreRegion"];?></th>
</tr>
<?php
}
?>
</table>

<h3>Admin y activos</h3>
<table border=1>
 <tr>
    <th scope="col">Nombre</th>
    <th scope="col">Nombre Usuario</th>
    <th scope="col">Tipo</th>
  </tr>

<?php
$datos_admin=json_decode(file_get_contents("http://localhost:8081/api/usuarios-admin-activos"),true);
print_r ($datos_admin);

for($i=0;$i<count($datos_admin);$i++){
?>
<tr>
	<th><?php echo $datos_admin[$i]["nombrePersona"];?></th>
	<th><?php echo $datos_admin[$i]["nombreUsuario"];?></th>
	<th><?php echo $datos_admin[$i]["nombbreTipoUsuario"];?></th>
</tr>
<?php
}
?>
</table>

<h3>Productos</h3>
<table border=1>
 <tr>
    <th scope="col">Nombre</th>
     <th scope="col">Rut</th>
    <th scope="col">Producto</th>
    <th scope="col">Precio</th>
   
    <th scope="col">Fecha de compra</th>
  </tr>

<?php
$datos_p=json_decode(file_get_contents("http://localhost:8082/api/compra-persona/"),true);
print_r ($datos_p);

for($i=0;$i<count($datos_p);$i++){
?>
<tr>
	<th><?php echo $datos_p[$i]["nombrePersona"];?></th>
	<th><?php echo $datos_p[$i]["rutPersona"];?></th>
	<th><?php echo $datos_p[$i]["nombreProducto"];?></th>
	<th><?php echo $datos_p[$i]["precioProducto"];?></th>
	<th><?php echo $datos_p[$i]["fechaCompra"];?></th>
</tr>
<?php
}
?>
</table>
</body>
</html>