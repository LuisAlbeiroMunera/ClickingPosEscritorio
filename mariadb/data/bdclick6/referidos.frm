TYPE=VIEW
query=(select `bdclick6`.`referidos1`.`Id` AS `Id`,`bdclick6`.`referidos1`.`nombre` AS `nombre`,`bdclick6`.`referidos1`.`telefono` AS `telefono`,`bdclick6`.`referidos1`.`celular` AS `celular`,`bdclick6`.`referidos1`.`direccion` AS `direccion`,if(isnull(`bdclick6`.`referidos1`.`tercero`),\'\',`bdclick6`.`referidos1`.`tercero`) AS `tercero2`,`bdclick6`.`referidos1`.`referido` AS `referido` from `bdclick6`.`referidos1` where (if(isnull(`bdclick6`.`referidos1`.`tercero`),\'\',`bdclick6`.`referidos1`.`tercero`) = \'\'))
md5=2ad4f34e8576b227ed3bb6ec2ad5b6cc
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:37
create-version=2
source=(select `referidos1`.`Id` AS `Id`,`referidos1`.`nombre` AS `nombre`,`referidos1`.`telefono` AS `telefono`,`referidos1`.`celular` AS `celular`,`referidos1`.`direccion` AS `direccion`,if(isnull(`referidos1`.`tercero`),\'\',`referidos1`.`tercero`) AS `tercero2`,`referidos1`.`referido` AS `referido` from `referidos1` where (if(isnull(`referidos1`.`tercero`),\'\',`referidos1`.`tercero`) = \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`referidos1`.`Id` AS `Id`,`bdclick6`.`referidos1`.`nombre` AS `nombre`,`bdclick6`.`referidos1`.`telefono` AS `telefono`,`bdclick6`.`referidos1`.`celular` AS `celular`,`bdclick6`.`referidos1`.`direccion` AS `direccion`,if(isnull(`bdclick6`.`referidos1`.`tercero`),\'\',`bdclick6`.`referidos1`.`tercero`) AS `tercero2`,`bdclick6`.`referidos1`.`referido` AS `referido` from `bdclick6`.`referidos1` where (if(isnull(`bdclick6`.`referidos1`.`tercero`),\'\',`bdclick6`.`referidos1`.`tercero`) = \'\'))
mariadb-version=100135
