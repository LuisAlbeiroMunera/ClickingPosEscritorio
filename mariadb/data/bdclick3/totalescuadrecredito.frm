TYPE=VIEW
query=(select `facturacion`.`red` AS `red`,sum(`facturacion`.`descuentoGeneral`) AS `SumaDedescuentos`,sum(`facturacion`.`subtotalGeneral`) AS `SumaDesubtotal`,sum(`facturacion`.`totalGeneral`) AS `SumaDetotal`,sum(`facturacion`.`ivaGeneral`) AS `SumaDeiva` from `bdclick3`.`facturacion` group by `facturacion`.`red`,`facturacion`.`credito` having ((`facturacion`.`red` <> \'\') and (`facturacion`.`credito` = 1)))
md5=b200fe4dac74f72b387a683662a0dee3
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:54
create-version=2
source=(select `facturacion`.`red` AS `red`,sum(`facturacion`.`descuentoGeneral`) AS `SumaDedescuentos`,sum(`facturacion`.`subtotalGeneral`) AS `SumaDesubtotal`,sum(`facturacion`.`totalGeneral`) AS `SumaDetotal`,sum(`facturacion`.`ivaGeneral`) AS `SumaDeiva` from `facturacion` group by `facturacion`.`red`,`facturacion`.`credito` having ((`facturacion`.`red` <> \'\') and (`facturacion`.`credito` = 1)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `facturacion`.`red` AS `red`,sum(`facturacion`.`descuentoGeneral`) AS `SumaDedescuentos`,sum(`facturacion`.`subtotalGeneral`) AS `SumaDesubtotal`,sum(`facturacion`.`totalGeneral`) AS `SumaDetotal`,sum(`facturacion`.`ivaGeneral`) AS `SumaDeiva` from `bdclick3`.`facturacion` group by `facturacion`.`red`,`facturacion`.`credito` having ((`facturacion`.`red` <> \'\') and (`facturacion`.`credito` = 1)))
mariadb-version=100135
