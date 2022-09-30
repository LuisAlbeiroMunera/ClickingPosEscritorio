TYPE=VIEW
query=(select `bdclick2`.`referidos1`.`Id` AS `Id`,`bdclick2`.`referidos1`.`nombre` AS `nombre`,`bdclick2`.`referidos1`.`telefono` AS `telefono`,`bdclick2`.`referidos1`.`celular` AS `celular`,`bdclick2`.`referidos1`.`direccion` AS `direccion`,if(isnull(`bdclick2`.`referidos1`.`tercero`),\'\',`bdclick2`.`referidos1`.`tercero`) AS `tercero2`,`bdclick2`.`referidos1`.`referido` AS `referido` from `bdclick2`.`referidos1` where (if(isnull(`bdclick2`.`referidos1`.`tercero`),\'\',`bdclick2`.`referidos1`.`tercero`) = \'\'))
md5=d28a9a89de5ef30850a09a983b967767
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:47
create-version=2
source=(select `referidos1`.`Id` AS `Id`,`referidos1`.`nombre` AS `nombre`,`referidos1`.`telefono` AS `telefono`,`referidos1`.`celular` AS `celular`,`referidos1`.`direccion` AS `direccion`,if(isnull(`referidos1`.`tercero`),\'\',`referidos1`.`tercero`) AS `tercero2`,`referidos1`.`referido` AS `referido` from `referidos1` where (if(isnull(`referidos1`.`tercero`),\'\',`referidos1`.`tercero`) = \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`referidos1`.`Id` AS `Id`,`bdclick2`.`referidos1`.`nombre` AS `nombre`,`bdclick2`.`referidos1`.`telefono` AS `telefono`,`bdclick2`.`referidos1`.`celular` AS `celular`,`bdclick2`.`referidos1`.`direccion` AS `direccion`,if(isnull(`bdclick2`.`referidos1`.`tercero`),\'\',`bdclick2`.`referidos1`.`tercero`) AS `tercero2`,`bdclick2`.`referidos1`.`referido` AS `referido` from `bdclick2`.`referidos1` where (if(isnull(`bdclick2`.`referidos1`.`tercero`),\'\',`bdclick2`.`referidos1`.`tercero`) = \'\'))
mariadb-version=100135
