TYPE=VIEW
query=(select `bdclick`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick`.`bdcxp`.`tipo` AS `tipo`,sum(`bdclick`.`bdcxp`.`valor`) AS `SumaDevalor`,`bdclick`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick`.`bdcxp`.`estado` AS `estado` from (`bdclick`.`bdingreso` left join `bdclick`.`bdcxp` on((`bdclick`.`bdingreso`.`id` = `bdclick`.`bdcxp`.`ingreso`))) group by `bdclick`.`bdcxp`.`ingreso`,`bdclick`.`bdcxp`.`tipo`,`bdclick`.`bdingreso`.`proveedor`,`bdclick`.`bdcxp`.`estado` having ((`bdclick`.`bdcxp`.`tipo` = \'PAGO\') and (`bdclick`.`bdcxp`.`estado` <> \'ANULADO\')))
md5=445ecbd324e4973390a392d155f92f4b
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:22
create-version=2
source=(select `bdcxp`.`ingreso` AS `ingreso`,`bdcxp`.`tipo` AS `tipo`,sum(`bdcxp`.`valor`) AS `SumaDevalor`,`bdingreso`.`proveedor` AS `proveedor`,`bdcxp`.`estado` AS `estado` from (`bdingreso` left join `bdcxp` on((`bdingreso`.`id` = `bdcxp`.`ingreso`))) group by `bdcxp`.`ingreso`,`bdcxp`.`tipo`,`bdingreso`.`proveedor`,`bdcxp`.`estado` having ((`bdcxp`.`tipo` = \'PAGO\') and (`bdcxp`.`estado` <> \'ANULADO\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick`.`bdcxp`.`tipo` AS `tipo`,sum(`bdclick`.`bdcxp`.`valor`) AS `SumaDevalor`,`bdclick`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick`.`bdcxp`.`estado` AS `estado` from (`bdclick`.`bdingreso` left join `bdclick`.`bdcxp` on((`bdclick`.`bdingreso`.`id` = `bdclick`.`bdcxp`.`ingreso`))) group by `bdclick`.`bdcxp`.`ingreso`,`bdclick`.`bdcxp`.`tipo`,`bdclick`.`bdingreso`.`proveedor`,`bdclick`.`bdcxp`.`estado` having ((`bdclick`.`bdcxp`.`tipo` = \'PAGO\') and (`bdclick`.`bdcxp`.`estado` <> \'ANULADO\')))
mariadb-version=100135
