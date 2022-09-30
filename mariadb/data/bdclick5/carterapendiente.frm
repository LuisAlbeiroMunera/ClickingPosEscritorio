TYPE=VIEW
query=(select `bdclick5`.`bdverificadorfacturas`.`cliente` AS `cliente`,`bdclick5`.`bdcxc`.`estado` AS `estado`,sum(`bdclick5`.`bdcxc`.`valor`) AS `valor2`,count(`bdclick5`.`bdcxc`.`plazo`) AS `cantidad`,sum(if(isnull(`abonosfacturacion`.`SumaDevalor`),\'0\',`abonosfacturacion`.`SumaDevalor`)) AS `valor`,`bdclick5`.`bdverificadorfacturas`.`anulada` AS `anulada` from ((`bdclick5`.`bdcxc` left join `bdclick5`.`abonosfacturacion` on((`bdclick5`.`bdcxc`.`factura2` = `abonosfacturacion`.`factura`))) left join `bdclick5`.`bdverificadorfacturas` on((`bdclick5`.`bdcxc`.`factura2` = `bdclick5`.`bdverificadorfacturas`.`factura`))) group by `bdclick5`.`bdverificadorfacturas`.`cliente`,`bdclick5`.`bdcxc`.`estado`,`bdclick5`.`bdverificadorfacturas`.`anulada` having ((`bdclick5`.`bdcxc`.`estado` = \'PEND\') and (`bdclick5`.`bdverificadorfacturas`.`anulada` = 0)))
md5=84f329c5df4fd3ee2df6c06e53ce1d51
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:44
create-version=2
source=(select `bdverificadorfacturas`.`cliente` AS `cliente`,`bdcxc`.`estado` AS `estado`,sum(`bdcxc`.`valor`) AS `valor2`,count(`bdcxc`.`plazo`) AS `cantidad`,sum(if(isnull(`abonosfacturacion`.`SumaDevalor`),\'0\',`abonosfacturacion`.`SumaDevalor`)) AS `valor`,`bdverificadorfacturas`.`anulada` AS `anulada` from ((`bdcxc` left join `abonosfacturacion` on((`bdcxc`.`factura2` = `abonosfacturacion`.`factura`))) left join `bdverificadorfacturas` on((`bdcxc`.`factura2` = `bdverificadorfacturas`.`factura`))) group by `bdverificadorfacturas`.`cliente`,`bdcxc`.`estado`,`bdverificadorfacturas`.`anulada` having ((`bdcxc`.`estado` = \'PEND\') and (`bdverificadorfacturas`.`anulada` = 0)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdverificadorfacturas`.`cliente` AS `cliente`,`bdclick5`.`bdcxc`.`estado` AS `estado`,sum(`bdclick5`.`bdcxc`.`valor`) AS `valor2`,count(`bdclick5`.`bdcxc`.`plazo`) AS `cantidad`,sum(if(isnull(`abonosfacturacion`.`SumaDevalor`),\'0\',`abonosfacturacion`.`SumaDevalor`)) AS `valor`,`bdclick5`.`bdverificadorfacturas`.`anulada` AS `anulada` from ((`bdclick5`.`bdcxc` left join `bdclick5`.`abonosfacturacion` on((`bdclick5`.`bdcxc`.`factura2` = `abonosfacturacion`.`factura`))) left join `bdclick5`.`bdverificadorfacturas` on((`bdclick5`.`bdcxc`.`factura2` = `bdclick5`.`bdverificadorfacturas`.`factura`))) group by `bdclick5`.`bdverificadorfacturas`.`cliente`,`bdclick5`.`bdcxc`.`estado`,`bdclick5`.`bdverificadorfacturas`.`anulada` having ((`bdclick5`.`bdcxc`.`estado` = \'PEND\') and (`bdclick5`.`bdverificadorfacturas`.`anulada` = 0)))
mariadb-version=100135
