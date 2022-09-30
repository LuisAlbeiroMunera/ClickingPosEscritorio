TYPE=VIEW
query=(select `bdclick`.`bdtrasladosprod`.`traslado` AS `traslado`,`bdclick`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick`.`bdtraslados`.`anulada` AS `anulada` from (`bdclick`.`bdtraslados` left join `bdclick`.`bdtrasladosprod` on((`bdclick`.`bdtraslados`.`Id` = `bdclick`.`bdtrasladosprod`.`traslado`))) group by `bdclick`.`bdtrasladosprod`.`traslado`,`bdclick`.`bdtrasladosprod`.`producto`,`bdclick`.`bdtrasladosprod`.`cantidad`,`bdclick`.`bdtraslados`.`anulada`,`bdclick`.`bdtraslados`.`origen` having ((`bdclick`.`bdtraslados`.`anulada` = 0) and (`bdclick`.`bdtraslados`.`origen` = \'123-55\')))
md5=85d2556fbea8235de55b954de63d81ff
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:24
create-version=2
source=(select `bdtrasladosprod`.`traslado` AS `traslado`,`bdtrasladosprod`.`producto` AS `producto`,`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdtraslados`.`anulada` AS `anulada` from (`bdtraslados` left join `bdtrasladosprod` on((`bdtraslados`.`Id` = `bdtrasladosprod`.`traslado`))) group by `bdtrasladosprod`.`traslado`,`bdtrasladosprod`.`producto`,`bdtrasladosprod`.`cantidad`,`bdtraslados`.`anulada`,`bdtraslados`.`origen` having ((`bdtraslados`.`anulada` = 0) and (`bdtraslados`.`origen` = \'123-55\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdtrasladosprod`.`traslado` AS `traslado`,`bdclick`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick`.`bdtraslados`.`anulada` AS `anulada` from (`bdclick`.`bdtraslados` left join `bdclick`.`bdtrasladosprod` on((`bdclick`.`bdtraslados`.`Id` = `bdclick`.`bdtrasladosprod`.`traslado`))) group by `bdclick`.`bdtrasladosprod`.`traslado`,`bdclick`.`bdtrasladosprod`.`producto`,`bdclick`.`bdtrasladosprod`.`cantidad`,`bdclick`.`bdtraslados`.`anulada`,`bdclick`.`bdtraslados`.`origen` having ((`bdclick`.`bdtraslados`.`anulada` = 0) and (`bdclick`.`bdtraslados`.`origen` = \'123-55\')))
mariadb-version=100135
