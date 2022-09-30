TYPE=VIEW
query=(select `bdclick3`.`bdtrasladosprod`.`traslado` AS `traslado`,`bdclick3`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick3`.`bdtrasladosprod`.`cantidad` AS `cantidad2`,`bdclick3`.`bdtraslados`.`anulada` AS `anulada` from (`bdclick3`.`bdtraslados` left join `bdclick3`.`bdtrasladosprod` on((`bdclick3`.`bdtraslados`.`Id` = `bdclick3`.`bdtrasladosprod`.`traslado`))) group by `bdclick3`.`bdtrasladosprod`.`traslado`,`bdclick3`.`bdtrasladosprod`.`producto`,`bdclick3`.`bdtrasladosprod`.`cantidad`,`bdclick3`.`bdtraslados`.`anulada`,`bdclick3`.`bdtraslados`.`destino` having ((`bdclick3`.`bdtraslados`.`anulada` = 0) and (`bdclick3`.`bdtraslados`.`destino` = \'123-55\')))
md5=13ce3ca24081c2fe04e631af9c677cf3
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:51
create-version=2
source=(select `bdtrasladosprod`.`traslado` AS `traslado`,`bdtrasladosprod`.`producto` AS `producto`,`bdtrasladosprod`.`cantidad` AS `cantidad2`,`bdtraslados`.`anulada` AS `anulada` from (`bdtraslados` left join `bdtrasladosprod` on((`bdtraslados`.`Id` = `bdtrasladosprod`.`traslado`))) group by `bdtrasladosprod`.`traslado`,`bdtrasladosprod`.`producto`,`bdtrasladosprod`.`cantidad`,`bdtraslados`.`anulada`,`bdtraslados`.`destino` having ((`bdtraslados`.`anulada` = 0) and (`bdtraslados`.`destino` = \'123-55\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdtrasladosprod`.`traslado` AS `traslado`,`bdclick3`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick3`.`bdtrasladosprod`.`cantidad` AS `cantidad2`,`bdclick3`.`bdtraslados`.`anulada` AS `anulada` from (`bdclick3`.`bdtraslados` left join `bdclick3`.`bdtrasladosprod` on((`bdclick3`.`bdtraslados`.`Id` = `bdclick3`.`bdtrasladosprod`.`traslado`))) group by `bdclick3`.`bdtrasladosprod`.`traslado`,`bdclick3`.`bdtrasladosprod`.`producto`,`bdclick3`.`bdtrasladosprod`.`cantidad`,`bdclick3`.`bdtraslados`.`anulada`,`bdclick3`.`bdtraslados`.`destino` having ((`bdclick3`.`bdtraslados`.`anulada` = 0) and (`bdclick3`.`bdtraslados`.`destino` = \'123-55\')))
mariadb-version=100135
