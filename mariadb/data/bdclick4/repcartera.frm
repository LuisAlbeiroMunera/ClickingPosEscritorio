TYPE=VIEW
query=(select `bdclick4`.`bdcxc`.`factura2` AS `fact`,`bdclick4`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick4`.`bdcxc`.`valor`) AS `valor`,`bdclick4`.`bdcxc`.`estado` AS `estado`,`bdclick4`.`bdverificadorfacturas`.`factura` AS `factura`,`bdclick4`.`bdverificadorfacturas`.`terminal` AS `terminal`,`bdclick4`.`bdverificadorfacturas`.`placa` AS `placa` from (`bdclick4`.`bdcxc` left join `bdclick4`.`bdverificadorfacturas` on((`bdclick4`.`bdcxc`.`factura2` = `bdclick4`.`bdverificadorfacturas`.`factura`))) group by `bdclick4`.`bdcxc`.`factura2`,`bdclick4`.`bdcxc`.`tipo`,`bdclick4`.`bdcxc`.`estado`,`bdclick4`.`bdverificadorfacturas`.`factura`,`bdclick4`.`bdverificadorfacturas`.`terminal`,`bdclick4`.`bdverificadorfacturas`.`placa` having ((`bdclick4`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick4`.`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
md5=cec04a79732a183393292c33ad7098cc
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:30
create-version=2
source=(select `bdcxc`.`factura2` AS `fact`,`bdcxc`.`tipo` AS `tipo`,sum(`bdcxc`.`valor`) AS `valor`,`bdcxc`.`estado` AS `estado`,`bdverificadorfacturas`.`factura` AS `factura`,`bdverificadorfacturas`.`terminal` AS `terminal`,`bdverificadorfacturas`.`placa` AS `placa` from (`bdcxc` left join `bdverificadorfacturas` on((`bdcxc`.`factura2` = `bdverificadorfacturas`.`factura`))) group by `bdcxc`.`factura2`,`bdcxc`.`tipo`,`bdcxc`.`estado`,`bdverificadorfacturas`.`factura`,`bdverificadorfacturas`.`terminal`,`bdverificadorfacturas`.`placa` having ((`bdcxc`.`tipo` = \'ABONO\') and (`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdcxc`.`factura2` AS `fact`,`bdclick4`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick4`.`bdcxc`.`valor`) AS `valor`,`bdclick4`.`bdcxc`.`estado` AS `estado`,`bdclick4`.`bdverificadorfacturas`.`factura` AS `factura`,`bdclick4`.`bdverificadorfacturas`.`terminal` AS `terminal`,`bdclick4`.`bdverificadorfacturas`.`placa` AS `placa` from (`bdclick4`.`bdcxc` left join `bdclick4`.`bdverificadorfacturas` on((`bdclick4`.`bdcxc`.`factura2` = `bdclick4`.`bdverificadorfacturas`.`factura`))) group by `bdclick4`.`bdcxc`.`factura2`,`bdclick4`.`bdcxc`.`tipo`,`bdclick4`.`bdcxc`.`estado`,`bdclick4`.`bdverificadorfacturas`.`factura`,`bdclick4`.`bdverificadorfacturas`.`terminal`,`bdclick4`.`bdverificadorfacturas`.`placa` having ((`bdclick4`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick4`.`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
mariadb-version=100135
