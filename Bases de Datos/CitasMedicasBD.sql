-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-10-2020 a las 01:54:44
-- Versión del servidor: 10.3.15-MariaDB
-- Versión de PHP: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `gestion_citas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citas`
--

CREATE TABLE `citas` (
  `CitNumero` int(11) NOT NULL,
  `CitFecha` date NOT NULL,
  `CitHora` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `CitPaciente` int(11) NOT NULL,
  `CitMedico` int(11) NOT NULL,
  `CitConsultorio` int(11) NOT NULL,
  `CitEstado` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `CitObservaciones` varchar(45) COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `citas`
--

INSERT INTO `citas` (`CitNumero`, `CitFecha`, `CitHora`, `CitPaciente`, `CitMedico`, `CitConsultorio`, `CitEstado`, `CitObservaciones`) VALUES
(1, '2020-10-19', '10:00', 1001098120, 1401896122, 22, 'pendiente', 'nn'),
(2, '2020-10-22', '12:00', 1227145200, 1401896122, 22, 'pendiente', 'nn'),
(3, '2020-10-24', '12:00', 1001098120, 1876987456, 22, 'pendiente', 'nn');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consultorios`
--

CREATE TABLE `consultorios` (
  `ConNumero` int(11) NOT NULL,
  `ConNombre` varchar(45) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `consultorios`
--

INSERT INTO `consultorios` (`ConNumero`, `ConNombre`) VALUES
(22, 'medicina');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicos`
--

CREATE TABLE `medicos` (
  `MedIdentificacion` int(11) NOT NULL,
  `MedNombre` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `MedApellido` varchar(45) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `medicos`
--

INSERT INTO `medicos` (`MedIdentificacion`, `MedNombre`, `MedApellido`) VALUES
(1401896122, 'Juan', 'torrez'),
(1876987456, 'Andres', 'Brochero');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes`
--

CREATE TABLE `pacientes` (
  `PacIdentificacion` int(11) NOT NULL,
  `PacNombre` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `PacApellido` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `PacFechaNacimiento` date NOT NULL,
  `PacSexo` varchar(10) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `pacientes`
--

INSERT INTO `pacientes` (`PacIdentificacion`, `PacNombre`, `PacApellido`, `PacFechaNacimiento`, `PacSexo`) VALUES
(1001098120, 'Diego', 'Puentes', '2020-10-17', 'hombre'),
(1227145200, 'Juan', 'Gutierrez', '2020-10-15', 'hombre');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tratamientos`
--

CREATE TABLE `tratamientos` (
  `TraNumero` int(11) NOT NULL,
  `TraFechaAsignado` date NOT NULL,
  `TraDescripcion` varchar(45) COLLATE utf8_spanish_ci DEFAULT NULL,
  `TraFechaInicio` date NOT NULL,
  `TraFechaFin` date NOT NULL,
  `TraObservaciones` varchar(45) COLLATE utf8_spanish_ci DEFAULT NULL,
  `TraPaciente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `tratamientos`
--

INSERT INTO `tratamientos` (`TraNumero`, `TraFechaAsignado`, `TraDescripcion`, `TraFechaInicio`, `TraFechaFin`, `TraObservaciones`, `TraPaciente`) VALUES
(1, '2020-10-19', 'examen anual', '2020-10-12', '2020-12-03', 'nn', 1001098120);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `citas`
--
ALTER TABLE `citas`
  ADD PRIMARY KEY (`CitNumero`),
  ADD KEY `CitPaciente` (`CitPaciente`),
  ADD KEY `CitMedico` (`CitMedico`),
  ADD KEY `CitConsultorio` (`CitConsultorio`);

--
-- Indices de la tabla `consultorios`
--
ALTER TABLE `consultorios`
  ADD PRIMARY KEY (`ConNumero`);

--
-- Indices de la tabla `medicos`
--
ALTER TABLE `medicos`
  ADD PRIMARY KEY (`MedIdentificacion`);

--
-- Indices de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  ADD PRIMARY KEY (`PacIdentificacion`);

--
-- Indices de la tabla `tratamientos`
--
ALTER TABLE `tratamientos`
  ADD PRIMARY KEY (`TraNumero`),
  ADD KEY `TraPaciente` (`TraPaciente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `citas`
--
ALTER TABLE `citas`
  MODIFY `CitNumero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citas`
--
ALTER TABLE `citas`
  ADD CONSTRAINT `CitConsultorio` FOREIGN KEY (`CitConsultorio`) REFERENCES `consultorios` (`ConNumero`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `CitMedico` FOREIGN KEY (`CitMedico`) REFERENCES `medicos` (`MedIdentificacion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `CitPaciente` FOREIGN KEY (`CitPaciente`) REFERENCES `pacientes` (`PacIdentificacion`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tratamientos`
--
ALTER TABLE `tratamientos`
  ADD CONSTRAINT `TraPaciente` FOREIGN KEY (`TraPaciente`) REFERENCES `pacientes` (`PacIdentificacion`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;