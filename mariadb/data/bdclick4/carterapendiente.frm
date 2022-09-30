TYPE=VIEW
query=(select `bdclick4`.`bdverificadorfacturas`.`cliente` AS `cliente`,`bdclick4`.`bdcxc`.`estado` AS `estado`,sum(`bdclick4`.`bdcxc`.`valor`) AS `valor2`,count(`bdclick4`.`bdcxc`.`plazo`) AS `cantidad`,sum(if(isnull(`abonosfacturacion`.`SumaDevalor`),\'0\',`abonosfacturacion`.`SumaDevalor`)) AS `valor`,`bdclick4`.`bdverificadorfacturas`.`anulada` AS `anulada` from ((`bdclick4`.`bdcxc` left join `bdclick4`.`abonosfacturacion` on((`bdclick4`.`bdcxc`.`factura2` = `abonosfacturacion`.`factura`))) left join `bdclick4`.`bdverificadorfacturas` on((`bdclick4`.`bdcxc`.`factura2` = `bdclick4`.`bdverificadorfacturas`.`factura`))) group by `bdclick4`.`bdverificadorfacturas`.`cliente`,`bdclick4`.`bdcxc`.`estado`,`bdclick4`.`bdverificadorfacturas`.`anulada` having ((`bdclick4`.`bdcxc`.`estado` = \'PEND\') and (`bdclick4`.`bdverificadorfacturas`.`anulada` = 0)))
md5=b1f674d6e5c486dc28f862e86d735168
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:25
create-version=2
source=(select `bdverificadorfacturas`.`cliente` AS `cliente`,`bdcxc`.`estado` AS `estado`,sum(`bdcxc`.`valor`) AS `valor2`,count(`bdcxc`.`plazo`) AS `cantidad`,sum(if(isnull(`abonosfacturacion`.`SumaDevalor`),\'0\',`abonosfacturacion`.`SumaDevalor`)) AS `valor`,`bdverificadorfacturas`.`anulada` AS `anulada` from ((`bdcxc` left join `abonosfacturacion` on((`bdcxc`.`factura2` = `abonosfacturacion`.`factura`))) left join `bdverificadorfacturas` on((`bdcxc`.`factura2` = `bdverificadorfacturas`.`factura`))) group by `bdverificadorfacturas`.`cliente`,`bdcxc`.`estado`,`bdverificadorfacturas`.`anulada` having ((`bdcxc`.`estado` = \'PEND\') and (`bdverificadorfacturas`.`anulada` = 0)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdverificadorfacturas`.`cliente` AS `cliente`,`bdclick4`.`bdcxc`.`estado` AS `estado`,sum(`bdclick4`.`bdcxc`.`valor`) AS `valor2`,count(`bdclick4`.`bdcxc`.`plazo`) AS `cantidad`,sum(if(isnull(`abonosfacturacion`.`SumaDevalor`),\'0\',`abonosfacturacion`.`SumaDevalor`)) AS `valor`,`bdclick4`.`bdverificadorfacturas`.`anulada` AS `anulada` from ((`bdclick4`.`bdcxc` left join `bdclick4`.`abonosfacturacion` on((`bdclick4`.`bdcxc`.`factura2` = `abonosfacturacion`.`factura`))) left join `bdclick4`.`bdverificadorfacturas` on((`bdclick4`.`bdcxc`.`factura2` = `bdclick4`.`bdverificadorfacturas`.`factura`))) group by `bdclick4`.`bdverificadorfacturas`.`cliente`,`bdclick4`.`bdcxc`.`estado`,`bdclick4`.`bdverificadorfacturas`.`anulada` having ((`bdclick4`.`bdcxc`.`estado` = \'PEND\') and (`bdclick4`.`bdverificadorfacturas`.`anulada` = 0)))
mariadb-version=100135
