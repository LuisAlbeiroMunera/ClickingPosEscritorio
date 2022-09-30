TYPE=VIEW
query=(select `bdclick`.`referidos1`.`Id` AS `Id`,`bdclick`.`referidos1`.`nombre` AS `nombre`,`bdclick`.`referidos1`.`telefono` AS `telefono`,`bdclick`.`referidos1`.`celular` AS `celular`,`bdclick`.`referidos1`.`direccion` AS `direccion`,if(isnull(`bdclick`.`referidos1`.`tercero`),\'\',`bdclick`.`referidos1`.`tercero`) AS `tercero2`,`bdclick`.`referidos1`.`referido` AS `referido` from `bdclick`.`referidos1` where (if(isnull(`bdclick`.`referidos1`.`tercero`),\'\',`bdclick`.`referidos1`.`tercero`) = \'\'))
md5=9cc2e3679705432477f67a66fd4adb6a
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:26
create-version=2
source=(select `referidos1`.`Id` AS `Id`,`referidos1`.`nombre` AS `nombre`,`referidos1`.`telefono` AS `telefono`,`referidos1`.`celular` AS `celular`,`referidos1`.`direccion` AS `direccion`,if(isnull(`referidos1`.`tercero`),\'\',`referidos1`.`tercero`) AS `tercero2`,`referidos1`.`referido` AS `referido` from `referidos1` where (if(isnull(`referidos1`.`tercero`),\'\',`referidos1`.`tercero`) = \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`referidos1`.`Id` AS `Id`,`bdclick`.`referidos1`.`nombre` AS `nombre`,`bdclick`.`referidos1`.`telefono` AS `telefono`,`bdclick`.`referidos1`.`celular` AS `celular`,`bdclick`.`referidos1`.`direccion` AS `direccion`,if(isnull(`bdclick`.`referidos1`.`tercero`),\'\',`bdclick`.`referidos1`.`tercero`) AS `tercero2`,`bdclick`.`referidos1`.`referido` AS `referido` from `bdclick`.`referidos1` where (if(isnull(`bdclick`.`referidos1`.`tercero`),\'\',`bdclick`.`referidos1`.`tercero`) = \'\'))
mariadb-version=100135
