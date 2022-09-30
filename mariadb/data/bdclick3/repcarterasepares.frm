TYPE=VIEW
query=select `bdclick3`.`bdcxc`.`factura` AS `fact`,`bdclick3`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick3`.`bdcxc`.`valor`) AS `valor`,`bdclick3`.`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`plansepareagrupado`.`terminal` AS `terminal`,`plansepareagrupado`.`placa` AS `placa` from (`bdclick3`.`bdcxc` left join `bdclick3`.`plansepareagrupado` on((`plansepareagrupado`.`idFactura` = `bdclick3`.`bdcxc`.`factura2`))) group by `bdclick3`.`bdcxc`.`factura`,`bdclick3`.`bdcxc`.`tipo`,`bdclick3`.`bdcxc`.`estado`,\'\',`plansepareagrupado`.`terminal`,`plansepareagrupado`.`placa` having ((`bdclick3`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick3`.`bdcxc`.`estado` = \'ABONO-REALIZADO\'))
md5=98a2296aba40fdfc863a365f4b69cdf6
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:53
create-version=2
source=select `bdcxc`.`factura` AS `fact`,`bdcxc`.`tipo` AS `tipo`,sum(`bdcxc`.`valor`) AS `valor`,`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`plansepareagrupado`.`terminal` AS `terminal`,`plansepareagrupado`.`placa` AS `placa` from (`bdcxc` left join `plansepareagrupado` on((`plansepareagrupado`.`idFactura` = `bdcxc`.`factura2`))) group by `bdcxc`.`factura`,`bdcxc`.`tipo`,`bdcxc`.`estado`,\'\',`plansepareagrupado`.`terminal`,`plansepareagrupado`.`placa` having ((`bdcxc`.`tipo` = \'ABONO\') and (`bdcxc`.`estado` = \'ABONO-REALIZADO\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdcxc`.`factura` AS `fact`,`bdclick3`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick3`.`bdcxc`.`valor`) AS `valor`,`bdclick3`.`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`plansepareagrupado`.`terminal` AS `terminal`,`plansepareagrupado`.`placa` AS `placa` from (`bdclick3`.`bdcxc` left join `bdclick3`.`plansepareagrupado` on((`plansepareagrupado`.`idFactura` = `bdclick3`.`bdcxc`.`factura2`))) group by `bdclick3`.`bdcxc`.`factura`,`bdclick3`.`bdcxc`.`tipo`,`bdclick3`.`bdcxc`.`estado`,\'\',`plansepareagrupado`.`terminal`,`plansepareagrupado`.`placa` having ((`bdclick3`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick3`.`bdcxc`.`estado` = \'ABONO-REALIZADO\'))
mariadb-version=100135
