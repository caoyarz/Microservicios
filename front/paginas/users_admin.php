<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Usuarios Admin</title>
  <link rel="stylesheet" href="css/estilo.css">
</head>
<body>
  <div class="contenido">
  <p>
  <h1>Usuarios Admin</h1>
</p>
<table class="table">
  <thead class="thead-light">
    <tr>
    <th scope="col">Nombre</th>
    <th scope="col">Nombre Usuario</th>
    <th scope="col">Tipo</th>
    </tr>
  </thead>
  <tbody>
    <?php
$datos=json_decode(file_get_contents("http://localhost:8081/api/usuarios-admin-activos"),true);

for($i=0;$i<count($datos);$i++){
?>
<tr>
	<th><?php echo $datos[$i]["nombrePersona"];?></th>
	<th><?php echo $datos[$i]["nombreUsuario"];?></th>
	<th><?php echo $datos[$i]["nombbreTipoUsuario"];?></th>
</tr>
<?php
}
?>
  </tbody>
</table>
</div>
</body>