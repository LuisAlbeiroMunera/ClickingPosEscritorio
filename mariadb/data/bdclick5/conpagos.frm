TYPE=VIEW
query=(select `bdclick5`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick5`.`bdcxp`.`tipo` AS `tipo`,sum(`bdclick5`.`bdcxp`.`valor`) AS `SumaDevalor`,`bdclick5`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick5`.`bdcxp`.`estado` AS `estado` from (`bdclick5`.`bdingreso` left join `bdclick5`.`bdcxp` on((`bdclick5`.`bdingreso`.`id` = `bdclick5`.`bdcxp`.`ingreso`))) group by `bdclick5`.`bdcxp`.`ingreso`,`bdclick5`.`bdcxp`.`tipo`,`bdclick5`.`bdingreso`.`proveedor`,`bdclick5`.`bdcxp`.`estado` having ((`bdclick5`.`bdcxp`.`tipo` = \'PAGO\') and (`bdclick5`.`bdcxp`.`estado` <> \'ANULADO\')))
md5=c778657c49ede2f0d60ef875017c3da5
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:45
create-version=2
source=(select `bdcxp`.`ingreso` AS `ingreso`,`bdcxp`.`tipo` AS `tipo`,sum(`bdcxp`.`valor`) AS `SumaDevalor`,`bdingreso`.`proveedor` AS `proveedor`,`bdcxp`.`estado` AS `estado` from (`bdingreso` left join `bdcxp` on((`bdingreso`.`id` = `bdcxp`.`ingreso`))) group by `bdcxp`.`ingreso`,`bdcxp`.`tipo`,`bdingreso`.`proveedor`,`bdcxp`.`estado` having ((`bdcxp`.`tipo` = \'PAGO\') and (`bdcxp`.`estado` <> \'ANULADO\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick5`.`bdcxp`.`tipo` AS `tipo`,sum(`bdclick5`.`bdcxp`.`valor`) AS `SumaDevalor`,`bdclick5`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick5`.`bdcxp`.`estado` AS `estado` from (`bdclick5`.`bdingreso` left join `bdclick5`.`bdcxp` on((`bdclick5`.`bdingreso`.`id` = `bdclick5`.`bdcxp`.`ingreso`))) group by `bdclick5`.`bdcxp`.`ingreso`,`bdclick5`.`bdcxp`.`tipo`,`bdclick5`.`bdingreso`.`proveedor`,`bdclick5`.`bdcxp`.`estado` having ((`bdclick5`.`bdcxp`.`tipo` = \'PAGO\') and (`bdclick5`.`bdcxp`.`estado` <> \'ANULADO\')))
mariadb-version=100135
