TYPE=VIEW
query=(select `bdclick2`.`bdcxc`.`factura` AS `factura`,`bdclick2`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick2`.`bdcxc`.`valor`) AS `SumaDevalor`,`bdclick2`.`bdverificadorfacturas`.`cliente` AS `cliente`,if((`bdclick2`.`bdcxc`.`factura` like \'SEPARE-%\'),`bdclick2`.`bdcxc`.`factura`,`bdclick2`.`bdverificadorfacturas`.`factura`) AS `facturaTerm`,`bdclick2`.`bdverificadorfacturas`.`terminal` AS `terminal`,`bdclick2`.`bdcxc`.`estado` AS `estado`,\'0\' AS `cuotaInicial2` from (`bdclick2`.`bdcxc` left join `bdclick2`.`bdverificadorfacturas` on((`bdclick2`.`bdcxc`.`factura2` = `bdclick2`.`bdverificadorfacturas`.`factura`))) group by `bdclick2`.`bdcxc`.`factura`,`bdclick2`.`bdcxc`.`tipo`,`bdclick2`.`bdverificadorfacturas`.`cliente`,`bdclick2`.`bdverificadorfacturas`.`factura`,`bdclick2`.`bdverificadorfacturas`.`terminal`,`bdclick2`.`bdcxc`.`estado`,\'0\' having ((`bdclick2`.`bdcxc`.`tipo` = \'ABONO\') and ((`bdclick2`.`bdcxc`.`estado` = \'pend\') or (`bdclick2`.`bdcxc`.`estado` = \'cancelada\') or (`bdclick2`.`bdcxc`.`estado` = \'\') or (`bdclick2`.`bdcxc`.`estado` = \'ABONO-REALIZADO\'))))
md5=752bbbcdafc3f2827bb253b369e7782e
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:42
create-version=2
source=(select `bdcxc`.`factura` AS `factura`,`bdcxc`.`tipo` AS `tipo`,sum(`bdcxc`.`valor`) AS `SumaDevalor`,`bdverificadorfacturas`.`cliente` AS `cliente`,if((`bdcxc`.`factura` like \'SEPARE-%\'),`bdcxc`.`factura`,`bdverificadorfacturas`.`factura`) AS `facturaTerm`,`bdverificadorfacturas`.`terminal` AS `terminal`,`bdcxc`.`estado` AS `estado`,\'0\' AS `cuotaInicial2` from (`bdcxc` left join `bdverificadorfacturas` on((`bdcxc`.`factura2` = `bdverificadorfacturas`.`factura`))) group by `bdcxc`.`factura`,`bdcxc`.`tipo`,`bdverificadorfacturas`.`cliente`,`bdverificadorfacturas`.`factura`,`bdverificadorfacturas`.`terminal`,`bdcxc`.`estado`,\'0\' having ((`bdcxc`.`tipo` = \'ABONO\') and ((`bdcxc`.`estado` = \'pend\') or (`bdcxc`.`estado` = \'cancelada\') or (`bdcxc`.`estado` = \'\') or (`bdcxc`.`estado` = \'ABONO-REALIZADO\'))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bdcxc`.`factura` AS `factura`,`bdclick2`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick2`.`bdcxc`.`valor`) AS `SumaDevalor`,`bdclick2`.`bdverificadorfacturas`.`cliente` AS `cliente`,if((`bdclick2`.`bdcxc`.`factura` like \'SEPARE-%\'),`bdclick2`.`bdcxc`.`factura`,`bdclick2`.`bdverificadorfacturas`.`factura`) AS `facturaTerm`,`bdclick2`.`bdverificadorfacturas`.`terminal` AS `terminal`,`bdclick2`.`bdcxc`.`estado` AS `estado`,\'0\' AS `cuotaInicial2` from (`bdclick2`.`bdcxc` left join `bdclick2`.`bdverificadorfacturas` on((`bdclick2`.`bdcxc`.`factura2` = `bdclick2`.`bdverificadorfacturas`.`factura`))) group by `bdclick2`.`bdcxc`.`factura`,`bdclick2`.`bdcxc`.`tipo`,`bdclick2`.`bdverificadorfacturas`.`cliente`,`bdclick2`.`bdverificadorfacturas`.`factura`,`bdclick2`.`bdverificadorfacturas`.`terminal`,`bdclick2`.`bdcxc`.`estado`,\'0\' having ((`bdclick2`.`bdcxc`.`tipo` = \'ABONO\') and ((`bdclick2`.`bdcxc`.`estado` = \'pend\') or (`bdclick2`.`bdcxc`.`estado` = \'cancelada\') or (`bdclick2`.`bdcxc`.`estado` = \'\') or (`bdclick2`.`bdcxc`.`estado` = \'ABONO-REALIZADO\'))))
mariadb-version=100135
