TYPE=VIEW
query=(select `separacion`.`red` AS `red`,sum(`separacion`.`descuentoGeneral`) AS `SumaDedescuentos`,sum(`separacion`.`subtotalGeneral`) AS `SumaDesubtotal`,sum(`separacion`.`totalGeneral`) AS `SumaDetotal`,sum(`separacion`.`ivaGeneral`) AS `SumaDeiva` from `bdclick`.`separacion` group by `separacion`.`red`,`separacion`.`credito` having (`separacion`.`red` <> \'\'))
md5=b04d82941ca2ef9ad6a24f18628bdf57
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:28
create-version=2
source=(select `separacion`.`red` AS `red`,sum(`separacion`.`descuentoGeneral`) AS `SumaDedescuentos`,sum(`separacion`.`subtotalGeneral`) AS `SumaDesubtotal`,sum(`separacion`.`totalGeneral`) AS `SumaDetotal`,sum(`separacion`.`ivaGeneral`) AS `SumaDeiva` from `separacion` group by `separacion`.`red`,`separacion`.`credito` having (`separacion`.`red` <> \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `separacion`.`red` AS `red`,sum(`separacion`.`descuentoGeneral`) AS `SumaDedescuentos`,sum(`separacion`.`subtotalGeneral`) AS `SumaDesubtotal`,sum(`separacion`.`totalGeneral`) AS `SumaDetotal`,sum(`separacion`.`ivaGeneral`) AS `SumaDeiva` from `bdclick`.`separacion` group by `separacion`.`red`,`separacion`.`credito` having (`separacion`.`red` <> \'\'))
mariadb-version=100135
