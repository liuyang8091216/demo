/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50548
Source Host           : localhost:3306
Source Database       : spring4_mybatis3

Target Server Type    : MYSQL
Target Server Version : 50548
File Encoding         : 65001

Date: 2016-12-08 22:13:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` char(32) NOT NULL,
  `user_name` varchar(30) DEFAULT NULL,
  `user_birthday` date DEFAULT NULL,
  `user_salary` double DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1172509c8ac44a0f884d0ea97951fe75', '白虎神皇xdp', '2016-12-07', '10000');
INSERT INTO `t_user` VALUES ('59842ff639b64082a93bb5004ffaa599', 'xdp_gacl_白虎神皇', '2016-12-07', '10000');
