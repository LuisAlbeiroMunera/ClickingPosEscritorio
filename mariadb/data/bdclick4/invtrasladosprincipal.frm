TYPE=VIEW
query=(select `bdclick4`.`bdtrasladosprod`.`traslado` AS `traslado`,`bdclick4`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick4`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick4`.`bdtraslados`.`anulada` AS `anulada` from (`bdclick4`.`bdtraslados` left join `bdclick4`.`bdtrasladosprod` on((`bdclick4`.`bdtraslados`.`Id` = `bdclick4`.`bdtrasladosprod`.`traslado`))) group by `bdclick4`.`bdtrasladosprod`.`traslado`,`bdclick4`.`bdtrasladosprod`.`producto`,`bdclick4`.`bdtrasladosprod`.`cantidad`,`bdclick4`.`bdtraslados`.`anulada`,`bdclick4`.`bdtraslados`.`origen` having ((`bdclick4`.`bdtraslados`.`anulada` = 0) and (`bdclick4`.`bdtraslados`.`origen` = \'123-55\')))
md5=6cf94923a980ec088b1117146a98f6d3
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:28
create-version=2
source=(select `bdtrasladosprod`.`traslado` AS `traslado`,`bdtrasladosprod`.`producto` AS `producto`,`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdtraslados`.`anulada` AS `anulada` from (`bdtraslados` left join `bdtrasladosprod` on((`bdtraslados`.`Id` = `bdtrasladosprod`.`traslado`))) group by `bdtrasladosprod`.`traslado`,`bdtrasladosprod`.`producto`,`bdtrasladosprod`.`cantidad`,`bdtraslados`.`anulada`,`bdtraslados`.`origen` having ((`bdtraslados`.`anulada` = 0) and (`bdtraslados`.`origen` = \'123-55\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdtrasladosprod`.`traslado` AS `traslado`,`bdclick4`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick4`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick4`.`bdtraslados`.`anulada` AS `anulada` from (`bdclick4`.`bdtraslados` left join `bdclick4`.`bdtrasladosprod` on((`bdclick4`.`bdtraslados`.`Id` = `bdclick4`.`bdtrasladosprod`.`traslado`))) group by `bdclick4`.`bdtrasladosprod`.`traslado`,`bdclick4`.`bdtrasladosprod`.`producto`,`bdclick4`.`bdtrasladosprod`.`cantidad`,`bdclick4`.`bdtraslados`.`anulada`,`bdclick4`.`bdtraslados`.`origen` having ((`bdclick4`.`bdtraslados`.`anulada` = 0) and (`bdclick4`.`bdtraslados`.`origen` = \'123-55\')))
mariadb-version=100135
