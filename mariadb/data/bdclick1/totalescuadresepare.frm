TYPE=VIEW
query=(select `separacion`.`red` AS `red`,sum(`separacion`.`descuentoGeneral`) AS `SumaDedescuentos`,sum(`separacion`.`subtotalGeneral`) AS `SumaDesubtotal`,sum(`separacion`.`totalGeneral`) AS `SumaDetotal`,sum(`separacion`.`ivaGeneral`) AS `SumaDeiva` from `bdclick1`.`separacion` group by `separacion`.`red`,`separacion`.`credito` having (`separacion`.`red` <> \'\'))
md5=3f46d991ec7265989edb7e72879ff39d
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:38
create-version=2
source=(select `separacion`.`red` AS `red`,sum(`separacion`.`descuentoGeneral`) AS `SumaDedescuentos`,sum(`separacion`.`subtotalGeneral`) AS `SumaDesubtotal`,sum(`separacion`.`totalGeneral`) AS `SumaDetotal`,sum(`separacion`.`ivaGeneral`) AS `SumaDeiva` from `separacion` group by `separacion`.`red`,`separacion`.`credito` having (`separacion`.`red` <> \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `separacion`.`red` AS `red`,sum(`separacion`.`descuentoGeneral`) AS `SumaDedescuentos`,sum(`separacion`.`subtotalGeneral`) AS `SumaDesubtotal`,sum(`separacion`.`totalGeneral`) AS `SumaDetotal`,sum(`separacion`.`ivaGeneral`) AS `SumaDeiva` from `bdclick1`.`separacion` group by `separacion`.`red`,`separacion`.`credito` having (`separacion`.`red` <> \'\'))
mariadb-version=100135
