TYPE=VIEW
query=(select `bdclick2`.`bdtrasladosprod`.`traslado` AS `traslado`,`bdclick2`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick2`.`bdtrasladosprod`.`cantidad` AS `cantidad2`,`bdclick2`.`bdtraslados`.`anulada` AS `anulada` from (`bdclick2`.`bdtraslados` left join `bdclick2`.`bdtrasladosprod` on((`bdclick2`.`bdtraslados`.`Id` = `bdclick2`.`bdtrasladosprod`.`traslado`))) group by `bdclick2`.`bdtrasladosprod`.`traslado`,`bdclick2`.`bdtrasladosprod`.`producto`,`bdclick2`.`bdtrasladosprod`.`cantidad`,`bdclick2`.`bdtraslados`.`anulada`,`bdclick2`.`bdtraslados`.`destino` having ((`bdclick2`.`bdtraslados`.`anulada` = 0) and (`bdclick2`.`bdtraslados`.`destino` = \'123-55\')))
md5=4a277012e6d305a13fcd27eff464304e
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:45
create-version=2
source=(select `bdtrasladosprod`.`traslado` AS `traslado`,`bdtrasladosprod`.`producto` AS `producto`,`bdtrasladosprod`.`cantidad` AS `cantidad2`,`bdtraslados`.`anulada` AS `anulada` from (`bdtraslados` left join `bdtrasladosprod` on((`bdtraslados`.`Id` = `bdtrasladosprod`.`traslado`))) group by `bdtrasladosprod`.`traslado`,`bdtrasladosprod`.`producto`,`bdtrasladosprod`.`cantidad`,`bdtraslados`.`anulada`,`bdtraslados`.`destino` having ((`bdtraslados`.`anulada` = 0) and (`bdtraslados`.`destino` = \'123-55\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bdtrasladosprod`.`traslado` AS `traslado`,`bdclick2`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick2`.`bdtrasladosprod`.`cantidad` AS `cantidad2`,`bdclick2`.`bdtraslados`.`anulada` AS `anulada` from (`bdclick2`.`bdtraslados` left join `bdclick2`.`bdtrasladosprod` on((`bdclick2`.`bdtraslados`.`Id` = `bdclick2`.`bdtrasladosprod`.`traslado`))) group by `bdclick2`.`bdtrasladosprod`.`traslado`,`bdclick2`.`bdtrasladosprod`.`producto`,`bdclick2`.`bdtrasladosprod`.`cantidad`,`bdclick2`.`bdtraslados`.`anulada`,`bdclick2`.`bdtraslados`.`destino` having ((`bdclick2`.`bdtraslados`.`anulada` = 0) and (`bdclick2`.`bdtraslados`.`destino` = \'123-55\')))
mariadb-version=100135
