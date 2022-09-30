TYPE=VIEW
query=(select `bdclick4`.`bdcxc`.`factura` AS `fact`,`bdclick4`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick4`.`bdcxc`.`valor`) AS `valor`,`bdclick4`.`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`bdclick4`.`bdcuentacobro`.`terminal` AS `terminal`,`bdclick4`.`bdcuentacobro`.`placa` AS `placa` from (`bdclick4`.`bdcxc` left join `bdclick4`.`bdcuentacobro` on((`bdclick4`.`bdcuentacobro`.`factura` = `bdclick4`.`bdcxc`.`factura2`))) group by `bdclick4`.`bdcxc`.`factura`,`bdclick4`.`bdcxc`.`tipo`,`bdclick4`.`bdcxc`.`estado`,\'\',`bdclick4`.`bdcuentacobro`.`terminal`,`bdclick4`.`bdcuentacobro`.`placa` having ((`bdclick4`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick4`.`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
md5=ee8f466c5636ad4c8cf98448f896f1ee
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:30
create-version=2
source=(select `bdcxc`.`factura` AS `fact`,`bdcxc`.`tipo` AS `tipo`,sum(`bdcxc`.`valor`) AS `valor`,`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`bdcuentacobro`.`terminal` AS `terminal`,`bdcuentacobro`.`placa` AS `placa` from (`bdcxc` left join `bdcuentacobro` on((`bdcuentacobro`.`factura` = `bdcxc`.`factura2`))) group by `bdcxc`.`factura`,`bdcxc`.`tipo`,`bdcxc`.`estado`,\'\',`bdcuentacobro`.`terminal`,`bdcuentacobro`.`placa` having ((`bdcxc`.`tipo` = \'ABONO\') and (`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdcxc`.`factura` AS `fact`,`bdclick4`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick4`.`bdcxc`.`valor`) AS `valor`,`bdclick4`.`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`bdclick4`.`bdcuentacobro`.`terminal` AS `terminal`,`bdclick4`.`bdcuentacobro`.`placa` AS `placa` from (`bdclick4`.`bdcxc` left join `bdclick4`.`bdcuentacobro` on((`bdclick4`.`bdcuentacobro`.`factura` = `bdclick4`.`bdcxc`.`factura2`))) group by `bdclick4`.`bdcxc`.`factura`,`bdclick4`.`bdcxc`.`tipo`,`bdclick4`.`bdcxc`.`estado`,\'\',`bdclick4`.`bdcuentacobro`.`terminal`,`bdclick4`.`bdcuentacobro`.`placa` having ((`bdclick4`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick4`.`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
mariadb-version=100135
