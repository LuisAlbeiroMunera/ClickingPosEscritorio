TYPE=VIEW
query=select `bdclick2`.`bdcxc`.`factura` AS `fact`,`bdclick2`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick2`.`bdcxc`.`valor`) AS `valor`,`bdclick2`.`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`plansepareagrupado`.`terminal` AS `terminal`,`plansepareagrupado`.`placa` AS `placa` from (`bdclick2`.`bdcxc` left join `bdclick2`.`plansepareagrupado` on((`plansepareagrupado`.`idFactura` = `bdclick2`.`bdcxc`.`factura2`))) group by `bdclick2`.`bdcxc`.`factura`,`bdclick2`.`bdcxc`.`tipo`,`bdclick2`.`bdcxc`.`estado`,\'\',`plansepareagrupado`.`terminal`,`plansepareagrupado`.`placa` having ((`bdclick2`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick2`.`bdcxc`.`estado` = \'ABONO-REALIZADO\'))
md5=427c9d7f8997bb889ee38fe09dfc2a6d
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:47
create-version=2
source=select `bdcxc`.`factura` AS `fact`,`bdcxc`.`tipo` AS `tipo`,sum(`bdcxc`.`valor`) AS `valor`,`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`plansepareagrupado`.`terminal` AS `terminal`,`plansepareagrupado`.`placa` AS `placa` from (`bdcxc` left join `plansepareagrupado` on((`plansepareagrupado`.`idFactura` = `bdcxc`.`factura2`))) group by `bdcxc`.`factura`,`bdcxc`.`tipo`,`bdcxc`.`estado`,\'\',`plansepareagrupado`.`terminal`,`plansepareagrupado`.`placa` having ((`bdcxc`.`tipo` = \'ABONO\') and (`bdcxc`.`estado` = \'ABONO-REALIZADO\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdcxc`.`factura` AS `fact`,`bdclick2`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick2`.`bdcxc`.`valor`) AS `valor`,`bdclick2`.`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`plansepareagrupado`.`terminal` AS `terminal`,`plansepareagrupado`.`placa` AS `placa` from (`bdclick2`.`bdcxc` left join `bdclick2`.`plansepareagrupado` on((`plansepareagrupado`.`idFactura` = `bdclick2`.`bdcxc`.`factura2`))) group by `bdclick2`.`bdcxc`.`factura`,`bdclick2`.`bdcxc`.`tipo`,`bdclick2`.`bdcxc`.`estado`,\'\',`plansepareagrupado`.`terminal`,`plansepareagrupado`.`placa` having ((`bdclick2`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick2`.`bdcxc`.`estado` = \'ABONO-REALIZADO\'))
mariadb-version=100135
