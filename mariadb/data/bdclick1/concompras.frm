TYPE=VIEW
query=select `bdclick1`.`bdingreso`.`id` AS `id`,`bdclick1`.`bdcompra`.`producto` AS `producto`,`bdclick1`.`bdcompra`.`cantidad` AS `cantidad`,`bdclick1`.`bdingreso`.`bodega` AS `bodega`,`bdclick1`.`bdingreso`.`anulada` AS `anulada` from (`bdclick1`.`bdingreso` left join `bdclick1`.`bdcompra` on((`bdclick1`.`bdcompra`.`ingreso` = `bdclick1`.`bdingreso`.`id`))) where ((`bdclick1`.`bdingreso`.`id` <> \'ING-0\') and (`bdclick1`.`bdingreso`.`anulada` = 0))
md5=56cc8d22518c0e345fb6a7f6754a2595
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:32
create-version=2
source=select `bdingreso`.`id` AS `id`,`bdcompra`.`producto` AS `producto`,`bdcompra`.`cantidad` AS `cantidad`,`bdingreso`.`bodega` AS `bodega`,`bdingreso`.`anulada` AS `anulada` from (`bdingreso` left join `bdcompra` on((`bdcompra`.`ingreso` = `bdingreso`.`id`))) where ((`bdingreso`.`id` <> \'ING-0\') and (`bdingreso`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdingreso`.`id` AS `id`,`bdclick1`.`bdcompra`.`producto` AS `producto`,`bdclick1`.`bdcompra`.`cantidad` AS `cantidad`,`bdclick1`.`bdingreso`.`bodega` AS `bodega`,`bdclick1`.`bdingreso`.`anulada` AS `anulada` from (`bdclick1`.`bdingreso` left join `bdclick1`.`bdcompra` on((`bdclick1`.`bdcompra`.`ingreso` = `bdclick1`.`bdingreso`.`id`))) where ((`bdclick1`.`bdingreso`.`id` <> \'ING-0\') and (`bdclick1`.`bdingreso`.`anulada` = 0))
mariadb-version=100135
