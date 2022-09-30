TYPE=VIEW
query=(select `bdclick5`.`bdcxc`.`factura2` AS `fact`,`bdclick5`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick5`.`bdcxc`.`valor`) AS `valor`,`bdclick5`.`bdcxc`.`estado` AS `estado`,`bdclick5`.`bdverificadorfacturas`.`factura` AS `factura`,`bdclick5`.`bdverificadorfacturas`.`terminal` AS `terminal`,`bdclick5`.`bdverificadorfacturas`.`placa` AS `placa` from (`bdclick5`.`bdcxc` left join `bdclick5`.`bdverificadorfacturas` on((`bdclick5`.`bdcxc`.`factura2` = `bdclick5`.`bdverificadorfacturas`.`factura`))) group by `bdclick5`.`bdcxc`.`factura2`,`bdclick5`.`bdcxc`.`tipo`,`bdclick5`.`bdcxc`.`estado`,`bdclick5`.`bdverificadorfacturas`.`factura`,`bdclick5`.`bdverificadorfacturas`.`terminal`,`bdclick5`.`bdverificadorfacturas`.`placa` having ((`bdclick5`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick5`.`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
md5=c68015c12e99cce66c226cda36f5782c
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:49
create-version=2
source=(select `bdcxc`.`factura2` AS `fact`,`bdcxc`.`tipo` AS `tipo`,sum(`bdcxc`.`valor`) AS `valor`,`bdcxc`.`estado` AS `estado`,`bdverificadorfacturas`.`factura` AS `factura`,`bdverificadorfacturas`.`terminal` AS `terminal`,`bdverificadorfacturas`.`placa` AS `placa` from (`bdcxc` left join `bdverificadorfacturas` on((`bdcxc`.`factura2` = `bdverificadorfacturas`.`factura`))) group by `bdcxc`.`factura2`,`bdcxc`.`tipo`,`bdcxc`.`estado`,`bdverificadorfacturas`.`factura`,`bdverificadorfacturas`.`terminal`,`bdverificadorfacturas`.`placa` having ((`bdcxc`.`tipo` = \'ABONO\') and (`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdcxc`.`factura2` AS `fact`,`bdclick5`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick5`.`bdcxc`.`valor`) AS `valor`,`bdclick5`.`bdcxc`.`estado` AS `estado`,`bdclick5`.`bdverificadorfacturas`.`factura` AS `factura`,`bdclick5`.`bdverificadorfacturas`.`terminal` AS `terminal`,`bdclick5`.`bdverificadorfacturas`.`placa` AS `placa` from (`bdclick5`.`bdcxc` left join `bdclick5`.`bdverificadorfacturas` on((`bdclick5`.`bdcxc`.`factura2` = `bdclick5`.`bdverificadorfacturas`.`factura`))) group by `bdclick5`.`bdcxc`.`factura2`,`bdclick5`.`bdcxc`.`tipo`,`bdclick5`.`bdcxc`.`estado`,`bdclick5`.`bdverificadorfacturas`.`factura`,`bdclick5`.`bdverificadorfacturas`.`terminal`,`bdclick5`.`bdverificadorfacturas`.`placa` having ((`bdclick5`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick5`.`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
mariadb-version=100135
