TYPE=VIEW
query=(select `bdclick`.`bdingreso`.`id` AS `id`,`bdclick`.`bdcompra`.`producto` AS `producto`,`bdclick`.`bdcompra`.`cantidad` AS `cantidad`,`bdclick`.`bdingreso`.`anulada` AS `anulada` from (`bdclick`.`bdingreso` left join `bdclick`.`bdcompra` on((`bdclick`.`bdcompra`.`ingreso` = `bdclick`.`bdingreso`.`id`))) where ((`bdclick`.`bdingreso`.`id` = \'ING-0\') and (`bdclick`.`bdingreso`.`anulada` = 0)))
md5=a26f17012d31f1c0aeaafd8c55baf9ea
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:22
create-version=2
source=(select `bdingreso`.`id` AS `id`,`bdcompra`.`producto` AS `producto`,`bdcompra`.`cantidad` AS `cantidad`,`bdingreso`.`anulada` AS `anulada` from (`bdingreso` left join `bdcompra` on((`bdcompra`.`ingreso` = `bdingreso`.`id`))) where ((`bdingreso`.`id` = \'ING-0\') and (`bdingreso`.`anulada` = 0)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdingreso`.`id` AS `id`,`bdclick`.`bdcompra`.`producto` AS `producto`,`bdclick`.`bdcompra`.`cantidad` AS `cantidad`,`bdclick`.`bdingreso`.`anulada` AS `anulada` from (`bdclick`.`bdingreso` left join `bdclick`.`bdcompra` on((`bdclick`.`bdcompra`.`ingreso` = `bdclick`.`bdingreso`.`id`))) where ((`bdclick`.`bdingreso`.`id` = \'ING-0\') and (`bdclick`.`bdingreso`.`anulada` = 0)))
mariadb-version=100135
