-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-11-2021 a las 08:31:49
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `peluqueriacanina`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `perro`
--

CREATE TABLE `perro` (
  `NROCLIENTE` varchar(255) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `ALERGICO` tinyint(1) DEFAULT 0,
  `ATENCIONESPECIAL` tinyint(1) DEFAULT 0,
  `CELULAR` varchar(255) COLLATE utf8mb4_spanish2_ci DEFAULT NULL,
  `COLOR` varchar(255) COLLATE utf8mb4_spanish2_ci DEFAULT NULL,
  `NOMBREDUENO` varchar(255) COLLATE utf8mb4_spanish2_ci DEFAULT NULL,
  `NOMBREPERRO` varchar(255) COLLATE utf8mb4_spanish2_ci DEFAULT NULL,
  `OBSERVACIONES` varchar(255) COLLATE utf8mb4_spanish2_ci DEFAULT NULL,
  `RAZA` varchar(255) COLLATE utf8mb4_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

--
-- Volcado de datos para la tabla `perro`
--

INSERT INTO `perro` (`NROCLIENTE`, `ALERGICO`, `ATENCIONESPECIAL`, `CELULAR`, `COLOR`, `NOMBREDUENO`, `NOMBREPERRO`, `OBSERVACIONES`, `RAZA`) VALUES
('1', 0, 0, '2634540527', 'Blanco', 'Lautaro', 'Cuca', 'Perrita hermosa mia', 'Caniche'),
('2', 1, 1, '2634540527', 'Gris', 'Lautaro', 'Ciro', 'Perro de prueba, no tiene alergia ni precisa\natencion especial', 'Braco de Weimar');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `perro`
--
ALTER TABLE `perro`
  ADD PRIMARY KEY (`NROCLIENTE`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
