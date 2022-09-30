TYPE=VIEW
query=(select `bdclick1`.`bdcxc`.`factura2` AS `fact`,`bdclick1`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick1`.`bdcxc`.`valor`) AS `valor`,`bdclick1`.`bdcxc`.`estado` AS `estado`,`bdclick1`.`bdverificadorfacturas`.`factura` AS `factura`,`bdclick1`.`bdverificadorfacturas`.`terminal` AS `terminal`,`bdclick1`.`bdverificadorfacturas`.`placa` AS `placa` from (`bdclick1`.`bdcxc` left join `bdclick1`.`bdverificadorfacturas` on((`bdclick1`.`bdcxc`.`factura2` = `bdclick1`.`bdverificadorfacturas`.`factura`))) group by `bdclick1`.`bdcxc`.`factura2`,`bdclick1`.`bdcxc`.`tipo`,`bdclick1`.`bdcxc`.`estado`,`bdclick1`.`bdverificadorfacturas`.`factura`,`bdclick1`.`bdverificadorfacturas`.`terminal`,`bdclick1`.`bdverificadorfacturas`.`placa` having ((`bdclick1`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick1`.`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
md5=7c4556e77f9d73e5dedccc43fa246b2a
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:36
create-version=2
source=(select `bdcxc`.`factura2` AS `fact`,`bdcxc`.`tipo` AS `tipo`,sum(`bdcxc`.`valor`) AS `valor`,`bdcxc`.`estado` AS `estado`,`bdverificadorfacturas`.`factura` AS `factura`,`bdverificadorfacturas`.`terminal` AS `terminal`,`bdverificadorfacturas`.`placa` AS `placa` from (`bdcxc` left join `bdverificadorfacturas` on((`bdcxc`.`factura2` = `bdverificadorfacturas`.`factura`))) group by `bdcxc`.`factura2`,`bdcxc`.`tipo`,`bdcxc`.`estado`,`bdverificadorfacturas`.`factura`,`bdverificadorfacturas`.`terminal`,`bdverificadorfacturas`.`placa` having ((`bdcxc`.`tipo` = \'ABONO\') and (`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bdcxc`.`factura2` AS `fact`,`bdclick1`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick1`.`bdcxc`.`valor`) AS `valor`,`bdclick1`.`bdcxc`.`estado` AS `estado`,`bdclick1`.`bdverificadorfacturas`.`factura` AS `factura`,`bdclick1`.`bdverificadorfacturas`.`terminal` AS `terminal`,`bdclick1`.`bdverificadorfacturas`.`placa` AS `placa` from (`bdclick1`.`bdcxc` left join `bdclick1`.`bdverificadorfacturas` on((`bdclick1`.`bdcxc`.`factura2` = `bdclick1`.`bdverificadorfacturas`.`factura`))) group by `bdclick1`.`bdcxc`.`factura2`,`bdclick1`.`bdcxc`.`tipo`,`bdclick1`.`bdcxc`.`estado`,`bdclick1`.`bdverificadorfacturas`.`factura`,`bdclick1`.`bdverificadorfacturas`.`terminal`,`bdclick1`.`bdverificadorfacturas`.`placa` having ((`bdclick1`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick1`.`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
mariadb-version=100135
