TYPE=VIEW
query=(select `bdclick`.`bdcxc`.`factura2` AS `fact`,`bdclick`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick`.`bdcxc`.`valor`) AS `valor`,`bdclick`.`bdcxc`.`estado` AS `estado`,`bdclick`.`bdverificadorfacturas`.`factura` AS `factura`,`bdclick`.`bdverificadorfacturas`.`terminal` AS `terminal`,`bdclick`.`bdverificadorfacturas`.`placa` AS `placa` from (`bdclick`.`bdcxc` left join `bdclick`.`bdverificadorfacturas` on((`bdclick`.`bdcxc`.`factura2` = `bdclick`.`bdverificadorfacturas`.`factura`))) group by `bdclick`.`bdcxc`.`factura2`,`bdclick`.`bdcxc`.`tipo`,`bdclick`.`bdcxc`.`estado`,`bdclick`.`bdverificadorfacturas`.`factura`,`bdclick`.`bdverificadorfacturas`.`terminal`,`bdclick`.`bdverificadorfacturas`.`placa` having ((`bdclick`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick`.`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
md5=1249bd0c9ae4a0ffb7f7206980ae8909
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:26
create-version=2
source=(select `bdcxc`.`factura2` AS `fact`,`bdcxc`.`tipo` AS `tipo`,sum(`bdcxc`.`valor`) AS `valor`,`bdcxc`.`estado` AS `estado`,`bdverificadorfacturas`.`factura` AS `factura`,`bdverificadorfacturas`.`terminal` AS `terminal`,`bdverificadorfacturas`.`placa` AS `placa` from (`bdcxc` left join `bdverificadorfacturas` on((`bdcxc`.`factura2` = `bdverificadorfacturas`.`factura`))) group by `bdcxc`.`factura2`,`bdcxc`.`tipo`,`bdcxc`.`estado`,`bdverificadorfacturas`.`factura`,`bdverificadorfacturas`.`terminal`,`bdverificadorfacturas`.`placa` having ((`bdcxc`.`tipo` = \'ABONO\') and (`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdcxc`.`factura2` AS `fact`,`bdclick`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick`.`bdcxc`.`valor`) AS `valor`,`bdclick`.`bdcxc`.`estado` AS `estado`,`bdclick`.`bdverificadorfacturas`.`factura` AS `factura`,`bdclick`.`bdverificadorfacturas`.`terminal` AS `terminal`,`bdclick`.`bdverificadorfacturas`.`placa` AS `placa` from (`bdclick`.`bdcxc` left join `bdclick`.`bdverificadorfacturas` on((`bdclick`.`bdcxc`.`factura2` = `bdclick`.`bdverificadorfacturas`.`factura`))) group by `bdclick`.`bdcxc`.`factura2`,`bdclick`.`bdcxc`.`tipo`,`bdclick`.`bdcxc`.`estado`,`bdclick`.`bdverificadorfacturas`.`factura`,`bdclick`.`bdverificadorfacturas`.`terminal`,`bdclick`.`bdverificadorfacturas`.`placa` having ((`bdclick`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick`.`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
mariadb-version=100135
