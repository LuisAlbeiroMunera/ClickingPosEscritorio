TYPE=VIEW
query=(select `bdclick3`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick3`.`bdcxp`.`tipo` AS `tipo`,sum(`bdclick3`.`bdcxp`.`valor`) AS `SumaDevalor`,`bdclick3`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick3`.`bdcxp`.`estado` AS `estado` from (`bdclick3`.`bdingreso` left join `bdclick3`.`bdcxp` on((`bdclick3`.`bdingreso`.`id` = `bdclick3`.`bdcxp`.`ingreso`))) group by `bdclick3`.`bdcxp`.`ingreso`,`bdclick3`.`bdcxp`.`tipo`,`bdclick3`.`bdingreso`.`proveedor`,`bdclick3`.`bdcxp`.`estado` having ((`bdclick3`.`bdcxp`.`tipo` = \'PAGO\') and (`bdclick3`.`bdcxp`.`estado` <> \'ANULADO\')))
md5=c48fc62de56a47200fe1d10e0e4ff6b8
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:49
create-version=2
source=(select `bdcxp`.`ingreso` AS `ingreso`,`bdcxp`.`tipo` AS `tipo`,sum(`bdcxp`.`valor`) AS `SumaDevalor`,`bdingreso`.`proveedor` AS `proveedor`,`bdcxp`.`estado` AS `estado` from (`bdingreso` left join `bdcxp` on((`bdingreso`.`id` = `bdcxp`.`ingreso`))) group by `bdcxp`.`ingreso`,`bdcxp`.`tipo`,`bdingreso`.`proveedor`,`bdcxp`.`estado` having ((`bdcxp`.`tipo` = \'PAGO\') and (`bdcxp`.`estado` <> \'ANULADO\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdcxp`.`ingreso` AS `ingreso`,`bdclick3`.`bdcxp`.`tipo` AS `tipo`,sum(`bdclick3`.`bdcxp`.`valor`) AS `SumaDevalor`,`bdclick3`.`bdingreso`.`proveedor` AS `proveedor`,`bdclick3`.`bdcxp`.`estado` AS `estado` from (`bdclick3`.`bdingreso` left join `bdclick3`.`bdcxp` on((`bdclick3`.`bdingreso`.`id` = `bdclick3`.`bdcxp`.`ingreso`))) group by `bdclick3`.`bdcxp`.`ingreso`,`bdclick3`.`bdcxp`.`tipo`,`bdclick3`.`bdingreso`.`proveedor`,`bdclick3`.`bdcxp`.`estado` having ((`bdclick3`.`bdcxp`.`tipo` = \'PAGO\') and (`bdclick3`.`bdcxp`.`estado` <> \'ANULADO\')))
mariadb-version=100135
