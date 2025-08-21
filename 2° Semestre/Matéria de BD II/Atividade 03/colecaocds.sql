-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 22-Maio-2025 às 03:26
-- Versão do servidor: 10.4.27-MariaDB
-- versão do PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `colecaocds`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cds`
--

CREATE TABLE `cds` (
  `Codigo` int(11) NOT NULL,
  `Nome_cd` varchar(100) NOT NULL,
  `DataCompra` date DEFAULT NULL,
  `ValorPago` decimal(10,2) DEFAULT NULL,
  `LocalCompra` varchar(100) DEFAULT NULL,
  `Album` enum('Sim','Não') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Extraindo dados da tabela `cds`
--

INSERT INTO `cds` (`Codigo`, `Nome_cd`, `DataCompra`, `ValorPago`, `LocalCompra`, `Album`) VALUES
(1, 'Greatest Hits - Queen', '2023-01-10', '59.90', 'Amazon', 'Sim'),
(2, 'Thriller - Michael Jackson', '2023-03-15', '45.00', 'Submarino', 'Sim'),
(3, 'Hybrid Theory - Linkin Park', '2023-06-20', '35.50', 'Saraiva', 'Sim'),
(4, 'Acústico MTV - Legião Urbana', '2023-07-10', '25.00', 'Americanas', 'Sim'),
(5, 'Coleção Anos 80', '2023-08-01', '40.00', 'Mercado Livre', 'Não');

-- --------------------------------------------------------

--
-- Estrutura da tabela `musicas`
--

CREATE TABLE `musicas` (
  `Numero_musica` int(11) NOT NULL,
  `Nome_musica` varchar(100) NOT NULL,
  `Artista` varchar(100) DEFAULT NULL,
  `Tempo` time DEFAULT NULL,
  `CodigoCD` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Extraindo dados da tabela `musicas`
--

INSERT INTO `musicas` (`Numero_musica`, `Nome_musica`, `Artista`, `Tempo`, `CodigoCD`) VALUES
(1, 'Bohemian Rhapsody', 'Queen', '00:05:55', 1),
(2, 'Don’t Stop Me Now', 'Queen', '00:03:30', 1),
(3, 'We Will Rock You', 'Queen', '00:02:02', 1),
(4, 'Thriller', 'Michael Jackson', '00:05:57', 2),
(5, 'Beat It', 'Michael Jackson', '00:04:18', 2),
(6, 'Billie Jean', 'Michael Jackson', '00:04:54', 2),
(7, 'In the End', 'Linkin Park', '00:03:36', 3),
(8, 'Crawling', 'Linkin Park', '00:03:29', 3),
(9, 'One Step Closer', 'Linkin Park', '00:02:35', 3),
(10, 'Tempo Perdido', 'Legião Urbana', '00:04:20', 4),
(11, 'Pais e Filhos', 'Legião Urbana', '00:05:06', 4),
(12, 'Índios', 'Legião Urbana', '00:04:25', 4),
(13, 'Take on Me', 'a-ha', '00:03:46', 5),
(14, 'Sweet Dreams', 'Eurythmics', '00:04:50', 5),
(15, 'Every Breath You Take', 'The Police', '00:04:13', 5);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `cds`
--
ALTER TABLE `cds`
  ADD PRIMARY KEY (`Codigo`);

--
-- Índices para tabela `musicas`
--
ALTER TABLE `musicas`
  ADD PRIMARY KEY (`Numero_musica`),
  ADD KEY `CodigoCD` (`CodigoCD`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `cds`
--
ALTER TABLE `cds`
  MODIFY `Codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `musicas`
--
ALTER TABLE `musicas`
  MODIFY `Numero_musica` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `musicas`
--
ALTER TABLE `musicas`
  ADD CONSTRAINT `musicas_ibfk_1` FOREIGN KEY (`CodigoCD`) REFERENCES `cds` (`Codigo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
