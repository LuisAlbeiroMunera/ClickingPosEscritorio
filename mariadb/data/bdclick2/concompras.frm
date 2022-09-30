TYPE=VIEW
query=select `bdclick2`.`bdingreso`.`id` AS `id`,`bdclick2`.`bdcompra`.`producto` AS `producto`,`bdclick2`.`bdcompra`.`cantidad` AS `cantidad`,`bdclick2`.`bdingreso`.`bodega` AS `bodega`,`bdclick2`.`bdingreso`.`anulada` AS `anulada` from (`bdclick2`.`bdingreso` left join `bdclick2`.`bdcompra` on((`bdclick2`.`bdcompra`.`ingreso` = `bdclick2`.`bdingreso`.`id`))) where ((`bdclick2`.`bdingreso`.`id` <> \'ING-0\') and (`bdclick2`.`bdingreso`.`anulada` = 0))
md5=7b47ef6883ba08daa4b10f52908b6bca
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:43
create-version=2
source=select `bdingreso`.`id` AS `id`,`bdcompra`.`producto` AS `producto`,`bdcompra`.`cantidad` AS `cantidad`,`bdingreso`.`bodega` AS `bodega`,`bdingreso`.`anulada` AS `anulada` from (`bdingreso` left join `bdcompra` on((`bdcompra`.`ingreso` = `bdingreso`.`id`))) where ((`bdingreso`.`id` <> \'ING-0\') and (`bdingreso`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdingreso`.`id` AS `id`,`bdclick2`.`bdcompra`.`producto` AS `producto`,`bdclick2`.`bdcompra`.`cantidad` AS `cantidad`,`bdclick2`.`bdingreso`.`bodega` AS `bodega`,`bdclick2`.`bdingreso`.`anulada` AS `anulada` from (`bdclick2`.`bdingreso` left join `bdclick2`.`bdcompra` on((`bdclick2`.`bdcompra`.`ingreso` = `bdclick2`.`bdingreso`.`id`))) where ((`bdclick2`.`bdingreso`.`id` <> \'ING-0\') and (`bdclick2`.`bdingreso`.`anulada` = 0))
mariadb-version=100135
