TYPE=VIEW
query=(select `bdclick5`.`bdingreso`.`id` AS `id`,`bdclick5`.`bdcompra`.`producto` AS `producto`,`bdclick5`.`bdcompra`.`cantidad` AS `cantidad`,`bdclick5`.`bdingreso`.`anulada` AS `anulada` from (`bdclick5`.`bdingreso` left join `bdclick5`.`bdcompra` on((`bdclick5`.`bdcompra`.`ingreso` = `bdclick5`.`bdingreso`.`id`))) where ((`bdclick5`.`bdingreso`.`id` = \'ING-0\') and (`bdclick5`.`bdingreso`.`anulada` = 0)))
md5=c50c9049ece8006ebff7ef144736467c
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:44
create-version=2
source=(select `bdingreso`.`id` AS `id`,`bdcompra`.`producto` AS `producto`,`bdcompra`.`cantidad` AS `cantidad`,`bdingreso`.`anulada` AS `anulada` from (`bdingreso` left join `bdcompra` on((`bdcompra`.`ingreso` = `bdingreso`.`id`))) where ((`bdingreso`.`id` = \'ING-0\') and (`bdingreso`.`anulada` = 0)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdingreso`.`id` AS `id`,`bdclick5`.`bdcompra`.`producto` AS `producto`,`bdclick5`.`bdcompra`.`cantidad` AS `cantidad`,`bdclick5`.`bdingreso`.`anulada` AS `anulada` from (`bdclick5`.`bdingreso` left join `bdclick5`.`bdcompra` on((`bdclick5`.`bdcompra`.`ingreso` = `bdclick5`.`bdingreso`.`id`))) where ((`bdclick5`.`bdingreso`.`id` = \'ING-0\') and (`bdclick5`.`bdingreso`.`anulada` = 0)))
mariadb-version=100135
