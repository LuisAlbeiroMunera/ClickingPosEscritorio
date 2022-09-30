TYPE=VIEW
query=select `bdclick6`.`bdingreso`.`id` AS `id`,`bdclick6`.`bdcompra`.`producto` AS `producto`,`bdclick6`.`bdcompra`.`cantidad` AS `cantidad`,`bdclick6`.`bdingreso`.`bodega` AS `bodega`,`bdclick6`.`bdingreso`.`anulada` AS `anulada` from (`bdclick6`.`bdingreso` left join `bdclick6`.`bdcompra` on((`bdclick6`.`bdcompra`.`ingreso` = `bdclick6`.`bdingreso`.`id`))) where ((`bdclick6`.`bdingreso`.`id` <> \'ING-0\') and (`bdclick6`.`bdingreso`.`anulada` = 0))
md5=dc523e4793e57b77d522b16107b77c63
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:33
create-version=2
source=select `bdingreso`.`id` AS `id`,`bdcompra`.`producto` AS `producto`,`bdcompra`.`cantidad` AS `cantidad`,`bdingreso`.`bodega` AS `bodega`,`bdingreso`.`anulada` AS `anulada` from (`bdingreso` left join `bdcompra` on((`bdcompra`.`ingreso` = `bdingreso`.`id`))) where ((`bdingreso`.`id` <> \'ING-0\') and (`bdingreso`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdingreso`.`id` AS `id`,`bdclick6`.`bdcompra`.`producto` AS `producto`,`bdclick6`.`bdcompra`.`cantidad` AS `cantidad`,`bdclick6`.`bdingreso`.`bodega` AS `bodega`,`bdclick6`.`bdingreso`.`anulada` AS `anulada` from (`bdclick6`.`bdingreso` left join `bdclick6`.`bdcompra` on((`bdclick6`.`bdcompra`.`ingreso` = `bdclick6`.`bdingreso`.`id`))) where ((`bdclick6`.`bdingreso`.`id` <> \'ING-0\') and (`bdclick6`.`bdingreso`.`anulada` = 0))
mariadb-version=100135
