-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: quiz
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `mcq`
--

DROP TABLE IF EXISTS `mcq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mcq` (
  `mcq_id` int NOT NULL AUTO_INCREMENT,
  `questions` varchar(255) DEFAULT NULL,
  `option_a` varchar(255) DEFAULT NULL,
  `option_b` varchar(255) DEFAULT NULL,
  `option_c` varchar(255) DEFAULT NULL,
  `option_d` varchar(255) DEFAULT NULL,
  `c_ans` int DEFAULT NULL,
  PRIMARY KEY (`mcq_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mcq`
--

LOCK TABLES `mcq` WRITE;
/*!40000 ALTER TABLE `mcq` DISABLE KEYS */;
INSERT INTO `mcq` VALUES (1,'Java was conceived by ___ at Sun Microsystems, Inc. in 1991.','1. James Gosling ','2. Patrick Naughton ','3. Chris Warth and Ed Frank ','4. all of the above',4),(2,'JVM stands for ___','1. Java Virtual Machine ','2. Joint virtual machine ','3. java virtual means ','4. joint virtual minute',1),(3,'JIT stands for ___','1. Just In Temporary ','2. Just In Time ','3. Jump In Time ','4. joke in Time',2),(4,'JDBC stands for ___','1. Java Database Connectivity ','2. Joint Database connection ','3. Just Dependent component ','4. none of the above',1),(5,'___ is the mechanism that binds together code and the data it manipulates and keeps both safes from outside interference and misuse.','1. Inheritance ','2. Polymorphism ','3. Encapsulation ','4. Multithreaded',3),(6,'Which of the following is not a primitive data type?','1. Boolean ','2. byte ','3. string ','4. double',3),(7,'Which of the following is not an OOPS concept in Java?','1. Polymorphism ','2. Inheritance ','3. Compilation ','4. Encapsulation',3),(8,'Which of the following is a type of polymorphism in Java Programming?','1. Multiple polymorphism ','2. Compile time polymorphism ','3. Multilevel polymorphism ','4. Execution time polymorphism',2),(9,'Which one of the following is not an access modifier?','1. Protected ','2. Void ','3. Public ','4. Private',2),(10,'Which of these are types of multitasking?','1. Process based ','2. Thread based ','3. Process and Thread based ','4. None of the mentioned',3),(11,'Which exception is thrown when java is out of memory?','1. MemoryError ','2. OutOfMemoryError ','3. MemoryOutOfBoundsException ','4. MemoryFullException',2),(12,'Which of the following is a superclass of every class in Java?','1. ArrayList ','2. Abstract class ','3. Object class ','4. String',3),(13,'Which of these packages contains the exception Stack Overflow in Java?','1. java.io ','2. java.system ','3. java.lang ','4. java.util',3),(14,'Which of these keywords are used for the block to be examined for exceptions?','1. check ','2. throw ','3. catch ','4. try',4),(15,'Which of the below does not implement Map interface?','1. HashMap ','2. Hashtable ','3. EnumMap ','4. Vector',4),(16,'Which of the following is not a Java features?','1. Dynamic ','2. Architecture Neutral ','3. Use of pointers ','4. Object-oriented',3),(17,'What is the return type of the hashCode() method in the Object class?','1. Object ','2. int ','3. long ','4. void',2),(18,'An interface with no fields or methods is known as a ______.','1. Runnable Interface ','2. Marker Interface ','3. Abstract Interface ','4. CharSequence Interface',2),(19,'Which of these classes are the direct subclasses of the Throwable class?','1. RuntimeException and Error class ','2. Exception and VirtualMachineError class ','3. Error and Exception class ','4. IOException and VirtualMachineError class',3),(20,'Which keyword is used for accessing the features of a package?','1. package ','2. import ','3. extends ','4. export',2),(21,'In java, jar stands for_____.','1. Java Archive Runner ','2. Java Application Resource ','3. Java Application Runner ','4. None of the above',4);
/*!40000 ALTER TABLE `mcq` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-06 19:51:14
