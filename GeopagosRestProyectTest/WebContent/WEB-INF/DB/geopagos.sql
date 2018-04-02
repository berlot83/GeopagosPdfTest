-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-04-2018 a las 17:07:59
-- Versión del servidor: 10.1.21-MariaDB
-- Versión de PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `geopagos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `geometric_figure`
--

CREATE TABLE `geometric_figure` (
  `id` int(11) NOT NULL,
  `height` double DEFAULT NULL,
  `width` double DEFAULT NULL,
  `surface` double DEFAULT NULL,
  `diameter` double DEFAULT NULL,
  `type` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `geometric_figure`
--

INSERT INTO `geometric_figure` (`id`, `height`, `width`, `surface`, `diameter`, `type`) VALUES
(6, 3, 3, 3, 3, 'Square'),
(7, 44, 4, 4, 4.99, 'Triangle'),
(8, 5.25, 6.25, 4.26, 8.66, 'Square');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `geometric_figure`
--
ALTER TABLE `geometric_figure`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `geometric_figure`
--
ALTER TABLE `geometric_figure`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
