TYPE=VIEW
query=(select `bdclick6`.`bdverificadorfacturas`.`cliente` AS `cliente`,`bdclick6`.`bdcxc`.`estado` AS `estado`,sum(`bdclick6`.`bdcxc`.`valor`) AS `valor2`,count(`bdclick6`.`bdcxc`.`plazo`) AS `cantidad`,sum(if(isnull(`abonosfacturacion`.`SumaDevalor`),\'0\',`abonosfacturacion`.`SumaDevalor`)) AS `valor`,`bdclick6`.`bdverificadorfacturas`.`anulada` AS `anulada` from ((`bdclick6`.`bdcxc` left join `bdclick6`.`abonosfacturacion` on((`bdclick6`.`bdcxc`.`factura2` = `abonosfacturacion`.`factura`))) left join `bdclick6`.`bdverificadorfacturas` on((`bdclick6`.`bdcxc`.`factura2` = `bdclick6`.`bdverificadorfacturas`.`factura`))) group by `bdclick6`.`bdverificadorfacturas`.`cliente`,`bdclick6`.`bdcxc`.`estado`,`bdclick6`.`bdverificadorfacturas`.`anulada` having ((`bdclick6`.`bdcxc`.`estado` = \'PEND\') and (`bdclick6`.`bdverificadorfacturas`.`anulada` = 0)))
md5=013326a287d1c1ff1f7636fdc2a7f0d2
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:32
create-version=2
source=(select `bdverificadorfacturas`.`cliente` AS `cliente`,`bdcxc`.`estado` AS `estado`,sum(`bdcxc`.`valor`) AS `valor2`,count(`bdcxc`.`plazo`) AS `cantidad`,sum(if(isnull(`abonosfacturacion`.`SumaDevalor`),\'0\',`abonosfacturacion`.`SumaDevalor`)) AS `valor`,`bdverificadorfacturas`.`anulada` AS `anulada` from ((`bdcxc` left join `abonosfacturacion` on((`bdcxc`.`factura2` = `abonosfacturacion`.`factura`))) left join `bdverificadorfacturas` on((`bdcxc`.`factura2` = `bdverificadorfacturas`.`factura`))) group by `bdverificadorfacturas`.`cliente`,`bdcxc`.`estado`,`bdverificadorfacturas`.`anulada` having ((`bdcxc`.`estado` = \'PEND\') and (`bdverificadorfacturas`.`anulada` = 0)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdverificadorfacturas`.`cliente` AS `cliente`,`bdclick6`.`bdcxc`.`estado` AS `estado`,sum(`bdclick6`.`bdcxc`.`valor`) AS `valor2`,count(`bdclick6`.`bdcxc`.`plazo`) AS `cantidad`,sum(if(isnull(`abonosfacturacion`.`SumaDevalor`),\'0\',`abonosfacturacion`.`SumaDevalor`)) AS `valor`,`bdclick6`.`bdverificadorfacturas`.`anulada` AS `anulada` from ((`bdclick6`.`bdcxc` left join `bdclick6`.`abonosfacturacion` on((`bdclick6`.`bdcxc`.`factura2` = `abonosfacturacion`.`factura`))) left join `bdclick6`.`bdverificadorfacturas` on((`bdclick6`.`bdcxc`.`factura2` = `bdclick6`.`bdverificadorfacturas`.`factura`))) group by `bdclick6`.`bdverificadorfacturas`.`cliente`,`bdclick6`.`bdcxc`.`estado`,`bdclick6`.`bdverificadorfacturas`.`anulada` having ((`bdclick6`.`bdcxc`.`estado` = \'PEND\') and (`bdclick6`.`bdverificadorfacturas`.`anulada` = 0)))
mariadb-version=100135
