/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 40122
Source Host           : localhost:3306
Source Database       : shop

Target Server Type    : MYSQL
Target Server Version : 40122
File Encoding         : 65001

Date: 2018-06-07 11:11:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL auto_increment,
  `userName` varchar(100) NOT NULL default '',
  `password` varchar(100) NOT NULL default '',
  `addr` varchar(100) NOT NULL default '',
  `phone` varchar(100) NOT NULL default '',
  `rdate` timestamp NOT NULL default '0000-00-00 00:00:00' on update CURRENT_TIMESTAMP,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('2', '小花', 'd7b6ae9431b3f298252315444c0ee6fa', '13546567687', '江西', '2018-06-07 11:10:57');
