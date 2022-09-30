TYPE=VIEW
query=select `bdclick4`.`bdcxc`.`factura` AS `fact`,`bdclick4`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick4`.`bdcxc`.`valor`) AS `valor`,`bdclick4`.`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`plansepareagrupado`.`terminal` AS `terminal`,`plansepareagrupado`.`placa` AS `placa` from (`bdclick4`.`bdcxc` left join `bdclick4`.`plansepareagrupado` on((`plansepareagrupado`.`idFactura` = `bdclick4`.`bdcxc`.`factura2`))) group by `bdclick4`.`bdcxc`.`factura`,`bdclick4`.`bdcxc`.`tipo`,`bdclick4`.`bdcxc`.`estado`,\'\',`plansepareagrupado`.`terminal`,`plansepareagrupado`.`placa` having ((`bdclick4`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick4`.`bdcxc`.`estado` = \'ABONO-REALIZADO\'))
md5=53b116b18a7dc24b315ee0d92a26a0d7
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:30
create-version=2
source=select `bdcxc`.`factura` AS `fact`,`bdcxc`.`tipo` AS `tipo`,sum(`bdcxc`.`valor`) AS `valor`,`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`plansepareagrupado`.`terminal` AS `terminal`,`plansepareagrupado`.`placa` AS `placa` from (`bdcxc` left join `plansepareagrupado` on((`plansepareagrupado`.`idFactura` = `bdcxc`.`factura2`))) group by `bdcxc`.`factura`,`bdcxc`.`tipo`,`bdcxc`.`estado`,\'\',`plansepareagrupado`.`terminal`,`plansepareagrupado`.`placa` having ((`bdcxc`.`tipo` = \'ABONO\') and (`bdcxc`.`estado` = \'ABONO-REALIZADO\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdcxc`.`factura` AS `fact`,`bdclick4`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick4`.`bdcxc`.`valor`) AS `valor`,`bdclick4`.`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`plansepareagrupado`.`terminal` AS `terminal`,`plansepareagrupado`.`placa` AS `placa` from (`bdclick4`.`bdcxc` left join `bdclick4`.`plansepareagrupado` on((`plansepareagrupado`.`idFactura` = `bdclick4`.`bdcxc`.`factura2`))) group by `bdclick4`.`bdcxc`.`factura`,`bdclick4`.`bdcxc`.`tipo`,`bdclick4`.`bdcxc`.`estado`,\'\',`plansepareagrupado`.`terminal`,`plansepareagrupado`.`placa` having ((`bdclick4`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick4`.`bdcxc`.`estado` = \'ABONO-REALIZADO\'))
mariadb-version=100135
