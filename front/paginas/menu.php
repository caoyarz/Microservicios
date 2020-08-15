<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
   <link rel="stylesheet" href="css/menu.css">
</head>
<body>
  <header class="header">
    <nav>
  <ul class="menu">

<li class="<?php echo $pagina == 'inicio' ? 'active' : ''; ?>"><a href="?p=inicio">Inicio</a></li>
<li class="<?php echo $pagina == 'users_admin' ? 'active' : ''; ?>"><a href="?p=users_admin">Usuarios</a></li>
<li class="<?php echo $pagina == 'ver_direcciones' ? 'active' : ''; ?>"><a href="?p=ver_direcciones">Geo</a></li>
<li class="<?php echo $pagina == 'compras_cliente' ? 'active' : ''; ?>"><a href="?p=compras_cliente">Productos</a></li>

  </ul>
  </nav>
</header>
