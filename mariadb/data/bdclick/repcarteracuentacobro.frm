TYPE=VIEW
query=(select `bdclick`.`bdcxc`.`factura` AS `fact`,`bdclick`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick`.`bdcxc`.`valor`) AS `valor`,`bdclick`.`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`bdclick`.`bdcuentacobro`.`terminal` AS `terminal`,`bdclick`.`bdcuentacobro`.`placa` AS `placa` from (`bdclick`.`bdcxc` left join `bdclick`.`bdcuentacobro` on((`bdclick`.`bdcuentacobro`.`factura` = `bdclick`.`bdcxc`.`factura2`))) group by `bdclick`.`bdcxc`.`factura`,`bdclick`.`bdcxc`.`tipo`,`bdclick`.`bdcxc`.`estado`,\'\',`bdclick`.`bdcuentacobro`.`terminal`,`bdclick`.`bdcuentacobro`.`placa` having ((`bdclick`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick`.`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
md5=9f63422a587c16b6f2c5c98e9534b184
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:26
create-version=2
source=(select `bdcxc`.`factura` AS `fact`,`bdcxc`.`tipo` AS `tipo`,sum(`bdcxc`.`valor`) AS `valor`,`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`bdcuentacobro`.`terminal` AS `terminal`,`bdcuentacobro`.`placa` AS `placa` from (`bdcxc` left join `bdcuentacobro` on((`bdcuentacobro`.`factura` = `bdcxc`.`factura2`))) group by `bdcxc`.`factura`,`bdcxc`.`tipo`,`bdcxc`.`estado`,\'\',`bdcuentacobro`.`terminal`,`bdcuentacobro`.`placa` having ((`bdcxc`.`tipo` = \'ABONO\') and (`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdcxc`.`factura` AS `fact`,`bdclick`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick`.`bdcxc`.`valor`) AS `valor`,`bdclick`.`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`bdclick`.`bdcuentacobro`.`terminal` AS `terminal`,`bdclick`.`bdcuentacobro`.`placa` AS `placa` from (`bdclick`.`bdcxc` left join `bdclick`.`bdcuentacobro` on((`bdclick`.`bdcuentacobro`.`factura` = `bdclick`.`bdcxc`.`factura2`))) group by `bdclick`.`bdcxc`.`factura`,`bdclick`.`bdcxc`.`tipo`,`bdclick`.`bdcxc`.`estado`,\'\',`bdclick`.`bdcuentacobro`.`terminal`,`bdclick`.`bdcuentacobro`.`placa` having ((`bdclick`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick`.`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
mariadb-version=100135
