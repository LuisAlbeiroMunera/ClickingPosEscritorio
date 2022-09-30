TYPE=VIEW
query=(select `bdclick3`.`bdcxc`.`factura2` AS `fact`,`bdclick3`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick3`.`bdcxc`.`valor`) AS `valor`,`bdclick3`.`bdcxc`.`estado` AS `estado`,`bdclick3`.`bdverificadorfacturas`.`factura` AS `factura`,`bdclick3`.`bdverificadorfacturas`.`terminal` AS `terminal`,`bdclick3`.`bdverificadorfacturas`.`placa` AS `placa` from (`bdclick3`.`bdcxc` left join `bdclick3`.`bdverificadorfacturas` on((`bdclick3`.`bdcxc`.`factura2` = `bdclick3`.`bdverificadorfacturas`.`factura`))) group by `bdclick3`.`bdcxc`.`factura2`,`bdclick3`.`bdcxc`.`tipo`,`bdclick3`.`bdcxc`.`estado`,`bdclick3`.`bdverificadorfacturas`.`factura`,`bdclick3`.`bdverificadorfacturas`.`terminal`,`bdclick3`.`bdverificadorfacturas`.`placa` having ((`bdclick3`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick3`.`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
md5=560e5bea4cb1d689acb93afe678b6de4
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:53
create-version=2
source=(select `bdcxc`.`factura2` AS `fact`,`bdcxc`.`tipo` AS `tipo`,sum(`bdcxc`.`valor`) AS `valor`,`bdcxc`.`estado` AS `estado`,`bdverificadorfacturas`.`factura` AS `factura`,`bdverificadorfacturas`.`terminal` AS `terminal`,`bdverificadorfacturas`.`placa` AS `placa` from (`bdcxc` left join `bdverificadorfacturas` on((`bdcxc`.`factura2` = `bdverificadorfacturas`.`factura`))) group by `bdcxc`.`factura2`,`bdcxc`.`tipo`,`bdcxc`.`estado`,`bdverificadorfacturas`.`factura`,`bdverificadorfacturas`.`terminal`,`bdverificadorfacturas`.`placa` having ((`bdcxc`.`tipo` = \'ABONO\') and (`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdcxc`.`factura2` AS `fact`,`bdclick3`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick3`.`bdcxc`.`valor`) AS `valor`,`bdclick3`.`bdcxc`.`estado` AS `estado`,`bdclick3`.`bdverificadorfacturas`.`factura` AS `factura`,`bdclick3`.`bdverificadorfacturas`.`terminal` AS `terminal`,`bdclick3`.`bdverificadorfacturas`.`placa` AS `placa` from (`bdclick3`.`bdcxc` left join `bdclick3`.`bdverificadorfacturas` on((`bdclick3`.`bdcxc`.`factura2` = `bdclick3`.`bdverificadorfacturas`.`factura`))) group by `bdclick3`.`bdcxc`.`factura2`,`bdclick3`.`bdcxc`.`tipo`,`bdclick3`.`bdcxc`.`estado`,`bdclick3`.`bdverificadorfacturas`.`factura`,`bdclick3`.`bdverificadorfacturas`.`terminal`,`bdclick3`.`bdverificadorfacturas`.`placa` having ((`bdclick3`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick3`.`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
mariadb-version=100135
