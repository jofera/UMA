-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 21, 2014 at 10:50 PM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `blogdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `comment`
--

CREATE TABLE IF NOT EXISTS `comment` (
`idcomment` int(11) NOT NULL,
  `comment` varchar(250) NOT NULL,
  `nick` varchar(45) NOT NULL,
  `date` datetime NOT NULL,
  `post_idpost` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=12 ;

--
-- Dumping data for table `comment`
--

INSERT INTO `comment` (`idcomment`, `comment`, `nick`, `date`, `post_idpost`) VALUES
(9, 'Es una de mis ciudades favoritas. Me encanta Madrid!!', 'Juan', '2014-12-21 21:48:08', 6),
(10, 'Las mejores tapas del mundo. Preciosa ciudad con gente maravillosa!', 'Sonia', '2014-12-21 21:48:53', 7),
(11, 'Fui a visitarla hace poco y me encanto. En breve volvere!', 'Raquel', '2014-12-21 21:49:19', 8);

-- --------------------------------------------------------

--
-- Table structure for table `post`
--

CREATE TABLE IF NOT EXISTS `post` (
`idpost` int(11) NOT NULL,
  `post` varchar(500) NOT NULL,
  `city` varchar(45) NOT NULL,
  `country` varchar(45) NOT NULL,
  `nick` varchar(45) NOT NULL,
  `date` datetime NOT NULL,
  `region` varchar(100) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `post`
--

INSERT INTO `post` (`idpost`, `post`, `city`, `country`, `nick`, `date`, `region`) VALUES
(6, 'Madrid es un municipio y una ciudad. La localidad, con categoria historica de villa, es la capital de la Comunidad de Madrid. Tambien conocida como la Villa y Corte, es la mas poblada del Estado.', 'Madrid', 'Spain', 'Maria', '2014-12-21 22:41:13', 'Comunidad de Madrid'),
(7, 'Bilbao es un municipio situado en el norte del pai­s, y una villa de dicho municipio, capital de la provincia y territorio historico de Vizcaya, en la comunidad autonoma del Pais Vasco. La villa de Bilbao es la capital y unica localidad del municipio.', 'Bilbao', 'Spain', 'Jose', '2014-12-21 22:42:37', 'Pais Vasco'),
(8, 'Londres es la capital de Inglaterra y del Reino Unido, y la mayor ciudad de toda la Union Europea. Situada a orillas del rio Tamesis, Londres es un importante asentamiento humano desde que fue fundada por los romanos con el nombre de Londinium hace casi dos milenios.', 'Londres', 'Reino Unido', 'Maria', '2014-12-21 22:46:43', 'Reino Unido');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `comment`
--
ALTER TABLE `comment`
 ADD PRIMARY KEY (`idcomment`), ADD UNIQUE KEY `idcomment_UNIQUE` (`idcomment`), ADD KEY `fk_comment_post_idx` (`post_idpost`);

--
-- Indexes for table `post`
--
ALTER TABLE `post`
 ADD PRIMARY KEY (`idpost`), ADD UNIQUE KEY `idpost_UNIQUE` (`idpost`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `comment`
--
ALTER TABLE `comment`
MODIFY `idcomment` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `post`
--
ALTER TABLE `post`
MODIFY `idpost` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=9;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `comment`
--
ALTER TABLE `comment`
ADD CONSTRAINT `fk_comment_post` FOREIGN KEY (`post_idpost`) REFERENCES `post` (`idpost`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
