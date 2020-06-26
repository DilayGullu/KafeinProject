-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: company_db
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `company`
--

DROP TABLE IF EXISTS `company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `company` (
  `id` int NOT NULL AUTO_INCREMENT,
  `companyname` varchar(250) COLLATE utf32_turkish_ci NOT NULL,
  `personelcount` int NOT NULL,
  `province` varchar(250) COLLATE utf32_turkish_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company`
--

LOCK TABLES `company` WRITE;
/*!40000 ALTER TABLE `company` DISABLE KEYS */;
INSERT INTO `company` VALUES (1,'Deneme',100,'Edirne'),(2,'Dilay',200,'İstanbul');
/*!40000 ALTER TABLE `company` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservations`
--

DROP TABLE IF EXISTS `reservations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservations` (
  `id` int NOT NULL AUTO_INCREMENT,
  `starts` datetime DEFAULT NULL,
  `ends` datetime DEFAULT NULL,
  `companyID` int NOT NULL,
  `bool` tinyint NOT NULL,
  `roomID` int NOT NULL,
  `capacity` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `companyID` (`companyID`),
  CONSTRAINT `reservations_ibfk_2` FOREIGN KEY (`companyID`) REFERENCES `company` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservations`
--

LOCK TABLES `reservations` WRITE;
/*!40000 ALTER TABLE `reservations` DISABLE KEYS */;
INSERT INTO `reservations` VALUES (7,'2020-06-15 01:03:00','2020-06-15 01:43:00',1,0,1,0),(8,'2020-06-15 20:00:00','2020-06-15 20:40:00',1,1,1,0),(9,'2020-06-15 20:41:00','2020-06-15 20:51:00',1,1,1,0),(12,'2020-06-15 20:52:00','2020-06-15 20:59:00',1,1,1,0),(13,'2020-06-15 20:53:00','2020-06-15 20:59:00',1,1,1,0),(14,'2020-06-15 22:10:00','2020-06-15 22:40:00',1,1,1,40),(15,'2020-06-15 22:15:00','2020-06-15 22:40:00',1,1,1,40),(16,'2020-06-15 22:17:00','2020-06-15 22:40:00',1,1,1,40),(17,'2020-06-15 22:18:00','2020-06-15 22:40:00',1,1,1,40),(18,'2020-06-15 22:20:00','2020-06-15 22:40:00',1,1,1,40),(19,'2020-06-15 22:21:00','2020-06-15 22:40:00',1,1,1,40),(20,'2020-06-15 22:22:00','2020-06-15 22:40:00',1,1,1,40),(21,'2020-06-15 22:41:00','2020-06-15 22:52:00',1,1,1,40),(22,'2020-06-15 17:00:00','2020-06-15 17:40:00',1,1,1,40),(23,'2020-06-15 11:20:00','2020-06-15 11:40:00',1,1,1,40);
/*!40000 ALTER TABLE `reservations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `room` (
  `id` int NOT NULL AUTO_INCREMENT,
  `roomname` varchar(100) COLLATE utf32_turkish_ci DEFAULT NULL,
  `capacity` int NOT NULL,
  `province` varchar(250) COLLATE utf32_turkish_ci NOT NULL,
  `county` varchar(250) COLLATE utf32_turkish_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES (1,'Toplantı 1',50,'Edirne','Edirne');
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-27  2:51:39
