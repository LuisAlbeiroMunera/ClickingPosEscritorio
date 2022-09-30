TYPE=VIEW
query=(select `bdclick`.`bdtrasladosprod`.`traslado` AS `traslado`,`bdclick`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick`.`bdtrasladosprod`.`cantidad` AS `cantidad2`,`bdclick`.`bdtraslados`.`anulada` AS `anulada` from (`bdclick`.`bdtraslados` left join `bdclick`.`bdtrasladosprod` on((`bdclick`.`bdtraslados`.`Id` = `bdclick`.`bdtrasladosprod`.`traslado`))) group by `bdclick`.`bdtrasladosprod`.`traslado`,`bdclick`.`bdtrasladosprod`.`producto`,`bdclick`.`bdtrasladosprod`.`cantidad`,`bdclick`.`bdtraslados`.`anulada`,`bdclick`.`bdtraslados`.`destino` having ((`bdclick`.`bdtraslados`.`anulada` = 0) and (`bdclick`.`bdtraslados`.`destino` = \'123-55\')))
md5=c23507afb0a86f2aaf01583c78698ad9
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:24
create-version=2
source=(select `bdtrasladosprod`.`traslado` AS `traslado`,`bdtrasladosprod`.`producto` AS `producto`,`bdtrasladosprod`.`cantidad` AS `cantidad2`,`bdtraslados`.`anulada` AS `anulada` from (`bdtraslados` left join `bdtrasladosprod` on((`bdtraslados`.`Id` = `bdtrasladosprod`.`traslado`))) group by `bdtrasladosprod`.`traslado`,`bdtrasladosprod`.`producto`,`bdtrasladosprod`.`cantidad`,`bdtraslados`.`anulada`,`bdtraslados`.`destino` having ((`bdtraslados`.`anulada` = 0) and (`bdtraslados`.`destino` = \'123-55\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdtrasladosprod`.`traslado` AS `traslado`,`bdclick`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick`.`bdtrasladosprod`.`cantidad` AS `cantidad2`,`bdclick`.`bdtraslados`.`anulada` AS `anulada` from (`bdclick`.`bdtraslados` left join `bdclick`.`bdtrasladosprod` on((`bdclick`.`bdtraslados`.`Id` = `bdclick`.`bdtrasladosprod`.`traslado`))) group by `bdclick`.`bdtrasladosprod`.`traslado`,`bdclick`.`bdtrasladosprod`.`producto`,`bdclick`.`bdtrasladosprod`.`cantidad`,`bdclick`.`bdtraslados`.`anulada`,`bdclick`.`bdtraslados`.`destino` having ((`bdclick`.`bdtraslados`.`anulada` = 0) and (`bdclick`.`bdtraslados`.`destino` = \'123-55\')))
mariadb-version=100135
