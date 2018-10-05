-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.12


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema correo
--

CREATE DATABASE IF NOT EXISTS correo;
USE correo;

--
-- Definition of table `correos`
--

DROP TABLE IF EXISTS `correos`;
CREATE TABLE `correos` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `correo` varchar(70) NOT NULL,
  `pass` varbinary(70) NOT NULL,
  `id_usuario` varchar(70) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `correos`
--

/*!40000 ALTER TABLE `correos` DISABLE KEYS */;
INSERT INTO `correos` (`id`,`correo`,`pass`,`id_usuario`) VALUES 
 (16,'domingo@sicar.mx',0x2B4B414561386C623873582F62626B37446972694438326872386F61434A5277,'19'),
 (17,'isidro@sicar.mx',0x4D6F6C6830536D6D534F4C7833716574744B327754673D3D,'20'),
 (18,'cochinating@sicar.mx',0x316A716C502B79336E48583333796D635275387341773D3D,'21'),
 (19,'habiaunavezunbarcochiquito@sicar.mx',0x5139475445792B423874527A65674F4D414232526B773D3D,'22');
/*!40000 ALTER TABLE `correos` ENABLE KEYS */;


--
-- Definition of table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(70) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usuarios`
--

/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` (`id`,`nombre`) VALUES 
 (19,'domingo'),
 (20,'Isidro'),
 (21,'Angel'),
 (22,'laVacaLola');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
