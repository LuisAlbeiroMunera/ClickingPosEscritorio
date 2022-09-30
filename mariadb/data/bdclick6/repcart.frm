TYPE=VIEW
query=(select `bdclick6`.`bdcxc`.`factura2` AS `fact`,`bdclick6`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick6`.`bdcxc`.`valor`) AS `valor`,`bdclick6`.`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`bdclick6`.`bdverificadorfacturas`.`terminal` AS `terminal`,`bdclick6`.`bdverificadorfacturas`.`placa` AS `placa` from (`bdclick6`.`bdcxc` left join `bdclick6`.`bdverificadorfacturas` on((`bdclick6`.`bdcxc`.`factura2` = `bdclick6`.`bdverificadorfacturas`.`factura`))) group by `bdclick6`.`bdcxc`.`factura`,`bdclick6`.`bdcxc`.`tipo`,`bdclick6`.`bdcxc`.`estado`,\'\',`bdclick6`.`bdverificadorfacturas`.`terminal`,`bdclick6`.`bdverificadorfacturas`.`placa` having ((`bdclick6`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick6`.`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
md5=65b3615a47a6d0d0434a13412d6dd052
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:37
create-version=2
source=(select `bdcxc`.`factura2` AS `fact`,`bdcxc`.`tipo` AS `tipo`,sum(`bdcxc`.`valor`) AS `valor`,`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`bdverificadorfacturas`.`terminal` AS `terminal`,`bdverificadorfacturas`.`placa` AS `placa` from (`bdcxc` left join `bdverificadorfacturas` on((`bdcxc`.`factura2` = `bdverificadorfacturas`.`factura`))) group by `bdcxc`.`factura`,`bdcxc`.`tipo`,`bdcxc`.`estado`,\'\',`bdverificadorfacturas`.`terminal`,`bdverificadorfacturas`.`placa` having ((`bdcxc`.`tipo` = \'ABONO\') and (`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdcxc`.`factura2` AS `fact`,`bdclick6`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick6`.`bdcxc`.`valor`) AS `valor`,`bdclick6`.`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`bdclick6`.`bdverificadorfacturas`.`terminal` AS `terminal`,`bdclick6`.`bdverificadorfacturas`.`placa` AS `placa` from (`bdclick6`.`bdcxc` left join `bdclick6`.`bdverificadorfacturas` on((`bdclick6`.`bdcxc`.`factura2` = `bdclick6`.`bdverificadorfacturas`.`factura`))) group by `bdclick6`.`bdcxc`.`factura`,`bdclick6`.`bdcxc`.`tipo`,`bdclick6`.`bdcxc`.`estado`,\'\',`bdclick6`.`bdverificadorfacturas`.`terminal`,`bdclick6`.`bdverificadorfacturas`.`placa` having ((`bdclick6`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick6`.`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
mariadb-version=100135
