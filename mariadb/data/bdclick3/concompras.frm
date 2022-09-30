TYPE=VIEW
query=select `bdclick3`.`bdingreso`.`id` AS `id`,`bdclick3`.`bdcompra`.`producto` AS `producto`,`bdclick3`.`bdcompra`.`cantidad` AS `cantidad`,`bdclick3`.`bdingreso`.`bodega` AS `bodega`,`bdclick3`.`bdingreso`.`anulada` AS `anulada` from (`bdclick3`.`bdingreso` left join `bdclick3`.`bdcompra` on((`bdclick3`.`bdcompra`.`ingreso` = `bdclick3`.`bdingreso`.`id`))) where ((`bdclick3`.`bdingreso`.`id` <> \'ING-0\') and (`bdclick3`.`bdingreso`.`anulada` = 0))
md5=c6732a9ee6f9c89f1809070acae53d86
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:48
create-version=2
source=select `bdingreso`.`id` AS `id`,`bdcompra`.`producto` AS `producto`,`bdcompra`.`cantidad` AS `cantidad`,`bdingreso`.`bodega` AS `bodega`,`bdingreso`.`anulada` AS `anulada` from (`bdingreso` left join `bdcompra` on((`bdcompra`.`ingreso` = `bdingreso`.`id`))) where ((`bdingreso`.`id` <> \'ING-0\') and (`bdingreso`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdingreso`.`id` AS `id`,`bdclick3`.`bdcompra`.`producto` AS `producto`,`bdclick3`.`bdcompra`.`cantidad` AS `cantidad`,`bdclick3`.`bdingreso`.`bodega` AS `bodega`,`bdclick3`.`bdingreso`.`anulada` AS `anulada` from (`bdclick3`.`bdingreso` left join `bdclick3`.`bdcompra` on((`bdclick3`.`bdcompra`.`ingreso` = `bdclick3`.`bdingreso`.`id`))) where ((`bdclick3`.`bdingreso`.`id` <> \'ING-0\') and (`bdclick3`.`bdingreso`.`anulada` = 0))
mariadb-version=100135
