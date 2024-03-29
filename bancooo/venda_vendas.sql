CREATE DATABASE  IF NOT EXISTS `venda` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `venda`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: venda
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `vendas`
--

DROP TABLE IF EXISTS `vendas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vendas` (
  `id_venda` bigint unsigned NOT NULL AUTO_INCREMENT,
  `data_venda` date NOT NULL,
  `valor_total` decimal(5,2) NOT NULL,
  PRIMARY KEY (`id_venda`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendas`
--

LOCK TABLES `vendas` WRITE;
/*!40000 ALTER TABLE `vendas` DISABLE KEYS */;
INSERT INTO `vendas` VALUES (1,'2023-06-14',880.00),(2,'2023-06-14',248.00),(3,'2023-06-14',248.00),(4,'2023-06-14',145.00),(5,'2023-06-14',145.00),(6,'2023-06-14',275.00),(7,'2023-06-14',275.00),(8,'2023-06-14',195.00),(9,'2023-06-14',195.00),(10,'2023-06-14',62.00),(11,'2023-06-14',62.00),(12,'2023-06-14',110.00),(13,'2023-06-14',110.00),(14,'2023-06-14',440.00),(15,'2023-06-14',440.00),(16,'2023-06-14',28.00),(17,'2023-06-14',28.00),(18,'2023-06-14',28.00),(19,'2023-06-14',28.00),(20,'2023-06-14',186.00),(21,'2023-06-14',186.00),(22,'2023-06-15',104.00),(23,'2023-06-15',104.00),(24,'2023-06-15',28.00),(25,'2023-06-15',28.00),(26,'2023-06-15',62.00),(27,'2023-06-15',62.00),(28,'2023-06-15',124.00),(29,'2023-06-15',124.00),(30,'2023-06-15',825.00),(31,'2023-06-15',112.00),(32,'2023-06-15',28.00),(33,'2023-06-15',7.00),(34,'2023-06-15',70.00),(35,'2023-06-15',110.00),(36,'2023-06-15',117.00),(37,'2023-06-15',248.00),(38,'2023-06-19',420.00),(39,'2023-06-19',29.98),(40,'2023-06-19',195.00),(41,'2023-06-20',106.00),(42,'2023-06-21',64.00),(43,'2023-06-21',50.00),(44,'2023-06-21',14.00),(45,'2023-06-21',14.00),(46,'2023-06-21',14.00),(47,'2023-06-21',160.00),(48,'2023-06-21',35.00),(49,'2023-06-21',84.00);
/*!40000 ALTER TABLE `vendas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-21 23:41:58
