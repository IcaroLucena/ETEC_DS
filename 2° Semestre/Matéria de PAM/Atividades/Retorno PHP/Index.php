<?php
  // Executado pelo servidor - o navegador só vê o resultado (HTML gerado)
  $titulo = "Demonstrando PHP servindo HTML, CSS e JS";
  $mensagem = "Esse parágrafo foi gerado dinamicamente via PHP.";
?>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
  <meta charset="UTF-8">
  <title><?= $titulo ?></title>
  <link rel="stylesheet" href="Styles.css">
</head>
<body>
  <h1><?= $titulo ?></h1>
  <p><?= $mensagem ?></p>

  <button id="botao">Clique aqui</button>

  <script src="Scripts.js"></script>
</body>
</html>
