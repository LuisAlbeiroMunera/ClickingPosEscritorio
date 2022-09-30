TYPE=VIEW
query=(select `bdclick`.`bdverificadorfacturas`.`cliente` AS `cliente`,`bdclick`.`bdcxc`.`estado` AS `estado`,sum(`bdclick`.`bdcxc`.`valor`) AS `valor2`,count(`bdclick`.`bdcxc`.`plazo`) AS `cantidad`,sum(if(isnull(`abonosfacturacion`.`SumaDevalor`),\'0\',`abonosfacturacion`.`SumaDevalor`)) AS `valor`,`bdclick`.`bdverificadorfacturas`.`anulada` AS `anulada` from ((`bdclick`.`bdcxc` left join `bdclick`.`abonosfacturacion` on((`bdclick`.`bdcxc`.`factura2` = `abonosfacturacion`.`factura`))) left join `bdclick`.`bdverificadorfacturas` on((`bdclick`.`bdcxc`.`factura2` = `bdclick`.`bdverificadorfacturas`.`factura`))) group by `bdclick`.`bdverificadorfacturas`.`cliente`,`bdclick`.`bdcxc`.`estado`,`bdclick`.`bdverificadorfacturas`.`anulada` having ((`bdclick`.`bdcxc`.`estado` = \'PEND\') and (`bdclick`.`bdverificadorfacturas`.`anulada` = 0)))
md5=693a496b99089f31d3400dc1bba20057
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:21
create-version=2
source=(select `bdverificadorfacturas`.`cliente` AS `cliente`,`bdcxc`.`estado` AS `estado`,sum(`bdcxc`.`valor`) AS `valor2`,count(`bdcxc`.`plazo`) AS `cantidad`,sum(if(isnull(`abonosfacturacion`.`SumaDevalor`),\'0\',`abonosfacturacion`.`SumaDevalor`)) AS `valor`,`bdverificadorfacturas`.`anulada` AS `anulada` from ((`bdcxc` left join `abonosfacturacion` on((`bdcxc`.`factura2` = `abonosfacturacion`.`factura`))) left join `bdverificadorfacturas` on((`bdcxc`.`factura2` = `bdverificadorfacturas`.`factura`))) group by `bdverificadorfacturas`.`cliente`,`bdcxc`.`estado`,`bdverificadorfacturas`.`anulada` having ((`bdcxc`.`estado` = \'PEND\') and (`bdverificadorfacturas`.`anulada` = 0)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdverificadorfacturas`.`cliente` AS `cliente`,`bdclick`.`bdcxc`.`estado` AS `estado`,sum(`bdclick`.`bdcxc`.`valor`) AS `valor2`,count(`bdclick`.`bdcxc`.`plazo`) AS `cantidad`,sum(if(isnull(`abonosfacturacion`.`SumaDevalor`),\'0\',`abonosfacturacion`.`SumaDevalor`)) AS `valor`,`bdclick`.`bdverificadorfacturas`.`anulada` AS `anulada` from ((`bdclick`.`bdcxc` left join `bdclick`.`abonosfacturacion` on((`bdclick`.`bdcxc`.`factura2` = `abonosfacturacion`.`factura`))) left join `bdclick`.`bdverificadorfacturas` on((`bdclick`.`bdcxc`.`factura2` = `bdclick`.`bdverificadorfacturas`.`factura`))) group by `bdclick`.`bdverificadorfacturas`.`cliente`,`bdclick`.`bdcxc`.`estado`,`bdclick`.`bdverificadorfacturas`.`anulada` having ((`bdclick`.`bdcxc`.`estado` = \'PEND\') and (`bdclick`.`bdverificadorfacturas`.`anulada` = 0)))
mariadb-version=100135
