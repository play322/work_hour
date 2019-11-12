/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.5.41 : Database - gongshi
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`gongshi` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `gongshi`;

/*Table structure for table `project_info` */

DROP TABLE IF EXISTS `project_info`;

CREATE TABLE `project_info` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `pi_name` varchar(500) DEFAULT NULL COMMENT '项目名称',
  `pi_department` varchar(500) DEFAULT NULL COMMENT '项目所属单位/部门/公司',
  `pi_create_id` bigint(11) DEFAULT NULL COMMENT '项目创建者ID',
  `pi_create_dt` date DEFAULT NULL COMMENT '项目创建时间（格式：yyyy-MM-dd hh:mm:dd）',
  `pi_plan_start_dt` date DEFAULT NULL COMMENT '项目计划开始日期（格式：yyyy-MM-dd）',
  `pi_plan_end_dt` date DEFAULT NULL COMMENT '项目计划结束日期（格式：yyyy-MM-dd）',
  `pi_real_start_dt` date DEFAULT NULL COMMENT '项目实际开始日期（格式：yyyy-MM-dd）',
  `pi_real_end_dt` date DEFAULT NULL COMMENT '项目实际结束日期（格式：yyyy-MM-dd）',
  `pi_state` tinyint(4) DEFAULT '0' COMMENT '项目状态，0表示未开始，1表示进行中，2表示已完成',
  `pi_users` varchar(255) DEFAULT NULL COMMENT '项目成员',
  PRIMARY KEY (`id`),
  KEY `pi_create_id` (`pi_create_id`),
  CONSTRAINT `project_info_ibfk_1` FOREIGN KEY (`pi_create_id`) REFERENCES `sys_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8;

/*Data for the table `project_info` */

insert  into `project_info`(`id`,`pi_name`,`pi_department`,`pi_create_id`,`pi_create_dt`,`pi_plan_start_dt`,`pi_plan_end_dt`,`pi_real_start_dt`,`pi_real_end_dt`,`pi_state`,`pi_users`) values (13,'碧水','碧峰涧',1,'2019-09-23','2019-09-23','2019-09-23','2019-09-23','2019-09-23',1,NULL),(14,'卧龙','青龙吟',1,'2019-07-09','2019-09-05','2019-08-14','2019-09-06','2019-09-05',2,NULL),(15,'星空','寰宇星空',1,'2019-09-25','2019-09-19','2019-09-18','2019-09-27','2019-09-19',0,NULL),(16,'长歌','岁月今朝',1,'2019-09-11','2019-09-13','2019-09-12','2019-09-19','2019-09-25',1,NULL),(21,'231','213',1,'2019-09-18','2019-09-11','2019-09-12','2019-09-12','2019-09-28',0,NULL),(22,'紫光','风花雪月',1,'2019-06-12','2019-08-01','2019-09-01','2019-08-15','2019-09-05',1,NULL),(23,'山水','墨尘风雨',1,'2019-07-09','2019-09-05','2019-08-14','2019-09-06','2019-09-05',2,NULL),(24,'江画','墨明棋妙',1,'2019-09-25','2019-09-19','2019-09-18','2019-09-27','2019-09-19',0,NULL),(25,'晚秋','荷碧当初',1,'2019-09-11','2019-09-13','2019-09-12','2019-09-19','2019-09-25',1,NULL),(26,'紫光','风花雪月',1,'2019-06-12','2019-08-01','2019-09-01','2019-08-15','2019-09-05',1,NULL),(27,'山水','墨尘风雨',1,'2019-07-09','2019-09-05','2019-08-14','2019-09-06','2019-09-05',2,NULL),(32,'江画','墨明棋妙',1,'2019-09-25','2019-09-19','2019-09-18','2019-09-27','2019-09-19',0,NULL),(61,'兰新高铁','防晒服',2,'2019-09-03','2019-09-24','2019-09-28','2019-09-27','2019-09-27',1,'2'),(65,'ggggg','gggg',2,'2019-09-04','2019-09-28','2019-09-27','2019-09-28','2019-09-28',1,'2'),(66,'纷纷问','二分二',1,NULL,NULL,NULL,NULL,NULL,NULL,'');

/*Table structure for table `project_update_log` */

DROP TABLE IF EXISTS `project_update_log`;

CREATE TABLE `project_update_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `pul_pi_id` bigint(20) DEFAULT NULL COMMENT '项目ID',
  `pul_update_uid` bigint(20) DEFAULT NULL COMMENT '项目更新者ID',
  `pul_update_dt` datetime DEFAULT NULL COMMENT '项目更新时间',
  `pul_update_contents` text COMMENT '项目更新内容（用json字符串表示，具体内容开发时决定）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `project_update_log` */

/*Table structure for table `project_work_hour` */

DROP TABLE IF EXISTS `project_work_hour`;

CREATE TABLE `project_work_hour` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `pui_pi_id` bigint(20) DEFAULT NULL COMMENT '项目ID',
  `pui_su_id` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `pui_work_hour` decimal(10,0) DEFAULT NULL COMMENT '工时数，单位：小时',
  `pui_input_dt` datetime DEFAULT NULL COMMENT '工时录入时间(格式：yyyy-MM-dd hh:mm:ss)',
  PRIMARY KEY (`id`),
  KEY `pui_pi_id` (`pui_pi_id`),
  KEY `pui_su_id` (`pui_su_id`),
  CONSTRAINT `project_work_hour_ibfk_1` FOREIGN KEY (`pui_pi_id`) REFERENCES `project_info` (`id`),
  CONSTRAINT `project_work_hour_ibfk_2` FOREIGN KEY (`pui_su_id`) REFERENCES `sys_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

/*Data for the table `project_work_hour` */

insert  into `project_work_hour`(`id`,`pui_pi_id`,`pui_su_id`,`pui_work_hour`,`pui_input_dt`) values (4,13,1,'12','2019-09-23 00:00:00'),(5,15,1,'12','2019-09-23 00:00:00'),(6,14,1,'13','2019-09-12 00:00:00'),(7,15,1,'11','2019-09-23 17:55:21'),(8,32,1,'22','2019-09-23 00:00:00'),(17,61,2,'22','2019-09-23 00:00:00'),(18,16,1,'32','2019-09-27 00:00:00'),(19,65,2,'44','2019-09-24 00:00:00');

/*Table structure for table `sys_dept` */

DROP TABLE IF EXISTS `sys_dept`;

CREATE TABLE `sys_dept` (
  `dept_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '机构编号，主键',
  `dept_parent_id` bigint(20) DEFAULT NULL COMMENT '上级机构ID，一级部门为0',
  `dept_name` varchar(50) DEFAULT NULL COMMENT '机构名称',
  `dept_order` int(11) DEFAULT NULL COMMENT '机构排序',
  `dept_flag` tinyint(4) DEFAULT '0' COMMENT '是否启用，0启用，1禁用',
  `dept_addr` varchar(500) DEFAULT NULL COMMENT '机构地址',
  `dept_contact` varchar(500) DEFAULT NULL COMMENT '机构联系人',
  `dept_phone` varchar(200) DEFAULT NULL COMMENT '机构联系电话',
  `dept_desc` varchar(1000) DEFAULT NULL COMMENT '机构简介',
  PRIMARY KEY (`dept_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='部门管理';

/*Data for the table `sys_dept` */

/*Table structure for table `sys_dict` */

DROP TABLE IF EXISTS `sys_dict`;

CREATE TABLE `sys_dict` (
  `id` bigint(64) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `sd_name` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '标签名',
  `sd_value` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '数据值',
  `sd_type` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '类型',
  `sd_desc` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '描述',
  `sd_order` int(11) DEFAULT NULL COMMENT '排序（升序）',
  `sd_parent_id` bigint(64) DEFAULT '0' COMMENT '父级编号',
  `sd_create_uid` bigint(64) DEFAULT NULL COMMENT '创建者',
  `sd_create_dt` datetime DEFAULT NULL COMMENT '创建时间',
  `sd_update_uid` bigint(64) DEFAULT NULL COMMENT '更新者',
  `sd_update_dt` datetime DEFAULT NULL COMMENT '更新时间',
  `sd_remark` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '备注信息',
  `sd_del_flag` char(1) COLLATE utf8_bin DEFAULT '0' COMMENT '删除标记,Y删除，N不删除',
  PRIMARY KEY (`id`),
  KEY `sys_dict_value` (`sd_value`),
  KEY `sys_dict_label` (`sd_name`),
  KEY `sys_dict_del_flag` (`sd_del_flag`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='字典表';

/*Data for the table `sys_dict` */

/*Table structure for table `sys_menu` */

DROP TABLE IF EXISTS `sys_menu`;

CREATE TABLE `sys_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `sm_parent_id` bigint(20) DEFAULT NULL COMMENT '父菜单ID，一级菜单为0',
  `sm_name` varchar(50) DEFAULT NULL COMMENT '菜单名称',
  `sm_url` varchar(200) DEFAULT NULL COMMENT '菜单URL',
  `sm_perms` varchar(500) DEFAULT NULL COMMENT '授权(多个用逗号分隔，如：user:list,user:create)',
  `sm_type` int(11) DEFAULT NULL COMMENT '类型   0：目录   1：菜单   2：按钮',
  `sm_icon` varchar(50) DEFAULT NULL COMMENT '菜单图标',
  `sm_order` int(11) DEFAULT NULL COMMENT '排序',
  `sm_create_dt` datetime DEFAULT NULL COMMENT '创建时间',
  `sm_create_uid` bigint(20) DEFAULT NULL COMMENT '创建者ID',
  `sm_update_dt` datetime DEFAULT NULL COMMENT '更新时间',
  `sm_update_uid` bigint(20) DEFAULT NULL COMMENT '更新者ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='菜单管理';

/*Data for the table `sys_menu` */

/*Table structure for table `sys_role` */

DROP TABLE IF EXISTS `sys_role`;

CREATE TABLE `sys_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色ID，主键',
  `sr_name` varchar(100) DEFAULT NULL COMMENT '角色名称',
  `sr_sign` varchar(100) DEFAULT NULL COMMENT '角色标识',
  `sr_remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `sr_create_uid` bigint(255) DEFAULT NULL COMMENT '创建用户id',
  `sr_create_dt` datetime DEFAULT NULL COMMENT '创建时间',
  `sr_update_dt` datetime DEFAULT NULL COMMENT '更新时间',
  `sr_update_uid` bigint(20) DEFAULT NULL COMMENT '更新者ID',
  `sr_issuperadmin` char(1) DEFAULT 'N' COMMENT '是否是超级管理员，Y是，N不是。超级管理员角色不能被删除和修改。',
  `sr_issysadmin` char(1) DEFAULT 'N' COMMENT '是否是系统管理员，Y是，N不是。系统管理员可以创建普通管理员和分配角色权限；非系统管理员不能分配权限。',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='角色';

/*Data for the table `sys_role` */

/*Table structure for table `sys_role_menu` */

DROP TABLE IF EXISTS `sys_role_menu`;

CREATE TABLE `sys_role_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `srm_role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
  `srm_menu_id` bigint(20) DEFAULT NULL COMMENT '菜单ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='角色与菜单对应关系';

/*Data for the table `sys_role_menu` */

/*Table structure for table `sys_user` */

DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `su_name` varchar(30) DEFAULT NULL COMMENT '用户姓名',
  `su_login_name` varchar(30) DEFAULT NULL COMMENT '用户系统登录名',
  `su_login_passwd` varchar(100) DEFAULT NULL COMMENT '用户系统登录密码',
  `su_sex` tinyint(4) DEFAULT '0' COMMENT '用户性别，-1未知，0男，1女',
  `su_birth_dt` date DEFAULT NULL COMMENT '用户生日(格式：yyyy-MM-dd)',
  `su_icon` varchar(100) DEFAULT NULL COMMENT '用户头像',
  `su_address` varchar(200) DEFAULT NULL COMMENT '用户详细地址',
  `su_province` varchar(50) DEFAULT NULL COMMENT '用户所在省份',
  `su_city` varchar(50) DEFAULT NULL COMMENT '用户所在城市',
  `su_district` varchar(100) DEFAULT NULL COMMENT '用户所在地区',
  `su_dept_id` bigint(20) DEFAULT NULL COMMENT '用户所属部门ID',
  `su_email` varchar(100) DEFAULT NULL COMMENT '用户电子邮箱',
  `su_mobile` varchar(20) DEFAULT NULL COMMENT '用户电话号码',
  `su_status` tinyint(4) DEFAULT '0' COMMENT '用户状态，0不可用，1可用',
  `su_create_uid` tinyint(4) DEFAULT NULL COMMENT '用户信息创建者ID',
  `su_create_dt` datetime DEFAULT NULL COMMENT '用户信息创建时间(格式：yyyy-MM-dd hh:mm:ss)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `sys_user` */

insert  into `sys_user`(`id`,`su_name`,`su_login_name`,`su_login_passwd`,`su_sex`,`su_birth_dt`,`su_icon`,`su_address`,`su_province`,`su_city`,`su_district`,`su_dept_id`,`su_email`,`su_mobile`,`su_status`,`su_create_uid`,`su_create_dt`) values (1,'aaa','aaa','1',1,'2019-05-06','1','1','1','1','1',1,'1','1',0,1,'2019-09-14 11:03:55'),(2,'bbb','bbb','1',1,'2019-09-11',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL);

/*Table structure for table `sys_user_role` */

DROP TABLE IF EXISTS `sys_user_role`;

CREATE TABLE `sys_user_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `sur_user_id` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `sur_role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='用户与角色对应关系';

/*Data for the table `sys_user_role` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
