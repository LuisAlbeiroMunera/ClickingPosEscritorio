TYPE=VIEW
query=(select `bdclick1`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick1`.`bdcxp`.`tipo` AS `tipo`,sum(`bdclick1`.`bdcxp`.`valor`) AS `SumaDevalor`,`bdclick1`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick1`.`bdcxp`.`estado` AS `estado` from (`bdclick1`.`bdingreso` left join `bdclick1`.`bdcxp` on((`bdclick1`.`bdingreso`.`id` = `bdclick1`.`bdcxp`.`ingreso`))) group by `bdclick1`.`bdcxp`.`ingreso`,`bdclick1`.`bdcxp`.`tipo`,`bdclick1`.`bdingreso`.`proveedor`,`bdclick1`.`bdcxp`.`estado` having ((`bdclick1`.`bdcxp`.`tipo` = \'PAGO\') and (`bdclick1`.`bdcxp`.`estado` <> \'ANULADO\')))
md5=fcf2edecfdca5a430375d0deff091214
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:33
create-version=2
source=(select `bdcxp`.`ingreso` AS `ingreso`,`bdcxp`.`tipo` AS `tipo`,sum(`bdcxp`.`valor`) AS `SumaDevalor`,`bdingreso`.`proveedor` AS `proveedor`,`bdcxp`.`estado` AS `estado` from (`bdingreso` left join `bdcxp` on((`bdingreso`.`id` = `bdcxp`.`ingreso`))) group by `bdcxp`.`ingreso`,`bdcxp`.`tipo`,`bdingreso`.`proveedor`,`bdcxp`.`estado` having ((`bdcxp`.`tipo` = \'PAGO\') and (`bdcxp`.`estado` <> \'ANULADO\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick1`.`bdcxp`.`tipo` AS `tipo`,sum(`bdclick1`.`bdcxp`.`valor`) AS `SumaDevalor`,`bdclick1`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick1`.`bdcxp`.`estado` AS `estado` from (`bdclick1`.`bdingreso` left join `bdclick1`.`bdcxp` on((`bdclick1`.`bdingreso`.`id` = `bdclick1`.`bdcxp`.`ingreso`))) group by `bdclick1`.`bdcxp`.`ingreso`,`bdclick1`.`bdcxp`.`tipo`,`bdclick1`.`bdingreso`.`proveedor`,`bdclick1`.`bdcxp`.`estado` having ((`bdclick1`.`bdcxp`.`tipo` = \'PAGO\') and (`bdclick1`.`bdcxp`.`estado` <> \'ANULADO\')))
mariadb-version=100135
