TYPE=VIEW
query=(select `bdclick1`.`bdverificadorfacturas`.`cliente` AS `cliente`,`bdclick1`.`bdcxc`.`estado` AS `estado`,sum(`bdclick1`.`bdcxc`.`valor`) AS `valor2`,count(`bdclick1`.`bdcxc`.`plazo`) AS `cantidad`,sum(if(isnull(`abonosfacturacion`.`SumaDevalor`),\'0\',`abonosfacturacion`.`SumaDevalor`)) AS `valor`,`bdclick1`.`bdverificadorfacturas`.`anulada` AS `anulada` from ((`bdclick1`.`bdcxc` left join `bdclick1`.`abonosfacturacion` on((`bdclick1`.`bdcxc`.`factura2` = `abonosfacturacion`.`factura`))) left join `bdclick1`.`bdverificadorfacturas` on((`bdclick1`.`bdcxc`.`factura2` = `bdclick1`.`bdverificadorfacturas`.`factura`))) group by `bdclick1`.`bdverificadorfacturas`.`cliente`,`bdclick1`.`bdcxc`.`estado`,`bdclick1`.`bdverificadorfacturas`.`anulada` having ((`bdclick1`.`bdcxc`.`estado` = \'PEND\') and (`bdclick1`.`bdverificadorfacturas`.`anulada` = 0)))
md5=fcb61490599af1ddf8b209303dc7c953
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:32
create-version=2
source=(select `bdverificadorfacturas`.`cliente` AS `cliente`,`bdcxc`.`estado` AS `estado`,sum(`bdcxc`.`valor`) AS `valor2`,count(`bdcxc`.`plazo`) AS `cantidad`,sum(if(isnull(`abonosfacturacion`.`SumaDevalor`),\'0\',`abonosfacturacion`.`SumaDevalor`)) AS `valor`,`bdverificadorfacturas`.`anulada` AS `anulada` from ((`bdcxc` left join `abonosfacturacion` on((`bdcxc`.`factura2` = `abonosfacturacion`.`factura`))) left join `bdverificadorfacturas` on((`bdcxc`.`factura2` = `bdverificadorfacturas`.`factura`))) group by `bdverificadorfacturas`.`cliente`,`bdcxc`.`estado`,`bdverificadorfacturas`.`anulada` having ((`bdcxc`.`estado` = \'PEND\') and (`bdverificadorfacturas`.`anulada` = 0)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bdverificadorfacturas`.`cliente` AS `cliente`,`bdclick1`.`bdcxc`.`estado` AS `estado`,sum(`bdclick1`.`bdcxc`.`valor`) AS `valor2`,count(`bdclick1`.`bdcxc`.`plazo`) AS `cantidad`,sum(if(isnull(`abonosfacturacion`.`SumaDevalor`),\'0\',`abonosfacturacion`.`SumaDevalor`)) AS `valor`,`bdclick1`.`bdverificadorfacturas`.`anulada` AS `anulada` from ((`bdclick1`.`bdcxc` left join `bdclick1`.`abonosfacturacion` on((`bdclick1`.`bdcxc`.`factura2` = `abonosfacturacion`.`factura`))) left join `bdclick1`.`bdverificadorfacturas` on((`bdclick1`.`bdcxc`.`factura2` = `bdclick1`.`bdverificadorfacturas`.`factura`))) group by `bdclick1`.`bdverificadorfacturas`.`cliente`,`bdclick1`.`bdcxc`.`estado`,`bdclick1`.`bdverificadorfacturas`.`anulada` having ((`bdclick1`.`bdcxc`.`estado` = \'PEND\') and (`bdclick1`.`bdverificadorfacturas`.`anulada` = 0)))
mariadb-version=100135
