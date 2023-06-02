-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-08-2022 a las 09:52:18
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdventas`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `clientes` ()   SELECT * FROM cliente$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `cliente_agregar` (IN `id` VARCHAR(50), IN `cod` INT(10), IN `dire` VARCHAR(100), IN `email` VARCHAR(20), IN `nom_cli` VARCHAR(50), IN `ruc` VARCHAR(50), IN `telefono` VARCHAR(12))   INSERT INTO cliente SET cod_cli=cod, dir_cli=dire, email_cli=email, nom_cli=nom_cli, ruc_cli=ruc, tel_cli=telefono$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `cliente_cambiar` (IN `id` VARCHAR(50), IN `cod` INT(10), IN `dire` VARCHAR(100), IN `email` VARCHAR(20), IN `nom_cli` VARCHAR(50), IN `ruc` VARCHAR(50), IN `telefono` VARCHAR(12))   UPDATE cliente SET cod_cli=cod, dir_cli=dire, email_cli=email, nom_cli=nom_cli, ruc_cli=ruc, tel_cli=telefono WHERE cod_cli=id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Cliente_eliminar` (IN `id` VARCHAR(50))   DELETE  FROM cliente WHERE cod_cli=id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Cliente_mostrar` (IN `id` VARCHAR(50))   SELECT * FROM cliente WHERE cod_cli=id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `empleados` ()   SELECT * FROM usuario$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `empleados_mostrar` (IN `id` VARCHAR(50))   SELECT * FROM usuario WHERE cod_usuario=id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Inventario` ()   SELECT * FROM producto$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prodcuto_eliminar` (IN `id` VARCHAR(50))   DELETE FROM producto WHERE cod_pro=id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `productos` ()   SELECT * FROM producto$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Producto_agregar` (IN `cod` INT(10), IN `descripcion_pro` VARCHAR(100), IN `precio_pro` DECIMAL(10,2), IN `Stock_pro` INT(10), IN `categoria_pro` INT(10), IN `precio` DECIMAL(10,2), IN `unidad_pro` VARCHAR(20), IN `iva_pro` VARCHAR(10), IN `stockmin_pro` INT(10), IN `ubicacion_pro` VARCHAR(30))   INSERT INTO producto SET cod_pro=cod, descripcion=descripcion_pro, precio=precio_pro, Stock=Stock_pro, categoriaFK=categoria_pro, precio_compra=precio, unidad=unidad_pro, iva=iva_pro, stockmin=stockmin_pro, ubicacion=ubicacion_pro$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Producto_cambio` (IN `id` VARCHAR(50), IN `cod` INT(10), IN `descripcion_pro` VARCHAR(100), IN `precio_pro` DECIMAL(10,2), IN `Stock_pro` INT(10), IN `categoria_pro` INT(10), IN `precio` DECIMAL(10,2), IN `unidad_pro` VARCHAR(20), IN `iva_pro` VARCHAR(10), IN `stockmin_pro` INT(10), IN `ubicacion_pro` VARCHAR(30))   UPDATE producto SET cod_pro=cod, descripcion=descripcion_pro, precio=precio_pro, Stock=Stock_pro, categoriaFK=categoria_pro, precio_compra=precio, unidad=unidad_pro, iva=iva_pro, stockmin=stockmin_pro, ubicacion=ubicacion_pro WHERE cod_pro=id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Producto_talla` (IN `id` VARCHAR(50))   SELECT * FROM producto WHERE categoriaFK=id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Producto_Unico` (IN `id_pro` VARCHAR(50))   SELECT * FROM producto WHERE cod_pro=id_pro$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `proveedores_mostrar` (IN `id` VARCHAR(50))   SELECT * FROM proveedor WHERE cod_proveedor=id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `ventas` ()   SELECT * FROM ventas$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `arqueos`
--

CREATE TABLE `arqueos` (
  `cod_arq` int(10) NOT NULL,
  `monto_apert` double(10,2) NOT NULL,
  `monto_cont` double(10,2) NOT NULL,
  `monto_calc` double(10,2) NOT NULL,
  `diferencia` double(10,2) NOT NULL,
  `f_aper` date NOT NULL,
  `f_cierre` date DEFAULT NULL,
  `usuarioFK` int(10) NOT NULL,
  `estado` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `cod_cli` int(10) NOT NULL,
  `nom_cli` varchar(40) NOT NULL,
  `tel_cli` varchar(20) NOT NULL,
  `email_cli` varchar(50) NOT NULL,
  `dir_cli` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`cod_cli`, `nom_cli`, `tel_cli`, `email_cli`, `dir_cli`) VALUES
(1, 'CLIENTE GENERAL', '', '', ''),
(12, 'Don Alejandro', '66953255', 'ale@upsin.com', 'En la upsin'),
(5001, 'Juan Carlos', '6691525545', 'juan58@gmail.com', 'primavera 1313 flores'),
(5002, 'Karla Santilla', '6691585457', 'kialos@gmail.com', 'peturnias de la cuz 13332');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `cod_compra` int(10) NOT NULL,
  `total_compra` double(10,2) NOT NULL,
  `cod_proveedorFK` int(10) NOT NULL,
  `fecha_compra` date NOT NULL,
  `cod_usuarioFK` int(10) NOT NULL,
  `forma_pago` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `compra`
--

INSERT INTO `compra` (`cod_compra`, `total_compra`, `cod_proveedorFK`, `fecha_compra`, `cod_usuarioFK`, `forma_pago`) VALUES
(1001, 5000.00, 2001, '2022-07-01', 2, 'Tarjeta'),
(1002, 3500.00, 2001, '2022-07-11', 2, 'Tarjeta'),
(1003, 4700.00, 2002, '2022-07-15', 1, 'Tarjeta'),
(1004, 1000.00, 2002, '2022-07-18', 1, 'Tarjeta'),
(1005, 2000.00, 2001, '2022-07-22', 3, 'Tarjeta'),
(1006, 1200.00, 2001, '2022-07-25', 3, 'Tarjeta'),
(1007, 1690.00, 2002, '2022-07-29', 1, 'Tarjeta'),
(1008, 1700.00, 2002, '2022-07-31', 2, 'Tarjeta'),
(1009, 3600.00, 2001, '2022-08-01', 3, 'Tarjeta'),
(1010, 4200.00, 2002, '2022-08-05', 3, 'Tarjeta'),
(1011, 800.00, 2001, '2022-08-08', 2, 'Tarjeta'),
(1012, 1000.00, 2001, '2022-08-12', 1, 'Tarjeta'),
(1013, 1400.00, 2002, '2022-08-15', 2, 'Tarjeta'),
(1014, 2900.00, 2002, '2022-08-19', 3, 'Tarjeta'),
(1015, 1990.00, 2001, '2022-08-22', 1, 'Tarjeta'),
(1016, 950.00, 2002, '2022-08-26', 2, 'Tarjeta');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `configuraciones`
--

CREATE TABLE `configuraciones` (
  `cod_conf` int(10) NOT NULL,
  `empresa` varchar(40) NOT NULL,
  `localidad` varchar(40) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `iva1` varchar(10) NOT NULL,
  `iva2` varchar(10) NOT NULL,
  `div1` double(10,2) NOT NULL,
  `div2` double(10,2) NOT NULL,
  `imgEmpresaLogo` longblob DEFAULT NULL,
  `moneda` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `configuraciones`
--

INSERT INTO `configuraciones` (`cod_conf`, `empresa`, `localidad`, `telefono`, `iva1`, `iva2`, `div1`, `div2`, `imgEmpresaLogo`, `moneda`) VALUES
(1, 'EMPRESA DEFAULT', 'NO LOCAL', 'NO TELEFONO', '16', '10', 1.16, 1.10, 0xffd8ffe000104a46494600010101006000600000ffdb0043000201010201010202020202020202030503030303030604040305070607070706070708090b0908080a0807070a0d0a0a0b0c0c0c0c07090e0f0d0c0e0b0c0c0cffc0000b080050005001011100ffc4001c0001000203010101000000000000000000000809010607020405ffc400381000010205020304060a0301000000000001020300040506070811091221131831412232575896d30a1519425161718194d214172497ffda0008010100003f00bfc842108421084221ff00106e23d95345572d4dcb774c37d653b2a89425572a173d2ebd25292b2a96d2e2de6cb4b0a7496d0df31e9d79ba0312274d79e28daa2d3ed9591ade2e7d497c51252b9269736ed1a6e6194b810bdba73a79b954079a4c6ef0842108423e3afd0a4ee5a2cdc84fcbb533273cc2e5e61a706e975b5a4a5693f914923f78ae9e055a89b5f4d1a63bd3015ff7a5bd6fd7b4f77f56ecb96456ead2f28fced344caa664a613da2d254da9b7ca527f04089b1df2b117b53c73f1348fcd877cac45ed4f1cfc4d23f361df2b117b53c73f1348fcd877cac45ed4f1c7c4d23f36373b232050b26505155b72b549afd31c5a9b44dd3671b9b614a49d9490b6d452483d08dfa47ebc210239811f8c54565cd0161aba7e91cdcb44cb38e6dabce899ff001d337250955360ac4b56298b4cbcdb6deca1b15cb361d56de240312dfec0dd1d7bbde3bfe1b9fde1f606e8ebddef1dff000dcfef0fb037475eef78eff86e7f788bbc5ab87ae923439a597666d2d37e3aae658bfa79ab471f515124b5b952ad4d9e4695c85ceadb209757e03d04a491cc226b70a8d0252786a687accc574e5b53551a630672bd3ed82054aa8fecb99786fe08e7d9081e4db681e5122a1084575f1f54777face9ab530c04b670664a9462b4fedb16a8756024a77750f2dfb21b1e9e9c588b0b4b8ca549214923a1077047918f71e1f7d12cca9c714942100a94a51d8240f124f908aded0e4bab8adf120b97545510a9ac4186dc9bb1f0f30e00a62a7360f2552bc907c79d43b16963ee8f2537164806d084211c33898e97bbe868172d6316da4bd3b765b5372f4e4abd513c8476d28a3fa4c36d1fda2bff00876714dd6ae79d1663cae59da4ab6f2051a5a92dd1cd7ddca5254c7ea73123ff0023eebb2aeb7da30e1759595215e04f4241063b5f7e6d7ffb8bdaff00fb2537e5c68da8fbff00881eb730fd57129d36db78429d904b544abdeede4c92ab3b40a6bce04ce3adcbb412b5acb05c40e5254398ec37d88b0cd39601b6b4b182ed4c7767488a75b3675359a5d3d8e8541b6d3b732cfde5ad5ccb52bc54a5a89f18dd61084230b1ba62b1281a1dd61680aad955ac2f9334d743c315bbbaab7bc8b57dca544ccdbecce292f3cca9c6c25a6d86d4147d6236dd448dc81f069f33beb9756121519ac65a82d025fcc521d0ccf2a80dd527ff00c359df94381b5129e6d8ec4f43b1db78e8aac7dc4dd0924dff00a37007527ea4adf48e5f87f535ad6d415ff56b56c6d48f0f8bbee5a1f319fa5d1d7529d9b95093caa529b6d655b255d0903607a120c580e8e69799a8f8712c677aa63cabdf6275e2662cc959a97a69953cbd90e5983cfda0f4b988d93eaede049eab08421106fe90a625bbb2ff000f17a56daa0576f0a3d1eeaa356af1b6a8c5467ee3b7e5a64393b28ca52415a88085f28ea43476dc888cda07a8637d4ff188b1b23695b165671c62cb32c4a9d2321d5536baadaa5d6de7f904853c31ca80eccb0e27b45ac249d903d22129267ef153c657d665e1cf99ad6c68e4c22f8aeda93b274a44bbbd93d32e291e930856e3956eb7ceda4ee3ab83a8f18aa0c07feaad47e79d1adb1a62c1375632ca9886e391a8647abcc5a2ed1556f5218955375391a8cda929336ecc2c94a4ad4a2a248dc15a9317bc9f5446610842046e2301001dfcff0058c91b88c04007cfa7e7198421084210842108ffd9, '$');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_compra`
--

CREATE TABLE `detalle_compra` (
  `cod_detalle_compra` int(10) NOT NULL,
  `cod_compraFK` int(10) NOT NULL,
  `cod_productoFK` bigint(18) NOT NULL,
  `desc_pro` varchar(30) NOT NULL,
  `cant_detalle` int(10) NOT NULL,
  `precio_producto` varchar(18) NOT NULL,
  `total_Comp` double(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_venta`
--

CREATE TABLE `detalle_venta` (
  `cod_detalle` int(10) NOT NULL,
  `cod_ventaFK` int(10) NOT NULL,
  `cod_proFK` bigint(18) NOT NULL,
  `des_pro` varchar(30) NOT NULL,
  `cant_pro` int(10) NOT NULL,
  `pre_unit` varchar(18) NOT NULL,
  `total_vent` double(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalle_venta`
--

INSERT INTO `detalle_venta` (`cod_detalle`, `cod_ventaFK`, `cod_proFK`, `des_pro`, `cant_pro`, `pre_unit`, `total_vent`) VALUES
(101, 1, 10010, '0', 1, '599.99', 599.99),
(102, 1, 10010, '0', 1, '599.99', 599.99),
(103, 2, 10020, '0', 2, '999.99', 1999.98),
(104, 2, 10020, '0', 1, '999.99', 999.99),
(105, 3, 10030, '0', 1, '700', 1400.00),
(106, 3, 10030, '0', 1, '700', 700.00),
(107, 4, 10050, '0', 2, '4000', 8000.00),
(108, 4, 10050, '0', 1, '4000', 4000.00),
(109, 5, 10060, '0', 4, '200', 800.00),
(110, 5, 10060, '0', 2, '200', 400.00),
(113, 7, 10020, '0', 3, '999.99', 2999.99),
(114, 7, 10020, '0', 1, '999.99', 999.99),
(115, 8, 10040, '0', 1, '1000', 1000.00),
(116, 8, 10040, '0', 4, '1000', 4000.00),
(117, 9, 10050, '0', 2, '4000', 8000.00),
(118, 9, 10050, '0', 1, '4000', 4000.00),
(119, 10, 10030, '0', 2, '700', 1400.00),
(120, 10, 10030, '0', 5, '700', 3500.00),
(121, 11, 10050, '0', 2, '4000', 8000.00),
(122, 11, 10050, '0', 1, '4000', 4000.00),
(123, 12, 10060, '0', 5, '200', 1000.00),
(124, 12, 10060, '0', 2, '200', 400.00),
(125, 13, 10060, '0', 3, '200', 600.00),
(126, 13, 10060, '0', 6, '200', 1200.00),
(127, 14, 10004, '0', 1, '5221', 5221.00),
(128, 14, 10004, '0', 1, '5221', 5221.00),
(129, 15, 10020, '0', 4, '999.99', 3999.96),
(130, 15, 10020, '0', 1, '999.99', 999.99),
(131, 16, 10020, '0', 1, '999.99', 999.99),
(132, 16, 10020, '0', 1, '999.99', 999.99);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `cod_pro` bigint(18) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `Stock` int(10) NOT NULL,
  `precio_compra` decimal(10,2) NOT NULL,
  `ubicacion` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`cod_pro`, `descripcion`, `precio`, `Stock`, `precio_compra`, `ubicacion`) VALUES
(10004, 'Zatatillas de tacón rojas', '5221.00', 10, '1300.00', 'Sin definir'),
(10010, 'Tenis Nike Con Bordes', '600.00', 25, '450.00', 'Almacen'),
(10020, 'Tenis Lacoste', '1000.00', 25, '700.00', 'Almacen'),
(10030, 'Tenis Adidas', '700.00', 13, '450.00', 'Almacen'),
(10040, 'Tenis Kroogen', '1000.00', 30, '600.00', 'Almacen'),
(10050, 'Tenis UPSIN', '4000.00', 5, '2300.00', 'Almacen'),
(10060, 'Tenis Puro Sinaloa', '200.00', 100, '70.00', 'Almacen');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `cod_proveedor` int(10) NOT NULL,
  `nombre_proveedor` varchar(40) NOT NULL,
  `ruc` varchar(20) NOT NULL,
  `telefono_proveedor` varchar(20) NOT NULL,
  `direccion` varchar(40) NOT NULL,
  `email` varchar(50) NOT NULL,
  `encargado` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`cod_proveedor`, `nombre_proveedor`, `ruc`, `telefono_proveedor`, `direccion`, `email`, `encargado`) VALUES
(2001, 'Calzados Rodriguez', '0', '558457458', 'San juan de las crucez 2234', 'San332@gmail.com', 'Indefinido'),
(2002, 'Calzado de las Garzas', '0', '5558245755', 'San Pablo de la casona 88263', 'GarzasEdd123@gmail.com', 'Sin definir');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `resumenmov`
--

CREATE TABLE `resumenmov` (
  `cod_res` int(10) NOT NULL,
  `arqueoFK` int(10) NOT NULL,
  `monto_apert` double(10,2) NOT NULL,
  `total_venta` double(10,2) NOT NULL,
  `cobranzas` double(10,2) NOT NULL,
  `compra_anulada` double(10,2) NOT NULL,
  `otros_ingreso` double(10,2) NOT NULL,
  `total_entrada` double(10,2) NOT NULL,
  `total_compra` double(10,2) NOT NULL,
  `pagos` double(10,2) NOT NULL,
  `venta_anulada` double(10,2) NOT NULL,
  `otros_egresos` double(10,2) NOT NULL,
  `total_salida` double(10,2) NOT NULL,
  `total_caja` double(10,2) NOT NULL,
  `ingreso_tarjeta` double(10,2) NOT NULL,
  `egreso_tarjeta` double(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `cod_usuario` int(10) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `direccion` varchar(40) NOT NULL,
  `email` varchar(50) NOT NULL,
  `login` varchar(20) NOT NULL,
  `password` blob DEFAULT NULL,
  `acceso` varchar(15) NOT NULL,
  `estado` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`cod_usuario`, `nombre`, `telefono`, `direccion`, `email`, `login`, `password`, `acceso`, `estado`) VALUES
(1, 'OSMAR', '0', 'CDE ', 'osmaralcides12@gmail.com', 'admin', 0x61646d696e, 'Administrador', 'Activo'),
(2, 'Juan Carlos', '6691525458', 'Baía 2441', 'Carlos344@gmail.com', 'Sin2441', 0x2a2a2a2a6a6b6c2a2a2a2a2a2a, 'OF', 'OF'),
(3, 'Karla Paulina Rodriguez', '6682457586', 'Calle de las zonas 2 4662', 'Pau33Ka@gmail.com', 'Karla442', 0x2a2a2a2a2a2a, 'OF', 'OF'),
(4, 'Cougar', '6699129823', 'Villa Union', 'Cougar@gmail.ccom', 'Cougar', 0x436f75676172, '', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `cod_venta` int(10) NOT NULL,
  `cod_cliFK` int(10) NOT NULL,
  `subtotal` double(20,2) NOT NULL,
  `total` double(20,2) NOT NULL,
  `fec_fac` date NOT NULL,
  `cod_usuarioFK` int(10) NOT NULL,
  `forma_pago` varchar(20) NOT NULL,
  `cod_producto` bigint(18) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`cod_venta`, `cod_cliFK`, `subtotal`, `total`, `fec_fac`, `cod_usuarioFK`, `forma_pago`, `cod_producto`) VALUES
(1, 1, 599.99, 599.99, '2022-08-01', 1, 'Efectivo', 10010),
(2, 1, 999.99, 999.99, '2022-08-05', 2, 'Efectivo', 10020),
(3, 1, 700.00, 700.00, '2022-08-08', 3, 'Efectivo', 10030),
(4, 1, 4000.00, 4000.00, '2022-08-12', 2, 'Efectivo', 10050),
(5, 1, 200.00, 200.00, '2022-08-15', 2, 'Efectivo', 10060),
(7, 1, 999.99, 999.99, '2022-08-22', 1, 'Tarjeta', 10020),
(8, 1, 1000.00, 1000.00, '2022-08-26', 3, 'Tarjeta', 10040),
(9, 5001, 4000.00, 4000.00, '2022-08-29', 2, 'Tarjeta', 10050),
(10, 1, 700.00, 700.00, '2022-07-04', 1, 'Efectivo', 10030),
(11, 5002, 4000.00, 4000.00, '2022-07-08', 2, 'Tarjeta', 10050),
(12, 1, 200.00, 200.00, '2022-07-11', 3, 'Efectivo', 10060),
(13, 1, 200.00, 200.00, '2022-08-19', 2, 'Tarjeta', 10060),
(14, 5002, 5221.00, 5221.00, '2022-08-22', 1, 'Efectivo', 10004),
(15, 5001, 999.99, 999.99, '2022-08-29', 2, 'Efectivo', 10020),
(16, 1, 999.99, 999.99, '2022-07-30', 2, 'Efectivo', 10020);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `arqueos`
--
ALTER TABLE `arqueos`
  ADD PRIMARY KEY (`cod_arq`),
  ADD KEY `usuarioFK` (`usuarioFK`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`cod_cli`);

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`cod_compra`),
  ADD KEY `cod_proveedorFK` (`cod_proveedorFK`),
  ADD KEY `cod_usuarioFK` (`cod_usuarioFK`);

--
-- Indices de la tabla `configuraciones`
--
ALTER TABLE `configuraciones`
  ADD PRIMARY KEY (`cod_conf`);

--
-- Indices de la tabla `detalle_compra`
--
ALTER TABLE `detalle_compra`
  ADD PRIMARY KEY (`cod_detalle_compra`),
  ADD KEY `cod_compraFK` (`cod_compraFK`),
  ADD KEY `cod_productoFK` (`cod_productoFK`);

--
-- Indices de la tabla `detalle_venta`
--
ALTER TABLE `detalle_venta`
  ADD PRIMARY KEY (`cod_detalle`),
  ADD KEY `cod_ventaFK` (`cod_ventaFK`),
  ADD KEY `cod_proFK` (`cod_proFK`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`cod_pro`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`cod_proveedor`);

--
-- Indices de la tabla `resumenmov`
--
ALTER TABLE `resumenmov`
  ADD PRIMARY KEY (`cod_res`),
  ADD KEY `arqueoFK` (`arqueoFK`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`cod_usuario`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`cod_venta`),
  ADD KEY `cod_cliFK` (`cod_cliFK`),
  ADD KEY `cod_usuarioFK` (`cod_usuarioFK`),
  ADD KEY `cod_producto` (`cod_producto`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `arqueos`
--
ALTER TABLE `arqueos`
  MODIFY `cod_arq` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `cod_cli` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5003;

--
-- AUTO_INCREMENT de la tabla `configuraciones`
--
ALTER TABLE `configuraciones`
  MODIFY `cod_conf` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `detalle_compra`
--
ALTER TABLE `detalle_compra`
  MODIFY `cod_detalle_compra` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `detalle_venta`
--
ALTER TABLE `detalle_venta`
  MODIFY `cod_detalle` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=133;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `cod_proveedor` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2003;

--
-- AUTO_INCREMENT de la tabla `resumenmov`
--
ALTER TABLE `resumenmov`
  MODIFY `cod_res` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `cod_usuario` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `cod_venta` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=100003;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `arqueos`
--
ALTER TABLE `arqueos`
  ADD CONSTRAINT `arqueos_ibfk_1` FOREIGN KEY (`usuarioFK`) REFERENCES `usuario` (`cod_usuario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `compra_ibfk_1` FOREIGN KEY (`cod_proveedorFK`) REFERENCES `proveedor` (`cod_proveedor`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `compra_ibfk_2` FOREIGN KEY (`cod_usuarioFK`) REFERENCES `usuario` (`cod_usuario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `detalle_compra`
--
ALTER TABLE `detalle_compra`
  ADD CONSTRAINT `detalle_compra_ibfk_1` FOREIGN KEY (`cod_compraFK`) REFERENCES `compra` (`cod_compra`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `detalle_compra_ibfk_2` FOREIGN KEY (`cod_productoFK`) REFERENCES `producto` (`cod_pro`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `detalle_venta`
--
ALTER TABLE `detalle_venta`
  ADD CONSTRAINT `detalle_venta_ibfk_2` FOREIGN KEY (`cod_proFK`) REFERENCES `producto` (`cod_pro`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `detalle_venta_ibfk_3` FOREIGN KEY (`cod_ventaFK`) REFERENCES `venta` (`cod_venta`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `resumenmov`
--
ALTER TABLE `resumenmov`
  ADD CONSTRAINT `resumenmov_ibfk_1` FOREIGN KEY (`arqueoFK`) REFERENCES `arqueos` (`cod_arq`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`cod_cliFK`) REFERENCES `cliente` (`cod_cli`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `venta_ibfk_3` FOREIGN KEY (`cod_usuarioFK`) REFERENCES `usuario` (`cod_usuario`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `venta_ibfk_4` FOREIGN KEY (`cod_producto`) REFERENCES `producto` (`cod_pro`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
