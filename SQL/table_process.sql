CREATE TABLE `process` (
 `id` char(36) NOT NULL COMMENT 'uuidで構成される中間成果物processの通しID',
 `divtime` datetime NOT NULL COMMENT '日時で構成される中間成果物processの作版識別符号',
 `divname` text NOT NULL COMMENT '中間成果物に付けられる版ごとのタイトル。通常は初版に準じ、公開タイトルとは異なる。',
 `comment` text COMMENT '版ごとのコメント。',
 `predivtime` datetime DEFAULT NULL COMMENT '版を改めた際の元になった版のdivtime',
 `artifactsid` char(36) DEFAULT NULL COMMENT '公開成果物artifactsのuuidで構成されるID.',
 PRIMARY KEY (`id`,`divtime`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

