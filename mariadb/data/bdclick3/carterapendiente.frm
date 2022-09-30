TYPE=VIEW
query=(select `bdclick3`.`bdverificadorfacturas`.`cliente` AS `cliente`,`bdclick3`.`bdcxc`.`estado` AS `estado`,sum(`bdclick3`.`bdcxc`.`valor`) AS `valor2`,count(`bdclick3`.`bdcxc`.`plazo`) AS `cantidad`,sum(if(isnull(`abonosfacturacion`.`SumaDevalor`),\'0\',`abonosfacturacion`.`SumaDevalor`)) AS `valor`,`bdclick3`.`bdverificadorfacturas`.`anulada` AS `anulada` from ((`bdclick3`.`bdcxc` left join `bdclick3`.`abonosfacturacion` on((`bdclick3`.`bdcxc`.`factura2` = `abonosfacturacion`.`factura`))) left join `bdclick3`.`bdverificadorfacturas` on((`bdclick3`.`bdcxc`.`factura2` = `bdclick3`.`bdverificadorfacturas`.`factura`))) group by `bdclick3`.`bdverificadorfacturas`.`cliente`,`bdclick3`.`bdcxc`.`estado`,`bdclick3`.`bdverificadorfacturas`.`anulada` having ((`bdclick3`.`bdcxc`.`estado` = \'PEND\') and (`bdclick3`.`bdverificadorfacturas`.`anulada` = 0)))
md5=2d864b3a04c59f5ba51a7e45193b34a5
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:48
create-version=2
source=(select `bdverificadorfacturas`.`cliente` AS `cliente`,`bdcxc`.`estado` AS `estado`,sum(`bdcxc`.`valor`) AS `valor2`,count(`bdcxc`.`plazo`) AS `cantidad`,sum(if(isnull(`abonosfacturacion`.`SumaDevalor`),\'0\',`abonosfacturacion`.`SumaDevalor`)) AS `valor`,`bdverificadorfacturas`.`anulada` AS `anulada` from ((`bdcxc` left join `abonosfacturacion` on((`bdcxc`.`factura2` = `abonosfacturacion`.`factura`))) left join `bdverificadorfacturas` on((`bdcxc`.`factura2` = `bdverificadorfacturas`.`factura`))) group by `bdverificadorfacturas`.`cliente`,`bdcxc`.`estado`,`bdverificadorfacturas`.`anulada` having ((`bdcxc`.`estado` = \'PEND\') and (`bdverificadorfacturas`.`anulada` = 0)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdverificadorfacturas`.`cliente` AS `cliente`,`bdclick3`.`bdcxc`.`estado` AS `estado`,sum(`bdclick3`.`bdcxc`.`valor`) AS `valor2`,count(`bdclick3`.`bdcxc`.`plazo`) AS `cantidad`,sum(if(isnull(`abonosfacturacion`.`SumaDevalor`),\'0\',`abonosfacturacion`.`SumaDevalor`)) AS `valor`,`bdclick3`.`bdverificadorfacturas`.`anulada` AS `anulada` from ((`bdclick3`.`bdcxc` left join `bdclick3`.`abonosfacturacion` on((`bdclick3`.`bdcxc`.`factura2` = `abonosfacturacion`.`factura`))) left join `bdclick3`.`bdverificadorfacturas` on((`bdclick3`.`bdcxc`.`factura2` = `bdclick3`.`bdverificadorfacturas`.`factura`))) group by `bdclick3`.`bdverificadorfacturas`.`cliente`,`bdclick3`.`bdcxc`.`estado`,`bdclick3`.`bdverificadorfacturas`.`anulada` having ((`bdclick3`.`bdcxc`.`estado` = \'PEND\') and (`bdclick3`.`bdverificadorfacturas`.`anulada` = 0)))
mariadb-version=100135
