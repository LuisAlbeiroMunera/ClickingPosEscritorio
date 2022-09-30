TYPE=VIEW
query=(select `bdclick2`.`bdverificadorfacturas`.`cliente` AS `cliente`,`bdclick2`.`bdcxc`.`estado` AS `estado`,sum(`bdclick2`.`bdcxc`.`valor`) AS `valor2`,count(`bdclick2`.`bdcxc`.`plazo`) AS `cantidad`,sum(if(isnull(`abonosfacturacion`.`SumaDevalor`),\'0\',`abonosfacturacion`.`SumaDevalor`)) AS `valor`,`bdclick2`.`bdverificadorfacturas`.`anulada` AS `anulada` from ((`bdclick2`.`bdcxc` left join `bdclick2`.`abonosfacturacion` on((`bdclick2`.`bdcxc`.`factura2` = `abonosfacturacion`.`factura`))) left join `bdclick2`.`bdverificadorfacturas` on((`bdclick2`.`bdcxc`.`factura2` = `bdclick2`.`bdverificadorfacturas`.`factura`))) group by `bdclick2`.`bdverificadorfacturas`.`cliente`,`bdclick2`.`bdcxc`.`estado`,`bdclick2`.`bdverificadorfacturas`.`anulada` having ((`bdclick2`.`bdcxc`.`estado` = \'PEND\') and (`bdclick2`.`bdverificadorfacturas`.`anulada` = 0)))
md5=e9880a8dca35d610eac3589d8ea6b4a8
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:43
create-version=2
source=(select `bdverificadorfacturas`.`cliente` AS `cliente`,`bdcxc`.`estado` AS `estado`,sum(`bdcxc`.`valor`) AS `valor2`,count(`bdcxc`.`plazo`) AS `cantidad`,sum(if(isnull(`abonosfacturacion`.`SumaDevalor`),\'0\',`abonosfacturacion`.`SumaDevalor`)) AS `valor`,`bdverificadorfacturas`.`anulada` AS `anulada` from ((`bdcxc` left join `abonosfacturacion` on((`bdcxc`.`factura2` = `abonosfacturacion`.`factura`))) left join `bdverificadorfacturas` on((`bdcxc`.`factura2` = `bdverificadorfacturas`.`factura`))) group by `bdverificadorfacturas`.`cliente`,`bdcxc`.`estado`,`bdverificadorfacturas`.`anulada` having ((`bdcxc`.`estado` = \'PEND\') and (`bdverificadorfacturas`.`anulada` = 0)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bdverificadorfacturas`.`cliente` AS `cliente`,`bdclick2`.`bdcxc`.`estado` AS `estado`,sum(`bdclick2`.`bdcxc`.`valor`) AS `valor2`,count(`bdclick2`.`bdcxc`.`plazo`) AS `cantidad`,sum(if(isnull(`abonosfacturacion`.`SumaDevalor`),\'0\',`abonosfacturacion`.`SumaDevalor`)) AS `valor`,`bdclick2`.`bdverificadorfacturas`.`anulada` AS `anulada` from ((`bdclick2`.`bdcxc` left join `bdclick2`.`abonosfacturacion` on((`bdclick2`.`bdcxc`.`factura2` = `abonosfacturacion`.`factura`))) left join `bdclick2`.`bdverificadorfacturas` on((`bdclick2`.`bdcxc`.`factura2` = `bdclick2`.`bdverificadorfacturas`.`factura`))) group by `bdclick2`.`bdverificadorfacturas`.`cliente`,`bdclick2`.`bdcxc`.`estado`,`bdclick2`.`bdverificadorfacturas`.`anulada` having ((`bdclick2`.`bdcxc`.`estado` = \'PEND\') and (`bdclick2`.`bdverificadorfacturas`.`anulada` = 0)))
mariadb-version=100135
