/*
 Navicat MySQL Data Transfer

 Source Server         : mysql8.0
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : crm

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 15/06/2021 00:13:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for authority
-- ----------------------------
DROP TABLE IF EXISTS `authority`;
CREATE TABLE `authority`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `authority` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限',
  `authority_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of authority
-- ----------------------------
INSERT INTO `authority` VALUES (1, 'ROLE_user', '普通用户');
INSERT INTO `authority` VALUES (2, 'ROLE_company', '公司用户');
INSERT INTO `authority` VALUES (3, 'ROLE_admin', '管理员');

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company`  (
  `company_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '公司ID',
  `companyname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '企业名称',
  `address` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '企业地址',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `leader` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '企业负责人',
  `createTime` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创办时间',
  `username` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  PRIMARY KEY (`company_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of company
-- ----------------------------
INSERT INTO `company` VALUES (1, '南昌工程学院', '江西省南昌市南昌天祥大道289号', '1142044719@qq.com', '校长金志农', '19850503213123', 'company');
INSERT INTO `company` VALUES (2, '江西师范大学', '江西省南昌市南昌县', '1142044719@qq.com', '师大HR', '19880202', 'company1');
INSERT INTO `company` VALUES (3, '广东筑波路桥工程有限公司', '广州越秀区', 'zblq@zblq.com', '陈泽丹', '19880404', 'company4');
INSERT INTO `company` VALUES (4, '1231231', '2', '3@qq.com', '4', '5', 'company6');

-- ----------------------------
-- Table structure for job
-- ----------------------------
DROP TABLE IF EXISTS `job`;
CREATE TABLE `job`  (
  `job_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '职位ID',
  `company_id` int(0) NULL DEFAULT NULL COMMENT '应聘者ID',
  `job_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '工作名称',
  `job_time` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '招聘时间',
  `per_num` int(0) NULL DEFAULT NULL COMMENT '招聘人数',
  `job_place` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '招聘地点',
  `job_require` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '招聘要求',
  `reqEdu_type` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '要求学历程度',
  `reqWork_life` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '要求工作年限',
  `reqExp_salary` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '要求薪资待遇',
  `reqWork_province` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '要去工作省份',
  `reqWork_city` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '要求工作城市',
  `reqPro_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '要求专业',
  PRIMARY KEY (`job_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of job
-- ----------------------------
INSERT INTO `job` VALUES (2, 1, '技术员', '20210521', 20, '电子信息楼', '无', '本科', '0', '5000', '广东', '广州', '任意');
INSERT INTO `job` VALUES (6, 1, '街道清理', '20210521', 20, '电子信息楼', '无', '大专', '2', '4000', '江西', '南昌', '无');
INSERT INTO `job` VALUES (7, 1, '数据录入员', '20210524', 3, '紫峰大厦', '需要一定的打字速度', '大专', '0', '4000', '江西', '南昌', '无');
INSERT INTO `job` VALUES (8, 1, '运维', '20210523', 1, '北B303', '熟悉运维', '本科', '2', '5000', '广东', '广州', '计算机科学与技术，软件工程');
INSERT INTO `job` VALUES (10, 2, '保安', '20210523', 2, '保安室', '身强力壮', '专科及以上', '1', '3000', '江西', '南昌', '无');
INSERT INTO `job` VALUES (11, 2, '保洁员', '20210524', 3, '保洁间', '无', '无', '1', '3000', '江西', '南昌', '无');
INSERT INTO `job` VALUES (12, 1, '合约', '20210524', 1, '合约办', '熟悉合同', '硕士', '1', '10000', '江西', '赣州', '金融相关专业');
INSERT INTO `job` VALUES (13, 4, '111', '1', 1, '1', '1', '1', '1', '1', '1', '1', '1');

-- ----------------------------
-- Table structure for jobobject
-- ----------------------------
DROP TABLE IF EXISTS `jobobject`;
CREATE TABLE `jobobject`  (
  `jobObject_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '投递职位ID',
  `resume_id` int(0) NULL DEFAULT NULL COMMENT '简历ID',
  `expected_job` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '工作名称',
  `status` tinyint(0) NULL DEFAULT NULL COMMENT '录取通知状态',
  `value` double(20, 2) NULL DEFAULT NULL COMMENT '相似度值',
  PRIMARY KEY (`jobObject_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of jobobject
-- ----------------------------

-- ----------------------------
-- Table structure for resume
-- ----------------------------
DROP TABLE IF EXISTS `resume`;
CREATE TABLE `resume`  (
  `resume_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '简历ID',
  `user_id` int(0) NULL DEFAULT NULL COMMENT '用户ID',
  `id_number` bigint(0) NULL DEFAULT NULL COMMENT '身份证',
  `username` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `sexy` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `birthday` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '出生日期',
  `age` int(0) NULL DEFAULT NULL COMMENT '年龄',
  `nationnality` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '国籍',
  `nation` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '民族',
  `political_status` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '政治面貌',
  `residence` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '现居地',
  `household_province` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '户籍省份',
  `household_city` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '户籍城市',
  `academic_degree` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学位',
  `education_type` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学历',
  `graduation_time` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '毕业时间',
  `major` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '专业',
  `school` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学校',
  `phoneNumber` bigint(0) NULL DEFAULT NULL COMMENT '手机号',
  `email` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `working_life` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '工作年限',
  `profession` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '行业',
  `photo_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '照片地址',
  `expected_place` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '期待工作省份',
  `expected_function` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '期待职能',
  `expected_salary` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '期待薪水',
  `time_to_work` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '到岗时间',
  `introduce` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '自我介绍',
  `create_time` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态变化时间',
  `status` tinyint(1) NULL DEFAULT NULL COMMENT '简历状态',
  PRIMARY KEY (`resume_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of resume
-- ----------------------------
INSERT INTO `resume` VALUES (1, 3, 360731199901010123, 'user', '男', '0503', 18, '中国', '汉族', '党员', '广州', '广东', '广州', '学士', '本科', '20210624', '计算机科学与技术', '南昌工程学院', 12312341234, '11@qq.com', '1', '计算机', NULL, '北上广', '程序员', '10000', '20210629', '无', '20210514', 1);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '应聘者ID',
  `phoneNumber` bigint(0) NULL DEFAULT NULL COMMENT '手机号',
  `username` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `email` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `valid` tinyint(1) NULL DEFAULT 2 COMMENT '合法性',
  `authority_id` int(0) NULL DEFAULT NULL COMMENT '权限',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 12321, 'admin', '21321@qwe.c', '$2a$10$kL.o/wH9xXzbxJ/YR0393eoYR9bOeyVP28AreIKMm.ydESqWlNoCu', 1, 3);
INSERT INTO `user` VALUES (2, 123213, 'company', '123213@qq.com', '$2a$10$kL.o/wH9xXzbxJ/YR0393eoYR9bOeyVP28AreIKMm.ydESqWlNoCu', 1, 2);
INSERT INTO `user` VALUES (3, 12321, 'user', '1608188128@qq.com', '$2a$10$kL.o/wH9xXzbxJ/YR0393eoYR9bOeyVP28AreIKMm.ydESqWlNoCu', 1, 1);
INSERT INTO `user` VALUES (4, 12312341234, 'company1', 'company1@163.com', '$2a$10$kL.o/wH9xXzbxJ/YR0393eoYR9bOeyVP28AreIKMm.ydESqWlNoCu', 1, 2);
INSERT INTO `user` VALUES (5, 12312341234, 'company2', 'company2@163.com', '$2a$10$BSgbUFjgqHE2ZvcEWtqmJOsAMU2uWGKamyoHBuJudujjghswEDPIq', 1, 2);
INSERT INTO `user` VALUES (6, 12312341234, 'user1', 'user1@163.com', '$2a$10$UkqJWgFCQNWbVWbyBXBmQeybEWm1xmxm9T6Ly.cgoRkJhySYh0yrW', 1, 1);
INSERT INTO `user` VALUES (7, 12312331233, 'company3', '11@qq.com', '$2a$10$Arq5YARnDVntEEDbGln76Or5niISqVJwMcwGm6E2HPBWrgVRqVcsS', 1, 2);
INSERT INTO `user` VALUES (8, 12312341234, 'user2', '11@qq.com', '$2a$10$HrJNoGaYINTnzzgavueKf.yc7KQHu6w.4qhufIOLje.itzOGRZiM6', 1, 1);
INSERT INTO `user` VALUES (9, 12312312312, 'company4', '1142044719@qq.com', '$2a$10$Zt/.4f/qpa2MMfTP3XL3veOvEn0XZQxRC9CnKa21IY/EqizNJKEW6', 1, 2);
INSERT INTO `user` VALUES (10, 13241234123, 'company6', '213123@qq.com', '$2a$10$MeH7chzZmTJRyJxaC.GzSuGexwg2fUg1dAPQjN9QKY768iD0UyfMK', 1, 2);
INSERT INTO `user` VALUES (11, 12312312312, 'user12', '213213@qq.cm', '$2a$10$lzNC1mDq5f0kzwnHTUPM.Ot43bOx2DAs.neZWrC16W0h/DhsW65si', 1, 1);

-- ----------------------------
-- Table structure for weightjob
-- ----------------------------
DROP TABLE IF EXISTS `weightjob`;
CREATE TABLE `weightjob`  (
  `weightjob_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '岗位权重id',
  `job_id` int(0) NULL DEFAULT NULL COMMENT '岗位id',
  `job_name` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '岗位名称',
  `weightitem` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权重项目',
  `weightvalue` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权重值',
  PRIMARY KEY (`weightjob_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of weightjob
-- ----------------------------
INSERT INTO `weightjob` VALUES (1, 2, '技术员', 'springboot', '1');
INSERT INTO `weightjob` VALUES (2, 2, '技术员', 'spring', '0.5');
INSERT INTO `weightjob` VALUES (3, 2, '技术员', 'java', '2');
INSERT INTO `weightjob` VALUES (4, 2, '技术员', 'c#', '1.2');
INSERT INTO `weightjob` VALUES (5, 2, '技术员', 'vue', '1.2');
INSERT INTO `weightjob` VALUES (7, 2, '技术员', 'vue', '1.2');
INSERT INTO `weightjob` VALUES (8, 2, '技术员', 'vue', '1.2');
INSERT INTO `weightjob` VALUES (9, 2, '技术员', 'layui', '0.3');
INSERT INTO `weightjob` VALUES (10, 2, '技术员', 'layuimini', '0.5');
INSERT INTO `weightjob` VALUES (11, 2, '技术员', 'socket', '1');
INSERT INTO `weightjob` VALUES (13, 2, '技术员', '未婚', '1');
INSERT INTO `weightjob` VALUES (14, 6, '街道清理', '熟悉街区', '1');
INSERT INTO `weightjob` VALUES (15, 6, '街道清理', '时间充足', '2');
INSERT INTO `weightjob` VALUES (16, 7, '数据录入员', '时间充足', '1');
INSERT INTO `weightjob` VALUES (17, 8, '运维', 'linux', '3');
INSERT INTO `weightjob` VALUES (18, 8, '运维', 'shell', '2');
INSERT INTO `weightjob` VALUES (20, 9, '1', '1', '1');

SET FOREIGN_KEY_CHECKS = 1;
