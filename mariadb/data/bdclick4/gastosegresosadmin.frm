TYPE=VIEW
query=select sum(`bdclick4`.`bdegreso`.`total`) AS `SumaDetotal`,`bdclick4`.`bdegreso`.`fecha` AS `fecha`,`bdclick4`.`bdegreso`.`anulada` AS `anulada`,count(`bdclick4`.`bdegreso`.`total`) AS `contGastos` from `bdclick4`.`bdegreso` where (`bdclick4`.`bdegreso`.`estado` = \'PENDIENTE\') group by `bdclick4`.`bdegreso`.`fecha`,`bdclick4`.`bdegreso`.`anulada` having (`bdclick4`.`bdegreso`.`anulada` = 0)
md5=6f0435aec7dbf74214644539d78416ff
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:27
create-version=2
source=select sum(`bdegreso`.`total`) AS `SumaDetotal`,`bdegreso`.`fecha` AS `fecha`,`bdegreso`.`anulada` AS `anulada`,count(`bdegreso`.`total`) AS `contGastos` from `bdegreso` where (`bdegreso`.`estado` = \'PENDIENTE\') group by `bdegreso`.`fecha`,`bdegreso`.`anulada` having (`bdegreso`.`anulada` = 0)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select sum(`bdclick4`.`bdegreso`.`total`) AS `SumaDetotal`,`bdclick4`.`bdegreso`.`fecha` AS `fecha`,`bdclick4`.`bdegreso`.`anulada` AS `anulada`,count(`bdclick4`.`bdegreso`.`total`) AS `contGastos` from `bdclick4`.`bdegreso` where (`bdclick4`.`bdegreso`.`estado` = \'PENDIENTE\') group by `bdclick4`.`bdegreso`.`fecha`,`bdclick4`.`bdegreso`.`anulada` having (`bdclick4`.`bdegreso`.`anulada` = 0)
mariadb-version=100135
