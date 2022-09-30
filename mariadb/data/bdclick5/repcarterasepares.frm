TYPE=VIEW
query=select `bdclick5`.`bdcxc`.`factura` AS `fact`,`bdclick5`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick5`.`bdcxc`.`valor`) AS `valor`,`bdclick5`.`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`plansepareagrupado`.`terminal` AS `terminal`,`plansepareagrupado`.`placa` AS `placa` from (`bdclick5`.`bdcxc` left join `bdclick5`.`plansepareagrupado` on((`plansepareagrupado`.`idFactura` = `bdclick5`.`bdcxc`.`factura2`))) group by `bdclick5`.`bdcxc`.`factura`,`bdclick5`.`bdcxc`.`tipo`,`bdclick5`.`bdcxc`.`estado`,\'\',`plansepareagrupado`.`terminal`,`plansepareagrupado`.`placa` having ((`bdclick5`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick5`.`bdcxc`.`estado` = \'ABONO-REALIZADO\'))
md5=532864d18e75ef6eb6a112513686dd02
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:49
create-version=2
source=select `bdcxc`.`factura` AS `fact`,`bdcxc`.`tipo` AS `tipo`,sum(`bdcxc`.`valor`) AS `valor`,`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`plansepareagrupado`.`terminal` AS `terminal`,`plansepareagrupado`.`placa` AS `placa` from (`bdcxc` left join `plansepareagrupado` on((`plansepareagrupado`.`idFactura` = `bdcxc`.`factura2`))) group by `bdcxc`.`factura`,`bdcxc`.`tipo`,`bdcxc`.`estado`,\'\',`plansepareagrupado`.`terminal`,`plansepareagrupado`.`placa` having ((`bdcxc`.`tipo` = \'ABONO\') and (`bdcxc`.`estado` = \'ABONO-REALIZADO\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdcxc`.`factura` AS `fact`,`bdclick5`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick5`.`bdcxc`.`valor`) AS `valor`,`bdclick5`.`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`plansepareagrupado`.`terminal` AS `terminal`,`plansepareagrupado`.`placa` AS `placa` from (`bdclick5`.`bdcxc` left join `bdclick5`.`plansepareagrupado` on((`plansepareagrupado`.`idFactura` = `bdclick5`.`bdcxc`.`factura2`))) group by `bdclick5`.`bdcxc`.`factura`,`bdclick5`.`bdcxc`.`tipo`,`bdclick5`.`bdcxc`.`estado`,\'\',`plansepareagrupado`.`terminal`,`plansepareagrupado`.`placa` having ((`bdclick5`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick5`.`bdcxc`.`estado` = \'ABONO-REALIZADO\'))
mariadb-version=100135
