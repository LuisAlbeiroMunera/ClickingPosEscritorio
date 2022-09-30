TYPE=VIEW
query=(select `bdclick4`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick4`.`bdcxp`.`tipo` AS `tipo`,sum(`bdclick4`.`bdcxp`.`valor`) AS `SumaDevalor`,`bdclick4`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick4`.`bdcxp`.`estado` AS `estado` from (`bdclick4`.`bdingreso` left join `bdclick4`.`bdcxp` on((`bdclick4`.`bdingreso`.`id` = `bdclick4`.`bdcxp`.`ingreso`))) group by `bdclick4`.`bdcxp`.`ingreso`,`bdclick4`.`bdcxp`.`tipo`,`bdclick4`.`bdingreso`.`proveedor`,`bdclick4`.`bdcxp`.`estado` having ((`bdclick4`.`bdcxp`.`tipo` = \'PAGO\') and (`bdclick4`.`bdcxp`.`estado` <> \'ANULADO\')))
md5=12d7943e0a9ef245348d28f4e8298bbf
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:26
create-version=2
source=(select `bdcxp`.`ingreso` AS `ingreso`,`bdcxp`.`tipo` AS `tipo`,sum(`bdcxp`.`valor`) AS `SumaDevalor`,`bdingreso`.`proveedor` AS `proveedor`,`bdcxp`.`estado` AS `estado` from (`bdingreso` left join `bdcxp` on((`bdingreso`.`id` = `bdcxp`.`ingreso`))) group by `bdcxp`.`ingreso`,`bdcxp`.`tipo`,`bdingreso`.`proveedor`,`bdcxp`.`estado` having ((`bdcxp`.`tipo` = \'PAGO\') and (`bdcxp`.`estado` <> \'ANULADO\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick4`.`bdcxp`.`tipo` AS `tipo`,sum(`bdclick4`.`bdcxp`.`valor`) AS `SumaDevalor`,`bdclick4`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick4`.`bdcxp`.`estado` AS `estado` from (`bdclick4`.`bdingreso` left join `bdclick4`.`bdcxp` on((`bdclick4`.`bdingreso`.`id` = `bdclick4`.`bdcxp`.`ingreso`))) group by `bdclick4`.`bdcxp`.`ingreso`,`bdclick4`.`bdcxp`.`tipo`,`bdclick4`.`bdingreso`.`proveedor`,`bdclick4`.`bdcxp`.`estado` having ((`bdclick4`.`bdcxp`.`tipo` = \'PAGO\') and (`bdclick4`.`bdcxp`.`estado` <> \'ANULADO\')))
mariadb-version=100135
