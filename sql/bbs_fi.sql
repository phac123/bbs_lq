/*
 Navicat MySQL Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : bbs

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 10/12/2019 09:22:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for announcement_list
-- ----------------------------
DROP TABLE IF EXISTS `announcement_list`;
CREATE TABLE `announcement_list`  (
  `anno_id` bigint(255) NOT NULL AUTO_INCREMENT,
  `anno_unique` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `anno_theme` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `anno_describe` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `anno_time` bigint(255) NULL DEFAULT NULL,
  PRIMARY KEY (`anno_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for answer_list
-- ----------------------------
DROP TABLE IF EXISTS `answer_list`;
CREATE TABLE `answer_list`  (
  `answer_id` bigint(255) NOT NULL AUTO_INCREMENT,
  `answer_unique` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `prob_id` bigint(255) NULL DEFAULT NULL,
  `user_id` bigint(255) NULL DEFAULT NULL,
  `answer_describe` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `answer_time` bigint(255) NULL DEFAULT NULL,
  PRIMARY KEY (`answer_id`) USING BTREE,
  INDEX `pro_id`(`prob_id`) USING BTREE,
  INDEX `user_id`(`user_id`) USING BTREE,
  CONSTRAINT `answer_list_ibfk_1` FOREIGN KEY (`prob_id`) REFERENCES `prob_list` (`prob_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `answer_list_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `user_list` (`uid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for card_list
-- ----------------------------
DROP TABLE IF EXISTS `card_list`;
CREATE TABLE `card_list`  (
  `card_id` bigint(255) NOT NULL AUTO_INCREMENT,
  `card_unique` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_id` bigint(255) NULL DEFAULT NULL,
  `card_theme` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `card_describe` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `like_num` bigint(255) NULL DEFAULT NULL,
  `comment_num` bigint(255) NULL DEFAULT NULL,
  `read_num` bigint(255) NULL DEFAULT NULL,
  `card_time` bigint(255) NULL DEFAULT NULL,
  PRIMARY KEY (`card_id`) USING BTREE,
  INDEX `user_id`(`user_id`) USING BTREE,
  CONSTRAINT `card_list_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user_list` (`uid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for comment_list
-- ----------------------------
DROP TABLE IF EXISTS `comment_list`;
CREATE TABLE `comment_list`  (
  `comment_id` bigint(255) NOT NULL AUTO_INCREMENT,
  `comment_unique` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_id` bigint(255) NULL DEFAULT NULL,
  `card_id` bigint(255) NULL DEFAULT NULL,
  `comment_describe` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `comment_time` bigint(255) NULL DEFAULT NULL,
  PRIMARY KEY (`comment_id`) USING BTREE,
  INDEX `user_id`(`user_id`) USING BTREE,
  INDEX `card_id`(`card_id`) USING BTREE,
  CONSTRAINT `comment_list_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user_list` (`uid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `comment_list_ibfk_2` FOREIGN KEY (`card_id`) REFERENCES `card_list` (`card_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for prob_list
-- ----------------------------
DROP TABLE IF EXISTS `prob_list`;
CREATE TABLE `prob_list`  (
  `prob_id` bigint(255) NOT NULL AUTO_INCREMENT,
  `prob_unique` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_id` bigint(255) NULL DEFAULT NULL,
  `prob_theme` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `prob_describe` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `prob_time` bigint(255) NULL DEFAULT NULL,
  `prob_label` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `prob_ward` int(20) NULL DEFAULT NULL,
  PRIMARY KEY (`prob_id`) USING BTREE,
  INDEX `user_id`(`user_id`) USING BTREE,
  CONSTRAINT `prob_list_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user_list` (`uid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_list
-- ----------------------------
DROP TABLE IF EXISTS `user_list`;
CREATE TABLE `user_list`  (
  `uid` bigint(255) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `profession` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `workplace` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `head` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `integral` bigint(255) NULL DEFAULT NULL,
  `flag` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
