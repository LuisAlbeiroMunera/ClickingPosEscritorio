TYPE=VIEW
query=(select `bdclick6`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick6`.`bdcxp`.`tipo` AS `tipo`,sum(`bdclick6`.`bdcxp`.`valor`) AS `SumaDevalor`,`bdclick6`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick6`.`bdcxp`.`estado` AS `estado` from (`bdclick6`.`bdingreso` left join `bdclick6`.`bdcxp` on((`bdclick6`.`bdingreso`.`id` = `bdclick6`.`bdcxp`.`ingreso`))) group by `bdclick6`.`bdcxp`.`ingreso`,`bdclick6`.`bdcxp`.`tipo`,`bdclick6`.`bdingreso`.`proveedor`,`bdclick6`.`bdcxp`.`estado` having ((`bdclick6`.`bdcxp`.`tipo` = \'PAGO\') and (`bdclick6`.`bdcxp`.`estado` <> \'ANULADO\')))
md5=a56789f34c276d6dd1dda724d00e095a
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:34
create-version=2
source=(select `bdcxp`.`ingreso` AS `ingreso`,`bdcxp`.`tipo` AS `tipo`,sum(`bdcxp`.`valor`) AS `SumaDevalor`,`bdingreso`.`proveedor` AS `proveedor`,`bdcxp`.`estado` AS `estado` from (`bdingreso` left join `bdcxp` on((`bdingreso`.`id` = `bdcxp`.`ingreso`))) group by `bdcxp`.`ingreso`,`bdcxp`.`tipo`,`bdingreso`.`proveedor`,`bdcxp`.`estado` having ((`bdcxp`.`tipo` = \'PAGO\') and (`bdcxp`.`estado` <> \'ANULADO\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick6`.`bdcxp`.`tipo` AS `tipo`,sum(`bdclick6`.`bdcxp`.`valor`) AS `SumaDevalor`,`bdclick6`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick6`.`bdcxp`.`estado` AS `estado` from (`bdclick6`.`bdingreso` left join `bdclick6`.`bdcxp` on((`bdclick6`.`bdingreso`.`id` = `bdclick6`.`bdcxp`.`ingreso`))) group by `bdclick6`.`bdcxp`.`ingreso`,`bdclick6`.`bdcxp`.`tipo`,`bdclick6`.`bdingreso`.`proveedor`,`bdclick6`.`bdcxp`.`estado` having ((`bdclick6`.`bdcxp`.`tipo` = \'PAGO\') and (`bdclick6`.`bdcxp`.`estado` <> \'ANULADO\')))
mariadb-version=100135
