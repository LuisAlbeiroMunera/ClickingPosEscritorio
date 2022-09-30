TYPE=VIEW
query=(select `bdclick4`.`bdingreso`.`id` AS `id`,`bdclick4`.`bdcompra`.`producto` AS `producto`,`bdclick4`.`bdcompra`.`cantidad` AS `cantidad`,`bdclick4`.`bdingreso`.`anulada` AS `anulada` from (`bdclick4`.`bdingreso` left join `bdclick4`.`bdcompra` on((`bdclick4`.`bdcompra`.`ingreso` = `bdclick4`.`bdingreso`.`id`))) where ((`bdclick4`.`bdingreso`.`id` = \'ING-0\') and (`bdclick4`.`bdingreso`.`anulada` = 0)))
md5=9fd4dbb21508e7f12d369549d71a3788
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:25
create-version=2
source=(select `bdingreso`.`id` AS `id`,`bdcompra`.`producto` AS `producto`,`bdcompra`.`cantidad` AS `cantidad`,`bdingreso`.`anulada` AS `anulada` from (`bdingreso` left join `bdcompra` on((`bdcompra`.`ingreso` = `bdingreso`.`id`))) where ((`bdingreso`.`id` = \'ING-0\') and (`bdingreso`.`anulada` = 0)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdingreso`.`id` AS `id`,`bdclick4`.`bdcompra`.`producto` AS `producto`,`bdclick4`.`bdcompra`.`cantidad` AS `cantidad`,`bdclick4`.`bdingreso`.`anulada` AS `anulada` from (`bdclick4`.`bdingreso` left join `bdclick4`.`bdcompra` on((`bdclick4`.`bdcompra`.`ingreso` = `bdclick4`.`bdingreso`.`id`))) where ((`bdclick4`.`bdingreso`.`id` = \'ING-0\') and (`bdclick4`.`bdingreso`.`anulada` = 0)))
mariadb-version=100135
