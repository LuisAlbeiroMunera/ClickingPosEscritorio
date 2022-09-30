TYPE=VIEW
query=(select `bdclick6`.`bdtrasladosprod`.`traslado` AS `traslado`,`bdclick6`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick6`.`bdtrasladosprod`.`cantidad` AS `cantidad2`,`bdclick6`.`bdtraslados`.`anulada` AS `anulada` from (`bdclick6`.`bdtraslados` left join `bdclick6`.`bdtrasladosprod` on((`bdclick6`.`bdtraslados`.`Id` = `bdclick6`.`bdtrasladosprod`.`traslado`))) group by `bdclick6`.`bdtrasladosprod`.`traslado`,`bdclick6`.`bdtrasladosprod`.`producto`,`bdclick6`.`bdtrasladosprod`.`cantidad`,`bdclick6`.`bdtraslados`.`anulada`,`bdclick6`.`bdtraslados`.`destino` having ((`bdclick6`.`bdtraslados`.`anulada` = 0) and (`bdclick6`.`bdtraslados`.`destino` = \'123-55\')))
md5=872ed3c3e1296457ceb222742c5ebb5d
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:35
create-version=2
source=(select `bdtrasladosprod`.`traslado` AS `traslado`,`bdtrasladosprod`.`producto` AS `producto`,`bdtrasladosprod`.`cantidad` AS `cantidad2`,`bdtraslados`.`anulada` AS `anulada` from (`bdtraslados` left join `bdtrasladosprod` on((`bdtraslados`.`Id` = `bdtrasladosprod`.`traslado`))) group by `bdtrasladosprod`.`traslado`,`bdtrasladosprod`.`producto`,`bdtrasladosprod`.`cantidad`,`bdtraslados`.`anulada`,`bdtraslados`.`destino` having ((`bdtraslados`.`anulada` = 0) and (`bdtraslados`.`destino` = \'123-55\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdtrasladosprod`.`traslado` AS `traslado`,`bdclick6`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick6`.`bdtrasladosprod`.`cantidad` AS `cantidad2`,`bdclick6`.`bdtraslados`.`anulada` AS `anulada` from (`bdclick6`.`bdtraslados` left join `bdclick6`.`bdtrasladosprod` on((`bdclick6`.`bdtraslados`.`Id` = `bdclick6`.`bdtrasladosprod`.`traslado`))) group by `bdclick6`.`bdtrasladosprod`.`traslado`,`bdclick6`.`bdtrasladosprod`.`producto`,`bdclick6`.`bdtrasladosprod`.`cantidad`,`bdclick6`.`bdtraslados`.`anulada`,`bdclick6`.`bdtraslados`.`destino` having ((`bdclick6`.`bdtraslados`.`anulada` = 0) and (`bdclick6`.`bdtraslados`.`destino` = \'123-55\')))
mariadb-version=100135
