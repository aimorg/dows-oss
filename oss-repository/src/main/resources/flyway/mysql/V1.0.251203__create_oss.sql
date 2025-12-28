-- 若库不存在创建一个
CREATE DATABASE IF NOT EXISTS `oss`;
USE `oss`;

drop table if exists `oss_identifier`;
CREATE TABLE IF NOT EXISTS `oss_identifier`(
    `oss_identifier_id` bigint(19) NOT NULL COMMENT '账号标识ID',
    `account_instance_id` bigint(19) DEFAULT NULL COMMENT '账号实例ID',
    `secret_id` varchar(64) DEFAULT NULL COMMENT '密钥ID',
    `secret_key` varchar(64) DEFAULT NULL COMMENT '密钥KEY',
    `channel` varchar(64) DEFAULT NULL COMMENT '存储通道[cos,oss,qiniu]',
    `config_json` varchar(64) DEFAULT NULL COMMENT '第三方存储JSON配置',
    `disable` tinyint(4) DEFAULT NULL COMMENT '是否启用',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`oss_identifier_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `oss_bucket`;
CREATE TABLE IF NOT EXISTS `oss_bucket`(
    `oss_bucket_id` bigint(19) NOT NULL COMMENT '存储空间ID',
    `oss_identifier_id` bigint(19) DEFAULT NULL COMMENT '账号标识ID',
    `region` varchar(64) DEFAULT NULL COMMENT '区域',
    `bucket_name` varchar(64) DEFAULT NULL COMMENT '桶名称',
    `folder_count` integer(11) DEFAULT NULL COMMENT '目录数',
    `file_count` integer(11) DEFAULT NULL COMMENT '文件数',
    `current_size` integer(11) DEFAULT NULL COMMENT '当前桶大小',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`oss_bucket_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `oss_trigger`;
CREATE TABLE IF NOT EXISTS `oss_trigger`(
    `oss_trigger_id` bigint(19) NOT NULL COMMENT '触发ID',
    `oss_identifier_id` bigint(19) DEFAULT NULL COMMENT '账号标识ID',
    `trigger` varchar(64) DEFAULT NULL COMMENT '触发器（MCP[解析、编码，OCR，发布多平台...]）',
    `callback` varchar(64) DEFAULT NULL COMMENT '回调[http:',
    `target` varchar(64) DEFAULT NULL COMMENT '目标',
    `config_json` varchar(64) DEFAULT NULL COMMENT '触发参数(配置{retry:3,压缩率:10,...})',
    `retry_count` integer(11) DEFAULT NULL COMMENT '重试次数',
    `seq` integer(11) DEFAULT NULL COMMENT '顺序',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`oss_trigger_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `oss_file`;
CREATE TABLE IF NOT EXISTS `oss_file`(
    `oss_file_id` bigint(19) NOT NULL COMMENT '文件ID',
    `oss_bucket_id` bigint(19) DEFAULT NULL COMMENT '存储空间ID',
    `oss_upload_id` bigint(19) DEFAULT NULL COMMENT '上传ID',
    `source` varchar(64) DEFAULT NULL COMMENT '来源（uim',
    `bucket_path` varchar(64) DEFAULT NULL COMMENT '存储路径',
    `file_name` varchar(64) DEFAULT NULL COMMENT '原文件名',
    `file_path` varchar(64) DEFAULT NULL COMMENT '文件存储路径',
    `file_ext` varchar(64) DEFAULT NULL COMMENT '文件后缀',
    `file_link` varchar(64) DEFAULT NULL COMMENT '文件全量路径',
    `cipher` varchar(64) DEFAULT NULL COMMENT '访问密码',
    `md5` varchar(64) DEFAULT NULL COMMENT '原始md5',
    `encoding` varchar(64) DEFAULT NULL COMMENT '编码格式',
    `file_info` varchar(64) DEFAULT NULL COMMENT '文件信息(扩展信息json格式{分辨率:100,长:,宽:...})',
    `file_size` integer(11) DEFAULT NULL COMMENT '原始文件大小KB',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`oss_file_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `oss_access`;
CREATE TABLE IF NOT EXISTS `oss_access`(
    `oss_access_id` bigint(19) NOT NULL COMMENT '访问ID',
    `accont_instance_id` bigint(19) DEFAULT NULL COMMENT '访问账号ID',
    `oss_file_id` bigint(19) DEFAULT NULL COMMENT '文件ID',
    `expire_time` datetime DEFAULT NULL COMMENT '访问过期时间',
    `secret_key` varchar(64) DEFAULT NULL COMMENT '访问密钥',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`oss_access_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `oss_download`;
CREATE TABLE IF NOT EXISTS `oss_download`(
    `oss_download_id` bigint(19) NOT NULL COMMENT '下载ID',
    `account_instance_id` bigint(19) DEFAULT NULL COMMENT '账号实例ID',
    `oss_file_id` bigint(19) DEFAULT NULL COMMENT '文件ID',
    `process` bigint(19) DEFAULT NULL COMMENT '下载进度',
    `state` integer(11) DEFAULT NULL COMMENT '状态',
    `link` varchar(64) DEFAULT NULL COMMENT '下载连接',
    `file_name` varchar(64) DEFAULT NULL COMMENT '存储文件名(另存为可重命名)',
    `local_path` varchar(64) DEFAULT NULL COMMENT '本地路径(异步下载时可端点继传，确保文件路径存在)',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`oss_download_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `oss_setting`;
CREATE TABLE IF NOT EXISTS `oss_setting`(
    `oss_setting_id` bigint(19) NOT NULL COMMENT '存储设置ID',
    `correlative_id` bigint(19) DEFAULT NULL COMMENT '关联源ID',
    `correlative_source` varchar(64) DEFAULT NULL COMMENT '关联源',
    `key_name` varchar(64) DEFAULT NULL COMMENT '配置键名[触发器配置，其他配置......]',
    `set_value` varchar(64) DEFAULT NULL COMMENT '键值',
    `data_type` varchar(64) DEFAULT NULL COMMENT '数据类型[class,string,integer,json...]',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`oss_setting_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `oss_metric`;
CREATE TABLE IF NOT EXISTS `oss_metric`(
    `oss_metric_id` bigint(19) NOT NULL COMMENT '统计ID',
    `oss_file_id` bigint(19) DEFAULT NULL COMMENT '文件ID',
    `type` integer(11) DEFAULT NULL COMMENT '统计类型(0:pv,1:uv,2:播放,3:收藏，4：下载)',
    `count` bigint(19) DEFAULT NULL COMMENT '数量',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`oss_metric_id`)
) ENGINE=InnoDB COMMENT='';


