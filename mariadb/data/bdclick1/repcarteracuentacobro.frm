TYPE=VIEW
query=(select `bdclick1`.`bdcxc`.`factura` AS `fact`,`bdclick1`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick1`.`bdcxc`.`valor`) AS `valor`,`bdclick1`.`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`bdclick1`.`bdcuentacobro`.`terminal` AS `terminal`,`bdclick1`.`bdcuentacobro`.`placa` AS `placa` from (`bdclick1`.`bdcxc` left join `bdclick1`.`bdcuentacobro` on((`bdclick1`.`bdcuentacobro`.`factura` = `bdclick1`.`bdcxc`.`factura2`))) group by `bdclick1`.`bdcxc`.`factura`,`bdclick1`.`bdcxc`.`tipo`,`bdclick1`.`bdcxc`.`estado`,\'\',`bdclick1`.`bdcuentacobro`.`terminal`,`bdclick1`.`bdcuentacobro`.`placa` having ((`bdclick1`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick1`.`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
md5=6c07698ff2b8886cade09d94cccca3c9
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:37
create-version=2
source=(select `bdcxc`.`factura` AS `fact`,`bdcxc`.`tipo` AS `tipo`,sum(`bdcxc`.`valor`) AS `valor`,`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`bdcuentacobro`.`terminal` AS `terminal`,`bdcuentacobro`.`placa` AS `placa` from (`bdcxc` left join `bdcuentacobro` on((`bdcuentacobro`.`factura` = `bdcxc`.`factura2`))) group by `bdcxc`.`factura`,`bdcxc`.`tipo`,`bdcxc`.`estado`,\'\',`bdcuentacobro`.`terminal`,`bdcuentacobro`.`placa` having ((`bdcxc`.`tipo` = \'ABONO\') and (`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bdcxc`.`factura` AS `fact`,`bdclick1`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick1`.`bdcxc`.`valor`) AS `valor`,`bdclick1`.`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`bdclick1`.`bdcuentacobro`.`terminal` AS `terminal`,`bdclick1`.`bdcuentacobro`.`placa` AS `placa` from (`bdclick1`.`bdcxc` left join `bdclick1`.`bdcuentacobro` on((`bdclick1`.`bdcuentacobro`.`factura` = `bdclick1`.`bdcxc`.`factura2`))) group by `bdclick1`.`bdcxc`.`factura`,`bdclick1`.`bdcxc`.`tipo`,`bdclick1`.`bdcxc`.`estado`,\'\',`bdclick1`.`bdcuentacobro`.`terminal`,`bdclick1`.`bdcuentacobro`.`placa` having ((`bdclick1`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick1`.`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
mariadb-version=100135
