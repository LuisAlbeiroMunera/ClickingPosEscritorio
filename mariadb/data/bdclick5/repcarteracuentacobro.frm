TYPE=VIEW
query=(select `bdclick5`.`bdcxc`.`factura` AS `fact`,`bdclick5`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick5`.`bdcxc`.`valor`) AS `valor`,`bdclick5`.`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`bdclick5`.`bdcuentacobro`.`terminal` AS `terminal`,`bdclick5`.`bdcuentacobro`.`placa` AS `placa` from (`bdclick5`.`bdcxc` left join `bdclick5`.`bdcuentacobro` on((`bdclick5`.`bdcuentacobro`.`factura` = `bdclick5`.`bdcxc`.`factura2`))) group by `bdclick5`.`bdcxc`.`factura`,`bdclick5`.`bdcxc`.`tipo`,`bdclick5`.`bdcxc`.`estado`,\'\',`bdclick5`.`bdcuentacobro`.`terminal`,`bdclick5`.`bdcuentacobro`.`placa` having ((`bdclick5`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick5`.`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
md5=78ee2d1b92332676598219474855f44d
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:49
create-version=2
source=(select `bdcxc`.`factura` AS `fact`,`bdcxc`.`tipo` AS `tipo`,sum(`bdcxc`.`valor`) AS `valor`,`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`bdcuentacobro`.`terminal` AS `terminal`,`bdcuentacobro`.`placa` AS `placa` from (`bdcxc` left join `bdcuentacobro` on((`bdcuentacobro`.`factura` = `bdcxc`.`factura2`))) group by `bdcxc`.`factura`,`bdcxc`.`tipo`,`bdcxc`.`estado`,\'\',`bdcuentacobro`.`terminal`,`bdcuentacobro`.`placa` having ((`bdcxc`.`tipo` = \'ABONO\') and (`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdcxc`.`factura` AS `fact`,`bdclick5`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick5`.`bdcxc`.`valor`) AS `valor`,`bdclick5`.`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`bdclick5`.`bdcuentacobro`.`terminal` AS `terminal`,`bdclick5`.`bdcuentacobro`.`placa` AS `placa` from (`bdclick5`.`bdcxc` left join `bdclick5`.`bdcuentacobro` on((`bdclick5`.`bdcuentacobro`.`factura` = `bdclick5`.`bdcxc`.`factura2`))) group by `bdclick5`.`bdcxc`.`factura`,`bdclick5`.`bdcxc`.`tipo`,`bdclick5`.`bdcxc`.`estado`,\'\',`bdclick5`.`bdcuentacobro`.`terminal`,`bdclick5`.`bdcuentacobro`.`placa` having ((`bdclick5`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick5`.`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
mariadb-version=100135
