TYPE=VIEW
query=(select `facturacion`.`red` AS `red`,sum(`facturacion`.`descuentoGeneral`) AS `SumaDedescuentos`,sum(`facturacion`.`subtotalGeneral`) AS `SumaDesubtotal`,sum(`facturacion`.`totalGeneral`) AS `SumaDetotal`,sum(`facturacion`.`ivaGeneral`) AS `SumaDeiva` from `bdclick6`.`facturacion` group by `facturacion`.`red`,`facturacion`.`credito`,`facturacion`.`anulada` having ((`facturacion`.`red` <> \'\') and (`facturacion`.`credito` = 0) and (`facturacion`.`anulada` = 0)))
md5=2a647d0c9b35d7d75f7a9e7a03487ad8
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:39
create-version=2
source=(select `facturacion`.`red` AS `red`,sum(`facturacion`.`descuentoGeneral`) AS `SumaDedescuentos`,sum(`facturacion`.`subtotalGeneral`) AS `SumaDesubtotal`,sum(`facturacion`.`totalGeneral`) AS `SumaDetotal`,sum(`facturacion`.`ivaGeneral`) AS `SumaDeiva` from `facturacion` group by `facturacion`.`red`,`facturacion`.`credito`,`facturacion`.`anulada` having ((`facturacion`.`red` <> \'\') and (`facturacion`.`credito` = 0) and (`facturacion`.`anulada` = 0)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `facturacion`.`red` AS `red`,sum(`facturacion`.`descuentoGeneral`) AS `SumaDedescuentos`,sum(`facturacion`.`subtotalGeneral`) AS `SumaDesubtotal`,sum(`facturacion`.`totalGeneral`) AS `SumaDetotal`,sum(`facturacion`.`ivaGeneral`) AS `SumaDeiva` from `bdclick6`.`facturacion` group by `facturacion`.`red`,`facturacion`.`credito`,`facturacion`.`anulada` having ((`facturacion`.`red` <> \'\') and (`facturacion`.`credito` = 0) and (`facturacion`.`anulada` = 0)))
mariadb-version=100135
