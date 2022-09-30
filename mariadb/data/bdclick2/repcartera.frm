TYPE=VIEW
query=(select `bdclick2`.`bdcxc`.`factura2` AS `fact`,`bdclick2`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick2`.`bdcxc`.`valor`) AS `valor`,`bdclick2`.`bdcxc`.`estado` AS `estado`,`bdclick2`.`bdverificadorfacturas`.`factura` AS `factura`,`bdclick2`.`bdverificadorfacturas`.`terminal` AS `terminal`,`bdclick2`.`bdverificadorfacturas`.`placa` AS `placa` from (`bdclick2`.`bdcxc` left join `bdclick2`.`bdverificadorfacturas` on((`bdclick2`.`bdcxc`.`factura2` = `bdclick2`.`bdverificadorfacturas`.`factura`))) group by `bdclick2`.`bdcxc`.`factura2`,`bdclick2`.`bdcxc`.`tipo`,`bdclick2`.`bdcxc`.`estado`,`bdclick2`.`bdverificadorfacturas`.`factura`,`bdclick2`.`bdverificadorfacturas`.`terminal`,`bdclick2`.`bdverificadorfacturas`.`placa` having ((`bdclick2`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick2`.`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
md5=3b1c3c59cad5ac4cd5ef9c46c8d12968
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:47
create-version=2
source=(select `bdcxc`.`factura2` AS `fact`,`bdcxc`.`tipo` AS `tipo`,sum(`bdcxc`.`valor`) AS `valor`,`bdcxc`.`estado` AS `estado`,`bdverificadorfacturas`.`factura` AS `factura`,`bdverificadorfacturas`.`terminal` AS `terminal`,`bdverificadorfacturas`.`placa` AS `placa` from (`bdcxc` left join `bdverificadorfacturas` on((`bdcxc`.`factura2` = `bdverificadorfacturas`.`factura`))) group by `bdcxc`.`factura2`,`bdcxc`.`tipo`,`bdcxc`.`estado`,`bdverificadorfacturas`.`factura`,`bdverificadorfacturas`.`terminal`,`bdverificadorfacturas`.`placa` having ((`bdcxc`.`tipo` = \'ABONO\') and (`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bdcxc`.`factura2` AS `fact`,`bdclick2`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick2`.`bdcxc`.`valor`) AS `valor`,`bdclick2`.`bdcxc`.`estado` AS `estado`,`bdclick2`.`bdverificadorfacturas`.`factura` AS `factura`,`bdclick2`.`bdverificadorfacturas`.`terminal` AS `terminal`,`bdclick2`.`bdverificadorfacturas`.`placa` AS `placa` from (`bdclick2`.`bdcxc` left join `bdclick2`.`bdverificadorfacturas` on((`bdclick2`.`bdcxc`.`factura2` = `bdclick2`.`bdverificadorfacturas`.`factura`))) group by `bdclick2`.`bdcxc`.`factura2`,`bdclick2`.`bdcxc`.`tipo`,`bdclick2`.`bdcxc`.`estado`,`bdclick2`.`bdverificadorfacturas`.`factura`,`bdclick2`.`bdverificadorfacturas`.`terminal`,`bdclick2`.`bdverificadorfacturas`.`placa` having ((`bdclick2`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick2`.`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
mariadb-version=100135
