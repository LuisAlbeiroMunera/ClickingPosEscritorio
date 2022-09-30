TYPE=VIEW
query=(select `bdclick2`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick2`.`bdcxp`.`tipo` AS `tipo`,sum(`bdclick2`.`bdcxp`.`valor`) AS `SumaDevalor`,`bdclick2`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick2`.`bdcxp`.`estado` AS `estado` from (`bdclick2`.`bdingreso` left join `bdclick2`.`bdcxp` on((`bdclick2`.`bdingreso`.`id` = `bdclick2`.`bdcxp`.`ingreso`))) group by `bdclick2`.`bdcxp`.`ingreso`,`bdclick2`.`bdcxp`.`tipo`,`bdclick2`.`bdingreso`.`proveedor`,`bdclick2`.`bdcxp`.`estado` having ((`bdclick2`.`bdcxp`.`tipo` = \'PAGO\') and (`bdclick2`.`bdcxp`.`estado` <> \'ANULADO\')))
md5=2dd02a7e120d2a0ade9110f987ab2860
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:43
create-version=2
source=(select `bdcxp`.`ingreso` AS `ingreso`,`bdcxp`.`tipo` AS `tipo`,sum(`bdcxp`.`valor`) AS `SumaDevalor`,`bdingreso`.`proveedor` AS `proveedor`,`bdcxp`.`estado` AS `estado` from (`bdingreso` left join `bdcxp` on((`bdingreso`.`id` = `bdcxp`.`ingreso`))) group by `bdcxp`.`ingreso`,`bdcxp`.`tipo`,`bdingreso`.`proveedor`,`bdcxp`.`estado` having ((`bdcxp`.`tipo` = \'PAGO\') and (`bdcxp`.`estado` <> \'ANULADO\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick2`.`bdcxp`.`tipo` AS `tipo`,sum(`bdclick2`.`bdcxp`.`valor`) AS `SumaDevalor`,`bdclick2`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick2`.`bdcxp`.`estado` AS `estado` from (`bdclick2`.`bdingreso` left join `bdclick2`.`bdcxp` on((`bdclick2`.`bdingreso`.`id` = `bdclick2`.`bdcxp`.`ingreso`))) group by `bdclick2`.`bdcxp`.`ingreso`,`bdclick2`.`bdcxp`.`tipo`,`bdclick2`.`bdingreso`.`proveedor`,`bdclick2`.`bdcxp`.`estado` having ((`bdclick2`.`bdcxp`.`tipo` = \'PAGO\') and (`bdclick2`.`bdcxp`.`estado` <> \'ANULADO\')))
mariadb-version=100135
