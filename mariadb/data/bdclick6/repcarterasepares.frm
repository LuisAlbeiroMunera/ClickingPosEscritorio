TYPE=VIEW
query=select `bdclick6`.`bdcxc`.`factura` AS `fact`,`bdclick6`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick6`.`bdcxc`.`valor`) AS `valor`,`bdclick6`.`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`plansepareagrupado`.`terminal` AS `terminal`,`plansepareagrupado`.`placa` AS `placa` from (`bdclick6`.`bdcxc` left join `bdclick6`.`plansepareagrupado` on((`plansepareagrupado`.`idFactura` = `bdclick6`.`bdcxc`.`factura2`))) group by `bdclick6`.`bdcxc`.`factura`,`bdclick6`.`bdcxc`.`tipo`,`bdclick6`.`bdcxc`.`estado`,\'\',`plansepareagrupado`.`terminal`,`plansepareagrupado`.`placa` having ((`bdclick6`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick6`.`bdcxc`.`estado` = \'ABONO-REALIZADO\'))
md5=b6b3269d4c1b50d65dcfafd46dc70b46
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:38
create-version=2
source=select `bdcxc`.`factura` AS `fact`,`bdcxc`.`tipo` AS `tipo`,sum(`bdcxc`.`valor`) AS `valor`,`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`plansepareagrupado`.`terminal` AS `terminal`,`plansepareagrupado`.`placa` AS `placa` from (`bdcxc` left join `plansepareagrupado` on((`plansepareagrupado`.`idFactura` = `bdcxc`.`factura2`))) group by `bdcxc`.`factura`,`bdcxc`.`tipo`,`bdcxc`.`estado`,\'\',`plansepareagrupado`.`terminal`,`plansepareagrupado`.`placa` having ((`bdcxc`.`tipo` = \'ABONO\') and (`bdcxc`.`estado` = \'ABONO-REALIZADO\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdcxc`.`factura` AS `fact`,`bdclick6`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick6`.`bdcxc`.`valor`) AS `valor`,`bdclick6`.`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`plansepareagrupado`.`terminal` AS `terminal`,`plansepareagrupado`.`placa` AS `placa` from (`bdclick6`.`bdcxc` left join `bdclick6`.`plansepareagrupado` on((`plansepareagrupado`.`idFactura` = `bdclick6`.`bdcxc`.`factura2`))) group by `bdclick6`.`bdcxc`.`factura`,`bdclick6`.`bdcxc`.`tipo`,`bdclick6`.`bdcxc`.`estado`,\'\',`plansepareagrupado`.`terminal`,`plansepareagrupado`.`placa` having ((`bdclick6`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick6`.`bdcxc`.`estado` = \'ABONO-REALIZADO\'))
mariadb-version=100135
