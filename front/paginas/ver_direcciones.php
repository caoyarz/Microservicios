<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Direcciones</title>
  <link rel="stylesheet" href="css/estilo.css">
</head>
<body>
  <div class="contenido">
    <p>
  <h1>Direcciones</h1>
</p>
<table class="table">
  <thead class="thead-light">
    <tr>
      <th scope="col">Nombre</th>
    <th scope="col">Rut</th>
    <th scope="col">Direccion</th>
    <th scope="col">Comuna</th>
    <th scope="col">Provincia</th>
    <th scope="col">Region</th>
    </tr>
  </thead>
  <tbody>
    <?php
$datos=json_decode(file_get_contents("http://localhost:8081/api/persona-geo"),true);

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
  </tbody>
</table>
</div>
</body>

